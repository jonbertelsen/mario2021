package mario;

import java.util.List;

public interface IDataMapper
{
    public final static String START = "START";
    public final static String SLUT = "SLUT";
    public final static String PIZZA_NR = "PIZZA_NR";
    public final static String ANTAL = "ANTAL";
    public final static String KUNDENAVN = "KUNDENAVN";
    public final static String LEVERINGSTIDSPUNKT = "LEVERINGSTIDSPUNKT";

    void gemBestillinger(String filnavn, List<Bestilling> bestillinger);
    List<Bestilling> hentBestillinger(String filnavn, MenuKort menuKort) throws MarioException;
/*
    void gemMenukort(String filnavn, MenuKort menukort);
    MenuKort hentMenukort(String filnavn);*/
}
