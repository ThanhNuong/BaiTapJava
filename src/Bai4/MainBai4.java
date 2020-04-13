/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;


public class MainBai4 {

    
    public static void main(String[] args) {
       QuanLyChuyenXe QLCX = new QuanLyChuyenXe();//khoi tao quan ly cac chuyen xe
       
       //khoi tao xe noi thanh
       XeNoiThanh noiThanh1 = new XeNoiThanh("Tuyen001", 120, "NT001", "Nguyen Tin", "N1-987", 155000);
       XeNoiThanh noithanh2 = new XeNoiThanh("Tuyen002", 100, "NT002", "Bui Van Thuong", "N1-909", 22000);
       XeNoiThanh noithanh3 = new XeNoiThanh("Tuyen003", 150, "NT003", "Bui Quang Hung", "N1-9890", 28000);
       
       //khoi tao xe ngoai thanh
       XeNgoaiThanh ngoaiThanh1 = new XeNgoaiThanh("Quang Nam", 20, "N-A1", "Bui Menh", "N1-123", 20000);
       XeNgoaiThanh ngoaiThanh2 = new XeNgoaiThanh("Phu Yen", 35, "N-BL", "Nguyen Thi Nhung", "N1-456", 25000);
       XeNgoaiThanh ngoaiThanh3 = new XeNgoaiThanh("Quang Nam", 20, "N-C1", "Nguyen Dinh Hung", "N1-789", 30000);
       
       //them cac chuyen xe noi thanh
      QLCX.themCX(noiThanh1);
      QLCX.themCX(noithanh3);
      QLCX.themCX(noithanh2);
      
    //them cac chuuyen xe ngoai thanh
        QLCX.themCX(ngoaiThanh1);
        QLCX.themCX(ngoaiThanh2);
        QLCX.themCX(ngoaiThanh3);
      
        //In thong tin cac chuyen xe
       QLCX.inDS();
       
        System.out.println("Tong doanh thu xe noi thanh: "+QLCX.doanhThuNoiThanh());
        System.out.println("Tong doanh thu xe ngoai thanh: "+QLCX.doanhThuNgoaiThanh());
        System.out.println("Tong doanh thu ca 2 loai xe: "+QLCX.tongTien());
    }
    
}
