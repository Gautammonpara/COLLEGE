import java.lang.System;
import java.lang.*;
import java.io.*;
class category
{

};
class assi2
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		boolean t=true,f=false,i;
		int ch;
		int cid,gst;
		int pid,price;
		String pname;
		String cname;
		while(t)
		{
			System.out.println("\n 1.Category...");
			System.out.println("\n 2.Product...");
			System.out.println("\n 3.Display Bill...");
			System.out.println("\n Enter Your Choice...!!!");
			ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1: 
					do
					{
						System.out.println("\n 1. Add Category");
						System.out.println("\n 2.Manage Category...");
						System.out.println("\n 0.EXIT");
						System.out.println("\n Enter Your Choice...!!!");
						ch=Integer.parseInt(br.readLine());
						switch(ch)
						{
							case 1: 
								System.out.println("\n Enter Category Id : ");
								cid=Integer.parseInt(br.readLine());
								System.out.println("\n Enter Category Name : ");
								cname=br.readLine();
								System.out.println("\n Enter GST Rate : ");
								gst=Integer.parseInt(br.readLine());
							break;
							case 2:
								do
								{
									System.out.println("\n 1. Edit Category");
									System.out.println("\n 2.Delete Category...");
									System.out.println("\n 0.EXIT");
									System.out.println("\n Enter Your Choice...!!!");
									ch=Integer.parseInt(br.readLine());
									switch(ch)
									{
										case 1:
											System.out.println("\n Sorry EDIT is not valide");
										break;
										case 2:
											System.out.println("\n Sorry DELETE is not valide");
										break;
										case 0:
											i=f;
										break;
									}
								}while(i=f);
								break;
							case 0:
								i=f;
							break;
						}
						
					}while(i=f);
				break;
				case 2:
					System.out.println("\n Enter Product Id : ");
					pid=Integer.parseInt(br.readLine());
					System.out.println("\n Enter Product Name : ");
					pname=br.readLine();
					System.out.println("\n Enter Category Id : ");
					cid=Integer.parseInt(br.readLine());
					System.out.println("\n Enter Price: ");
					price=Integer.parseInt(br.readLine());
				break;
				case 3:
					//System.out.println("\n Product Id : "+pid+"\n Product Name : "+pname+"\n Category Id"+cid+"\n Price : "+price+"\n GST : "+gst);
				break;
			}
		}
	}
}