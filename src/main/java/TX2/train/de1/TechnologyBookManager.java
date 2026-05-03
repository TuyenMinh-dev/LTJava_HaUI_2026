/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TX2.train.de1;

import java.io.*;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author IT SUPPORTER
 */
public class TechnologyBookManager implements ITechnologyBookManager {

    public Scanner sc = new Scanner(System.in);
    //TreeSet tu dong sap xep theo theo Id va khong bi trung lap
    private TreeSet<TechnologyBook> BookList = new TreeSet<>();

    @Override
    public void addTechnologyBook(TechnologyBook e) throws Exception {
        //TreeSet.add tra ve false neu phan tu da ton tai (dua tren ham compare to)
        if (!BookList.add(e)) {
            throw new Exception("Loi: Ma sach " + e.getBookid() + " da co ");
        }
    }

    @Override
    // notice : khong dung .remove(x) trong for-each vi se bi loi ConcurrentModificationException
    public void delTechnologyBookByID(int bookid) throws Exception {
        boolean check = BookList.removeIf(book -> book.getBookid() == bookid);

        if (check) {
            System.out.println("Delete complete the book has id " + bookid);
        } else {
            throw new Exception("Can not find the book has id " + bookid + " to delete ");
        }
    }

    @Override
    public void searchTechnologyBookByAuthorName(String name) throws Exception {
        boolean found = false;
        for (TechnologyBook x : BookList) {
            if (x.getAuthorname().equalsIgnoreCase(name)) {
                if (!found) {
                    x.printTitle();
                    found = true;
                }
                x.printData();
            }

        }
        if (!found) {
            throw new Exception("Can not find the author has name " + name);
        }
    }

    @Override
    public void saveToFile(String fileName) throws Exception {
        // 1. Tạo "luồng" để ghi dữ liệu vào file có tên fileName
        FileOutputStream fos = new FileOutputStream(fileName);

        // 2. Tạo bộ lọc để chuyển đối tượng Java thành dữ liệu máy tính hiểu được
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // 3. Ghi cả cái BookList xuống file
        oos.writeObject(BookList);

        // 4. Đóng luồng sau khi làm xong để giải phóng bộ nhớ
        oos.close();
        fos.close();
        System.out.println("Lưu file thành công!");
    }

    @Override
    public void readFromFile(String fileName) throws Exception {
        // 1. Mở file để đọc
        FileInputStream fis = new FileInputStream(fileName);

        // 2. Tạo bộ lọc để chuyển dữ liệu từ file ngược thành đối tượng Java
        ObjectInputStream ois = new ObjectInputStream(fis);

        // 3. Đọc dữ liệu và ép kiểu nó về TreeSet<TechnologyBook>
        // Vì ois.readObject() trả về kiểu Object chung chung nên ta phải ép kiểu
        BookList = (TreeSet<TechnologyBook>) ois.readObject();

        // 4. Đóng luồng
        ois.close();
        fis.close();
        System.out.println("Đọc file thành công!");

    }

    @Override
    public void printList() throws Exception {
        if (BookList.isEmpty()) {
            throw new Exception("Danh sach hien dang trong!");
        }

        Iterator<TechnologyBook> it = BookList.iterator();

        boolean isFisrt = true;

        while (it.hasNext()) {//chung nao van con phan tu tiep theo
            TechnologyBook b = it.next();// lay phan tu do ra 

            //in tieu de mot lan duy nhat cho cuon dau tien
            if (isFisrt) {
                b.printTitle();
                isFisrt = false;
            }
            b.printData();
        }
    }
}
