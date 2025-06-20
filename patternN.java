public class patternN {
    public static void main(String[] args) {
        int n= 10;
        for(int row=1; row<=(n*2-1); row++)
        {
            {
                int spa = row>=n ? (row-n) : (n-row);
                for(int spc = 1; spc<=spa; spc++){
                    System.out.print(" ");
                }
                int val = row>=n ? ((2 * (2 * n - row)) - 1) : ((row*2)-1);
                for(int col=1; col<=val; col++){
                    System.out.print("*");
                }
            }
        System.out.println();
        }
    }
}

    // public static void patternO() {
    //     for (int row = 1; row <= n * 2 - 1; row++) {
    //         int rowChange = row > n ? (n * 2) - row : row;
    //         for (int i = 1; i <= n - rowChange; i++) {
    //             System.out.print(" ");
    //         }
    //         for (int col = 1; col <= rowChange * 2 - 1; col++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }