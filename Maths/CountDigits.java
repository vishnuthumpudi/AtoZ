import java.util.*;

public class CountDigits{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int num = Integer.parseInt(s);
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            int pos = s.charAt(i) - '0';
            if(num % pos == 0) cnt++;
        }
        System.out.println(cnt);
    }
}