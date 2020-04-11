/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;
import Bai1.NhanVien;

public class QuanLyNhanVien implements IQuanLy{
    NhanVien[] NV = new NhanVien[10];
    int n = 0;
    
    //Ham ghi de them doi tuong nhan vien
    @Override
    public void them(NhanVien nv){
        NV[n] = nv;
        n++;
    }
    
    //Ham in danh sach 
    @Override
    public void inDS(){
        for(int i=0; i<n;i++){
            System.out.println("\nThong tin nhan vien thu "+(i+1));
            NV[i].getThongTin();
        }
    }

}
