import java.util.Scanner;
class Days
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
String day=obj.next();
switch(day)
{
case "mon":
System.out.println(" it is a monday");
break;
case "tue":
System.out.println(" it is a tuesday");
break;
case "wed":
System.out.println(" it is a wednesday");
break;
case "thur":
System.out.println(" it is a thursday");
break;
case "fri":
System.out.println(" it is a friday");
break;
case "sat":
System.out.println(" it is a saturday");
break;
case "sun":
System.out.println(" it is asunday");
break;
}
obj.close();
}
}