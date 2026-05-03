/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TX1.train.de1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Minh Tuyen
 */
public class NhanVienControl {

    private ArrayList<NhanVien> dsNhanVien = new ArrayList();
    private Scanner sc = new Scanner(System.in);

    public void fakeData() {
        NhanVien nv1 = new NhanVien();
        nv1.setTenNV("Tuyen");
        nv1.setLuong(50000000);
        nv1.setBoPhan(BoPhan.KyThuat);
        dsNhanVien.add(nv1);

        NhanVien nv2 = new NhanVien();
        nv2.setTenNV("Nam");
        nv2.setLuong(30000000);
        nv2.setBoPhan(BoPhan.KyThuat);
        dsNhanVien.add(nv2);

        NhanVien nv3 = new NhanVien();
        nv3.setTenNV("Hai");
        nv3.setLuong(50000000);
        nv3.setBoPhan(BoPhan.KinhDoanh);
        dsNhanVien.add(nv3);
    }

    public void showAll() {
        System.out.println("|------------|-----------------|------------|----------------|");
        System.out.println("| MaNV       | TenNv           | Luong      | BoPhan         |");
        System.out.println("|------------|-----------------|------------|----------------|");
        for (NhanVien nv : dsNhanVien) {
            nv.display();
        }
    }

    public void countKyThuat() {
        int cnt = 0;
        for (NhanVien nv : dsNhanVien) {
            if (nv.getBoPhan() == BoPhan.KyThuat) {
                cnt++;
            }
        }
        System.out.println("Co tat ca " + cnt + " nhan vien ky thuat");
        System.out.println("Danh sach nhan vien ky thuat la: ");
        System.out.println("|------------|-----------------|------------|----------------|");
        System.out.println("| MaNV       | TenNv           | Luong      | BoPhan         |");
        System.out.println("|------------|-----------------|------------|----------------|");
        for(NhanVien nv : dsNhanVien){
            if (nv.getBoPhan() == BoPhan.KyThuat){ 
                nv.display();
            }
        }
    }

    public void addNV(NhanVien nv) {
        dsNhanVien.add(nv);
    }
}
