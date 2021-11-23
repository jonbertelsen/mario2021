package mario;

import java.util.HashMap;
import java.util.Map;

public class Menu
{
    Map<Integer, Pizza> menu = new HashMap<>();

    public Menu()
    {
        menu.put(1, new Pizza(1, "Vesuvio", "tomat, ost", 57) );
        menu.put(2, new Pizza(2, "Amerikaner", "tomat, ost, skinke", 53) );
        menu.put(3, new Pizza(3, "Cacciatore", "tomat, ost, sardiner", 57) );
    }

    public String visMenu()
    {
        StringBuilder sb = new StringBuilder();

        for (Pizza pizza : menu.values())
        {
            sb.append("\n");
            sb.append(pizza.toString());
        }
        return sb.toString();
    }
}
