import java.util.Scanner;

public class factorial {
    public static void main (String args[]){ 
    int i,f=1;
    Scanner sc = new Scanner (System.in);
    System.out.println("enter a number: 4");
    int x = sc.nextInt();
    for(i=1;i<=x;i++){
        f=f*i;
    }
    System.out.println("factorial is : "+f);
}
}