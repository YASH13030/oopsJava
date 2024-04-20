import java.util.Scanner;

public class palindrome {
    public static void main(String args[]){
        int s=0;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int t=x;
        while(x!=0){
            int r =x%10;
            s=s*10+r;
            x=x/10;

        }
        if(s==t){
            System.out.println("palindrome");
        }
        else
        System.out.println("not");
    }
    
}
