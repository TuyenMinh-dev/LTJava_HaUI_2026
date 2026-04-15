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
public class NhanVien implements IEntity{

    private int soThuTu;
    private String tenNV;
    private double luong;
    private BoPhan boPhan;
    private static int count = 0;
    private Scanner sc= new Scanner(System.in);

    public int getSoThuTu() {
        return soThuTu;
    }

    public void setSoThuTu(int soThuTu) {
        this.soThuTu = soThuTu;
    }

    public String getTenNV() {
        if (this.tenNV != null) {
            return tenNV.toUpperCase();
        }
        return "";
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV.toUpperCase();
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public BoPhan getBoPhan() {
        return boPhan;
    }

    public void setBoPhan(BoPhan boPhan) {
        this.boPhan = boPhan;
    }

    public NhanVien() {
        count++;
        this.soThuTu = count;
        
    }
    @Override
    public void input(){
        System.out.println("Nhap thong tin cho nhan vien: ");
        System.out.print("Nhap ten nhan vien: ");
        this.tenNV=sc.nextLine().toUpperCase();
        System.out.println("Nhap bo phan lam viec: 1.KinhDoanh  2.KyThuat");
        System.out.print("Nhap chu so 1 hoac 2 de chon bo phan: ");
        int choice;
        do{
            try{
               choice=Integer.parseInt(sc.nextLine());
               switch(choice){
                   case 1:
                       this.boPhan=BoPhan.KinhDoanh;
                       break;
                   case 2:
                       this.boPhan=BoPhan.KyThuat;
                       break;
                   default:
                       this.boPhan=null;
                       System.out.println("Vui long nhap lai");          
               }
            }
            catch(NumberFormatException e){
                System.out.println("Vui long nhap lai");
            }
        }while(this.boPhan==null);
        System.out.print("Nhap muc luong: ");
        this.luong=Double.parseDouble(sc.nextLine());
    }
    @Override
    public void display(){
        System.out.printf("| %-10s | %-15s | %-10s | %-15s |%n",soThuTu,tenNV,luong,boPhan);
    }

}
