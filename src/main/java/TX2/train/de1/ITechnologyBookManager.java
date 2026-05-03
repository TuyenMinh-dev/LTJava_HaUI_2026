/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TX2.train.de1;

/**
 *
 * @author IT SUPPORTER
 */
public interface ITechnologyBookManager {
    void addTechnologyBook(TechnologyBook e) throws Exception;
    void delTechnologyBookByID(int bookid) throws Exception;
    void searchTechnologyBookByAuthorName(String name) throws Exception;
    void saveToFile(String fileName) throws Exception; // Ý d
    void readFromFile(String fileName) throws Exception; // Ý e
    void printList() throws Exception; // Ý f
}
