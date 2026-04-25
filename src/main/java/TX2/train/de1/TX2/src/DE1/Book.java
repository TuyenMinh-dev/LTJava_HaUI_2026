/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DE1;

/**
 *
 * @author IT SUPPORTER
 */
public abstract class Book {
    int bookid;
    String bookname;
    int quantity;
    double price;
    
    public  double discount(){
        if(this.quantity>=20){
        return 0.2*price;
        } else return 0;
    }

    public String getBookName() {
        return bookname.toUpperCase();
    }
    public void printTitle(){
        System.out.println("|-----------|-------------|-----------|-----------|");
        System.out.println("|    id     |    name     | quantity  |    price  |");
        System.out.println("|-----------|-------------|-----------|-----------|");
    }
    public void printData(){
        System.out.printf("| %-11s |  %-13s | %-11s  | %-11s |",bookid,getBookName(),quantity,price);
    }
    
}
