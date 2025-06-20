public class patternM {
    public static void main(String[] args) {
        int n=7;
        for(int row=5; row>=1; row--)
        {
            {
                for(int spc=1; spc<(n-row); spc++){
                    System.out.print(" ");
                }
                for(int col=1; col<=((row*2)-1); col=col+1){
                    System.out.print("*");
                }
            }
        System.out.println();
        }
    }
}


    // public static void patternN() {
    //     for (int row = 5; row >= 1; row--) {
    //         for (int i = 1; i <= n - row; i++) {
    //             System.out.print(" ");
    //         }
    //         for (int col = 1; col <= row * 2 - 1; col++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }