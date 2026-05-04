/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TX2.train.de2;

import java.util.Objects;

/**
 *
 * @author Minh Tuyen
 */
public class CPU extends Component {

    private int coreCount;
    private String brand;

    @Override
    public void printTitle() {
        super.printTitle();
        System.out.printf("| %-10s | %-20s | %-20s |", "coreCount", "brand", "tax");
        System.out.println("---------------------------------------------------------------------\n");
    }

    @Override
    public void printData() {
        super.printData();
        System.out.printf("| %-10d | %-20s | %-20.1f |", this.coreCount, this.brand, calculateTax());
    }

    @Override
    public double calculateTax() {
        double tax = 0;
        if (this.brand == "Intel") {
            tax = 0.1 * this.basePrice;
        } else {
            tax = 0.05 * this.basePrice;
        }
        return tax;
    }

    public void setCoreCount(int coreCount) throws Exception {
        if (coreCount <= 0) {
            throw new Exception("So nhan phai lon hon 0");
        }
        this.coreCount = coreCount;
    }

    public void setBrand(String brand) throws Exception {
        if (brand == null || brand.trim().isEmpty()) {
            throw new Exception("Ten nhan hieu khong duoc trong");
        }
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Component component = (Component) o;
        // So sánh dựa trên id (dùng equals của String)
        return Objects.equals(id, component.id);
    }

    @Override
    public int hashCode() {
        // Tạo mã băm dựa trên id
        return Objects.hash(id);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public int getCoreCount() {
        return coreCount;
    }

    public String getBrand() {
        return brand;
    }

    public CPU() {
        super();
    }

    public CPU(int id, String name, int quantity, double basePrice, int coreCount, String brand ) throws Exception {
        super(id, name, quantity, basePrice);
        setCoreCount(coreCount);
        setBrand(brand);
    }

}
