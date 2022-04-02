package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double summ=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = scan.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите x: ");
        int x = scan2.nextInt();
        for (int i = 1;i<n;i++){
            int c = (2*i-1);
            int z = (2*i*(2*i+1));
            double p = Math.pow(x,(2*i+1));
            double task = ((c*p)/ z);
            summ = summ + task;

        }
        System.out.println("Результат: ");
        System.out.println(x+summ);

    }
}
