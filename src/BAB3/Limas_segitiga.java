/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3;

/**
 *
 * @author lilis
 */
public class Limas_segitiga extends Segitiga{
    double tinggilimas,vol;
    double VolumeLimas(){
        vol = ((0.333 * Luas())* tinggilimas);
        return vol;
    }
}
