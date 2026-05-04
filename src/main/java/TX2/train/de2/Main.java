/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TX2.train.de2;

import java.util.Scanner;

/**
 *
 * @author Minh Tuyen
 */
public class Main {

    public static void menu() {
        System.out.println("---MENU---");
        System.out.println("1.Add CPU");
        System.out.println("2.Delete CPU");
        System.out.println("3.Search CPU");
        System.out.println("4.Save file");
        System.out.println("5.Read file");
        System.out.println("6.Print list");
        System.out.println("0.Exit");
        System.out.print("Your choose: ");
    }
    private static Scanner sc = new Scanner(System.in);
    private static CPUManager manager = new CPUManager();

    public static void main(String[] args) {
        int choice = -1;
        do {
            menu();
            try {
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("--Input CPU info--- ");
                        int id;
                        while (true) {
                            try {
                                System.out.print("Nhap ID: ");
                                id = Integer.parseInt(sc.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Vui long nhap so cho ID");
                            }
                        }
                        System.out.print("Nhap ten linh kien: ");
                        String name = sc.nextLine();

                        int qty;
                        while (true) {
                            try {
                                System.out.print("Nhap so luong linh kien: ");
                                qty = Integer.parseInt(sc.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Vui long nhap so cho So Luong");
                            }
                        }

                        double price;
                        while (true) {
                            try {
                                System.out.print("Nhap don gia ");
                                price = Double.parseDouble(sc.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Vui long nhap so thuc cho don gia");
                            }
                        }
                        int cores;
                        while (true) {

                            System.out.print("Nhap so luong nhan: ");
                            cores = Integer.parseInt(sc.nextLine());
                            if (cores > 0) {
                                break;
                            }

                            System.out.println("Vui long nhap lai cho So Nhan");

                        }
                        String brand;
                        while (true) {
                            System.out.print("Nhap ten nhan hieu: ");
                            brand = sc.nextLine();
                            if (!brand.isEmpty()) {
                                break;
                            }
                            System.out.println("Khong duoc de trong ten nhan hieu");
                        }

                        try {
                            CPU newCpu = new CPU(id, name, qty, price, cores, brand);
                            manager.addCPU(newCpu);
                            System.out.println("Da them thanh cong ");
                        } catch (Exception e) {
                            System.out.println("Loi: " + e.getMessage());
                        }

                        break;
                    case 2:
                        int delID;
                        while (true) {
                            try {
                                System.out.println("Nhap ma cua CPU muon xoa: ");
                                delID = Integer.parseInt(sc.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Vui long nhap so nguyen ");
                            }
                        }
                        try {
                            manager.delCPUByID(delID);
                            break;
                        } catch (Exception e) {
                            System.out.println("Loi: " + e.getMessage());
                        }
                        break;
                    case 3:
                        String nameFind;
                        
                        try {
                            System.out.println("Nhap ten nhan hieu cho CPU muon tim: ");
                            nameFind = sc.nextLine();
                            manager.searchByBrand(nameFind);
                            break;
                        } catch (Exception e) {
                            System.out.println("Loi: " + e.getMessage());
                        }
                        break;
                    case 4:
                        try {
                            manager.saveFile("CPUs.dat");
                            System.out.println("Da luu file thanh cong");
                            break;
                        } catch (Exception e) {
                            System.out.println("Loi: " + e.getMessage());
                        }
                        break;
                    case 5:
                        try {
                            manager.readFile("CPUs.dat");
                            System.out.println("Da doc file thanh cong");
                            break;
                        } catch (Exception e) {
                            System.out.println("Loi: " + e.getMessage());
                        }
                        break;
                    case 6:
                        try {
                            manager.displayAll();
                            break;

                        } catch (Exception e) {
                            System.out.println("Loi: " + e.getMessage());
                        }
                        break;
                    case 0:
                        System.out.println("Thoat chuong trinh ");
                        break;
                    default:
                        System.out.println("Vui long nhap mot so tu 0->6");
                        break;

                }
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap mot chu so de lua chon");
            }

        } while (choice != 0);
    }
}
