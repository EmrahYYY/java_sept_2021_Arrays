package be.intecbrussel.exercises;

import java.util.Arrays;

public class Exercise1Optional {
    public static void main(String[] args) {
        int[] primes = new int[100];
        int indexPrime = 0;

        for (int number = 2; number < 50; number++) {
            if (isPrimeNumber(number)){
                primes[indexPrime] = number;
                indexPrime++;
            }
        }

        printPrimes(primes);
    }

    private static boolean isPrimeNumber(int number) {
        for (int divider = 2; divider < number; divider++) {
            if (number % divider == 0){
                return false;
            }
        }
        return true;
    }

    private static void printPrimes(int[] primes) {
        for (int number : primes){
            if (number == 0){
                break;
            } else {
                System.out.println(number);
            }
        }
    }
}
