package DeseneGoreMetot;

import java.util.Scanner;

public class MetotOlusturma {

    static void numberPositive(int num){
        for (int i = num; i >= 0; i = i - 5) {
            System.out.print(i + " ");
        }
    }

    static void numberNegative(int num){
        for (int i = 0; i<=num; i = i + 5) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int num = input.nextInt();
        numberPositive(num);
        numberNegative(num);
    }
}
