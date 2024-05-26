/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stoktakip;

/**
 *
 * @author veranur
 */
public class Kullanici {

    private int id;
    private String kullaniciAd;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKullaniciad() {
        return kullaniciAd;
    }

    public void setKullaniciad(String kullaniciad) {
        this.kullaniciAd = kullaniciad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Kullanici(int id, String kullaniciad, String password) {
        this.id = id;
        this.kullaniciAd = kullaniciad;
        this.password = password;
    }

    
    
}
