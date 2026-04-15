/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TX1.train;

import java.util.Scanner;

/**
 *
 * @author Minh Tuyen
 */
public class DEmo {

    public static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("---MENU---");
        System.out.println("1.Test fakeData va showAll");
        System.out.println("2.Them nv ");
        System.out.println("3.Thong ke nv KyThuat");
        System.out.println("0.Thoat");
        System.out.print("Hay nhap lua chon cua ban: ");
    }

    public static void main(String[] args) {
        int choice;
        NhanVienControl control = new NhanVienControl();
        do {
            menu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    control.fakeData();
                    control.showAll();
                    break;
                case 2:
                   
                    System.out.print("Nhap so nhan vien muon them: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        NhanVien nv = new NhanVien();
                        System.out.println("Nhap thong tin cho nhan vien thu "+(i+1)+" : ");
                        nv.input();
                        control.addNV(nv);
                    }

                    System.out.println("Danh sach sau khi them la : ");
                    control.showAll();
                    break;
                case 3:
                    control.countKyThuat();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Vui long nhap lai ");

            }
        } while (choice != 0);
    }
}
