/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TX1.train.de3;

import java.util.Scanner;

/**
 *
 * @author Minh Tuyen
 */
public class Demo {

    public static void menu() {
        System.out.println("---MENU---");
        System.out.println("1.Test fakeData va showAll");
        System.out.println("2.Them nv ");
        System.out.println("3.Thong ke NVKT");
        System.out.println("4.Thoat");
        System.out.print("Nhap lua chon cua bạn");
    }
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        NhanVienControl control = new NhanVienControl();
        int choice;
        do {
            menu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    control.fakeData();
                    control.showAll();
                    break;
                case 2:
                    NhanVien nv = new NhanVien();
                    System.out.println("Nhap so nv muon them: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        control.addNV(nv);
                    }
                    System.out.println("DS sau khi them nv :");
                    control.showAll();
                    break;
                case 3:
                    control.KT();
                    break;
                case 4:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Vui long nhap lai");
                    break;
            }
        } while (choice != 4);
    }
}
