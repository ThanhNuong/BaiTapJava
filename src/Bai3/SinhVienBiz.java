/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

//lop SinhVienBiz ke thua tu lop SinhVienPoly
public class SinhVienBiz extends SinhVienPoLy{
    private double diemMarketing;
    private double diemSales;

    public SinhVienBiz() {
    }

    public SinhVienBiz(double diemMarketing, double diemSales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    public double getDiemMarketing() {
        return diemMarketing;
    }

    public double getDiemSales() {
        return diemSales;
    }

    public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }
    
    //ghi de len phuong thuc getDiem()
    @Override
    public double getDiem(){
        return (2*diemMarketing + diemSales)/3;
    } 
}
