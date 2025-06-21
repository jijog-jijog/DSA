public class patternN2 {
    public static void main(String[] args) {
        int n = 10;
        for(int row = 1; row<=(n*2)-1; row++)
        {
            {
                int spcval=row>n ? (row-n) : (n-row);
                for(int spc= 1; spc<=spcval; spc++){
                    System.out.print(" ");
                }
                int colval = row>n ? (2*(2*n-row)-1) : (row*2)-1;
                for(int col = 1; col<=colval; col++){
                    System.out.print("*");
                }
            }
        System.out.println();
        }
    }
}
