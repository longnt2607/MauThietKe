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
public class XeNgoaiThanh extends ChuyenXe{
    
    private String noiDen;
    private int soNgayDi;
    
    public XeNgoaiThanh() {
        
    }
    
    public XeNgoaiThanh(String maSo, String tenTaiXe, String soXe, String noiDen, int soNgayDi, int doanhThu) {
        super(maSo, tenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }
    
    /*@Override
    public void Nhap() {
        super.Nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap noi den: ");
        noiDen = scanner.nextLine();
        System.out.print("Nhap so ngay di: ");
        soNgayDi = scanner.nextInt();
        System.out.print("Nhap doanh thu: ");
        setDoanhThu(scanner.nextInt());
    }*/
    
    @Override // không có overwrite thấy IDE cảnh báo vàng
    public void Xuat(){
        super.Xuat();
        System.out.println("Noi den: " + noiDen);
        System.out.println("So ngay da di: " + soNgayDi + "\n");
    }
}
