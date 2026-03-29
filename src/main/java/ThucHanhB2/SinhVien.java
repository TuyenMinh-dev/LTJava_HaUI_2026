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

public class SinhVien implements IStudentUtils {

    private static int stt = 1;
    private String maSV;
    private String tenSV;
    private MajorType nganhHoc;
    private float diemTB;

    public SinhVien() {
        this.maSV = "SV" + stt++;
    }

    public SinhVien(String tenSV, MajorType nganhHoc, float diemTB) {
        this.maSV = "SV" + stt++;
        this.tenSV = tenSV;
        this.nganhHoc = nganhHoc;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public MajorType getNganhHoc() {
        return nganhHoc;
    }

    public float getDiemTB() {
        return diemTB;
    }

    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Nhap thong tin cho " + maSV + " ---");
        System.out.print("Ten sinh vien: ");
        this.tenSV = sc.nextLine();

        System.out.print("Nganh hoc (1: CNTT, 2: Ke toan, 3: QTKD): ");
        int chon = Integer.parseInt(sc.nextLine());
        this.nganhHoc = (chon == 1) ? MajorType.CNTT : (chon == 2) ? MajorType.KETOAN : MajorType.QTKD;

        System.out.print("Diem trung binh: ");
        this.diemTB = Float.parseFloat(sc.nextLine());
    }

    @Override
    public void outputData() {
        System.out.printf("| %-6s | %-18s | %-8s | %-6.2f |\n",
                maSV, tenSV, nganhHoc, diemTB);
    }
}
