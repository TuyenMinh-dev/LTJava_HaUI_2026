/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TX2.train.de3;

import java.io.FileOutputStream;
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
    public void saveFile(String fileName) throws Exception{
      FileOutputStream a = new FileOutputStream(fileName );
      OjectOutputStream b = new OjectOutputStream(a);
      
    }
}
