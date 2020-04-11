/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

public abstract class SinhVienPoLy {//lop truu tuong (do co phuong thuc getDiem() laf phuong thuc truu tuong)
    private String hoTen;
    private String nganh;

    //ham Constructor không tham số
    public SinhVienPoLy() {
    }

    //Hàm Constructor có tham số
    public SinhVienPoLy(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    
    //Hàm get

    public String getHoTen() {
        return hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    //ham set
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    //Phuong thức getDiem là phuong thức trừu tượng
    public abstract double getDiem();
    
    //phuong thuc getHocLuc()
    public String getHocLuc(){
        if(getDiem()<5) return "Yeu";
        else if(getDiem()>=5 && getDiem()<6.5) return "Trung Binh";
        else if(getDiem()>=6.5 && getDiem()<7.5) return "Kha";
        else if (getDiem()>=7.5 && getDiem()<9) return "Gioi";
        else return "Xuất sac";
    }
    
    public void xuat(){
        System.out.println("Ho ten sinh vien: "+hoTen);
        System.out.println("Nganh hoc cua sinh vien: "+nganh);
        System.out.println("Diem cua sinh vien: "+getDiem());
        System.out.println("Hoc luc cua sinh vien: "+getHocLuc());
    }
}
