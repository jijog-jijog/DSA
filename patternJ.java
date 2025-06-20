public class patternJ {
    public static void main(String[] args) {
        int n = 10;
        for(int row=1; row<=n; row=row+1)
        {
            {
                for(int spc=1; spc<=(n-row); spc=spc+1){
                     System.out.print(" ");
                }
                for(int col=1; col<=row; col=col+1){
                    System.out.print("*");
                }
            }
         System.out.println();
        }
    }
}
