package mario;

public class Butik
{
    private String navn;
    private Menu menu = new Menu();

    public void visMenu()
    {
        System.out.println(menu.visMenu());
    }

}
