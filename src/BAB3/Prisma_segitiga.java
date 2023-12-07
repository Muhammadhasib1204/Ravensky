/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3;

/**
 *
 * @author lilis
 */
public class Prisma_segitiga extends Segitiga {
    double tinggiprisma,vol;
    double VolumePrisma(){
        vol = (Luas()*tinggiprisma);
        return vol;
    }
}
