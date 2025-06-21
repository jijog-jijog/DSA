public class patternO {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row<=(n*2)-1; row++)
        {
            {
                int spcval = n>=row ? (row) : (n*2-(row-1))-1;
                for(int spc =1; spc<=spcval; spc++){
                    System.out.print(" ");
                }
                int colval = n>=row ? ((n-row)+1) : (row-n)+1;
                for(int col = 1; col<=colval; col++){
                    System.out.print("*"+" ");
                }
            }
        System.out.println();
        }
    }
}
