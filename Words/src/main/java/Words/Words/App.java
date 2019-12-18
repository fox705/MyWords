package Words.Words;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //WordManager wm = new WordManager();
        TranslateManager tm = new TranslateManager();
        
        try {
			tm.Translate("macierzyństwo", "english");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
