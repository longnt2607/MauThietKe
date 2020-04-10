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
public class ChuyenXe {
    
    private String maSo, tenTaiXe, soXe;
    private int doanhThu;
    
    public ChuyenXe() {
        
    }
    
    public ChuyenXe(String maSo, String tenTaiXe, String soXe, int doanhThu) {
        this.maSo = maSo;
        this.tenTaiXe = tenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }
    
    /*public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma so xe: ");
        maSo = scanner.nextLine();
        System.out.print("Nhap ten tai xe: ");
        tenTaiXe = scanner.nextLine();
        System.out.print("Nhap so xe: ");
        soXe = scanner.nextLine();
    }*/
    
    public void Xuat() {
        System.out.println("----- Thong tin chuyen xe -----");
        System.out.println("Ma so chuyen: " + maSo);
        System.out.println("Ho ten tai xe: " + tenTaiXe);
        System.out.println("So xe: " + soXe);
        System.out.println("Doanh thu: " + doanhThu);
    }
    
    public int getDoanhThu() {
        return doanhThu;
    }
}
