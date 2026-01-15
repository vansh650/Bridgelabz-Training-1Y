import java.util.Scanner;
public class Operator
{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
double a,b,c;
a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();
double f = a+b*c;
double  s = a*b+c;
double t = c+a/b;

System.out.print("precedence is :"+f);
System.out.print("precedence is :"+s);
System.out.print("precedence is :"+t);
}
}
