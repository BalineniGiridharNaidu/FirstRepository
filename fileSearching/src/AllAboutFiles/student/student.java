package AllAboutFiles.student;

public class student
{
	private int sid;
	private String sname;
	private String scourse;
	private int age;
	
	@Override
	public String toString()
	{
		return sid+","+sname+","+scourse+","+age;
	}
	public student()
	{
		super();
	}


	public student(int sid, String sname, String scourse, int age)
	{
		super();
		this.sid = sid;
		this.sname = sname;
		this.scourse = scourse;
		this.age = age;
	}


	public int getSid()
	{
		return sid;
	}


	public void setSid(int sid)
	{
		this.sid = sid;
	}


	public String getSname()
	{
		return sname;
	}


	public void setSname(String sname)
	{
		this.sname = sname;
	}


	public String getScourse()
	{
		return scourse;
	}


	public void setScourse(String scourse)
	{
		this.scourse = scourse;
	}


	public int getAge()
	{
		return age;
	}


	public void setAge(int age)
	{
		this.age = age;
	}
	
	
	
	
	
}
