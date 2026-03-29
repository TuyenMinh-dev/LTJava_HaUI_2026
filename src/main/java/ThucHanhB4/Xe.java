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
public class Xe {

    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double triGia;

    public double thue() {
        double thue = 0;
        if (dungTich < 100) {
            thue = 0.1 * triGia;
        } else if ( dungTich < 200) {
            thue = 0.3 * triGia;

        } else  {
            thue = 0.5 * triGia;
        }
        return thue;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten chu xe: ");
        tenChuXe = sc.nextLine();
        System.out.print("Nhap loai xe: ");
        loaiXe = sc.nextLine();
        System.out.print("Nhap dung tich xylanh: ");
        dungTich = sc.nextInt();
        System.out.print("Nhap tri gia xe: ");
        triGia = sc.nextDouble();
    }
    public static void inTieuDe() {
        System.out.printf("%-20s %-15s %-10s %-15s %-15s\n", 
            "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
        System.out.println("-----------------------------------------------------------------------------------");
    }

    public void inDuLieu() {
        System.out.printf("%-20s %-15s %-10d %-15.2f %-15.2f\n", 
            tenChuXe, loaiXe, dungTich, triGia, thue());
    }
}
