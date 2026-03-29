import java.util.Scanner;
public class FizzBuzz{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int num[] = sc.nextInt();
String num[] = new String[20];
if(num<0){
System.out.println("invalid ");
return ;
}
for(int i=0;i<num.length;i++){
if(num%3==0 && num%5==0){
result[i] = "FizzBuzz";
}
else if(num%3==0){
result[i] = "Fizz";
}
else if(num%5==0){
result[i] = "Buzz";
}
else {
result[i] = String.valueOf(result);
}
