import java.util.Scanner;

public class digitsum {
    
        public static void main(String[] args) {
            int s=0;
            Scanner sc = new Scanner(System.in);
            int x= sc.nextInt();
            while (x!=0){
                int r = x%10;
                s=s+r;
                x=x/10;
            }
            System.out.println(s);
        }
    }
    

