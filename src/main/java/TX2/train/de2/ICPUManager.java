/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TX2.train.de2;

/**
 *
 * @author Minh Tuyen
 */
public interface ICPUManager {
    void addCPU(CPU c) throws Exception;
    void delCPUByID(int id) throws Exception;
    void searchByBrand(String brand) throws Exception;
    void saveFile(String fileName) throws Exception;
    void readFile(String fileName) throws Exception;
    void displayAll() throws Exception;
}
