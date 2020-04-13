/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;
import java.util.ArrayList;

public class QuanLyChuyenXe {
    ArrayList<ChuyenXe> DSCX = new ArrayList<>();

    public QuanLyChuyenXe() {
    }
    
    public QuanLyChuyenXe(ArrayList<ChuyenXe> dsChuyenXe){
        this.DSCX = dsChuyenXe;
    }
    
    //them chuyen xe
    public void themCX(ChuyenXe cx){
        DSCX.add(cx);
    }
    
    //in danh sach tung chuyen xe
    public void inDS(){
        for(int i=0; i<DSCX.size(); i++){
            System.out.println("\nThong tin chuyen xe thu "+i);
            DSCX.get(i).HienThiTT();
        }
            
    }
    
    //tinh tong doanh thu cho xe noi thanh
    public double doanhThuNoiThanh(){
        double doanhThu = 0;
        for(int i=0; i<DSCX.size(); i++){
            if(DSCX.get(i) instanceof XeNoiThanh)
                doanhThu += DSCX.get(i).getDoanhThu();
        }
        return doanhThu;
    }
    
    //tinh tong doanh thu cho xe ngoai thanh
    public double doanhThuNgoaiThanh(){
        double doanhthu = 0;
        for(int i=0; i<DSCX.size(); i++){
            if(DSCX.get(i) instanceof XeNgoaiThanh)
                doanhthu += DSCX.get(i).getDoanhThu();
        }
        return doanhthu;
    }
    
    //tong doanh thu 2 loai xe
    public double tongTien(){
        double tien=0;
        for(int i=0; i<DSCX.size(); i++){
            tien += DSCX.get(i).getDoanhThu();
        }
        return tien;
    }
}
