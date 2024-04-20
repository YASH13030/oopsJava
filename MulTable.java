import java.util.Scanner;

public class MulTable {
    

    public static void main (String args[])
    {

        Scanner sc =new Scanner (System.in);
        System.out.println("enter a number");
        int m;
        int x = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            m=x*i;
            System.out.println(m);

        }
    }
}
