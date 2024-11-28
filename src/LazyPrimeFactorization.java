public class LazyPrimeFactorization extends Thread{
    private final int n;
    public LazyPrimeFactorization(int n){
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        this.n = n;
    }
    @Override
    public void run() {
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("LazyPrimeFactorization: " + i);
            }
        }
    }
}
