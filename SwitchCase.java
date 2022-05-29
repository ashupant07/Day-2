package com.company.Learning;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String agrs[]) {


        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();


        switch (button){
            case 1:
                System.out.println("Hello");
                break;

            case 2:
                System.out.println("Namaste");
                break;

            case 3:
                System.out.println("bonjour");
                break;

            default:
                System.out.println("invaild entry");
        }

    }
    }

