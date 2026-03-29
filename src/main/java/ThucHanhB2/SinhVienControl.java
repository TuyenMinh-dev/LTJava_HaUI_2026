/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanhB2;

/**
 *
 * @author Minh Tuyen
 */
import java.util.*;

public class SinhVienControl {

    private List<SinhVien> list = new ArrayList<>();

    public void addData(SinhVien sv) {
        list.add(sv);
    }

    public void getData() {
        System.out.println("\nDANH SACH SINH VIEN:");
        System.out.println("--------------------------------------------");
        System.out.printf("| %-6s | %-18s | %-8s | %-6.2s |\n", "Ma", "Ten", "Nganh", "DTB");
        for (SinhVien sv : list) {
            sv.outputData();
            System.out.println();
        }
        System.out.println("--------------------------------------------");
    }

    public void fakeData() {
        list.add(new SinhVien("Tuyen", MajorType.CNTT, 10));
        list.add(new SinhVien("Long", MajorType.QTKD, 9.2f));
        list.add(new SinhVien("Nam", MajorType.KETOAN, 9.0f));
    }

    public void sortData() {

        Collections.sort(list, (s1, s2) -> {
            int soSanhTen = s2.getTenSV().compareTo(s1.getTenSV());
            if (soSanhTen == 0) {
                return s1.getNganhHoc().compareTo(s2.getNganhHoc());
            }
            return soSanhTen;
        });
    }

    public void editData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma SV can sua: ");
        String ma = sc.nextLine();
        for (SinhVien sv : list) {
            if (sv.getMaSV().equalsIgnoreCase(ma)) {
                sv.inputData();
                return;
            }
        }
        System.out.println("Loi : Khong tim thay ma nhu tren " + ma);
    }

    public void deleteSV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma SV can xoa: ");
        String ma = sc.nextLine();
        boolean check = list.removeIf(sv -> sv.getMaSV().equalsIgnoreCase(ma));
        if (check) {
            System.out.println("Da xoa thanh cong");
        } else {
            System.out.println("Khong tim thay ma de xoa");
        }
    }

    public void maxSV() {
        if (list.isEmpty()) {
            return;
        }
        SinhVien top = Collections.max(list, Comparator.comparingDouble(SinhVien::getDiemTB));
        System.out.print(" Thu khoa la: ");
        top.outputData();
        System.out.println();
    }
}
