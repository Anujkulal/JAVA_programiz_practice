import java.math.BigInteger;
public class P2_Factorial {
    public static void main(String[] args) {
        int num = 5;
        BigInteger factorial = BigInteger.ONE;
        for(int i = 1; i<=num; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("Factorial of %d is %d ", num, factorial);
    }
}
