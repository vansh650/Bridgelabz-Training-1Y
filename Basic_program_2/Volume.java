import java.util.Scanner;
public class Volume
{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("enter radius of earth :");
double pi = 3.14;
double r;
r = sc.nextInt();
double volume; 
volume = (4/3)*pi*r*r*r;
System.out.println("volume of earth in cubic  is :" +volume);
double miles = volume*1.6;
System.out.print("cubic miles is :" +miles);


}
}



