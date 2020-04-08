/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author long
 */
public class NhanVien {
    
    private String ten, diachi;
    private int tuoi, tonggiolam;
    private double tienluong;
    
    // constructor
    public NhanVien() {
        
    }
    public NhanVien(String ten, int tuoi, String diachi, double tienluong, int tonggiolam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.tienluong = tienluong;
        this.tonggiolam = tonggiolam;
    }
    
    //getter, setter
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    public String getDiachi() {
        return diachi;
    }
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    public double getTienluong() {
        return tienluong;
    }
    public void setTienluong(double tienluong) {
        this.tienluong = tienluong;
    }
    
    public int getTonggiolam() {
        return tonggiolam;
    }
    public void setTonggiolam(int tonggiolam) {
        this.tonggiolam = tonggiolam;
    }
    
    public void getThongTin() {
        System.out.println("----- Thong tin nhan vien -----");
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Dia chi: " + diachi);
        System.out.println("Tien luong: " + (int)tienluong);
        System.out.println("Tong gio lam: " + tonggiolam + "\n");
        //return null;
    }
    
    public double tinhThuong() {
        if (tonggiolam < 100) return 0;
        else if (tonggiolam >= 100 && tonggiolam < 200) return tienluong * 0.1;
        return tienluong * 0.2;
   }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*NhanVien nv1 = new NhanVien("Nguyen Truong Long", 21, "Ninh Hoa, Khanh Hoa, Viet Nam", 8000000, 250);
        NhanVien nv2 = new NhanVien("Scarlett Johansson", 35, " Manhattan, New York, America", 16000000, 120);
        
        nv1.getThongTin();
        nv2.getThongTin();*/
        
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        
        // khởi tạo 5 nhân viên
        NhanVien nv1 = new NhanVien("Nguyen Truong Long", 21, "Ninh Hoa, Khanh Hoa, Viet Nam", 8000000, 250);
        NhanVien nv2 = new NhanVien("Scarlett Johansson", 35, " Manhattan, New York, America", 16000000, 120);
        NhanVien nv3 = new NhanVien("Uzumaki Naruto", 16, "Yamashina, Kyoto, Japan", 4000000, 80);
        NhanVien nv4 = new NhanVien("Stephen Chow", 57, "HongKong, China", 10000000, 100);
        NhanVien nv5 = new NhanVien("Karen Mok", 49, "HongKong, China", 8000000, 220);
        
        // thêm 5 nhân viên vào danh sách
        qlnv.them(nv1);
        qlnv.them(nv2);
        qlnv.them(nv3);
        qlnv.them(nv4);
        qlnv.them(nv5);
        
        // in danh sách nhân viên ra màn hình
        qlnv.inDS();
    }
}
