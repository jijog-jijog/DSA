public class patternK {
    public static void main(String[] args) {
        int n= 8;
        for(int row=1; row<=n; row=row+1)
        {
            {
                for(int spc=1; spc<=row-1; spc=spc+1){
                    System.out.print(" ");
                }
                for(int col=1; col<=(n-(row-1)); col=col+1){
                    System.out.print("*");
                }
            }
        System.out.println();
        }
    }
}
