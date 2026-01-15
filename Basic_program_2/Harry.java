import java.util.Scanner;
public class Harry
{
public static void main(String args[]){
Scanner  sc = new Scanner (System.in);
System.out.print("enter Year:");
int birthYear = sc.nextInt();
System.out.print("current age:");
int currentAge = sc.nextInt();
int Age;
Age = currentAge-birthYear;
System.out.println(Age);
}
}


