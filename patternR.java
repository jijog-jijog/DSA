import java.util.Scanner;

public class patternR {
    public static void main(String[] args) {
        System.out.print("Enter the number want to print : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        for(int row =1; row<=(n*2)-1; row++)
        {
            {
                for(int col = 1; col<=(n*2)-1; col++){
                    int topdis = row, downdis = (n*2) - row, lefdis = col, rigdis = (n*2) - col;
                    int min = Math.min(Math.min(topdis, downdis), Math.min(lefdis, rigdis));
                    System.out.print(n-min+1 + "  ");
                }
            }
        System.out.println();
        }

    }

}
            
   
