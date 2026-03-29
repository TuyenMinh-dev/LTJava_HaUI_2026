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
public class HCN {
    private float dai;
    private float rong;
    public float chuVi(){
        return (dai+rong)*2;
    }
    public float dienTich(){
        return dai*rong;
    }
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        this.dai=sc.nextFloat();
        System.out.print("Nhap chieu rong: ");
        this.rong=sc.nextFloat();
    }
    public void xuat(){
        System.out.println("Chu vi HCN: "+chuVi());
        System.out.println("Dien tich HCN: "+dienTich());
    }
    public static void main(String[] args) {
        HCN hcn=new HCN();
        hcn.nhap();
        hcn.xuat();
    }
}
