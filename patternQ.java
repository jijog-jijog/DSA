import java.util.Scanner;

public class patternQ {
    public static void main(String[] args) {
        System.out.print("Enter the Value you want to print : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int row=1; row<=n*2; row++)      
        {
            {
                int rowval = row>n ? n*2-(row-1) : row ;          

                for(int col=1; col<=n*2; col++){          

                    if ( col<=((n - rowval)+1) || col >= ((n+ rowval )-1)) {   
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
        System.out.println();
        }
    }


    //     int n = 20;

    //     for (int row = 1; row <= 2 * n; row++) { 

    //         int rowChange = row > n ? 2 * n - (row - 1) : row;


    //         for (int col = 1; col <= 2 * n; col++) {

    //             if (col <= n - rowChange + 1 || col > n + rowChange - 1) {

    //                 System.out.print("*");

    //             } else {

    //                 System.out.print(" ");


    //             }
    //         }
    //         System.out.println();
    //     }
    // }
}
 