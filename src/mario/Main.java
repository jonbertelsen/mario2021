package mario;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class Main
{
    public static void main(String[] args)
    {

        //IDataMapper dataMapper = new FilMapper();
        IDataMapper dataMapper = new DBMapper();
        try
        {
            Butik butik = new Butik(dataMapper, "Marios Pizzabar");
            butik.hovedMenu();
        } catch (MarioException e)
        {
            System.out.println("Der er sket en alvorlig fejl:");
            System.out.println(e.getMessage());
        }

    }
}
