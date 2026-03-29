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
public class Xedemo {
    static Xe[] danhSachXe;
    static int soLuongXe = 0;

    public static void nhapDanhSach() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong xe can dang ky: ");
        soLuongXe = sc.nextInt();
        danhSachXe = new Xe[soLuongXe];

        for (int i = 0; i < soLuongXe; i++) {
            System.out.println("Nhap thong tin xe thu " + (i + 1) + ":");
            danhSachXe[i] = new Xe(); 
            danhSachXe[i].nhap();
        }
}
    public static void xuatBangKe() {
        if (danhSachXe == null || soLuongXe == 0) {
            System.out.println("Chua có du lieu xe. Vui long chon nhap thong tin truoc!");
            return;
        }
        System.out.println("\n--- BANG KE KHAI THUE TRUOC BA ---");
        Xe.inTieuDe();
        for (int i = 0; i < soLuongXe; i++) {
            danhSachXe[i].inDuLieu();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n========== MENU QUAN LY XE ==========");
            System.out.println("1. Nhap thong tin va tao danh sach xe");
            System.out.println("2. Xuat bang ke khai tien thue truoc ba");
            System.out.println("3. Thoat");
            System.out.print("Lua chon của ban: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    nhapDanhSach();
                    break;
                case 2:
                    xuatBangKe();
                    break;
                case 3:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 3);
    }
}
