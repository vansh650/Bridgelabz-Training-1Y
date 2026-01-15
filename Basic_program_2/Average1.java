import java.util.Scanner;
public class Average1
{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
int math = sc.nextInt();
int physics = sc.nextInt();
int  chemistry = sc.nextInt();
int average;
average = (math+physics+chemistry)/3;
System.out.print("Average:" +average);
}
}