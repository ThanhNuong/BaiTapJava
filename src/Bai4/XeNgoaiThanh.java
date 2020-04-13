/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

public class XeNgoaiThanh extends ChuyenXe{
    private String noiDen;
    private int soNgayDi;

    public XeNgoaiThanh() {
    }

    public XeNgoaiThanh(String noiDen, int soNgayDi, String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public int getSoNgayDi() {
        return soNgayDi;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public void setSoNgayDi(int soNgayDi) {
        this.soNgayDi = soNgayDi;
    }
    
    @Override
    public void HienThiTT(){
        super.HienThiTT();
        System.out.println("Noi den: "+noiDen);
        System.out.println("So ngay di duoc: "+soNgayDi);
        
    }
        
}
