/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;
import Bai1.NhanVien;
import java.util.ArrayList;

public class QuanLyNhanVien implements IQuanLy{
    ArrayList<NhanVien> qlnv = new ArrayList<>();

    public QuanLyNhanVien() {
    }
    
    public QuanLyNhanVien(ArrayList<NhanVien> qlnv){
        this.qlnv = qlnv;
    }
            
    //Ham ghi de them doi tuong nhan vien
    @Override
    public void them(NhanVien nv){
        qlnv.add(nv);
    }
    
    //Ham in danh sach 
    @Override
    public void inDS(){
        for(int i=0; i<qlnv.size();i++){
            System.out.println("\nThong tin nhan vien thu: "+i);
            qlnv.get(i).getThongTin();
        }
    }

}
