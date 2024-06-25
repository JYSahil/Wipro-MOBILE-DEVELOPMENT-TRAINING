import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        /* 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter your Second number: ");
        int b = scanner.nextInt();
        int c = a + b;
        System.out.println("your result for the addition of the two numbers is :"+ c);
        */

        /* 
        int[] arr = new int[5]; // 0-4 (5 elements)
        arr[0] = 5;
        arr[1] = 5;
        arr[2] = 45;
        arr[3] = 5;
        arr[4] = 0;
        // arr[5] = 89;

        //TODO: replace all occurences of 5 with 67 
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 5) {
                arr[i] = 67;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
            */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] array = new int[n];  
        System.out.println("Enter the numbers into the array: ");  
        for(int i=0; i<n; i++)  
        {
          array[i]=sc.nextInt();  
        }  
        System.out.println("Array elements are: ");  
        for (int i=0; i<n; i++)   
        {  
         System.out.print(" " + array[i]);  
        }


    }
    
}