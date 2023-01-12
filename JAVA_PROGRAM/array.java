import java.lang.System;
import java.lang.String;
import java.io.*;
class array
{
	/*public static void main(String arg[])
	{
		int[] a={1,2,3,4,5};
		for(int i=0;i<4;i++)
		{
			System.out.println(a[i]);
		}
		for(int i:a)
		{
			System.out.println(i);
		}
	}*/
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] arr =new int[5];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter Value : ");
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<3;i++)
		{
			System.out.println(arr[i]);
		}
	}
}