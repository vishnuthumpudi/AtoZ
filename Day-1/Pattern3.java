import java.util.*;
/*
Pattern : 
1
1 2 
1 2 3
*/
public class Pattern3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}