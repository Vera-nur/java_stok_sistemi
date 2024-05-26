/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stoktakip;

import java.util.ArrayList;

/**
 *
 * @author veranur
 */
public class satislarclass {
    private int urunId;
    private int adet;
    public static ArrayList<satislarclass>satisList=new ArrayList<>();

    public satislarclass(int urunId, int adet) {
        this.urunId = urunId;
        this.adet = adet;
    }
    public satislarclass (){
        
    }
    public static void add(satislarclass satis){
        satislarclass.satisList.add(satis);
    }
    public static void clear1(){
        satislarclass.satisList.clear();
    }

    public static ArrayList<satislarclass> getSatisList() {
        return satisList;
    }

    public static void setSatisList(ArrayList<satislarclass> satisList) {
        satislarclass.satisList = satisList;
    }

    
    
    

    public int getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {
        this.urunId = urunId;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }
    
    
    
}
