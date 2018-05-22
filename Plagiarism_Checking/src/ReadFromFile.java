import java.io.*;


public class ReadFromFile 
{
	private String file1 = "test1.txt";
	private String file2 = "test2.txt";
	private String file3 = "test3.txt";
	private String file4 = "test4.txt";
	private String file5 = "test5.txt";
	private String content; 
	
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
	
	public String removeCapitals()
	{
		try {
			BufferedReader in = new BufferedReader(new FileReader(file1));
			String line = null;
			
			while((line = in.readLine()) != null)
			{
				content = content + line;
			}
			
			content = content.toLowerCase();
			System.out.println(content);
			in.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} 
		return null;
	}
	
	public void removePunctuation()
	{
		try {
			BufferedReader in = new BufferedReader(new FileReader(file1));
			String line = null;
			
			while((line = in.readLine()) != null)
			{
				content = content + line;
			}
			content = content.replaceAll("[^a-zA-Z ]", "      ");
			System.out.println(content);
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
