public class Exercise6 {
    public static void main(String[] args) {
        int n = 500;
        LazyPrimeFactorization t1 = new LazyPrimeFactorization(n);
        OptimizedPrimeFactorization t2 = new OptimizedPrimeFactorization(n);

        t1.start();
        t2.start();
    }
}
