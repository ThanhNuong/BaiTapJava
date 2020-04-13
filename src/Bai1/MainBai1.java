/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;


public class MainBai1 {
    public static void main(String[] args) {
        
    //Khởi tạo hai biến nhân viên
        NhanVien nv1 = new NhanVien("Thanh Nuong", 21, "Quang Nam", 20000, 150);
        NhanVien nv2 = new NhanVien("Mong Ngan", 21, "Phu Yen", 30000, 200);
        
    //In thông tin nhân viên
        System.out.println("Thông tin nhan viên thư 1:");
        nv1.getThongTin();
        System.out.println("\nThong tin nhan vien thư 2: ");
        nv2.getThongTin();
    }
    
}
