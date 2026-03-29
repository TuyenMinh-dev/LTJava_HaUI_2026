/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanhB4;

import java.util.Scanner;

/**
 *
 * @author Minh Tuyen
 */
public  class PTB2 {

    private double a, b, c;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap he so a(khac 0): ");
            this.a = sc.nextDouble();
            if (a == 0) {
                System.out.println("He so a phai khac khong . Vui long nhap lai");
            }
        } while (a == 0);

        System.out.print("Nhap he so b: ");
        this.b = sc.nextDouble();
        System.out.print("Nhap he so c: ");
        this.c = sc.nextDouble();
    }
    public static void inTieuDe() {   
    System.out.printf("%-30s %-10s %-10s %-10s %-30s\n", 
                      "Phuong trinh", "a", "b", "c", "Ket qua");
    System.out.println("------------------------------------------------------------------------------------------");
}

    public String giaiPT() {
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            return "PT vo nghiem";
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return "PT co nghiem kep x= " + x;
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "x1 = " + String.format("%.2f", x1) + ", x2 = " + String.format("%.2f", x2);
        }
    }
    public void xuat() {
    String pt = String.format("%.1fx^2 + %.1fx + %.1f = 0", a, b, c);
    System.out.printf("%-30s %-10.1f %-10.1f %-10.1f %-30s\n", 
                      pt, a, b, c, giaiPT());
}
    
}
