package mario;

public class Butik
{
    private String navn;
    private IDataMapper dataMapper;
    private MenuKort menuKort;
    private BestillingsListe bestillinger;

    public Butik(IDataMapper dataMapper, String navn) throws MarioException
    {
        this.navn = navn;
        this.dataMapper = dataMapper;
        this.menuKort = new MenuKort();
        this.bestillinger = new BestillingsListe(dataMapper, menuKort);
    }

    public void hovedMenu()
    {
        boolean running = true;
        int input;

        while (running)
        {
            visHovedmenuTekst();
            input = Tools.inputTal("Valg (1-9): ");

            switch (input)
            {
                case 1: System.out.println(menuKort.visMenuKort()); break;
                case 2: bestillinger.opretBestilling(menuKort); break;
                case 3: bestillinger.visBestillinger(); break;
                case 9: running = false;
            }
        }
        bestillinger.gemBestillinger(dataMapper);
        System.out.println("Tak for denne gang!");
    }

    private void visHovedmenuTekst()
    {
        System.out.println("Hovedmenu:");
        System.out.println("1) vis menukort 2) ny bestilling 3) vis bestillinger 9) afslut ");
    }
}
