/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

public class ChuyenXe {
    protected String maSoChuyen;
    protected String hoTenTaiXe;
    protected String soXe;
    protected double doanhThu;

    //khoi tao ham khong tham so
    public ChuyenXe() {
    }

    //khoi tao ham co tham so
    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    //phuong thuc get
    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    //phuong thuc set
    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    
    //phuong thuc hien thi thong tin chuyen xe
    public void HienThiTT(){
        System.out.println("Ma so chuyen xe: "+maSoChuyen);
        System.out.println("Ho ten tai xe: "+hoTenTaiXe);
        System.out.println("So xe : "+soXe);
        System.out.println("Doanh thu: "+doanhThu);
    }
    
    
}
