import java.util.*;
/*
Pattern : 
* * *
* *
*
*/
public class Pattern5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
    }
}