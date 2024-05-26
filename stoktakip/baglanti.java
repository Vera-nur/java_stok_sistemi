/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stoktakip;

import java.sql.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author veranur
 */
public class baglanti {

    private String username = "root";
    private String pass = "190517Veranur";
    private String url = "jdbc:mysql://127.0.0.1:3306/stok_sistemi";
    Connection c = this.getConnection();

    public Connection getConnection() {
        c = null;

        try {
            c = DriverManager.getConnection(url, username, pass);
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }

        return c;
    }

    public ResultSet executeQuery(String sorgu) {

        ResultSet rs = null;
        try {
            Statement st = c.createStatement();
            rs = st.executeQuery(sorgu);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return rs;
    }

    public int executeUpdate(String sorgu) {
        int sonuc = 0;
        try {
            Statement st = c.createStatement();
            sonuc = st.executeUpdate(sorgu);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return sonuc;

    }

    public PreparedStatement preparedStatement(String sorgu) {
        PreparedStatement ps = null;
        try {
            ps = c.prepareStatement(sorgu);
        } catch (SQLException ex) {
           System.out.println(ex.getMessage());
        }
        return ps;
    }
// Verilen sorgu ile tablo sütun başlıklarını ayarlar ve model döner

    public DefaultTableModel colName(String sorgu, JTable jTable1) {
        ResultSet rs = this.executeQuery(sorgu);
        DefaultTableModel model = new DefaultTableModel();
        jTable1.setModel(model);
        ResultSetMetaData rsmd;
        int columnCount = 0;
        try {
            rsmd = rs.getMetaData();
            columnCount = rsmd.getColumnCount();

            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(rsmd.getColumnName(i));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;

    }

    public void tabloyaEkle(String sorgu, JTable jTable1, DefaultTableModel model) {
        ResultSet rs = this.executeQuery(sorgu);
        ResultSetMetaData rsmd;
        int columnCount = 0;
        try {
            rsmd = rs.getMetaData();
            columnCount = rsmd.getColumnCount();

            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    row[i] = rs.getObject(i + 1);
                }
                model.addRow(row);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void comboBox(String sorgu, String istenen, JComboBox combo) {
        ResultSet rs = this.executeQuery(sorgu);
        ArrayList<String> list = new ArrayList<>();
        try {
            while (rs.next()) {
                list.add(rs.getString(istenen));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        for (Object string : list) {
            combo.addItem(string);
        }

    }

    public void listele(String sorgu, String istenen, DefaultListModel listModel) {
        ResultSet rs = this.executeQuery(sorgu);

        try {
            while (rs.next()) {
                String kullaniciAd = rs.getString(istenen);
                listModel.addElement(kullaniciAd);
            }
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }

    }

    /**
     * Bu metot, verilen metni kullanarak belirli bir sütunda arama yapar ve
     * sonuçları döndürür. Arama kriteri boşsa, tüm kayıtları döndürür.
     *
     * @param str
     * @param sutun
     * @param sorgu
     * @return
     */
    public ArrayList<Object> search(String str, String sutun, String sorgu) {
        Pattern pattern = Pattern.compile(str);
        Matcher matcher;
        ArrayList<Object> urunList = new ArrayList<>();

        ResultSet rs = this.executeQuery("select * from stok_sistemi." + sorgu);
        try {
            while (rs.next()) {
                if (str.isBlank()) {
                    // Arama kriteri boşsa, tüm kayıtları listeye ekler
                    Object urun = null;

                    if (sorgu.equals("ürünler")) {
                        urun = new ürünler(rs.getInt("id"), rs.getString("ad"), rs.getString("marka"), rs.getString("kategori"), rs.getInt("fiyat"), rs.getString("tarih"));
                    } else if (sorgu.equals("stoklar")) {
                        urun = new stoklar(rs.getInt("urunid"), rs.getString("urunAd"), rs.getInt("adet"), rs.getString("tarih"), rs.getString("personel"));
                    }
                    urunList.add(urun);
                    // Arama kriteri doluysa, eşleşen kayıtları listeye ekle
                } else {
                    matcher = pattern.matcher(rs.getString(sutun));
                    while (matcher.find()) {
                        Object urun = null;

                        if (sorgu.equals("ürünler")) {
                            urun = new ürünler(rs.getInt("id"), rs.getString("ad"), rs.getString("marka"), rs.getString("kategori"), rs.getInt("fiyat"), rs.getString("tarih"));
                        } else if (sorgu.equals("stoklar")) {
                            urun = new stoklar(rs.getInt("urunid"), rs.getString("urunAd"), rs.getInt("adet"), rs.getString("tarih"), rs.getString("personel"));
                        }
                        urunList.add(urun);
                    }

                }

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return urunList;
    }

}
