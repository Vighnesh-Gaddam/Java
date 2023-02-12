public class prime{
    public static void main(String args[])
    {
        int a = 13;
        for (int i = 2; i * i - 1<= a; i++) {
            if(a%i==0)
            {
                System.out.println(a+" number is not a prime number");
                break;
            }
            else
            {
                System.out.println(a+" is a prime number");
               break;
            }
        }
    }
}
