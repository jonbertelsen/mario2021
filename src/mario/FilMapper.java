package mario;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilMapper implements IDataMapper
{

    public FilMapper()
    {
    }

    @Override
    public void gemBestillinger(String filnavn, List<Bestilling> bestillinger)
    {
        try (PrintWriter writer = new PrintWriter(new File(filnavn)))
        {
            for (Bestilling bestilling : bestillinger)
            {
                writer.println(START);
                writer.println(PIZZA_NR);
                writer.println(bestilling.getPizza().getNr());
                writer.println(ANTAL);
                writer.println(bestilling.getAntal());
                writer.println(KUNDENAVN);
                writer.println(bestilling.getKundenavn());
                writer.println(LEVERINGSTIDSPUNKT);
                writer.println(bestilling.getLeveringstidspunkt().visTidspunkt());
                writer.println(SLUT);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found: " + filnavn);
        }
    }

    @Override
    public List<Bestilling> hentBestillinger(String filnavn, MenuKort menuKort) throws MarioException
    {
        File csvFil = new File(filnavn);
        String line = "";
        String token = "";
        Bestilling bestilling = null;
        List<Bestilling> bestillinger = new ArrayList<>();

        try (Scanner scanner = new Scanner(csvFil))  // try-with-ressources
        {
            while (scanner.hasNext()){
                line = scanner.nextLine();
                switch(line)
                {
                    case START:
                        token = START;
                        bestilling = new Bestilling();
                        break;
                    case PIZZA_NR:
                        token = PIZZA_NR;
                        break;
                    case ANTAL:
                        token = ANTAL;
                        break;
                    case KUNDENAVN:
                        token = KUNDENAVN;
                        break;
                    case LEVERINGSTIDSPUNKT:
                        token = LEVERINGSTIDSPUNKT;
                        break;
                    case SLUT:
                        bestillinger.add(bestilling);
                        break;
                    default:
                        switch (token)
                        {
                            case PIZZA_NR:
                                int pizzaNr = Integer.parseInt(line);
                                bestilling.setPizza(menuKort.getPizza(pizzaNr));
                                break;
                            case ANTAL:
                                bestilling.setAntal(Integer.parseInt(line));
                                break;
                            case KUNDENAVN:
                                bestilling.setKundenavn(line);
                                break;
                            case LEVERINGSTIDSPUNKT:
                                try
                                {
                                    bestilling.setLeveringstidspunkt(Tools.parseTidspunkt(line));
                                } catch (MarioException e)
                                {
                                    throw new MarioException("Der er sket en konverteringsfejl under indlæsningen. Der er fejl i et tidsformat: " + line);
                                }
                                break;
                        }
                }
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Filen findes ikke: " + filnavn);
        }
        return bestillinger;
    }
}
