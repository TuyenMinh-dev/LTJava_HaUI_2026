/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DE1;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author IT SUPPORTER
 */
public class TechnologyBookManager implements ITechnologyBookManager{
    public Scanner sc= new Scanner(System.in);
    TreeSet<TechnologyBook> BookList = new TreeSet<>();
    void addTechnologyBook(TechnologyBook e){
        BookList.add( e);
    }
    void delTechnologyBookByID(int bookid){
        System.out.print("Fill bookID: ");
        bookid=Integer.parseInt(sc.nextLine());
        for(TechnologyBook x : BookList){
            if(x.bookid == bookid){
                BookList.remove(x);
                System.out.println("Da xoa sach co id "+ bookid + " thanh cong");
            }
        }
    }
    void searchTechnologyBookByAuthorName(String name){
            System.out.print("Fill author name: ");
            name=sc.nextLine();
            for(TechnologyBook x : BookList){
                if(x.authorname.equalsIgnoreCase(name)){
                    System.out.println("Thong tin chi tiet: ");
                    x.printTitle();
                    x.printData();
                }
            }
    }
}
