/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khach_hang;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author pham huu dat
 */
public class Ngay_Gio {

    public static String getDate() {
        Date time = new Date();
        SimpleDateFormat dinhDangthoigian = new SimpleDateFormat("MM-dd-yyyy");
        String hienThi = dinhDangthoigian.format(time.getTime());
        return hienThi;

    }

    public static String getDateime_hoadon() {
        Date time = new Date();
        SimpleDateFormat dinhDangthoigian = new SimpleDateFormat("MM-dd-yyyy HH-mm-ss");
        String hienThi = dinhDangthoigian.format(time.getTime());
        return hienThi;

    }
    
    public static String getDateime() {
        Date time = new Date();
        SimpleDateFormat dinhDangthoigian = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String hienThi = dinhDangthoigian.format(time.getTime());
        return hienThi;

    }
    
  

    public static float getdatetime_chuongtrinh(String datetime1, String datetime2) {
        SimpleDateFormat dinhDangThoiGian = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date1 = null;
        Date date2 = null;
        try {
            date1 = dinhDangThoiGian.parse(datetime1);
            date2 = dinhDangThoiGian.parse(datetime2);

        } catch (Exception e) {
        }
        long khoangthoigian = date2.getTime() - date1.getTime();
        float khongthoigiangio = (float) khoangthoigian / (60 * 60 * 1000);

        return khongthoigiangio;
    }

}
