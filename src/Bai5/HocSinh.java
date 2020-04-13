/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

public class HocSinh extends CaNhan{
    private String lop;
    private String nangKhieu;

    public HocSinh() {
    }

    public HocSinh(String lop, String nangKhieu, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public String getLop() {
        return lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }
    
    @Override
    public String HienThiTT(){
        System.out.println("\nHo ten hoc sinh: "+hoTen);
        System.out.println("Tuoi hoc sinh: "+tuoi);
        System.out.println("Dia chi hoc sinh: "+diaChi);
        System.out.println("So dien thoai hoc sinh: "+sdt);
        System.out.println("Lop cua hoc sinh "+lop);
        System.out.println("Nang khieu cua hoc sinh: "+nangKhieu);
        return null;
        
    }
}
