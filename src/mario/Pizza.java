package mario;

public class Pizza
{
    private int nr;
    private String navn;
    private String ingredienser;
    private int pris;

    public Pizza(int nr, String navn, String ingredienser, int pris)
    {
        this.nr = nr;
        this.navn = navn;
        this.ingredienser = ingredienser;
        this.pris = pris;
    }

    public int getNr()
    {
        return nr;
    }

    public String getNavn()
    {
        return navn;
    }

    public String getIngredienser()
    {
        return ingredienser;
    }

    public int getPris()
    {
        return pris;
    }

    //  Egne metoder
    public String visPizzaInfo()
    {
        return String.format("%2d. %-15s %-20s %4d kr.",
                nr,
                navn,
                ingredienser,
                pris);
    }
}
