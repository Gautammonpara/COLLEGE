import java.lang.System;
import java.lang.String;
import java.io.*;
class stud
{
	int id;
	String name;
	
	public stud()
	{
		id=0;
		name="vishesh";
	}
	public stud(int sid,String name1)
	{
		id=sid;
		name=name1;
	}
	public void dis()
	{
		System.out.println(id+"\t"+name);
	}
};
class gautam
{
	public static void main(String arg[]) throws IOException
	{
		stud[] s=new stud[5];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int id1;
		String nm;
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter i :d");
			id1=Integer.parseInt(br.readLine());
			System.out.println("Enter name : ");
			nm=br.readLine();
			s[i]=new stud(id1,nm);
		}
		System.out.println("ID\tNAME");
		for(int i=0;i<3;i++)
		{
			s[i].dis();
		}
	}
}
