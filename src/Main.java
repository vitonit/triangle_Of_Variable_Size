import java.util.Scanner;

public class Main {


    private static void printing_Symbol() {

        System.out.print("#");
    }

    private static void printing_Space() {

        System.out.print(" ");
    }    public static void main(String[] args) {


        System.out.println("Indicate the size of the triangle");
       Scanner sc = new Scanner(System.in);
       int count = sc.nextInt();

        int l = 1;
        int n = count;

        for (int i = 1; i < count; i++) {
            System.out.print(" ");
            // printing_Space();
        }

            // System.out.println("#");
        printing_Symbol();
        System.out.println();

            for (int k = 0; k < count - 1; k++) {
                for (int j = n - k - 2; j > 0; j--) {
                    // System.out.print(" ");
                    printing_Space();
                }
                // System.out.print("#");
               printing_Symbol();

                for (int x = 0; x < l; x++) {
                    // System.out.print(" ");
                    printing_Space();
                }


                // System.out.print("#");
                printing_Symbol();

                l = l + 2;
                System.out.println();
            }
            for (int q = 0; q < 2 * count - 1; q++)
               // for (int q = 0; q < count; q++)
            {
                // System.out.print("# ");
                 printing_Symbol();
            }
        }
      
    }

