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
public class HTron {

    private float banKinh;

    public float tinhChuVi() {
        return (float) (2 * Math.PI * banKinh);
    }
    public static String tieuDe = "STT\tBan kinh\tChu vi\t\tDien tich";

    public float tinhDienTich() {
        return (float) (Math.PI * banKinh * banKinh);
    }

    public void nhap(int i) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron thu " + (i + 1) + ": ");
        this.banKinh = sc.nextFloat();
    }

    public void hienThi(int stt) {
        System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\n",
                stt, banKinh, tinhChuVi(), tinhDienTich());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hinh tron: ");
        int n = sc.nextInt();

        HTron[] dsHinhTron = new HTron[n];
        for (int i = 0; i < n; i++) {
            dsHinhTron[i] = new HTron();
            dsHinhTron[i].nhap(i);
        }

        System.out.println("\nBANG KET QUA HINH TRON");
        System.out.println(HTron.tieuDe);
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            dsHinhTron[i].hienThi(i + 1);
        }
    }
}
