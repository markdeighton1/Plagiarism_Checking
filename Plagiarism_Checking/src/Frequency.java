import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;


public class Frequency {
	
	private String frequency2 = "";
	private String theWord2 = "";
	private String mostFrequentlyUsed2 = "";
	
	public String getFrequency2()
	{
		return frequency2;
	}
	
	public String getTheWord2()
	{
		return theWord2;
	}
	
	public String getMostFrequentlyUsed2()
	{
		return mostFrequentlyUsed2; 
	}
	
	public void setFrequency2(String frequency2)
	{
		this.frequency2 = frequency2;
	}
	
	public void setTheWord2(String theWord2)
	{
		this.theWord2 = theWord2;
	}
	
	public void setMostFrequentlyUsed2(String mostFrequentlyUsed2)
	{
		this.mostFrequentlyUsed2 = mostFrequentlyUsed2;
	}
	
	
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
			Set<String> wordsOf = new HashSet<>();
			
			int totalWords = 0;
			
					String [] words = file.split(" ");
					totalWords += words.length;
					
					for(String word : words)
					{
						String cleanedUpWord = word;
						wordsOf.add(cleanedUpWord);
					}
					
			
			System.out.println();
			System.out.println("Unique Words:");
			System.out.println(wordsOf.size());
			System.out.println();
			System.out.println("Total Words: ");
			System.out.println(totalWords);
	}
}
