class Swap
{
public static void main(String args[])
{
int a=10;
int b=20;
System.out.println("before swapping first number = "+a );
System.out.println("before swapping second number = "+b );

 a=a+b;
b=a-b;
a=a-b;

System.out.println("after swapping first number = "+a );
System.out.println("after swapping second number = "+b );


}}