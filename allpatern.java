import java.util.Scanner;

public class allpatern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yes = 0;
        System.out.println("PAttern world");
        do {
            System.out.println("we have 1-35 patterns to display and 0 to exit");
            System.out.print("Enter the no. of pattern you wanna run: ");
            yes = sc.nextInt();

            switch (yes) {
                case 0:
                    System.out.println("Exiting pragram...");
                    break;
                case 1:
                    System.out.print("Enter the value of N: ");
                    int n1 = sc.nextInt();
                    pattern1(n1);
                    break;
                case 2:
                    System.out.print("Enter the value of N: ");
                    int n2 = sc.nextInt();
                    pattern2(n2);
                    break;
                case 3:
                    System.out.print("Enter the value of N: ");
                    int n3 = sc.nextInt();
                    pattern3(n3);
                    break;
                case 4:
                    System.out.print("Enter the value of N: ");
                    int n4 = sc.nextInt();
                    pattern4(n4);
                    break;
                case 5:
                    System.out.print("Enter the value of N: ");
                    int n5 = sc.nextInt();
                    pattern5(n5);
                    break;
                case 6:
                    System.out.print("Enter the value of N: ");
                    int n6 = sc.nextInt();
                    pattern6(n6);
                    break;
                case 7:
                    System.out.print("Enter the value of N: ");
                    int n7 = sc.nextInt();
                    pattern7(n7);
                    break;
                case 8:
                    System.out.print("Enter the value of N: ");
                    int n8 = sc.nextInt();
                    pattern8(n8);
                    break;
                case 9:
                    System.out.print("Enter the value of N: ");
                    int n9 = sc.nextInt();
                    pattern9(n9);
                    break;
                case 10:
                    System.out.print("Enter the value of N: ");
                    int n10 = sc.nextInt();
                    pattern10(n10);
                    break;
                case 11:
                    System.out.print("Enter the value of N: ");
                    int n11 = sc.nextInt();
                    pattern11(n11);
                    break;
                case 12:
                    System.out.print("Enter the value of N: ");
                    int n12 = sc.nextInt();
                    pattern12(n12);
                    break;

                default:
                    System.out.println("\tEnter a number in the range\n");
                    break;
            }
        } while (yes != 0);

    }

    private static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int j = row; j <= n; j++) { // instead of using j= row we can also use j<=(n+1)-row
                System.out.print("* ");
            }
            System.out.println();
            // System.out.println("value of i "+row);
        }
    }

    private static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            int num = 1;
            for (int j = 1; j <= row; j++) {
                System.out.print(num++ + " "); // instead of using a num we can also use j
            }
            System.out.println();
        }
    }

    private static void pattern5(int n) {
        for (int row = 0; row < n * 2; row++) {
            int starInRow = row > n ? (2 * n) - (row) : row;
            for (int j = 0; j < starInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern6(int n) {
        for (int row = 0; row < n; row++) {

            for (int z = n - row; z > 0; z--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern7(int n) {
        for (int row = 0; row < n; row++) {

            for (int j = 0; j < row; j++) {
                System.out.print(" ");
            }
            for (int z = n - row - 1; z >= 0; z--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {

            for (int z = n - row; z > 0; z--) {
                System.out.print(" ");
            }
            for (int j = 0; j < row * 2 - 1; j++) {
                System.out.print("*");
            }
            // for (int x = 2 * n - row; x > n; x--) {
            // System.out.print(" ");
            // }
            System.out.println();
        }
    }

    private static void pattern9(int n) {
        for (int row = 1; row <= n; row++) {

            for (int j = 0; j < row - 1; j++) {
                System.out.print(" ");
            }
            for (int z = 2 * n; z >= 2 * row; z--) {
                System.out.print("*");
            }
            // for (int j = 0; j < row - 1; j++) {
            // System.out.print(" ");
            // }
            System.out.println();
        }
    }

    private static void pattern10(int n) {
        for (int row = 1; row <= n; row++) {

            for (int j = 0; j < n - row; j++) {
                System.out.print(" ");
            }
            for (int z = 0; z < row; z++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern11(int n) {
        for (int row = 1; row <= n; row++) {

            for (int z = 0; z < row - 1; z++) {
                System.out.print(" ");
            }
            for (int j = n - row; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern12(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int spaceInRow = row > n ? (2 * n) - (row) : row;
            int starInRow = row > n ? row - n : n - row;
            for (int z = 0; z < spaceInRow; z++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= starInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
