import java.io.*;
import java.util.Arrays;
public class Main 
{
	public static void main(String[] args)
	{
		/*String fileName = "test1.txt";
		
		String line = null;
		
		try {
			FileReader fileReader = new FileReader(fileName);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while((line = bufferedReader.readLine()) != null) 
			{
				System.out.println(line);
			}
			
			bufferedReader.close();
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("Unable to open file '" + fileName + "'");
		}
		catch(IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}*/
		
		ReadFromFile RFF = new ReadFromFile();
		RFF.removeCapitals();
		RFF.removePunctuation();
		String content = RFF.getContent();
		System.out.println(content);
	}
}	
