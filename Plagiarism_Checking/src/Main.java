
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
		String file = RFF.getContent();
		String file2 = RFF.getContent2();
		System.out.println(file);
		System.out.println();
		System.out.println(file2);
//		Frequency Frequency = new Frequency();
//		Frequency.frequency(file);
//		Frequency.uniqueWords(RFF.getSelected());
		
		
		
	}
}	
