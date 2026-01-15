import java.util.Scanner;
public class Distance
{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter distanceinfeet:");
double distanceInfeet = sc.nextInt();
double yard = 3*distanceInfeet;
System.out.print("distance in yard:" +yard);
double miles= sc.nextInt();
 yard = (1/1760)*miles;
System.out.print("distance in miles:" +yard);
}
}




