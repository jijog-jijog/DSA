public class patternA {
    
    public static void main(String[] args) {
        {
            int n= 5;
            {
                for(int row=1; row<=n; row=row+1)
                 {
                    for(int col=1; col<=row; col=col+1)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                 }
            }
            
        }
    }
}
