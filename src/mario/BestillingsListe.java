package mario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BestillingsListe
{
    private List<Bestilling> bestillinger;

    public BestillingsListe(IDataMapper dataMapper, MenuKort menuKort) throws MarioException
    {
        bestillinger = dataMapper.hentBestillinger("bestillinger.txt", menuKort);
        if (bestillinger == null)
        {
            bestillinger = new ArrayList<>();
        }

    }

    public void opretBestilling(MenuKort menu)
    {
        int pizzaNr = Tools.inputTal("Indtast pizza nummer: ");
        int antal = Tools.inputTal("Indtast antal: ");
        String navn = Tools.inputTekst("Indtast kundens navn: ");
        Tidspunkt leveringstidspunkt = Tools.inputTidspunkt("Indtast leveringstidspunkt ");
        Bestilling nyBestilling = new Bestilling(menu.getPizza(pizzaNr), antal, navn, leveringstidspunkt);
        bestillinger.add(nyBestilling);
        System.out.println("Tak for din bestilling");
    }

    public void visBestillinger()
    {
        System.out.println("**** Ventende bestillinger ******* ");
        Collections.sort(bestillinger);
        for (Bestilling bestilling : bestillinger)
        {
            System.out.println(bestilling.visBestilling());
        }
        System.out.println("**********************************");
    }

    public void gemBestillinger(IDataMapper dataMapper)
    {
        dataMapper.gemBestillinger("bestillinger.txt", bestillinger);
    }

}
