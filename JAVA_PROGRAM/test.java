import java.lang.System;
import java.lang.String;
import java.io.*;
class test
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int id;
		String name;
		System.out.println("Enter id : ");
		id=Integer.parseInt(br.readLine());
		System.out.println("Enter name : ");
		name=br.readLine();
		System.out.println("id : "+id+" name : "+name+" product : "+pr);
		
	}
}