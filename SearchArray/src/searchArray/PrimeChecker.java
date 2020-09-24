package searchArray;

public class PrimeChecker {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
        PrimeChecker pc = new PrimeChecker();
        for (int num : arr) {
            System.out.println("Is " + num + " prime?: " + pc.isPrime(num));
        }
    }

    public boolean isPrime(int num) {
        if (num == 2 || num == 1) {
            return true;
        } else if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
