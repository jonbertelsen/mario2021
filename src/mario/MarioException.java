package mario;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MarioException extends Exception
{
    public MarioException(String message)
    {
        super(message);
        // Skriv message til en log-fil
        skrivTilLogfil("logfil.txt", message);

    }

    private void skrivTilLogfil(String filnavn, String message)
    {
        try (PrintWriter writer = new PrintWriter(new File(filnavn)))
        {
            writer.println(message);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
