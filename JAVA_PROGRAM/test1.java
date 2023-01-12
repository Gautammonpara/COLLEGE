import java.lang.System;
import java.lang.String;
import java.io.*;
class test1
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int id;
		String name;
		int pr,z=0;
		System.out.println("Enter id : ");
		id=Integer.parseInt(br.readLine());
		System.out.println("Enter name : ");
		name=br.readLine();
		System.out.println("Enter product : ");
		pr=Integer.parseInt(br.readLine());
		if(pr>0)
		{
				z=pr/5;
		}
		else
		{
			System.out.println("THANK YOU FOR VISIT !!!");
		}
		System.out.println("id : "+id+" name : "+name+" number of product : "+pr +" number of free product : "+z);
		
	}
}