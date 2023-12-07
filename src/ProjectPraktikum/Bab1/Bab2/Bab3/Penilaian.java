/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab1.Bab2.Bab3;

/**
 *
 * @author lilis
 */
abstract public class Penilaian {
    String NIM,Nama,Kode_mk;
    private int NP1,NP2,NP3,NilaiPrak,UTS,UAS;
    public double nilaiproses(){
        return ((NP1 * 0.1)+ (NP2 * 0.2) + (NP3 * 0.1) + (NilaiPrak * 0.4));
    }    

    double nilaiakhir(){
        return (nilaiproses() * 0.6) + (UAS * 0.3);
    }
    double tampilan(){
        return nilaiakhir();
    }
    abstract double nilaikeaktifan();
        
    public int GetNP1(){
        return NP1;
    }
    public void SetNP1(int NP1){
        this.NP1 = NP1;
    }
    public int GetNP2(){
        return NP2;
    }
    public void SetNP2(int NP2){
        this.NP2 = NP2;
    }
    public int GetNP3(){
        return NP3;
    }
    public void SetNP3(int NP3){
        this.NP3 = NP3;
    }
    public int GetNilaiPrak(){
        return NilaiPrak;
    }
    public void SetNilaiPrak(int NilaiPrak){
        this.NilaiPrak = NilaiPrak;
    }
    public int GetUtS(){
        return UTS;
    }
    public void SetUts(int UTS){
        this.UTS = UTS;
    }
    public int GetUas(){
        return UAS;
    }
    public void SetUAS(int UAS){
        this.UAS = UAS;
    }
}
