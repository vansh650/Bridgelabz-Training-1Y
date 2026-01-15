import java.util.Scanner;
public class Course
{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("enter fee:");
int fee = sc.nextInt();
double DP;
System.out.print("enter discount percent :");
DP = sc.nextInt();
double DA = (fee*DP)/100;
System.out.println("discount amount is :" +DA);
System.out.print("enter discounted price :");
double FD = sc.nextInt();
FD = fee-DA;
System.out.print("final discount fee is :" +FD);
}
}

