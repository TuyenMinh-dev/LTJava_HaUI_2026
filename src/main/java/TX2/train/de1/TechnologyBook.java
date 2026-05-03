/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TX2.train.de1;

import java.util.Objects;

/**
 *
 * @author IT SUPPORTER
 */
public class TechnologyBook extends Book implements Comparable<TechnologyBook> {// comparable đe TreeSet co the sap xep

    private int numberpage;
    private String authorname;

    public TechnologyBook() {
        super();
    }

    public TechnologyBook(int bookid, String bookname, int quantity, double price,
            int numberpage, String authorname) throws Exception {
        super(bookid, bookname, quantity, price);
        setNumberpage(numberpage);
        setAuthorname(authorname);
    }

    @Override
    public void printTitle() {
        super.printTitle();
        System.out.printf("| %-15s | %-25s | %-15s |\n", "numberpage", "authorname", "discount");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");

    }

    @Override
    public void printData() {
        super.printData();
        System.out.printf("| %-15d | %-25s | %-15.1f |\n", numberpage, authorname, discount());
    }

    @Override
    public double discount() {
        if (this.quantity >= 20) {
            return 0.2 * this.price;
        }
        return 0;
    }

    public void setNumberpage(int numberpage) throws Exception {
        if (numberpage < 0) {
            throw new Exception("So trang khong đuoc am!");
        }
        this.numberpage = numberpage;
    }

    public void setAuthorname(String authorname) throws Exception {
        if (authorname == null || authorname.trim().isEmpty()) {
            throw new Exception("Ten tac gia khong duoc de trong!");
        }
        this.authorname = authorname;
    }

    @Override
    public int compareTo(TechnologyBook other) {
        return Integer.compare(this.bookid, other.bookid);
    }
    
    //hai ham danh cho hashSet
    /*@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        // So sánh dựa trên tên sách (dùng equals của String)
        return Objects.equals(bookname, book.bookname);
    }

    @Override
    public int hashCode() {
        // Tạo mã băm dựa trên tên sách
        return Objects.hash(bookname);
    }*/

    public String getAuthorname() {
        return authorname;
    }

    public int getNumberpage() {
        return numberpage;
    }

}
