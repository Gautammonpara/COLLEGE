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
		public friend(String fname)
		{
			name=fname;
		}
		public friend(String fname,String email1)
		{
			this(fname);
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
			this();
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
	public static void main(String o[])throws IOException
	{
		buddy[] gm=new buddy[10];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String nm,em,mo,bd,ad;
		int no;
		System.out.println("Enter number od record... : ");
		no=Integer.parseInt(br.readLine());
		for(int i=1;i<=no;i++)
		{
			System.out.println("Enter Name : ");
			nm=br.readLine();
			System.out.println("Enter Address : ");
			ad=br.readLine();
			System.out.println("Enter Birth of date : ");
			bd=br.readLine();
			System.out.println("Enter Mobile Number : ");
			mo=br.readLine();
			System.out.println("Enter Email : ");
			em=br.readLine();
			gm[i]=new buddy(bd,ad,mo,nm,em);
		}
		for(int i=;i<=no;i++)
		{
			gm[i].dis_buddy();
		}
	}
}
			
		
	
	