import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a=1,b=1,c=1;
        for (int i = 4; i<=n ; i++) {
            int temp=(a+b+c)%100000;
            a=b;
            b=c;
            c=temp;
        }
        System.out.println(c);
    }


}
