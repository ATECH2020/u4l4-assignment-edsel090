public class Primes {
    public static int countFactors(int n){
        int factors = 0;
    for (int i = 1; i <= n; ++i) {
      if (n % i == 0) {
        factors++;
      }
    }
    System.out.println(factors);
      return factors;
    }

    public static boolean isPrime(int n){
        boolean prime = true;
        int max = (int)Math.sqrt(n);
        for(int i = 2; i<=max; i++){
          if(n%i == 0){
            prime = false;
          }
        }
        System.out.println(prime);
        return prime;
    }

    public static int countPrimes(int n){

        int numPrimes = 0;
        for(int i = 1; i<=n; i++){
          if(n%i == 0){
            numPrimes++;
          }
        }

        System.out.print(numPrimes+1);      
          return numPrimes;
    }
}
