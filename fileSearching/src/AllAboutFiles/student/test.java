package AllAboutFiles.student;

import java.io.IOException;

public class test
{
	public static void main(String[] args) throws IOException
	{
		stdController stdc = new stdController();
		
		student s = new student(1, "Giri", "Java", 89);
		
		stdc.addStudent(s);
	}
}
