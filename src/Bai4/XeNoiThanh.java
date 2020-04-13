/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

public class XeNoiThanh extends ChuyenXe{
    private String soTuyen;
    private double soKmDi;

    public XeNoiThanh() {
    }

    public XeNoiThanh(String soTuyen, double soKmDi, String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDi = soKmDi;
    }

    public String getSoTuyen() {
        return soTuyen;
    }

    public double getSoKmDi() {
        return soKmDi;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }

    public void setSoKmDi(double soKmDi) {
        this.soKmDi = soKmDi;
    }
    
    @Override
    public void HienThiTT(){
        super.HienThiTT();
        System.out.println("So tuyen xe: "+soTuyen);
        System.out.println("So km di duoc: "+soKmDi);
    }
        
}
