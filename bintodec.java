import java.lang.Math;
public class bintodec
{
    static void decimal(int a)
    {
        int oldnum=a;
        int dec = 0,pow=0;
        while(a>0)
        {
            int lastdigit = a%10;
            a = a/10;
            dec = dec +(lastdigit * (int)Math.pow(2,pow));
            pow++;
        }
        System.out.println("Decimal value of "+oldnum+" is "+dec);
    }

    static void dectobin(int a)
    {
        int oldnum=a;
        int pow=0;
        int bin=0;
        while(a>0)
        {
            int lastdigit = a % 2;
            a = a / 2;
            bin = bin +(lastdigit*(int)Math.pow(10,pow));
            pow++;
        }
        System.out.println("Decimal value of "+oldnum+" is "+bin);
    }


    public static void main(String args[])
    {
       decimal(111);
       dectobin(7);
    }
    
}
