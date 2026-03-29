/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanhB2;

/**
 *
 * @author Minh Tuyen
 */
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        SinhVienControl control = new SinhVienControl();
        Scanner sc = new Scanner(System.in);

        control.fakeData();
        control.getData();

        System.out.print("Ban muon them may sinh vien? ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            SinhVien sv = new SinhVien();
            sv.inputData();
            control.addData(sv);
        }
        control.getData();
       
        control.sortData();
        control.getData();

        control.editData();
        control.getData();

        control.deleteSV();
        control.getData();

        control.maxSV();
    }
}
