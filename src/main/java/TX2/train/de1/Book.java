/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TX2.train.de1;

import java.io.Serializable;

/**
 *
 * @author IT SUPPORTER
 */
public abstract class Book implements  Serializable{// đọc ghi 
    protected int bookid;
    protected String bookname;
    protected int quantity;
    protected double price;

    public Book() {
    }

    public Book(int bookid, String bookname, int quantity, double price) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.quantity = quantity;
        this.price = price;
    }
    
    
    public abstract double discount();
        
    
    public String getBookName() {
        return bookname.toUpperCase();
    }
    // ep kieu cho bang du lieu nhu sau :
    // s cho chu , d cho kieu int , f cho kieu double 
    public void printTitle(){     
        System.out.printf("| %-10s | %-20s | %-10s | %-15s ","id","name","quantity","price");
        
    }
    public void printData(){
        System.out.printf("| %-10d | %-20s | %-10d | %-15.1f ",bookid,getBookName(),quantity,price);
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
