/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DE1;

/**
 *
 * @author IT SUPPORTER
 */
public interface ITechnologyBookManager {
    void addTechnologyBook(TechnologyBook e);
    void delTechnologyBookByID(int bookid);
    void searchTechnologyBookByAuthorName(String name);
}
