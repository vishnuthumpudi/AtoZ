import java.util.*;
/*
Pattern : 
1 2 3
1 2 
1
*/
public class Pattern6{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = n; i > 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}