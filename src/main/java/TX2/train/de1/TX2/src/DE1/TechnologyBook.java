/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DE1;

/**
 *
 * @author IT SUPPORTER
 */
public class TechnologyBook extends Book{
    int numberpage;
    String authorname;
    @Override
    public void printTitle(){
        
        System.out.println("|-----------|-------------|-----------|-----------|------------|--------------|");
        System.out.println("|    id     |    name     | quantity  |    price  | numberpage |  authorname  |");
        System.out.println("|-----------|-------------|-----------|-----------|------------|--------------|");
    
    }
    @Override
    public void printData(){
          System.out.printf("| %-11s |  %-13s | %-11s  | %-11s | -12%s | -14s | ",bookid,getBookName(),quantity,price,numberpage,authorname);
    }
    public void check(){
        if(this.numberpage<=0){
            System.out.println("So trang phai lon hon 0");
        }
        if(this.authorname.trim().isEmpty()){
            System.out.println("Chua nhap ten tac gia!");
        }
    }
    
}
