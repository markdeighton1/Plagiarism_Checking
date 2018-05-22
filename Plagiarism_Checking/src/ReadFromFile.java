import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class ReadFromFile 
{
	private String file1 = "test1.txt";
	private String file2 = "test2.txt";
	private String file3 = "test3.txt";
	private String file4 = "test4.txt";
	private String file5 = "test5.txt";
	private String content = ""; 
	private String selected = "";

	
	public String getFile1()
	{
		return file1;
	}
	
	public String getFile2()
	{
		return file2;
	}
	
	public String getFile3()
	{
		return file3;
	}
	
	public String getFile4()
	{
		return file4;
	}
	
	public String getFile5()
	{
		return file5;
	}
	
	public String getContent()
	{
		return content;
	}
	
	public void setContent(String content)
	{
		this.content = content;
	}
	
	public void setFile(String selected) {
		this.selected = selected;
	}
	
	public String getSelected()
	{
		return selected;
	}

	public void FileSelect() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Available Files are:\n" + 
				file1 + "\n" +
				file2 + "\n" +
				file3 + "\n" +
				file4 + "\n" +
				file5 + "\n");
		System.out.println("Please select the first file you would like to compare");
		String i = sc.nextLine();
		if(i.equals("Test1.txt") || i.equals("test1.txt") || i.equals("test1") || i.equals("1"))
		{
			System.out.println("You have selected test1.txt\n");
			this.setFile("test1.txt");
		} else if(i.equals("Test2.txt") || i.equals("test2.txt") || i.equals("test2") || i.equals("2"))
		{
			System.out.println("You have selected test2.txt\n");
			this.setFile("test2.txt");
		}
		sc.close();
	}
	
	
	public void removeFormatting()
	{
		try {
			
			BufferedReader in = new BufferedReader(new FileReader(selected));
			String line = "";
			
			while((line = in.readLine()) != null)
			{
				line = line.trim();
				if (!line.equals(" "))
				{
				content = content + line;
				}
			}
			content = content.toLowerCase();
			content = content.replaceAll("[^a-zA-Z ]", "");
			this.setContent(content);
			in.close();
			//System.out.println(content + "\n");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
