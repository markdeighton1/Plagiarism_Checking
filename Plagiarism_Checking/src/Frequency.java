import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.*;
/**
* This class is intended to check the frequency of words
* of the file and find the unique words of that file.
* It also sorts the most frequent words into a top 10 
* list.
*
*
*
* @author  Mark Deighton
* @version 1.0
* @since   22-05-2018 
*/



public class Frequency {
	
	/*
	 * Private instance variables for security. 
	 */
	
	private String theWord = "";
	private int mostFrequentlyUsed = 0;
	private String theWord2 = "";
	private int mostFrequentlyUsed2 = 0;
	private int uniqueWords = 0;
	private int uniqueWords1 = 0;
	
	/*
	 * getters and setters to get private instance variables content
	 * and sent them. 
	 */
	

	
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
	/*
	 * This method utilises hashmaps and list so that the file
	 * when split into just words can be sorted into key and value pairs
	 * this means that each word is assigned as the key and the value
	 * is the number of times the word occurs
	 */
	
	
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
				
				frequency.remove(""); //removes any key & value that may be empty.
				
				/*
				 * This allows me to sort the keyset (contents of the hashmap) 
				 * into a largest to smallest order.
				 */
				List<Map.Entry<String, Integer>> sortedList = new ArrayList<>();
				for(String key : frequency.keySet())
				{
					sortedList.add(new AbstractMap.SimpleEntry<String, Integer>(key, frequency.get(key)));
				}
				Collections.sort(sortedList, new Comparator<Map.Entry<String, Integer>>() 
				{
					@Override //Override a method subclass
					public int compare(final Map.Entry<String, Integer> lhs, Map.Entry<String, Integer> rhs) 
					{
						//if lhs is greater than rhs 
						if(lhs.getValue() < rhs.getValue())
						{
							return 1; //return 1
						} 
						//if lhs is less than rhs
						if(lhs.getValue() > rhs.getValue())
						{
							return -1; // return -1
						}
						return 0;
					}
				});
				
				sortedList = sortedList.subList(0, 10); //only obtain the first 10 entries of the sorted list
				this.setMostFrequentlyUsed(0);
				
				/*
				 * this gets the most frequently used words and 
				 * prints that along with the top 10
				 * most frequently used words
				 */
				for(String w : frequency.keySet()) {
					Integer theVal = frequency.get(w);
					if(theVal > mostFrequentlyUsed) {
						mostFrequentlyUsed = theVal;
						this.setTheWord(w);
					}
				}
				System.out.println(sortedList);
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
	/*
	 * This method is used to get the total words and unique words of the file
	 * and then print them out to screen. 
	 */

	public void uniqueWords(String file, int count)
	{
			Set<String> wordsOfFile = new HashSet<>();
			
			int totalWords = 0;
			
					String [] words = file.split(" ");
					totalWords += words.length;
					
					for(String word : words)
					{
						
						wordsOfFile.add(word);
					}
					
			
					
			System.out.println();
			System.out.println("Unique Words:");
			System.out.println(wordsOfFile.size());
			System.out.println();
			System.out.println("Total Words: ");
			System.out.println(totalWords);
			System.out.println();
			
	}
}
