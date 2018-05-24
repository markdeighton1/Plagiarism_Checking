/**
* The Plagiarism Checker program implements 3 classes
* that allows the user too select two files to see if
* there are similar in terms of unique words and word
* frequency.
*
*
*
* @author  Mark Deighton
* @version 1.0
* @since   22-05-2018 
*/
public class Main 
{
	public static void main(String[] args)
	{
		
		Frequency Frequency = new Frequency();
		ReadFromFile RFF = new ReadFromFile();
		
		RFF.FileSelect();
		String file = RFF.getContent();
		String file2 = RFF.getContent2();
		Frequency.frequency(file2, 1);
		Frequency.uniqueWords(file2, 1);
		Frequency.frequency(file, 0);
		Frequency.uniqueWords(file, 0);
		
	}
}	
