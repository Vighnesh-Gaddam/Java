import java.util.*;
public class prime_function
{
    static void prime(int  a)
    {
        boolean b = true;
        for(int i = 1;i*i<=a;i++)
        {
            if(a%i==0)
            {
                b=false;
            }
        }
            if(b==true)
            {
                System.out.println(a+" is prime");
            }
            else{
                System.out.println(a+" is not prime");
            }
        
    }
    public static void main(String args[])
    {
        int n = 10;
        for(int i = 1;i<=n;i++)
        {
            prime(i);
            
        }
    }
}
