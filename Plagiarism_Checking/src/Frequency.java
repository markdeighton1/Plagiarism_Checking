import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class Frequency {
	
	
	public void frequency(String file) 
	{		
				Map<String, Integer> frequency = new HashMap<>();
						
				
				String[] words = file.split(" ");
						
						for(String word : words) {
								if(frequency.containsKey(word))
								{
									frequency.put(word, frequency.get(word) + 1);
								}
								else
								{
									frequency.put(word, 1);
								}
						}
					
				System.out.println(frequency);

				int mostFrequentlyUsed = 0;
				String theWord = null;
				
				for(String w : frequency.keySet()) {
					Integer theVal = frequency.get(w);
					if(theVal > mostFrequentlyUsed) {
						mostFrequentlyUsed = theVal;
						theWord = w;
					}
				}
				System.out.println();
				System.out.printf("The most frequently used word is '%s', used %d times.", 
						theWord, mostFrequentlyUsed);
				System.out.println();	
	}
	
	
	public void uniqueWords(String file) throws Exception
	{
			BufferedReader reader = new BufferedReader(new FileReader(file));
			
			Set<String> wordsOf = new HashSet<>();
		
			String line = reader.readLine();
			int totalWords = 0;
			while(line != null) 
			{
				if(!line.trim().equals("")) 
				{
					String [] words = line.split(" ");
					totalWords += words.length;
					
					for(String word : words)
					{
						String cleanedUpWord = word.toLowerCase().replaceAll("[^a-zA-Z ]", "");
						wordsOf.add(cleanedUpWord);
					}
				}
				line = reader.readLine();
			} 
			System.out.println();
			System.out.println("Unique Words:");
			System.out.println(wordsOf.size());
			System.out.println();
			System.out.println("Total Words: ");
			System.out.println(totalWords);
			reader.close();
	}
}
