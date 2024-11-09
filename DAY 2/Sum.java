import java.util.*;
class Sum
{
public static void main(String args[])
{
int i=1,n,sum=0;
Scanner obj=new Scanner(System.in);
System.out.println("enter the n natural numbers:");
n=obj.nextInt();
while(i<=n)
{
sum=sum+i;
i++;
}
System.out.println(i);
obj.close();
}
}