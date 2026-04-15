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
public class Demo {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        MonHocControl control=new MonHocControl();
        //1.test fakeData va outputList
        control.fakeData();
        control.outputList();
        
        //2.addMore
        System.out.println("Nhap so mon muon them: ");        
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            System.out.println("Nhap tt cho mon thu "+(i+1)+" :");
        MonHoc mh=new MonHoc();
        mh.inputData();
        control.addMore(mh);            
        System.out.println("Nhap thanh cong cho mon thu "+(i+1));
        }
        System.out.println("Danh sach sau khi them: ");
        control.outputList();
        
        //3.Tim max tin chi
        control.findMax();
    }
}
