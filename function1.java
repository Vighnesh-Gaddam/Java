import java.util.*;
public class function1 
{
    static void  bino(int n , int r)
    {
    int a = n-r;
       for(int i = a-1;i>0;i--)
       {
        a=a*i;
       }
       for(int i = n-1;i>0;i--)
       {
        n=n*i;
       }
       for(int i = r-1;i>0;i--)
       {
        r=r*i;
       }
       System.out.println("n:"+n);
       System.out.println("r:"+r);
       System.out.println("n-r:"+a);

       int bino = n / (r*a);
       System.out.println(bino);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        sc.close();
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        bino(5,2);
    }
}
