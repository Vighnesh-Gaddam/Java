import java.util.Scanner;

class Evendemo{
    public static void main(String args[])
    {
        System.out.print("please enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0)
        {
            System.out.println("GIven number is even");
        }
        else
        {
            System.out.println("Given number is odd");
        }
        }
}