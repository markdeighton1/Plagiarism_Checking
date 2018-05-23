
public class Compare 
	{
	
		Frequency Frequency = new Frequency();
		ReadFromFile RFF = new ReadFromFile();
		
		
		public void comparison()
		{
			RFF.FileSelect();
			String file = RFF.getContent();
			String file2 = RFF.getContent2();
			Frequency.frequency(file2, 1);
			Frequency.uniqueWords(file2, 1);
			Frequency.frequency(file, 0);
			Frequency.uniqueWords(file, 0);
			
			int one = Frequency.getMostFrequentlyUsed2();
			int two = Frequency.getMostFrequentlyUsed();
			System.out.println();
			System.out.println("In file " + RFF.getFileName() + " there are " );
			
			
			
		}
		
		
	}

