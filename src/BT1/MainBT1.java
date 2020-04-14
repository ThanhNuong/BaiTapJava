/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

public class MainBT1 {

    public static void main(String[] args) {
         //khai bao một lớp học, học sinh và giáo viên
          LopHoc lophoc = new LopHoc();
        HocSinh hs1 = new HocSinh("59-cntt1", "Hoi hoa", "le Thi Mong Ngan", 21, "Phu Yen", "098");
        HocSinh hs2 = new HocSinh("59-cntt1", "Ca hat", "Bui Thi Thanh Nuong", 21, "QuangNam", "096");
        GiaoVien gv1 = new GiaoVien("Mau thiet ke", "Ky thuat phan mem", "Huynh Tuan Anh", 45, "Phu Yen", ")987654321");
        
        //them hoc sinh va giáo vien 
        lophoc.themHocSinh(hs1);
        lophoc.themHocSinh(hs2);
        lophoc.themGVGD(gv1);
        
        
        //Xóa thông tin học sinh có tên Bùi Thị Thanh Nương
        lophoc.qldsHS.xoa("Bui Thi Thanh Nuong");
       
        //in ra danh sach lop và giao vien
        System.out.println("Thong tin danh sach lop:");
        lophoc.inDSHS();
        System.out.println("\nThong tin Danh sách giao vien:");
        lophoc.inDSGVGD();
    }
    
    
}
