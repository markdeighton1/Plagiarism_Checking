
public class Main 
{
	public static void main(String[] args) throws Exception
	{
		
		/*
		 * 	String file = RFF.getContent();
		 *	System.out.println(file);
		 */
		
		ReadFromFile RFF = new ReadFromFile();
		RFF.FileSelect();
		RFF.removeFormatting();
		String file = RFF.getContent();
		//System.out.println(file);
		Frequency Frequency = new Frequency();
		Frequency.frequency(file);
		Frequency.uniqueWords(RFF.getSelected());
		
		
		
	}
}	
