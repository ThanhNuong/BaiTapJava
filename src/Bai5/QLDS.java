/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;
import java.util.ArrayList;

public class QLDS implements IQLDS{
      
    ArrayList<CaNhan> dsCaNhan = new ArrayList<>();//khoi tao mọt arraylist mới cho qlds

    //khoi tao khong tham so
    public QLDS() {
    }
    
    //khoi tao co tham so
    public QLDS(ArrayList<CaNhan> dsCaNhan){
        this.dsCaNhan = dsCaNhan;
    }
    
    //ghi de 
    @Override
    public int them(CaNhan p){
        dsCaNhan.add(p);
        return 1;
    }
    
     @Override
    public int xoa(String ten){
        for(int i=0; i<dsCaNhan.size(); i++){
            if(dsCaNhan.get(i).getHoTen() == ten)
                dsCaNhan.remove(i);
                        
        }
        return 1;
    }
    
    @Override
    public void inDS(){
        for(int i=0; i<dsCaNhan.size(); i++){
            dsCaNhan.get(i).HienThiTT();
        }
    }
}
