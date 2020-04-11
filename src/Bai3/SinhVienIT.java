/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

//lop SinhVienIT ke thua tu lop SinhVienPoly
public class SinhVienIT extends SinhVienPoLy{
    private double diemJava;
    private double diemCss;
    private double diemHtml;

    public SinhVienIT() {
    }

    public SinhVienIT(double diemJava, double diemCss, double diemHtml, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }

    public void setDiemHtml(double diemHtml) {
        this.diemHtml = diemHtml;
    }
     
   //ghi de phuong thuc getDiem()
    @Override 
    public double getDiem(){
        return (2*diemJava + diemHtml+diemCss)/4;
    }
            
    
}
