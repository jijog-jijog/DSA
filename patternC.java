public class patternC {
    public static void main(String[] args) {
        int n = 5;
        {
            for(int r=1; r<=n; r=r+1)
            {
                for(int c=1; c<=r; c=c+1)
                {
                    System.out.print(c+" " );
                }
            System.out.println( );
            }
        }
    }
}
