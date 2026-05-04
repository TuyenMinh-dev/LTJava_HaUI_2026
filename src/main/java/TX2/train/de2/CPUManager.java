/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TX2.train.de2;

import java.util.HashSet;
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
            if (x.getNameUpperCase().equalsIgnoreCase(brand)) {
                if (!find) {
                    x.printTitle();
                    find = true;
                }
                x.printData();
            }
        }
        if(!find){
            throw new Exception("Khong ton tai brand ten "+ brand);
        }
    }
    @Override
    public void saveFile(String fileName) throws Exception{
        
    }
    
    @Override
    public void readFile(String fileName) throws Exception{
        
    }
    
    @Override
    public void displayAll() throws Exception{
        
    }

}
