import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;



public class Frequency {
	
	private String theWord = "";
	private int mostFrequentlyUsed = 0;
	private String theWord2 = "";
	private int mostFrequentlyUsed2 = 0;
	private int uniqueWords = 0;
	private int uniqueWords1 = 0;
	

	
	public String getTheWord2()
	{
		return theWord2;
	}
	
	public int getMostFrequentlyUsed2()
	{
		return mostFrequentlyUsed2; 
	}
	
	
	public void setTheWord2(String theWord2)
	{
		this.theWord2 = theWord2;
	}
	
	public void setMostFrequentlyUsed2(int mostFrequentlyUsed2)
	{
		this.mostFrequentlyUsed2 = mostFrequentlyUsed2;
	}
	
	public String getTheWord()
	{
		return theWord;
	}
	
	public int getMostFrequentlyUsed()
	{
		return mostFrequentlyUsed;
	}
	
	public void setTheWord(String theWord)
	{
		this.theWord = theWord;
	}
	
	public void setMostFrequentlyUsed(int mostFrequentlyUsed)
	{
		this.mostFrequentlyUsed = mostFrequentlyUsed;
	}
	
	public void setUniqueWord(int uniqueWords)
	{
		this.uniqueWords = uniqueWords;
	}
	
	public void setUniqueWord2(int uniqueWords1)
	{
		this.uniqueWords1 = uniqueWords1;
	}
	
	public int getUniqueWord()
	{
		return uniqueWords;
	}
	
	public int getUniqueWord1()
	{
		return uniqueWords1;
	}
	
	public void frequency(String file, int count) 
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
				
				frequency.remove("");
				
				System.out.println();
				Map<String, Integer> sortedMap = frequency.entrySet().stream()
						.sorted(Map.Entry.comparingByValue())
						.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
								(e1, e2) -> e1, LinkedHashMap::new));
				
				//list
				//sort list
				
				System.out.println(sortedMap);
				
				for(String w : frequency.keySet()) {
					Integer theVal = frequency.get(w);
					if(theVal > mostFrequentlyUsed) {
						mostFrequentlyUsed = theVal;
						this.setTheWord(w);
					}
				}
				System.out.println();
				System.out.printf("The most frequently used word is '%s', used %d times.", 
						theWord, mostFrequentlyUsed);
				System.out.println();	
				if(count == 1)
				{
					this.setTheWord2(theWord);
					this.setMostFrequentlyUsed2(mostFrequentlyUsed);
				} 
	}
	
	
	public void uniqueWords(String file, int count)
	{
			Set<String> wordsOf = new HashSet<>();
			
			int totalWords = 0;
			
					String [] words = file.split(" ");
					totalWords += words.length;
					
					for(String word : words)
					{
						String cleanedUpWord = word;
						wordsOf.add(cleanedUpWord);
					}
					
			if(count == 1)
			{
				this.setUniqueWord(wordsOf.size());
				
			}
					
			System.out.println();
			System.out.println("Unique Words:");
			System.out.println(wordsOf.size());
			System.out.println();
			System.out.println("Total Words: ");
			System.out.println(totalWords);
	}
}
