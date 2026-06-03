package _2;

public class Assignment2 {
    static void main() {
        System.out.println(primeFactors(15));
    }

    public static String primeFactors(int n) {
        StringBuilder result = new StringBuilder();
        while (n % 2 == 0) {
            result.append(2).append(" ");
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                result.append(i).append(" ");
                n /= i;
            }
        }
        if (n > 2)
            result.append(n).append(" ");
        return result.toString().trim();
    }
}
