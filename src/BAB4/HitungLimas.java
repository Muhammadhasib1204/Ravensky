/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB4;

/**
 *
 * @author lilis
 */
public class HitungLimas {
    private int luasAlas;
    int tinggi;
    double volume;

    public void setLuasAlas(int luasAlas) {
        this.luasAlas = luasAlas;
    }
    public int getLuasAlas() {
        return luasAlas;
    }
    int Tinggi(){
        return tinggi;
    }
    double volumelimas(int LuasAlas){
        volume = (0.33 * LuasAlas * tinggi);
        return volume;
    }
    
}
