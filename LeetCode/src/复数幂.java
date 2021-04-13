import java.math.BigInteger;

public class 复数幂 {
   /* ( a + bi ) * ( c + di ) = ( a * c - b * d ) + ( a * d + b * c )i*/
                                /*  shi   ansshi   xu  ansxu       shi ansxu     xu    ansshi*/
    public  static BigInteger shi=new BigInteger("2");
    public  static BigInteger xu=new BigInteger("3");
    public  static BigInteger ansshi=new BigInteger("2");
    public  static BigInteger ansxu=new BigInteger("3");
    public  static  BigInteger mid;
    public  static   BigInteger z=new BigInteger("0");
    public  static  void app(){
        mid=ansshi;
        ansshi=(ansshi.multiply(shi).subtract(ansxu.multiply(xu)));
        ansxu=(ansxu.multiply(shi).add(mid.multiply(xu)));
    }
    public static void main(String[] args) {
        for (int i = 1; i <123456 ; i++) {
           app();
        }
        System.out.println(ansshi+((ansxu.compareTo(z))>=0?"+":"")+ansxu+"i");
    }
}
