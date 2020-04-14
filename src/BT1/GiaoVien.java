/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;


public class GiaoVien extends CaNhan{ //lop GiaoVien ke thua tu lop CaNhan
    private String monDay;
    private String toBoMon;

    public GiaoVien() {
    }

    public GiaoVien(String monDay, String toBoMon, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    

    public String getMonDay() {
        return monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }

   @Override
    public String HienThiTT(){
        System.out.println("Ho ten giao vien: "+hoTen);
        System.out.println("Tuoi giao vien: "+tuoi);
        System.out.println("Dia chi giao vien: "+diaChi);
        System.out.println("So dien thoai giao vien: "+sdt);
        System.out.println("Mon day cua giao vien: "+monDay);
        System.out.println("To bo mon: "+toBoMon);
        return null;  
       }
}
