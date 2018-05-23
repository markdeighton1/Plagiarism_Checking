import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ReadFromFile 
{
	private String file1 = "test1.txt";
	private String file2 = "test2.txt";
	private String file3 = "test3.txt";
	private String file4 = "test4.txt";
	private String file5 = "test5.txt";
	private String content = ""; 
	private String content2 = "";
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
					this.setFile("test2.txt");
					this.removeFormatting();
					
				} else if(j.equals("Test3.txt") || j.equals("test3.txt") || j.equals("test3") || j.equals("3"))
				{
					System.out.println("You have selected test3.txt\n");
					this.setFile("test3.txt");
					this.removeFormatting();
					
				} else if(j.equals("Test4.txt") || j.equals("test4.txt") || j.equals("test4") || j.equals("4"))
				{
					System.out.println("You have selected test5.txt\n");
					this.setFile("test4.txt");
					this.removeFormatting();
					
				} else if(j.equals("Test5.txt") || j.equals("test5.txt") || j.equals("test5") || j.equals("5"))
				{
					System.out.println("You have selected test5.txt\n");
					this.setFile("test5.txt");
					this.removeFormatting();
				}
				
		} else if(i.equals("Test2.txt") || i.equals("test2.txt") || i.equals("test2") || i.equals("2"))
		{
				this.setContent2(content);
				System.out.println("You have selected test2.txt\n");
				this.setFile("test2.txt");
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
					this.setFile("test1.txt");
					
				} else if(j.equals("Test3.txt") || j.equals("test3.txt") || j.equals("test3") || j.equals("3"))
				{
					System.out.println("You have selected test3.txt\n");
					this.setFile("test3.txt");
					
				} else if(j.equals("Test4.txt") || j.equals("test4.txt") || j.equals("test4") || j.equals("4"))
				{
					System.out.println("You have selected test5.txt\n");
					this.setFile("test4.txt");
					
				} else if(j.equals("Test5.txt") || j.equals("test5.txt") || j.equals("test5") || j.equals("5"))
				{
					System.out.println("You have selected test5.txt\n");
					this.setFile("test5.txt");
				}
				
		} else if(i.equals("Test3.txt") || i.equals("test3.txt") || i.equals("test3") || i.equals("3"))
		{
				this.setContent2(content);
				System.out.println("You have selected test3.txt\n");
				this.setFile("test3.txt");
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
					this.setFile("test1.txt");
					
				} else if(j.equals("Test2.txt") || j.equals("test2.txt") || j.equals("test2") || j.equals("2"))
				{
					System.out.println("You have selected test2.txt\n");
					this.setFile("test2.txt");
					
				} else if(j.equals("Test4.txt") || j.equals("test4.txt") || j.equals("test4") || j.equals("4"))
				{
					System.out.println("You have selected test3.txt\n");
					this.setFile("test4.txt");
					
				} else if(j.equals("Test5.txt") || j.equals("test5.txt") || j.equals("test5") || j.equals("5"))
				{
					System.out.println("You have selected test5.txt\n");
					this.setFile("test5.txt");
				}
				
		}else if(i.equals("Test4.txt") || i.equals("test4.txt") || i.equals("test4") || i.equals("4"))
		{
			this.setContent2(content);
			System.out.println("You have selected test4.txt\n");
			this.setFile("test4.txt");
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
				this.setFile("test1.txt");
				
			} else if(j.equals("Test2.txt") || j.equals("test2.txt") || j.equals("test2") || j.equals("2"))
			{
				System.out.println("You have selected test2.txt\n");
				this.setFile("test2.txt");
				
			} else if(j.equals("Test3.txt") || j.equals("test3.txt") || j.equals("test3") || j.equals("3"))
			{
				System.out.println("You have selected test3.txt\n");
				this.setFile("test3.txt");
				
			} else if(j.equals("Test5.txt") || j.equals("test5.txt") || j.equals("test5") || j.equals("5"))
			{
				System.out.println("You have selected test5.txt\n");
				this.setFile("test5.txt");
			}
		}else if(i.equals("Test5.txt") || i.equals("test5.txt") || i.equals("test5") || i.equals("5"))
		{
			this.setContent2(content);
			System.out.println("You have selected test5.txt\n");
			this.setFile("test5.txt");
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
				this.setFile("test1.txt");
				
			} else if(j.equals("Test2.txt") || j.equals("test2.txt") || j.equals("test2") || j.equals("2"))
			{
				System.out.println("You have selected test2.txt\n");
				this.setFile("test2.txt");
				
			} else if(j.equals("Test3.txt") || j.equals("test3.txt") || j.equals("test3") || j.equals("3"))
			{
				System.out.println("You have selected test3.txt\n");
				this.setFile("test3.txt");
				
			} else if(j.equals("Test4.txt") || j.equals("test4.txt") || j.equals("test4") || j.equals("4"))
			{
				System.out.println("You have selected test5.txt\n");
				this.setFile("test4.txt");
			}
		}
	}
	
	
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
