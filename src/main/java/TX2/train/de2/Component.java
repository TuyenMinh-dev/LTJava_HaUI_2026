/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TX2.train.de2;

/**
 *
 * @author Minh Tuyen
 */
public abstract class Component {

    protected int id;
    protected String name;
    protected int quantity;
    protected double basePrice;

    public abstract double calculateTax();

    public String getNameUpperCase() {
        if (name.isEmpty()) {
            return name = " ";
        }
        return name.toUpperCase();
    }
    
    public void printTitle(){
        System.out.printf("| %-10s | %-15s | %-10s | %-20s ","id","name","quantity","price");
    }
    
    public void printData(){
        System.out.printf("| %-10d | %-15s | %-10d | %-20.1f ",this.id,getNameUpperCase(),this.quantity,this.basePrice);    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

}
