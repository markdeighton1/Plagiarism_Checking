import java.io.*;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main 
{
	public static void main(String[] args) throws Exception
	{
		
		/*ReadFromFile RFF = new ReadFromFile();
		RFF.FileSelect();
		RFF.removeFormatting();*/
		
		ReadFromFile RFF = new ReadFromFile();
		RFF.FileSelect();
		RFF.removeFormatting();
		
		Frequency Frequency = new Frequency();
		Frequency.frequency(RFF.getSelected());
		Frequency.uniqueWords(RFF.getSelected());
		
		
		
	}
}	
