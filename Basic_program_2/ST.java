import java.util.Scanner;
public class ST
{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("enter student:");
int student = sc.nextInt();
System.out.print("enter pen:");
double pen = sc.nextInt();
double q = pen/student;
double r = pen - (q*student);
System.out.print(r);
}
}
