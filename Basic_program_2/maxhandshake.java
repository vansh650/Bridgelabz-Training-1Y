import java.util.Scanner;
class maxhandshake{
public static void main(String[] args){  
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int maxhandshake = (n*(n-1));
System.out.println(maxhandshake);
}
}