public class patternH {
    public static void main(String[] args) {
        int n =5;
        for(int row= 1; row<=n; row=row+1)
        {
            for(int col= 1; col<=n-(row-1); col=col+1)
            {
                System.out.print(col +" ");
            }
        System.out.println();    
        }
    }
}

