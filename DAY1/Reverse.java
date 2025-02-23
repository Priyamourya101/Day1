class Reverse
{
public static void main(String args[])
{
int n=12345;
int rev=0;
System.out.println(n);

for(;n!=0;)
{
int a=n%10;
 rev=rev*10+a;
n=n/10;

}
System.out.println(rev);

}
}