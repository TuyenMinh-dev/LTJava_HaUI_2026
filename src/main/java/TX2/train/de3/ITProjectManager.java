/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TX2.train.de3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Minh Tuyen
 */
public class ITProjectManager {

    private TreeSet<ITProject> prList = new TreeSet<>();

    public void addProject(ITProject e) throws Exception {
        if (!prList.add(e)) {
            throw new Exception("Loi: Ma id " + e.projectId + " da ton tai");
        }
    }

    public void delProjectByID(int id) throws Exception {
        boolean check = prList.removeIf(project -> project.projectId == id);
        if (check) {
            System.out.println("Da xoa thanh cong du an co id la " + id);
        } else {
            throw new Exception("Khong the tim thay du an co id la " + id);
        }
    }

    public void searchByLanguage(String lang) throws Exception {
        boolean find = false;
        if (prList.isEmpty()) {
            System.out.println("Danh sach trong");
        }
        for (ITProject x : prList) {
            if (x.getLanguage().equalsIgnoreCase(lang)) {
                if (!find) {
                    x.printTitle();
                    find = true;
                }
                x.printData();
            }
        }
        if (!find) {
            throw new Exception("Khong tim thay du an su dung nnlt " + lang);
        }
    }

    public void saveFile(String fileName) throws Exception {
        FileOutputStream a = new FileOutputStream(fileName);
        ObjectOutputStream b = new ObjectOutputStream(a);
        b.writeObject(prList);
        b.close();
        a.close();
        System.out.println("Luu file thanh cong");
    }

    public void readFile(String fileName) throws Exception {
        FileInputStream x = new FileInputStream(fileName);
        ObjectInputStream y = new ObjectInputStream(x);
        prList = (TreeSet<ITProject>) y.readObject();
        y.close();
        x.close();
        System.out.println("Doc file thanh cong");
    }

    public void printList() {
        if (prList.isEmpty()) {
            System.out.println("Danh sach rong");
        }
        Iterator<ITProject> it = prList.iterator();
        boolean isFisrt = true;
        while (it.hasNext()) {
            ITProject x = it.next();
            if (isFisrt) {
                x.printTitle();
                isFisrt = false;
            }
            x.printData();
        }
    }
}
