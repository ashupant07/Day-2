package com.company.Learning;

import java.util.Scanner;

public class IfElse {
    public static void main(String agrs[]) {

        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        if (button == 1) {
            System.out.println("Hello");
        } else if (button == 2) {
            System.out.println("Namaste");
        } else {
               System.out.println("Bonjour");
        }
    }
}
