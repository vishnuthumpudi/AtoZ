import java.util.Scanner;

public class Pattern8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = n; i > 0; i++){
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" "+" ");
            }

            for(int j = 0; j < 2 * i + 1; j++){
                System.out.print("*"+" ");
            }

            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}