public class patternE {
    public static void main(String[] args) {
        int n = 8;
        int count =0;
        {
            for(int row=1; row<=n; row=row+1)
            {
                for(int col=1; col<=row; col=col+1)
                {
                    count=count+1;
                    System.out.print(count+" ");
                }
            System.out.println();
            }
        }
    }
}
