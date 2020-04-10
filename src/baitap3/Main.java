/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author long
 */
public class Main { // shift + F6 để run file, F6 run project
    public static void main(String[] args) {
        // không thể khởi tạo một SinVienPoly bằng Constructor của nó (abstract class) => tạo thông qua lớp con ?
        SinhVienPoly sv1 = new SinhVienIT("Nguyen Truong Long", 7, 8, 9);
        SinhVienIT sv2 = new SinhVienIT("Tran Quoc Chien", 5, 6, 7);
        SinhVienBiz sv3 = new SinhVienBiz("Dang Hoai Phong", 7, 8);
        
        /*boolean isSinhVienPoly = sv1 instanceof SinhVienPoly; // true
        boolean isSinhVienIT = sv1 instanceof SinhVienIT; // true
        boolean isSinhVienBiz = sv1 instanceof SinhVienBiz; // false
        System.out.println(isSinhVienPoly);
        System.out.println(isSinhVienIT);
        System.out.println(isSinhVienBiz);*/
        
        // in thong tin sinh vien
        sv1.Xuat();
        System.out.println("Diem cua sv: " + sv1.getDiem());
        System.out.println("Hoc luc: " + sv1.getHocLuc() + "\n");
        
        sv2.Xuat();
        System.out.println("Diem cua sv: " + sv2.getDiem());
        System.out.println("Hoc luc: " + sv2.getHocLuc() + "\n");
        
        sv3.Xuat();
        System.out.println("Diem cua sv: " + sv3.getDiem());
        System.out.println("Hoc luc: " + sv3.getHocLuc() + "\n");
    }
}
