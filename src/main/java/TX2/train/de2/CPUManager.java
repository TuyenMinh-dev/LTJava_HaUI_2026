/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TX2.train.de2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Minh Tuyen
 */
public class CPUManager implements ICPUManager {

    private Scanner sc = new Scanner(System.in);
    private HashSet<CPU> cpnList = new HashSet<>();

    @Override
    public void addCPU(CPU c) throws Exception {
        if (!cpnList.add(c)) {
            throw new Exception("Ma id " + c.getId() + " da ton tai ");
        }
    }

    @Override
    public void delCPUByID(int id) throws Exception {
        boolean check = cpnList.removeIf(component -> component.getId() == id);
        if (check) {
            System.out.println("Da xoa thanh cong CPU co id la " + id);
        } else {
            throw new Exception("Khong the tim thay CPU co id " + id);
        }

    }

    @Override
    public void searchByBrand(String brand) throws Exception {
        boolean find = false;
        for (CPU x : cpnList) {
            if (x.getBrand().equalsIgnoreCase(brand)) {
                if (!find) {
                    x.printTitle();
                    find = true;
                }
                x.printData();
            }
        }
        if (!find) {
            throw new Exception("Khong ton tai brand ten " + brand);
        }
    }

    @Override
    public void saveFile(String fileName) throws Exception {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName));
        dos.writeInt(cpnList.size());// luu truoc so luong phan tu de con dung vong lap
        for( CPU x : cpnList){
           dos.writeInt(x.getId());
           dos.writeUTF(x.getNameUpperCase());
           dos.writeInt(x.getQuantity());
           dos.writeDouble(x.getBasePrice());
           dos.writeInt(x.getCoreCount());
           dos.writeUTF(x.getBrand());
        }
        System.out.println("Da luu file thanh cong");
    }

    @Override
    public void readFile(String fileName) throws Exception {
        DataInputStream dis = new DataInputStream(new FileInputStream(fileName));
        int size = dis.readInt();// doc so luong dau tien 
        cpnList.clear();// xoa cu de nap moi
        for(int i=0 ; i<size;i++){
         int id=dis.readInt();
         String name=dis.readUTF();
         int qty = dis.readInt();
         double price=dis.readDouble();
         int cores =dis.readInt();
         String brand=dis.readUTF();
         
         CPU a = new CPU(id,name,qty,price,cores,brand);
         cpnList.add(a);
        }
        System.out.println("Doc file thanh cong ");
    }

    @Override
    public void displayAll() throws Exception {
        if (cpnList.isEmpty()) {
            throw new Exception("Danh sach rong!");
        }
        Iterator<CPU> it = cpnList.iterator();
        boolean isFisrt = true;
        while (it.hasNext()) {
            CPU x = it.next();
            if (isFisrt) {
                x.printTitle();
                isFisrt = false;
            }
            x.printData();
        }
    }

}
