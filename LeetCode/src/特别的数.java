import java.util.Scanner;

public class 特别的数 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextInt();
        long num=0;
        for (int i = 1; i <=n ; i++) {
            String   s=i+"";
            if(s.indexOf("2")!=-1 ||s.indexOf("0")!=-1||s.indexOf("1")!=-1||s.indexOf("9")!=-1 ){
                num+=i;
            }
        }

        System.out.println(num);
    }

}
