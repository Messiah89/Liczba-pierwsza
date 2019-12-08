package com.company;
import java.util.Scanner;

public class LiczbaPierwsza {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Wpisz liczbę: ");
        int n = s.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " jest liczbą pierwszą");
        } else {
            System.out.println(n + " nie jest liczbą pierwszą");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
            if (n == 4) {
                return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}