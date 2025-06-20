public class patternI {
    public static void main(String[] args) {
        int n= 10;
        for(int row=1; row<=(n*2)-1; row=row+1)
        {
            int rowvalue =row>n? (n*2)-row : row;
            for(int col=1; col<=rowvalue; col=col+1)
            {
                System.out.print("*"+ " ");
            }
        System.out.println();
        }
        }
    }