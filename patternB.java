public class patternB {
    public static void main(String[] args) {
        int n = 5;
        {
            for(int r=1; r<=n; r=r+1)
            {
                for(int c=1; c<=n; c=c+1)
                {
                    System.out.print(r+" " );
                }
            System.out.println( );
            }
        }
    }
}
