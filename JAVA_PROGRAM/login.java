import java.lang.System;
import java.lang.String;
import java.io.*;
class register
{
	String fname,lname,gender,mail,pass,cpass,cunt,city,state;
	public register(){}
	public register(String fname1,String lname1,String gender1,String mail1,String pass1,String cpass1,String cunt1,String city1,String state1)
	{
		fname=fname1;
		lname=lname1;
		gender=gender1;
		mail=mail1;
		pass=pass1;
		cpass=cpass1;
		cunt=cunt1;
		city=city1;
		state=state1;
	}
	public void dis()
	{
		System.out.println(fname+"\t\t"+lname+"\t\t"+gender+"\t\t"+mail+"\t\t"+cunt+"\t\t"+state+"\t\t"+city);			
	}
};
class login
{
	public static void main(String o[])throws IOException
	{
		register[] ob=new register[3];
		boolean b=false;
		int ch=0,f=0;
		int len;
		char[] temp=new char[15];
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		String fname,lname,gender,mail,pass,cpass,cunt,city,state;
		do{
			System.out.println("1.REGISTER ");
			System.out.println("2.LOGIN ");
			System.out.println("0.EXIT ");
			System.out.println(" --> ENTER YOUR CHOICE ");
			ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1:
					System.out.println("Enter Mail ");
					mail=br.readLine();
					System.out.println("Enter First Name ");
					fname=br.readLine();
					System.out.println("Enter Last Name ");
					lname=br.readLine();
					do{
						b=false;
						System.out.println("Enter Gender (M/F) ");
						gender=br.readLine();
						if(gender.equals("m")||gender.equals("M")||gender.equals("f")||gender.equals("F"))
						{
							b=true;
						}
					}while(b!=true);
					System.out.println("ENTER PASSWORD ");
					pass=br.readLine();
					do{
						b=false;
						System.out.println("ENTER CONFIRM PASSWORD ");
						cpass=br.readLine();
						if(cpass.equals(pass)!=true)
						{
							System.out.println("INVALID CONFIRM PASSWORD ");
							b=true;
						}
					}while(b==true);
					System.out.println("Enter Country ");
					cunt=br.readLine();
					System.out.println("Enter City ");
					city=br.readLine();
					System.out.println("Enter State ");
					state=br.readLine();
					ob[f]=new register(fname,lname,gender,mail,pass,cpass,cunt,city,state);
					f++;
					break;
				case 2:
					System.out.println("Enter Rgister Mail Id ");
					mail=br.readLine();
					b=false;
					for(int k=0;k<f;k++)
					{
						if(mail.equals(ob[k].mail)==true)
						{
							System.out.println("Enter Password ");
							pass=br.readLine();
							if(pass.equals(ob[k].pass)==true)
							{
								System.out.println("Login Succesfully ");
								System.out.println("\n\nFIRSTNAME\tLASTNAME\tGENDER\tMAIL\tCUNTRY\tSTATE\tCITY");
								ob[k].dis();
								b=false;
							}
						}
					}
					break;
				case 0:
					System.exit(0);
			}
			
		}while(ch!=3);	
	}
}



















