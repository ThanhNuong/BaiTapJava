/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;
import java.util.ArrayList;

public class LopHoc {
    //khoi tao
    ArrayList<HocSinh> hocsinh = new ArrayList<>();
    ArrayList<GiaoVien> giaovienGD = new ArrayList<>();
    GiaoVien giaovienCN = new GiaoVien();
    QLDS qldsGVGD = new QLDS();
    QLDS qldsHS = new QLDS();

    public LopHoc() {
    }
    
    //phuong thuc them hoc sinh
    public int themHocSinh(HocSinh hs){
        qldsHS.them(hs);
        return 1;
    }
    
    //phuong thuc them gvgd
    public int themGVGD(GiaoVien gv){
        qldsGVGD.them(gv);
        return 1;
    }
    
    //phuong thuc in dshs
    public int inDSHS(){
        qldsHS.inDS();
        return  0;
    }
    
    //phuong thuc in dsgvgd
    public int inDSGVGD(){
        qldsGVGD.inDS();
        return 0;
    }
}
