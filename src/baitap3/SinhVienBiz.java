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
public class SinhVienBiz extends SinhVienPoly{

    private double diemMarketing, diemSales;
    
    public SinhVienBiz(String hoTen, double diemMarketing, double diemSales) {
        
        // gọi Constructor của lớp cha
        super(hoTen, "Kinh te");
        
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }
    
    // thực hiện phương thức trừu tượng ở lớp cha
    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}
