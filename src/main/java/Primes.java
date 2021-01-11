public class Primes {
    public static int countFactors(int n){
        int factors = 0;
        for(int i = 1; i <= 8; i++){
          if(n%i==0 && i*i !=n){
            factors += 2;
          }else if(i*i==n){
            factors++;
          }
        System.out.println(factors);
        }
        return factors;
      
    }

    public static boolean isPrime(int n){
        int factors = countFactors(n);
        boolean prime = true;
        for(int i = 1; i <= factors; i++){
          if(i%n==0){
            prime = false;
          }
        }
        System.out.println(prime);
        return prime;
    }

    public static int countPrimes(int n){
        int numPrimes = 0;
        
        return numPrimes;
    }
}
