/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TX2.train.de3;

import java.util.Scanner;

/**
 *
 * @author Minh Tuyen
 */
public class Main {

    public static void menu() {
        System.out.println("---MENU---");
        System.out.println("1.Add");
        System.out.println("2.Delete");
        System.out.println("3.Search by ID");
        System.out.println("4.Save");
        System.out.println("5.Read");
        System.out.println("6.Print");
        System.out.println("0.Exit");
        System.out.print("Your choose: ");
    }
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = -1;
        do {
            menu();
            try {
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("ITProject info");
                        int id;
                        while (true) {
                            try {
                                System.out.print("Nhap id: ");
                                id = Integer.parseInt(sc.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Vui long nhap so cho id");
                            }
                        }
                        String pjName;
                        while (true) {
                            System.out.print("Nhap ten du an: ");
                            pjName = sc.nextLine();
                            if (!pjName.isEmpty()) {
                                break;
                            }
                        }
                        String stName;
                        while (true) {
                            System.out.print("Nhap ten sinh vien: ");
                            stName = sc.nextLine();
                            if (!stName.isEmpty()) {
                                break;
                            }
                        }
                        double raw;
                        while (true) {
                            try {
                                System.out.println("Nhap diem goc: ");
                                raw = Double.parseDouble(sc.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Vui long nhap so thuc");
                            }

                        }
                        String lan;
                        while (true) {
                            System.out.println("Nhap nnlt cua du an: ");
                            lan = sc.nextLine();
                            if (!lan.isEmpty()) {
                                break;
                            }
                        }
                        boolean Deploy;
                        
                        ;

                }
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap mot so de su dung cac chuc nang");
            }
        } while (choice != 0);
    }
}
