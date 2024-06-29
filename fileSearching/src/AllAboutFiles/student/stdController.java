package AllAboutFiles.student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class stdController
{
	static String path = "./StudentsInfo.txt";
	
	public void addStudent(student s) throws IOException
	{
		FileWriter fw = new FileWriter(path,true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(s.toString());
		bw.newLine();
		bw.flush();
		bw.close();
		fw.close();
	}
	
	
	public void displayAll() throws IOException
	{
		FileReader fw = new FileReader(path);
		BufferedReader bw = new BufferedReader(fw);
		for(String s = bw.readLine(); s != null; s = bw.readLine())
		{
			bw.readLine();
			bw.close();
			fw.close();
		}
		
	}
}
