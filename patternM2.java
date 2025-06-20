public class patternM2 {
     public static void main(String[] args) {
        int n=10;
        for(int row=1; row<=n; row++)
        {
            {
                for(int spc=1; spc<=(row-1); spc++){
                    System.out.print(" ");
                }
                for(int col=1; col<=(n*2-((row*2)-1)); col=col+1){
                    System.out.print("*");
                }
            }
        System.out.println();
        }
    }
}
