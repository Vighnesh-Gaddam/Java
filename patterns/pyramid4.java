public class pyramid4 {
    public static void main(String args[])
    {
        final int numofrows=4;
        int rows;
        for(rows = 1;rows<=numofrows;rows++)
        {
            int numofcols,cols;
            int numofspaces = numofrows-rows;
            for(int spaces=1;spaces<=numofspaces;spaces++)
            {
                System.out.print("  ");
            }
            for(cols = rows;cols >= 1;cols--)
            {
                System.out.print(cols + " ");
            }
            for(cols=2;cols<=rows;cols++)
            {
                System.out.print(cols+" ");
            }
            System.out.println();
        }
    }
}
 