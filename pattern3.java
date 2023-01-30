public class pattern3 {
    public static void main(String args[])
    {
        int numofrows = 4;
        for(int rows=0;rows<2*numofrows-1;rows++)
        {
            int numofcols;
            numofcols = rows >= numofrows ? rows-numofrows+1: numofrows-rows-1;
            int numofspaces;
            numofspaces = rows >= numofrows ? numofrows-numofcols-1 :rows;
            for(int spaces=0;spaces<=numofspaces;spaces++)
            {
                System.out.print(" ");
            } 
            for(int cols=0;cols<=numofcols;cols++)
            {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
}
