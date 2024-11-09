import java.util.*;
class Maximum2
{
public static void main(String args[])
{
int a,b,c;
Scanner obj=new Scanner(System.in);
System.out.println("enter a value:");
a=obj.nextInt();
System.out.println("enter b value:");
b=obj.nextInt();
System.out.println("enter c value:");
c=obj.nextInt();
if(a>b&&a>c)
{
System.out.println("the given a value:"+a);
}
else if(b>c&&b>a)
{
System.out.println("the given b value:"+b);
}
else if(c>a&&c>b)
{
System.out.println("the given c value:"+c);
}
else
{
System.out.println("it is a default value");
}
}
}