package mario;

import java.util.HashMap;
import java.util.Map;

public class MenuKort
{
    Map<Integer, Pizza> menu = new HashMap<>();

    public MenuKort()
    {
        menu.put(1, new Pizza(1, "Vesuvio", "tomat, ost", 57) );
        menu.put(2, new Pizza(2, "Amerikaner", "tomat, ost, skinke", 53) );
        menu.put(3, new Pizza(3, "Cacciatore", "tomat, ost, sardiner", 57) );
    }

    public String visMenuKort()
    {
        StringBuilder sb = new StringBuilder();

        sb.append("******************* Menukort *******************\n");

        for (Pizza pizza : menu.values())
        {
            sb.append(pizza.visPizzaInfo());
            sb.append("\n");
        }
        sb.append("*********************************************\n");
        return sb.toString();
    }

    public Pizza getPizza(int pizzaNr)
    {
        return menu.get(pizzaNr);
    }
}
