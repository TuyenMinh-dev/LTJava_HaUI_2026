/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanhB4.train;

import java.util.Scanner;

/**
 *
 * @author Minh Tuyen
 */
public class MonHoc implements IO{
    private String maMon;
    private String tenMon;
    private int soTin;
    private LoaiMon loaiMon;
    private Scanner sc=new Scanner(System.in);
   @Override
   public void inputData(){
       System.out.println("Nhap thong tin cho mon hoc: ");
       System.out.print("Nhap ma mon: ");
       this.maMon=sc.nextLine();
       System.out.print("Nhap ten mon: ");
       this.tenMon=sc.nextLine();
       System.out.println("Nhap so tin chi: ");
       this.soTin=Integer.parseInt(sc.nextLine());
       System.out.println("Nhap loai mon: 1.CoSo   2.ChuyenNganh");
       int choice;
       do{
       choice=Integer.parseInt(sc.nextLine());    
       switch(choice){
           case 1:
               this.loaiMon=LoaiMon.CoSo;
               break;
           case 2:
               this.loaiMon=LoaiMon.ChuyenNganh;
               break;
           default:
               this.loaiMon=null;
               System.out.println("Vui long nhap lai ");
               break;
              
       }
       }while(this.loaiMon==null);
   }
   @Override
   public void outputData(){
       System.out.printf("|  %-10s  |  %-15s  |  %-10s  |  %-15s  |%n",maMon,getTenMon(),soTin,loaiMon);
   }

    public String getTenMon() {
        return tenMon.toUpperCase();
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon.toUpperCase();
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public int getSoTin() {
        return soTin;
    }

    public void setSoTin(int soTin) {
        this.soTin = soTin;
    }

    public LoaiMon getLoaiMon() {
        return loaiMon;
    }

    public void setLoaiMon(LoaiMon loaiMon) {
        this.loaiMon = loaiMon;
    }
   
}
