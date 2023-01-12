import java.lang.System;
import java.lang.String;
import java.io.*;
class calculation_area
{
	double area;
	double pi=3.14;
	public void calculate_area(double d,int base,int height)
	{
		area=d*base*height;
		System.out.println("Area Of Triangle : "+area);
	}
	public void calculate_area(double radius)
	{
		area=pi*radius*radius;
		System.out.println("Area Of Circle : "+area);
	}
	public void calculate_area(int sq)
	{
		area=sq*sq;
		System.out.println("Area Of Square : "+area);
	}
	public void calculate_area(int length,int width)
	{
		area=length*width;
		System.out.println("Area Of Rectangle : "+area);
	}
};
class demo1
{
	public static void main(String ar[])throws IOException
	{
		calculation_area gm=new calculation_area();
		int b,h;
		double r;
		int s;
		int l,w;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Area Of Triangle Base : ");
		b=Integer.parseInt(br.readLine());
		System.out.println("Enter Area Of Triangle Height : ");
		h=Integer.parseInt(br.readLine());
		System.out.println("Enter Area Of Circle Radius : ");
		r=Double.parseDouble(br.readLine());
		System.out.println("Enter Area Of Square SQ : ");
		s=Integer.parseInt(br.readLine());
		System.out.println("Enter Area Of Rectangle Length : ");
		l=Integer.parseInt(br.readLine());
		System.out.println("Enter Area Of Rectangle Width : ");
		w=Integer.parseInt(br.readLine());
		gm.calculate_area(0.5,b,h);
		gm.calculate_area(r);
		gm.calculate_area(s);
		gm.calculate_area(l,w);
	}
	
}