public class patternD {
   public static void main(String[] args) {
     {
        int n= 10;
        int printvalue =1;
        {
            for(int row=1; row<=n; row=row+1)
            {
               
                // When printvalue is 1, 1 - 1 = 0, so it becomes 0.
                // When printvalue is 0, 1 - 0 = 1, so it becomes 1.
                // That returened 0 or 1 is stored in this printvalue so that can store that and print that
               
                printvalue = row%2 == 0 ? 0 : 1;
                //That is only for the row starting value 1 or 0.

                for(int col=1; col<=row; col=col+1)
                {
                    System.out.print(printvalue);
                    printvalue = 1 - printvalue;  
                
                    // printvalue can be either 1 or 0.
               
                }
            System.out.println();
            }
        }
    }
   }
}
