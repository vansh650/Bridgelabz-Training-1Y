import java.util.Scanner;
public class Perimeter
{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("the length of the side is ");
double side ,perimeter;
side = sc.nextInt();
perimeter = 4*side;
System.out.print("perimeter is " +perimeter);
}
}
