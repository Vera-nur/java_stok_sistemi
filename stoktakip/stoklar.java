/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stoktakip;

/**
 *
 * @author veranur
 */
public class stoklar {

    private int urunId;
    private String urunAd;
    private int adet;
    private String tarih;
    private String personel;

    public stoklar(int urunId, String urunAd, int adet, String tarih, String personel) {
        this.urunId = urunId;
        this.urunAd = urunAd;
        this.adet = adet;
        this.tarih = tarih;
        this.personel = personel;
    }

    public int getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {
        this.urunId = urunId;
    }

    

    public String getUrunAd() {
        return urunAd;
    }

    public void setUrunAd(String urunAd) {
        this.urunAd = urunAd;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getPersonel() {
        return personel;
    }

    public void setPersonel(String personel) {
        this.personel = personel;
    }

}
