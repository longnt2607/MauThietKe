/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

import java.util.ArrayList;

/**
 *
 * @author long
 */
public class QuanLyNhanVien implements IQuanLy {

    ArrayList<NhanVien> arrListNhanVien = new ArrayList<>();
    
    @Override
    public void them(NhanVien nv) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        arrListNhanVien.add(nv);
    }

    @Override
    public void inDS() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        arrListNhanVien.forEach((nv) -> { // cái này được IDE đề nghị dùng ???
            nv.getThongTin();
        });
        /*for (NhanVien nv : arrListNhanVien) {
            nv.getThongTin();
        }*/
    }
    
}
