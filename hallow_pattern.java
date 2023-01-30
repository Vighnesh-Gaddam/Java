public class hallow_pattern 
{
    public static void main(String args[])
     {
        int numofrows = 5;
        for (int rows = 1; rows <= numofrows; rows++) 
        {
            int cols;
            for (cols = 1; cols <= rows; cols++) 
            {
                if (cols == 1 || cols == rows || rows == numofrows)
                {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }

}
