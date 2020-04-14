/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

public class NhanVien {
    //Cac thuoc tinh lop NhanVien
    public String ten;
    public int tuoi;
    public String diaChi;
    public double tienLuong;
    public int tongSoGioLam;
    
    //Xay dung ham Constructor khong tham so
    public NhanVien() {
    }
    
    //Xay dung ham Constructor có tham so
    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongSoGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongSoGioLam = tongSoGioLam;
    }
    
    //Xay dung ham get
    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public int getTongSoGioLam() {
        return tongSoGioLam;
    }
    
    
    //Xay dung ham setNhanVien
    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public void setTongSoGioLam(int tongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }
    
    //Xay dung phuong thuc getThongTin() tra về thông tin của nhân viên
    public void getThongTin(){
        System.out.println("Ten nhan vien: "+ten);
        System.out.println("Tuoi nhan vien: "+tuoi);
        System.out.println("Dia chi nhan vien: "+diaChi);
        System.out.println("Tien luong nhan vien: "+tienLuong);
        System.out.println("Tong so gio lam cua nhan vien: "+tongSoGioLam);
    }
    
    //Xay dựng hàm tinhThuong tính toán và trả vầ số tiền thưởng của nhân viên 
    public double tinhThuong(){
        if(tongSoGioLam >= 200) return tienLuong*0.2;
        else if(tongSoGioLam<200 && tongSoGioLam>=100) return tienLuong*0.1;
        else return 0;
    }
   
    
}
