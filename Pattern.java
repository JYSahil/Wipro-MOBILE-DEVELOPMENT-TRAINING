public class Pattern{
    public static void main(String[] args) {
        System.out.println("your Left sided triangle is : ");
        for(int i = 0; i <= 5; i++) {
            for(int j=0; j<i; j++){
                System.out.print(" * ");
            }
            System.out.println( );
        }
        
        System.out.println("your inverted triangle is : ");
        
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("your Center triangle is : ");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("your hollow triangle is : ");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) { 
                System.out.print(" "); 
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                
                if (k == 1 || k == 2 * i - 1 || i == 5) { //print star on the edege
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print spaces for hollow part
                }
            }
            System.out.println();
        }
    }
}