import java.util.*;
class Natural
{
public static void main(String args[])
{
int i=1,n;
Scanner obj=new Scanner(System.in);
System.out.println("enter the n natural numbers:");
n=obj.nextInt();
while(i<=n)
{
System.out.println(i);
i++;
}
obj.close();
}
}