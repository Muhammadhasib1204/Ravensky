/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6;

/**
 *
 * @author lilis
 */
public class Gaji_Reward extends GajiAbsReward{
    double menit,tunjbonus,gapok,tunjanak,anak;
    int waktu;

    @Override
    double tunjanganAnak() {
        if (anak == 1){
           tunjanak =  gapok + gapok / 0.1;
        }
        else {
            tunjanak = gapok + gapok / 0.2;
        }
        return tunjanak;
    }

    @Override
    double lembur() {
        waktu = (int) (((menit%3600)/60)*25000);
        tunjbonus = tunjanak + waktu;
        return waktu;
    }

    void gapok(String gapok){
    }
    
    
    
}
