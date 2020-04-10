/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author long
 */
public class QuanLyChuyenXe {

    public ArrayList<ChuyenXe> list = new ArrayList<>();
    
    public void Them(ChuyenXe xe) {
        list.add(xe);
    }
    
    /*public void ThemChuyenXe() {
        System.out.println("----- Khoi tao thong tin chuyen xe -----");
        Scanner scanner = new Scanner(System.in);
        int loai, stop = 1;
        do { // vong lap nhap thong tin chuyen xe
            do { // vong lap nhap loai hinh xe
                System.out.print("Nhap loai hinh xe (noi thanh: 1 / ngoai thanh: 2): ");
                loai = scanner.nextInt();
            } while ((loai != 1) && (loai != 2));
            
            if (loai == 1) {
                XeNoiThanh xe = new XeNoiThanh();
                xe.Nhap();
                qlcx.add(xe);
            } else if (loai == 2) {
                XeNgoaiThanh xe = new XeNgoaiThanh();
                xe.Nhap();
                qlcx.add(xe);
            }     
            System.out.print("Ban co muon tiep tuc nhap them xe (1 / 0): ");
            stop = scanner.nextInt();
        } while (stop != 0);
    }*/
    
    public void XuatDanhSach() {
        for (var xe : list) {
            xe.Xuat();
        }
    }
    
    public int TongDoanhThu() {
        int sum = 0;
        for (ChuyenXe xe : list) {
            sum += xe.getDoanhThu();
        }
        return sum;
    }
    
    public int DoanhThuXeNoiThanh() {
        int sum = 0;
        for (ChuyenXe xe : list) {    
            if (xe instanceof XeNoiThanh) {
                sum += xe.getDoanhThu();
            }
        }
        return sum;
    }
    
    public int DoanhThuXeNgoaiThanh() {
        int sum = 0;
        for (ChuyenXe xe : list) {    
            if (xe instanceof XeNgoaiThanh) {
                sum += xe.getDoanhThu();
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        
        QuanLyChuyenXe ql = new QuanLyChuyenXe();
        
        // khởi tạo các chuyến xe
        XeNoiThanh xe1 = new XeNoiThanh("noithanh01", "Nguyen Van A", "xe01", "tuyen 01", 3, 20000);
        XeNoiThanh xe2 = new XeNoiThanh("noithanh02", "Nguyen Van B", "xe02", "tuyen 02", 1, 10000);
        XeNoiThanh xe3 = new XeNoiThanh("noithanh03", "Nguyen Van C", "xe03", "tuyen 03", 5, 50000);
        
        XeNgoaiThanh xe4 = new XeNgoaiThanh("ngoaithanh01", "Tran Van D", "xe04", "Cam Ranh", 1, 15000);
        XeNgoaiThanh xe5 = new XeNgoaiThanh("ngoaithanh02", "Tran Van E", "xe05", "Da Lat", 1, 45000);
        XeNgoaiThanh xe6 = new XeNgoaiThanh("ngoaithanh03", "Tran Van F", "xe06", "Da Nang", 2, 90000);
               
        ql.Them(xe1);
        ql.Them(xe2);
        ql.Them(xe3);
        ql.Them(xe4);
        ql.Them(xe5);
        ql.Them(xe6);
        ql.XuatDanhSach();
        System.out.println("Tong doanh thu xe ngoai thanh: " + ql.DoanhThuXeNgoaiThanh());
        System.out.println("Tong doanh thu xe noi thanh: " + ql.DoanhThuXeNoiThanh());
        System.out.println("Tong doanh thu ca hai loai xe: " + ql.TongDoanhThu());
    }
}
