package tendomloop;

import java.util.Scanner;

public class Pbm1 {
public static void main(String[] args) {
char operation;
double a,b,res;
Scanner sc=new Scanner(System.in);

System.out.println("choose an operation:+,-,*,/");
operation=sc.next().charAt(0);

System.out.println("Enter the value of a");
a=sc.nextDouble();

System.out.println("Enter the value of b");
b=sc.nextDouble();

switch (operation) {
case '+':
	res=a+b;
	System.out.println(a+"+"+b+"="+res);
	break;
case '-':
	res=a-b;
	System.out.println(a+"-"+b+"="+res);
	break;
case '*':
	res=a*b;
	System.out.println(a+"*"+b+"="+res);
	break;
case '/':
	res=a/b;
	System.out.println(a+"/"+b+"="+res);
	break;
}
}
}