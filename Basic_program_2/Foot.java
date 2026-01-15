import java.util.Scanner;
public class Foot
{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("enter height:");
double height = sc.nextInt();
double feet = (height/30.43);
System.out.print("feet is :" +feet);
double inches = (1/12)*feet;
System.out.print("inches is :"+inches);
}
}


 