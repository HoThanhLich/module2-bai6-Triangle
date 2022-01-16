package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------Tao mot tam giac------");
        System.out.println("Moi nhap canh a:");
        double canhA = scanner.nextDouble();
        System.out.println("Moi nhap canh b:");
        double canhB = scanner.nextDouble();
        System.out.println("Moi nhap canh c:");
        double canhC = scanner.nextDouble();
        scanner.nextLine();

        if (isTriangle(canhA, canhB, canhC)) {
            System.out.println("Moi nhap mau sac: ");
            String color = scanner.nextLine();
            System.out.println("Moi nhap kieu hinh: ");
            boolean filled = scanner.nextBoolean();
            Shape triangle = new TriangleClass(color, filled, canhA, canhB, canhC);
            System.out.println(triangle);
        }else {
            System.out.println("du lieu da nhap khong phai la mot tam giac");
        }
    }

    public static boolean isTriangle(double canhA, double canhB, double canhC) {
        return canhA + canhB > canhC && canhA + canhC > canhB && canhB + canhC > canhA;
    }
}
