public class OptimizedPrimeFactorization extends Thread{
    private final int n;
    public OptimizedPrimeFactorization(int n){
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        this.n = n;
    }
    @Override
    public void run() {
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("OptimizedPrimeFactorization: " + i);
            }
        }
    }
}
