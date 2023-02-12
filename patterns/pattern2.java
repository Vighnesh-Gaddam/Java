public class pattern2 {
    public static void main(String args[])
    {
        int numofrows = 4;
        {
            for (int rows = 0;rows<2*numofrows;rows++)
            {
                int numofcols,cols;
                numofcols = rows > numofrows ? 2 * numofrows - rows: rows;
                int numofspaces,spaces;
                numofspaces = numofrows-numofcols;
                for(spaces=0;spaces<numofspaces;spaces++) 
                {
                    System.out.print(" ");
                }
                for (cols=1;cols<=numofcols;cols++)
                {
                        System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
