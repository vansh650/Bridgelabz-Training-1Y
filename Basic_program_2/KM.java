import java.util.Scanner;
public class KM
{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("enter value");
double KM = sc.nextInt();
double miles = sc.nextInt();
miles = KM * 1.6;
System.out.print(miles);
}
}