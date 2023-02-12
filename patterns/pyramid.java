import java.util.Scanner;
public class pyramid  
{  
public static void main(String[] args)  
{  
//int rows=5;  
Scanner sc = new Scanner(System.in);
System.out.print("Input Number of rows:");
int rows = sc.nextInt();
for (int i= 0; i<= rows-1; i++)  
{  
for (int j=0; j<=i; j++)  
{  
System.out.print(" ");  
}  
for (int k=0; k<=rows-1-i; k++)  
{  
System.out.print("*" + " ");  
}  
System.out.println();  
}  
}  
}  