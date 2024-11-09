import java.util.*;
class ThreeNumbers
{
public static void main(String args[])
{
int a;
Scanner obj=new Scanner(System.in);
System.out.println("enter a value:");
a=obj.nextInt();
if(a>0)
{
System.out.println("it is a positive");
}
else if(a<0)
{
System.out.println("it is a negative");
}
else
{
System.out.println("otherwise zero");
}
}
}