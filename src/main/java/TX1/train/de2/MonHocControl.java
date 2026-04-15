/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanhB4.train;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Minh Tuyen
 */
public class MonHocControl {
    private ArrayList<MonHoc> dsMon=new ArrayList();
    
    public void outputList(){
        System.out.println("|--------------|-------------------|--------------|-------------------|");
        System.out.println("|     MaMon    |     TenMon        |     SoTin    |      LoaiMon      | ");
        System.out.println("|--------------|-------------------|--------------|-------------------|");
        for(MonHoc a : dsMon){
           a.outputData();
        }
    }
    public void fakeData(){
       MonHoc mh1=new MonHoc();
       mh1.setMaMon("01");
       mh1.setTenMon("oop");
       mh1.setSoTin(3);
       mh1.setLoaiMon(LoaiMon.CoSo);
       dsMon.add(mh1);
       
       MonHoc mh2=new MonHoc();
       mh2.setMaMon("02");
       mh2.setTenMon("sql");
       mh2.setSoTin(4);
       mh2.setLoaiMon(LoaiMon.CoSo);
       dsMon.add(mh2);
       
       MonHoc mh3=new MonHoc();
       mh3.setMaMon("03");
       mh3.setTenMon("dsa");
       mh3.setSoTin(3);
       mh3.setLoaiMon(LoaiMon.ChuyenNganh);
       dsMon.add(mh3);
    }
    public void findMax(){
    if(dsMon.isEmpty()){
        System.out.println("Danh sach rong");}

        MonHoc max=Collections.max(dsMon, (MonHoc mh1,MonHoc mh2)->{
          return Integer.compare(mh1.getSoTin(), mh2.getSoTin());
    });
        System.out.println("Mon hoc co so tin lon nhat la: ")               ;
        System.out.println("|--------------|-------------------|--------------|-------------------|");
        System.out.println("|     MaMon    |     TenMon        |     SoTin    |      LoaiMon      | ");
        System.out.println("|--------------|-------------------|--------------|-------------------|");
        max.outputData();
    }
    
    public void addMore(MonHoc m){
        dsMon.add(m);
    }
}
