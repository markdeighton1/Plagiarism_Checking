import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

/**
* This class allows the user to select the two 
* files to compare. It also reads the files and stores
* them in variables.
*
*
* @author  Mark Deighton
* @version 1.0
* @since   22-05-2018 
*/

public class ReadFromFile 
{
	/*
	 * Private instance variables for security. 
	 */
	private String file1 = "test1.txt";
	private String file2 = "test2.txt";
	private String file3 = "test3.txt";
	private String file4 = "test4.txt";
	private String file5 = "test5.txt";
	private String fileName = "";
	private String fileName2 = "";
	private String content = ""; 
	private String content2 = "";
	private String selected = "";
	
	/*
	 * getters and setters to get private instance variables content
	 * and sent them. 
	 */
	
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
	
	public void setFile(String selected) 
	{
		this.selected = selected;
	}
	
	public String getSelected()
	{
		return selected;
	}
	
	public String getContent2()
	{
		return content2;
	}
	
	public void setContent2(String content2)
	{
		this.content2 = content2;
	}
	
	public void setFileName(String FileName)
	{
		this.fileName = FileName;
	}
	
	public void setFileName2(String FileName2)
	{
		this.fileName2 = fileName2;
	}
	
	public String getFileName()
	{
		return fileName;
	}
	
	public String getFileName2()
	{
		return fileName2;
	}
	
	/*
	 * This method takes user input that checks which files should be
	 * used for comparison. This is done with nested if else statements.
	 */
	
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
				this.setFileName("test1.txt");
				this.setFile("test1.txt");
				this.removeFormatting();
				this.setContent2(content);
				System.out.println("Available Files are:\n" +
						file2 + "\n" +
						file3 + "\n" +
						file4 + "\n" +
						file5 + "\n");
				System.out.println("Please select the second file you would like to compare");
				String j = sc.nextLine();
				if(j.equals("Test2.txt") || j.equals("test2.txt") || j.equals("test2") || j.equals("2"))
				{
					System.out.println("You have selected test2.txt\n");
					this.setFileName2("test2.txt");
					this.setFile("test2.txt");
					this.removeFormatting();
					
				} else if(j.equals("Test3.txt") || j.equals("test3.txt") || j.equals("test3") || j.equals("3"))
				{
					System.out.println("You have selected test3.txt\n");
					this.setFileName2("test3.txt");
					this.setFile("test3.txt");
					this.removeFormatting();
					
				} else if(j.equals("Test4.txt") || j.equals("test4.txt") || j.equals("test4") || j.equals("4"))
				{
					System.out.println("You have selected test5.txt\n");
					this.setFileName2("test4.txt");
					this.setFile("test4.txt");
					this.removeFormatting();
					
				} else if(j.equals("Test5.txt") || j.equals("test5.txt") || j.equals("test5") || j.equals("5"))
				{
					System.out.println("You have selected test5.txt\n");
					this.setFileName2("test5.txt");
					this.setFile("test5.txt");
					this.removeFormatting();
				}
				
		} else if(i.equals("Test2.txt") || i.equals("test2.txt") || i.equals("test2") || i.equals("2"))
		{
				
				System.out.println("You have selected test2.txt\n");
				this.setFileName("test2.txt");
				this.setFile("test2.txt");
				this.removeFormatting();
				this.setContent2(content);
				System.out.println("Available Files are:\n" +
						file1 + "\n" +
						file3 + "\n" +
						file4 + "\n" +
						file5 + "\n");
				System.out.println("Please select the second file you would like to compare");
				String j = sc.nextLine();
				if(j.equals("Test1.txt") || j.equals("test1.txt") || j.equals("test1") || j.equals("1"))
				{
					System.out.println("You have selected test1.txt\n");
					this.setFileName2("test1.txt");
					this.setFile("test1.txt");
					this.removeFormatting();
					
				} else if(j.equals("Test3.txt") || j.equals("test3.txt") || j.equals("test3") || j.equals("3"))
				{
					System.out.println("You have selected test3.txt\n");
					this.setFileName2("test3.txt");
					this.setFile("test3.txt");
					this.removeFormatting();
					
				} else if(j.equals("Test4.txt") || j.equals("test4.txt") || j.equals("test4") || j.equals("4"))
				{
					System.out.println("You have selected test5.txt\n");
					this.setFileName2("test4.txt");
					this.setFile("test4.txt");
					this.removeFormatting();
					
				} else if(j.equals("Test5.txt") || j.equals("test5.txt") || j.equals("test5") || j.equals("5"))
				{
					System.out.println("You have selected test5.txt\n");
					this.setFileName2("test5.txt");
					this.setFile("test5.txt");
					this.removeFormatting();
				}
				
		} else if(i.equals("Test3.txt") || i.equals("test3.txt") || i.equals("test3") || i.equals("3"))
		{
				
				System.out.println("You have selected test3.txt\n");
				this.setFileName("test3.txt");
				this.setFile("test3.txt");
				this.removeFormatting();
				this.setContent2(content);
				System.out.println("Available Files are:\n" +
						file1 + "\n" +
						file2 + "\n" +
						file4 + "\n" +
						file5 + "\n");
				System.out.println("Please select the second file you would like to compare");
				String j = sc.nextLine();
				if(j.equals("Test1.txt") || j.equals("test1.txt") || j.equals("test1") || j.equals("1"))
				{
					System.out.println("You have selected test1.txt\n");
					this.setFileName2("test1.txt");
					this.setFile("test1.txt");
					this.removeFormatting();
					
				} else if(j.equals("Test2.txt") || j.equals("test2.txt") || j.equals("test2") || j.equals("2"))
				{
					System.out.println("You have selected test2.txt\n");
					this.setFileName2("test2.txt");
					this.setFile("test2.txt");
					this.removeFormatting();
					
				} else if(j.equals("Test4.txt") || j.equals("test4.txt") || j.equals("test4") || j.equals("4"))
				{
					System.out.println("You have selected test4.txt\n");
					this.setFileName2("test4.txt");
					this.setFile("test4.txt");
					this.removeFormatting();
					
				} else if(j.equals("Test5.txt") || j.equals("test5.txt") || j.equals("test5") || j.equals("5"))
				{
					System.out.println("You have selected test5.txt\n");
					this.setFileName2("test5.txt");
					this.setFile("test5.txt");
					this.removeFormatting();
				}
				
		}else if(i.equals("Test4.txt") || i.equals("test4.txt") || i.equals("test4") || i.equals("4"))
		{
			
			System.out.println("You have selected test4.txt\n");
			this.setFileName("test4.txt");
			this.setFile("test4.txt");
			this.removeFormatting();
			this.setContent2(content);
			System.out.println("Available Files are:\n" +
					file1 + "\n" +
					file2 + "\n" +
					file3 + "\n" +
					file5 + "\n");
			System.out.println("Please select the second file you would like to compare");
			String j = sc.nextLine();
			if(j.equals("Test1.txt") || j.equals("test1.txt") || j.equals("test1") || j.equals("1"))
			{
				System.out.println("You have selected test1.txt\n");
				this.setFileName2("test1.txt");
				this.setFile("test1.txt");
				this.removeFormatting();
				
			} else if(j.equals("Test2.txt") || j.equals("test2.txt") || j.equals("test2") || j.equals("2"))
			{
				System.out.println("You have selected test2.txt\n");
				this.setFileName2("test2.txt");
				this.setFile("test2.txt");
				this.removeFormatting();
				
			} else if(j.equals("Test3.txt") || j.equals("test3.txt") || j.equals("test3") || j.equals("3"))
			{
				System.out.println("You have selected test3.txt\n");
				this.setFileName2("test3.txt");
				this.setFile("test3.txt");
				this.removeFormatting();
				
			} else if(j.equals("Test5.txt") || j.equals("test5.txt") || j.equals("test5") || j.equals("5"))
			{
				System.out.println("You have selected test5.txt\n");
				this.setFileName2("test5.txt");
				this.setFile("test5.txt");
				this.removeFormatting();
			}
		}else if(i.equals("Test5.txt") || i.equals("test5.txt") || i.equals("test5") || i.equals("5"))
		{
			
			System.out.println("You have selected test5.txt\n");
			this.setFileName("test5.txt");
			this.setFile("test5.txt");
			this.removeFormatting();
			this.setContent2(content);
			System.out.println("Available Files are:\n" +
					file1 + "\n" +
					file2 + "\n" +
					file3 + "\n" +
					file4 + "\n");
			System.out.println("Please select the second file you would like to compare");
			String j = sc.nextLine();
			if(j.equals("Test1.txt") || j.equals("test1.txt") || j.equals("test1") || j.equals("1"))
			{
				System.out.println("You have selected test1.txt\n");
				this.setFileName2("test1.txt");
				this.setFile("test1.txt");
				this.removeFormatting();
				
			} else if(j.equals("Test2.txt") || j.equals("test2.txt") || j.equals("test2") || j.equals("2"))
			{
				System.out.println("You have selected test2.txt\n");
				this.setFileName2("test2.txt");
				this.setFile("test2.txt");
				this.removeFormatting();
				
			} else if(j.equals("Test3.txt") || j.equals("test3.txt") || j.equals("test3") || j.equals("3"))
			{
				System.out.println("You have selected test3.txt\n");
				this.setFileName2("test3.txt");
				this.setFile("test3.txt");
				this.removeFormatting();
				
			} else if(j.equals("Test4.txt") || j.equals("test4.txt") || j.equals("test4") || j.equals("4"))
			{
				System.out.println("You have selected test5.txt\n");
				this.setFileName2("test4.txt");
				this.setFile("test4.txt");
				this.removeFormatting();
			}
		}
		sc.close();
	}
	
	/*
	 * This class removes the formatting of the text by removing white space, punctuation
	 * and capitalisation. It ignores any text that is in quotation marks "".
	 * 
	 */
	
	
	public void removeFormatting()
	{
		try {
			
			BufferedReader in = new BufferedReader(new FileReader(selected));
			String line = "";
			this.setContent("");
			
			while((line = in.readLine()) != null)
			{
				line = line.trim();
				if (!line.equals(" "))
				{
				content = content + line;
				}
			}
			content = content.toLowerCase();
			content = content.replaceAll("\"[^\"]+\"", ""); //strips out anything in quotes
			content = content.replaceAll("[^a-zA-Z ]", "");
			this.setContent(content);
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
