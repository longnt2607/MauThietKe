/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

import java.util.Scanner;

/**
 *
 * @author long
 */
public class XeNoiThanh extends ChuyenXe{
    
    private String soTuyen;
    private int soKm;
    
    public XeNoiThanh() {
        
    }
        
    public XeNoiThanh(String maSo, String tenTaiXe, String soXe, String soTuyen, int soKm, int doanhThu) {
        super(maSo, tenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }
    
    /*@Override
    public void Nhap(){
        super.Nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tuyen: ");
        soTuyen = scanner.nextLine();
        System.out.print("Nhap so km di duoc: ");
        soKm = scanner.nextInt();
        System.out.print("Nhap doanh thu: ");
        setDoanhThu(scanner.nextInt());
    }*/
    
    @Override // không có overwrite thấy IDE cảnh báo vàng
    public void Xuat(){
        super.Xuat();
        System.out.println("So tuyen: " + soTuyen);
        System.out.println("So km da di: " + soKm + "\n");
    }    
}
