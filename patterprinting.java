import java.util.Arrays;
import java.util.Scanner;

public class patterprinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter random no: ");
        int n = sc.nextInt();
//               NUMBER PATTERN PRINTING

/*        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(j+ " ");
            }
        System.out.println(); }  */

//                   SEEDHA TRIANGLE

/*        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

//                ULTA TRIANGLE

/*        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/
//       NUMBER TRIANGLE

/*        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

//                ULTA NUMBER TRIANGLE

 /*      for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n+1-i ; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }/*

//             ODD NUMBER TRIANGLE

/*        for (int i = 1; i <=n ; i++) {
            int a=1;
            for (int j = 1; j <=i ; j++) {
                System.out.print(a +" ");
                 a+=2;
            }
            System.out.println();
        }*/
//            STAR PLUS

/*        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                int a=n/2+1;
                if (i==a||j==a){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }*/
//        HOLLOW STAR TRIANGLE

/*        System.out.print("Enter no of column: ");
        int m= sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                if (i ==1 || i==n ||j==1 ||j==m) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }*/
//              STAR CROSS
/*        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i==j||i+j==n+1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }                System.out.println();
        }*/
//           ASCENDING ORDER NUMBER TRIANGLE
/*        int a=1;
        for (int i = 1; i <=n ; i++) {
            for (int  j= 1; j <=i ; j++) {
                System.out.print(a+" ");
            a+=1;
            }
            System.out.println();
        }*/
//            STAR PYRAMID

/*        int nst=1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 01; j <=n-i ; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <=nst ; k++) {
                System.out.print("* ");
            }nst+=2;
            System.out.println();
        }*/
    }
}
