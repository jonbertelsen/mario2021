package mario;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tools
{

    public static int inputTal(String ledetekst)
    {
        while (true)
        {
            try
            {
                Scanner input = new Scanner(System.in);
                System.out.println(ledetekst);
                String line = input.nextLine();
                return Integer.parseInt(line);
            }
            catch (NumberFormatException e)
            {
                System.out.println("Du skal indtaste et tal");
            }
        }
    }

    public static String inputTekst(String ledetekst)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(ledetekst);
        String line = input.nextLine();
        return line;
    }

    public static Tidspunkt inputTidspunkt(String ledetekst)
    {
        // forventet format 17:30
        while (true)
        {
            try
            {
                Scanner input = new Scanner(System.in);
                System.out.println(ledetekst + " (tt:mm):");
                String line = input.nextLine();
                return parseTidspunkt(line);
            } catch (MarioException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    public static Tidspunkt parseTidspunkt(String tidspunkt) throws MarioException
    {

                int timer = Integer.parseInt(tidspunkt.substring(0, 2));
                int minutter = Integer.parseInt(tidspunkt.substring(3, 5));
                if (timer >= 0 && timer <= 23 && minutter >=0 && minutter <= 59)
                {
                    return new Tidspunkt(timer, minutter);
                } else
                {
                    throw new MarioException("Du skal overholde formatet tt:mm");
                }
     }

    public static LocalDate inputLocalDate(String ledetekst)
    {
        // 2005-01-15
        Scanner input = new Scanner(System.in);
        System.out.println(ledetekst + " (åååå-mm-dd):");
        String line = input.nextLine();
        return LocalDate.parse(line);
    }
}
