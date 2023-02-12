public class pattern
{
    public static void main(String[] args)
    {
        int rows = 4;
        for(int i=0;i<rows;i++)
        {
            int cols = rows-i;
            int celpadding = rows - cols;
            for(int k = 0; k<=celpadding; k++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<=cols;j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}

