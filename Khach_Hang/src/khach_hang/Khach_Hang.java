/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khach_hang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author pham huu dat
 */
public class Khach_Hang {

    private String iD;
    private String tenKhach;
    private String soDienThoai;
    private String diaChiNha;
    private String email;
    private String noiCap;

    public Khach_Hang() {
    }

    public Khach_Hang(String iD, String tenKhach, String soDienThoai, String diaChiNha, String email, String noiCap) {
        this.iD = iD;
        this.tenKhach = tenKhach;
        this.soDienThoai = soDienThoai;
        this.diaChiNha = diaChiNha;
        this.email = email;
        this.noiCap = noiCap;
    }

    public ArrayList<Khach_Hang> loadKhachHang() {
        ArrayList<Khach_Hang> list = new ArrayList<Khach_Hang>();
        String sql = "select Khach_Hang.* from Khach_Hang";
        try {
            Connection cnn = Connect_Sqlserver_airport.connectAirport();
            PreparedStatement stt = cnn.prepareStatement(sql);
            ResultSet rs = stt.executeQuery();
            while (rs.next()) {
                list.add(new Khach_Hang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
            }
            return list;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "connect fail!!!");
        }
        return null;

    }

    public void insetKhachHang(Khach_Hang kh) {
        String sql = "insert into Khach_Hang values (?,?,?,?,?,?)";

        Connection cnn;
        try {
            cnn = Connect_Sqlserver_airport.connectAirport();
            PreparedStatement stt = cnn.prepareStatement(sql);
            stt.setString(1, kh.getiD());
            stt.setString(2, kh.getTenKhach());
            stt.setString(3, kh.getSoDienThoai());
            stt.setString(4, kh.getDiaChiNha());
            stt.setString(5, kh.getEmail());
            stt.setString(6, kh.getNoiCap());
            stt.executeUpdate();
            JOptionPane.showMessageDialog(null, "ok!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "checking fill in !!!");
        }

    }

    public String getNoiCap() {
        return noiCap;
    }

    public void setNoiCap(String noiCap) {
        this.noiCap = noiCap;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setDiaChiNha(String diaChiNha) {
        this.diaChiNha = diaChiNha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getiD() {
        return iD;
    }

    public String getTenKhach() {
        return tenKhach;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public String getDiaChiNha() {
        return diaChiNha;
    }

    public String getEmail() {
        return email;
    }
}
