import java.io.*;
class Raj{
public static void main(String[]arg)
{
Console c= System.console();
int id=Integer.parseInt(c.readLine("Enter your day no."));

 switch(id){
 
case 1:
 System.out.println("The day is Monday");
 break;
case 2:
 System.out.println("The day is Tuesday");
 break;
case 3:
 System.out.println("The day is Wednesday");
 break;
case 4:
 System.out.println("The day is thursday");
 break;
case 5:
 System.out.println("The day is friday");
 break;
case 6:
 System.out.println("The day is Saturday");
 break;
case 7:
 System.out.println("The day is Sunday");
 break;
default :
break;
 }
}
}