import java.lang.*;
import java.io.*;
class friend
{
	String name,email;
	public friend()
	{
		name=null;
		email=null;
	}
		public friend(String fname,String email1)
		{
			name=fname;
			email=email1;
		}
			public void dis_friend()
			{
				System.out.println("\n\nName ="+name+"\n\nEmail ="+email);
			}
};
class buddy extends friend
{
	String dob,add,mno;
	public buddy()
	{
		dob=null;
		add=null;
		mno=null;
	}
		public buddy(String bdob,String badd)
		{
			dob=bdob;
			add=badd;
		}
		public buddy(String bdob,String badd,String bmno,String fname,String email1)
		{
			super(fname,email1);
			dob=bdob;
			add=badd;
			mno=bmno;
		}
		public void dis_buddy()
		{
			super.dis_friend();
			System.out.println("\nD_O_B ="+dob+"\n\naddress ="+add+"\n\nmno ="+mno+"\n\n\n");
		}
};
class mainbuddy
{
	public static void main(String o[])
	{
		buddy obj1=new buddy();
		buddy obj2=new buddy("01-11-22","surat","+91 9876000021","abc","abcajddj,h1");
		obj2.dis_buddy();
	}
}
			
		
	
	