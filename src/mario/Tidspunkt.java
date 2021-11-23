package mario;

public class Tidspunkt implements Comparable<Tidspunkt>
{
    private int minutter;

    public Tidspunkt(int timer, int minutter)
    {
        this.minutter = timer * 60 + minutter;
    }

    public int getMinutter()
    {
        return minutter;
    }

    public String visTidspunkt()
    {
        return String.format("%2d:%02d", minutter / 60, minutter % 60);
    }

    @Override
    public int compareTo(Tidspunkt t2)
    {
        return this.minutter - t2.getMinutter();
    }
}
