import java.math.BigInteger;
public class sam {
    public static void main(String[] args) {

        int n = 5;

        boolean isPrime = BigInteger.valueOf(n).isProbablePrime(10);
        
        System.out.println(n + " is prime: " + isPrime);
    }
}
