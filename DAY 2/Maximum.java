import java.util.*;
class Maximum
{
public static void main(String args[])
{
int a,b;
Scanner obj=new Scanner(System.in);
System.out.println("enter a value:");
a=obj.nextInt();
System.out.println("enter b value:");
b=obj.nextInt();
if(a>b)
{
System.out.println("a is a maximum:"+a);
}
else if(b>a)
{
System.out.println("b is a maximum :"+b);
}
else
{
System.out.println("it is a default");
}
obj.close();
}
}