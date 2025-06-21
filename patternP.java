public class patternP {
    public static void main(String[] args) {
        int n = 15;
        for(int row =1; row<=n; row++)
        {
            {
                for(int spc=1; spc<=(n-row); spc++){
                    System.out.print(" ");
                }
                for(int col =1; col<=(row*2)-1; col++){
                    if (col==1 || col==(row*2)-1 || row==n) { //and ||
                         System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
               
            }
        System.out.println();
        }
    }
}
