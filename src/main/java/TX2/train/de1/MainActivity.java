/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TX2.train.de1;

import java.util.Scanner;

/**
 *
 * @author IT SUPPORTER
 */
public class MainActivity {

    public static Scanner sc = new Scanner(System.in);
    public static TechnologyBookManager manager = new TechnologyBookManager();

    public static void menu() {
        System.out.println("---MENU---");
        System.out.println("1.Add book");
        System.out.println("2.Delete book");
        System.out.println("3.Search book");
        System.out.println("4.Save list into file");
        System.out.println("5.Read list from file");
        System.out.println("6.Print list by use interator");
        System.out.println("0.Exit");
        System.out.print("Your choose: ");
    }

    public static void main(String[] args) {
        int choice = -1;
        do {
            menu();
            try {
                choice = Integer.parseInt(sc.nextLine());
                
             switch(choice){
                 case 0:
                     System.out.println("EXIT");
                     break;
                     
                 case 1:
                     System.out.println("Start fill new book: ");
                     System.out.print("Fill id : ");
                     int id = Integer.parseInt(sc.nextLine());
                     System.out.print("Fill book's name: ");
                     String name = sc.nextLine();
                     System.out.print("Fill quantity: ");
                     int qtity = Integer.parseInt(sc.nextLine());
                     System.out.print("Fill price: ");
                     double price = Double.parseDouble(sc.nextLine());
                     System.out.print("Fill numberpage: ");
                     int number = Integer.parseInt(sc.nextLine());
                     System.out.print("Fill authorname: ");
                     String author = sc.nextLine();
                     
                     TechnologyBook newBook = new TechnologyBook(id,name,qtity,price,number,author);
                     manager.addTechnologyBook(newBook);
                     System.out.println("Add succesfully!");
                     break;
                 case 2:
                     System.out.print("Fill id of book want to delete: ");
                     int delId = Integer.parseInt(sc.nextLine());
                     manager.delTechnologyBookByID(delId);
                     break;
                 case 3 :
                     System.out.print("Search by author name: ");
                     String Auname = sc.nextLine();
                     manager.searchTechnologyBookByAuthorName(Auname);
                     break;
                 case 4 : 
                     manager.saveToFile("books.dat");
                     System.out.println("Da luu du lieu vao books.dat");
                     break;
                 case 5 : 
                     manager.readFromFile("books.dat");
                     System.out.println("Da tai du lieu tu file!");
                     break;
                 case 6 :
                     manager.printList();
                     break;
                 default:
                     System.out.println("Vui long nhap lai ");
                     break;
             }   
            } catch (Exception e) {
                System.err.println("Loi: " + e.getMessage());
            }

        } 
        while (choice != 0);
    }
}
