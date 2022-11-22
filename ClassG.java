package com.task1;

public class ClassG
{
public ClassG()
{
	System.out.println("Sunday");
	ClassG obj=new ClassG(10);
	System.out.println("Tuesday");
	String s=obj.display("Challenge Accepted");
	System.out.println(s);
}
public ClassG(int temp)
{
	System.out.println("Saturday");
	ClassG aobj=new ClassG(10,20);
	int a=aobj.meth1()+temp;
	System.out.println("===>"+(a+aobj.meth2()));
	System.out.println("Monday");
}
String display(String s)
{
	System.out.println("In the next statement I am returning String value");
	return s;
}
int meth1()
{
	return 100;
}
int meth2()
{
	return 99;
}
public ClassG(int data,int temp)
{
	System.out.println("Thursday");
	System.out.println("===>"+(data+new ClassG("HI").meth2()-temp));
}
ClassG(String s)
{
	System.out.println(s);
}
public static void main(String[] args) 
{
	ClassG obj=new ClassG();
	System.out.println("output verified");
}
}
