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

    @Override
    public String toString()
    {
        return "Pizza{" +
                "nr=" + nr +
                ", navn='" + navn + '\'' +
                ", ingredienser='" + ingredienser + '\'' +
                ", pris=" + pris +
                '}';
    }

    //  Egne metoder
}
