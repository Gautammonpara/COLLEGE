import java.lang.System;
import java.lang.String;
import java.io.*;
class test12
{
	int pid;
	String pname;
	public test12(){}
	public test12(int id1,String name1)
	{
		pid=id1;
		pname=name1;
	}
	public void dis1()
	{
		System.out.println("id = "+pid+"name = "+pname);
	}
	
};
classs test13 extends test12
{
	int cid;
	String cname;
	public test13(){}
	public test13(int id1,String name1,int id2,String name2)
	{
		super(id1,name1);
		cid=id2;
		cname=name2;
	}
	public void dis()
	{
		super.dis1();
	}
};
class demo
{
	public static void main(String arg[])
	{
		test13 ob=new test13(101,"pni",201,"cni");
		ob.dis();
	}
}

