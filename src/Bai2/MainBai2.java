/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;
import Bai1.NhanVien;

public class MainBai2 {

    
    public static void main(String[] args) {
        //khai bao và khoi tao doi tuong QuanLyNhanVien
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        
        //khoi tạo 5 nhân viên 
        NhanVien nv1 = new NhanVien("Thanh Nuong", 21, "Quang Nam", 20000, 200);
        NhanVien nv2 = new NhanVien("Mong Ngan", 21, "Phu Yen", 90000, 200);
        NhanVien nv3 = new NhanVien("THúy Hồng", 20, "Binh dinh", 20000, 200);
        NhanVien nv4 = new NhanVien("Hồng Quanh", 21, "Khanh Hòa", 50000, 200);
        NhanVien nv5 = new NhanVien("Thanh Nuong", 21, "Quang Nam", 20000, 200);
       
        //thêm danh sách 5 nhân viên vào lớp QuanLyNhanVien
        qlnv.them(nv1);
        qlnv.them(nv2);
        qlnv.them(nv3);
        qlnv.them(nv4);
        qlnv.them(nv5);
        
        
        //In danh sách nhân viên
        qlnv.inDS();
    }
    
}
