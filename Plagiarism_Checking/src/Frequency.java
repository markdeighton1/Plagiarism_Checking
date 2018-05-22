import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class Frequency {
	

	public void frequency(String fileName) 
	{		
			try {
				BufferedReader reader = new BufferedReader(new FileReader(fileName));
				Map<String, Integer> frequency = new HashMap<>();
				
				String line = reader.readLine();
				while(line != null) {
					//System.out.println("Processing line: " + line);
					
					if(!line.trim().equals("")) {
						String [] words = line.split(" ");
						
						for(String word : words) {
							if(word == null || word.trim().equals("")) {
								continue;
							}
							String processed = word.toLowerCase();
							processed = processed.replaceAll("[^a-zA-Z ]", "");
							
							if(frequency.containsKey(processed)) 
							{
								frequency.put(processed, frequency.get(processed) + 1);
							} else {
								frequency.put(processed, 1);
							}
						}
					}
					
					line = reader.readLine();
				}
				reader.close();
				System.out.println("FileName: " + fileName + "\n");
				System.out.println(frequency);
				
				int mostFrequentlyUsed = 0;
				String theWord = null;
				
				for(String word : frequency.keySet()) {
					Integer theVal = frequency.get(word);
					if(theVal > mostFrequentlyUsed) {
						mostFrequentlyUsed = theVal;
						theWord = word;
					}
				}
				System.out.println();
				System.out.printf("The most frequently used word is '%s', used %d times.", 
						theWord, mostFrequentlyUsed);
				System.out.println();
				
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	public void uniqueWords(String fileName) throws Exception
	{
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			
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
