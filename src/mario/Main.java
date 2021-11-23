package mario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Butik butik = new Butik();
        butik.visMenu();

        List<Tidspunkt> tider = new ArrayList<>();

        Tidspunkt t1 = new Tidspunkt(14,25);
        Tidspunkt t2 = new Tidspunkt(21,30);
        Tidspunkt t3 = new Tidspunkt(17,45);

        tider.add(t1);
        tider.add(t2);
        tider.add(t3);
        System.out.println("Usorteret:");
        visTider(tider);
        Collections.sort(tider);
        System.out.println("Nu i sorteret udgave:");
        visTider(tider);
        Collections.sort(tider, Collections.reverseOrder());
        System.out.println("Nu i omvendt rækkefølge:");
        visTider(tider);
    }

    private static void visTider(List<Tidspunkt> tider)
    {
        for (Tidspunkt tidspunkt : tider)
        {
            System.out.println(tidspunkt.visTidspunkt());
        }
    }
}
