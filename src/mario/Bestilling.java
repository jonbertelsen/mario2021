package mario;

public class Bestilling implements Comparable<Bestilling>
{
    private Pizza pizza;
    private int antal;
    private String kundenavn;
    private Tidspunkt leveringstidspunkt;

    public Bestilling()
    {
    }

    public Bestilling(Pizza pizza, int antal, String kundenavn, Tidspunkt leveringstidspunkt)
    {
        this.pizza = pizza;
        this.antal = antal;
        this.kundenavn = kundenavn;
        this.leveringstidspunkt = leveringstidspunkt;
    }

    public Pizza getPizza()
    {
        return pizza;
    }

    public int getAntal()
    {
        return antal;
    }

    public String getKundenavn()
    {
        return kundenavn;
    }

    public Tidspunkt getLeveringstidspunkt()
    {
        return leveringstidspunkt;
    }

    // Egne metoder

    public String visBestilling()
    {
        return String.format("%d stk á nr. %d: %s i alt %d kr. Hentes kl. %s",
                antal,
                pizza.getNr(),
                pizza.getNavn(),
                antal * pizza.getPris(),
                leveringstidspunkt.visTidspunkt());
    }

    public void setPizza(Pizza pizza)
    {
        this.pizza = pizza;
    }

    public void setAntal(int antal)
    {
        this.antal = antal;
    }

    public void setKundenavn(String kundenavn)
    {
        this.kundenavn = kundenavn;
    }

    public void setLeveringstidspunkt(Tidspunkt leveringstidspunkt)
    {
        this.leveringstidspunkt = leveringstidspunkt;
    }

    @Override
    public int compareTo(Bestilling b2)
    {
        return this.leveringstidspunkt.compareTo(b2.leveringstidspunkt);
    }
}
