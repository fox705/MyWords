package Words.Words;

import java.io.IOException;
import java.util.Map;

public class TranslateManager {

	
	
	public void Translate(String input, String language) throws IOException {
		
		Map<String, String> langs = YadexTranslateApi.getLangs();
		
		String source = YadexTranslateApi.detectLanguage(input);
		String target = YadexTranslateApi.getKey(langs, language);
		
		String output = YadexTranslateApi.translate(input, source, target);
		
		
		
		System.out.println("Detected lang: " + source + " (" + langs.get(source) + ")");
		
		System.out.println("Input: " + input);
		System.out.println("Output: " + output);
		
		System.out.println("Source: " + source);
		System.out.println("Target: " + target);
		
		
		System.out.println("langs.get(source): " + langs.get(source));
		System.out.println("langs.get(target): " + langs.get(target));
		System.out.println("TranslateAPI.getKey(langs, \"english\"): " + YadexTranslateApi.getKey(langs, "english"));

	}
	
	}
	
	

