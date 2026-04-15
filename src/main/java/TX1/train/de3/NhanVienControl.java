/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TX1.train.de3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Minh Tuyen
 */
public class NhanVienControl {

    private ArrayList<NhanVien> dsNV = new ArrayList();
    private Scanner sc = new Scanner(System.in);

    public void fakeData() {
        NhanVien nv1 = new NhanVien();
        nv1.setTenNV("Hai");
        nv1.setLuong(300000);
        nv1.setBoPhan(BoPhan.KyThuat);
        dsNV.add(nv1);

        NhanVien nv2 = new NhanVien();
        nv2.setTenNV("Long");
        nv2.setLuong(400000);
        nv2.setBoPhan(BoPhan.KinhDoanh);
        dsNV.add(nv2);

        NhanVien nv3 = new NhanVien();
        nv3.setTenNV("Nam");
        nv3.setLuong(500000);
        nv3.setBoPhan(BoPhan.KyThuat);
        dsNV.add(nv3);

    }

    public void showAll() {
        System.out.println("|--------------|-------------------|-------------------|-------------------|");
        System.out.println("|  STT         |  TenNV            |  Luong            |  BoPhan           |");
        System.out.println("|--------------|-------------------|-------------------|-------------------|");
        for (NhanVien nv : dsNV) {
            nv.display();
        }
    }

    public void KT() {
        int cnt = 0;
        for (NhanVien nv : dsNV) {
            if (nv.getBoPhan() == BoPhan.KyThuat) {
                cnt++;
            }
        }
        System.out.println("Trong ds co " + cnt + " nv KyThuat");
        System.out.println("DS NVKT la: ");
        System.out.println("|--------------|-------------------|-------------------|-------------------|");
        System.out.println("|  STT         |  TenNV            |  Luong            |  BoPhan           |");
        System.out.println("|--------------|-------------------|-------------------|-------------------|");
        for (NhanVien nv : dsNV) {
            if (nv.getBoPhan() == BoPhan.KyThuat) {
                nv.display();
            }
        }
    }

    public void addNV(NhanVien nv) {       
            dsNV.add(nv);
        
    }
}
