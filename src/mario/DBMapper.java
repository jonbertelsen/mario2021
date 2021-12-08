package mario;

import java.util.List;

public class DBMapper implements IDataMapper
{
    @Override
    public void gemBestillinger(String filnavn, List<Bestilling> bestillinger)
    {
        // Nu skal vi gemme i en database
    }

    @Override
    public List<Bestilling> hentBestillinger(String filnavn, MenuKort menuKort)
    {
        // Hent fra database
        return null;
    }
}
