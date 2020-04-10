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
public abstract class SinhVienPoly {
    
    private String hoTen, nganh;
    
    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    
    // phương thức trừu tượng
    public abstract double getDiem();
    
    public String getHocLuc() {
        if (getDiem() < 5) return "Yeu";
        else if (getDiem() >= 5 && getDiem() < 6.5) return "Trung binh";
        else if (getDiem() >= 6.5 && getDiem() < 7.5) return "Kha";
        else if (getDiem() >= 7.5 && getDiem() < 9) return "Gioi";
        return "Xuat sac";
    }
    
    public void Xuat() {
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Nganh hoc: " + nganh);
    }
}
