/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stoktakip;



/**
 *
 * @author veranur
 */
public class ürünler {
    private int id;
    private String ad;
    private String marka;
    private String katergori;
    private int fiyat;
    private String tarih;

    public ürünler(int id, String ad, String marka, String katergori, int fiyat, String tarih) {
        this.id = id;
        this.ad = ad;
        this.marka = marka;
        this.katergori = katergori;
        this.fiyat = fiyat;
        this.tarih = tarih;
    }
    

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getKatergori() {
        return katergori;
    }

    public void setKatergori(String katergori) {
        this.katergori = katergori;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    
    
    
    

    
    
    
    
}
