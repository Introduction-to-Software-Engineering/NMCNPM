/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khach_hang;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author pham huu dat
 */
public class Nhap_Thong_Tin_Khach extends javax.swing.JFrame {

    char[] T = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    ArrayList<Khach_Hang> list1 = new ArrayList<Khach_Hang>();
    ArrayList<Khach_Hang> list = new ArrayList<Khach_Hang>();
    Khach_Hang kh = new Khach_Hang();

    public Nhap_Thong_Tin_Khach() {
        this.setLocation(300, 150);
        list1 = kh.loadKhachHang();
        initComponents();
        jLabel1.setText(Ngay_Gio.getDate());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Dia_Chi_Nha = new javax.swing.JTextArea();
        CMTND = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Dia_Chi_Mail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ComBox_ThanhP = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        SDT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Ho_Ten = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin khách hàng đặt vé"));
        jPanel1.setForeground(new java.awt.Color(0, 255, 204));
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Số CMTND");

        Dia_Chi_Nha.setColumns(20);
        Dia_Chi_Nha.setLineWrap(true);
        Dia_Chi_Nha.setRows(5);
        jScrollPane1.setViewportView(Dia_Chi_Nha);

        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("Email");

        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Nơi cấp");

        jButton1.setText("Hoàn tất");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoan_Tat(evt);
            }
        });

        ComBox_ThanhP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "An Giang", "Bà Rịa - Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu", "Bắc Ninh", "Bến Tre", "Bình Định", "Bình Dương", "Bình Phước", "Bình Thuận", "Cà Mau", "Cao Bằng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Tĩnh", "Hải Dương", "Hậu Giang", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái", "Phú Yên", "Cần Thơ", "Đà Nẵng", "Hải Phòng", "Hà Nội", "TP HCM" }));

        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("SĐT");

        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("Địa chỉ nhà");

        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Họ và tên");

        jLabel5.setText("vui lòng nghi đầy đủ thông tin vào mẫu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(Dia_Chi_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7))
                    .addGap(57, 57, 57)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComBox_ThanhP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SDT)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .addComponent(CMTND))
                        .addComponent(Ho_Ten, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(278, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dia_Chi_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel5))
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(Ho_Ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(CMTND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(ComBox_ThanhP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(115, Short.MAX_VALUE)))
        );

        Time.setIcon(new javax.swing.ImageIcon(getClass().getResource("/khach_hang/folder/1438680163_Edit-Male-User.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/khach_hang/folder/Plane-icon.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Time, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hoan_Tat(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoan_Tat
        int e = 0;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).getiD().equals(CMTND.getText().trim())) {
                JOptionPane.showMessageDialog(this, "khách hàng quen !!!");
                Ho_Ten.setText(list1.get(i).getTenKhach());
                ComBox_ThanhP.setSelectedItem(list1.get(i).getNoiCap());
                SDT.setText(list1.get(i).getSoDienThoai());
                Dia_Chi_Nha.setText(list1.get(i).getDiaChiNha());
                Dia_Chi_Mail.setText(list1.get(i).getEmail());

                e = 1;
            }
        }
        if (e == 0) {
            if ((Ho_Ten.getText().trim().equals(""))
                    || (CMTND.getText().trim().equals(""))
                    || (SDT.getText().trim().equals(""))
                    || (Dia_Chi_Nha.getText().trim().equals(""))
                    || (Dia_Chi_Mail.getText().trim().equals(""))) {
                JOptionPane.showMessageDialog(this, "Fill in form!!!");
            } else {
                int t = 0;
                String k = CMTND.getText().trim();
                if (k.length() == 11) {
                    for (int i = 0; i < k.length(); i++) {
                        int a = 0;
                        for (int z = 0; z < T.length; z++) {
                            if (k.charAt(i) == T[z]) {
                                a = 1;
                                break;
                            }

                        }
                        if (a == 0) {
                            JOptionPane.showMessageDialog(this, "CMTND sai !!!");
                            t = 1;
                            break;

                        }

                    }
                    if (t == 0) {
                        String m = SDT.getText().trim();
                        if (m.length() == 10 || m.length() == 11) {
                            for (int i = 0; i < m.length(); i++) {
                                int a = 0;
                                for (int z = 0; z < T.length; z++) {
                                    if (m.charAt(i) == T[z]) {
                                        a = 1;
                                        break;
                                    }

                                }
                                if (a == 0) {
                                    JOptionPane.showMessageDialog(this, "SDT sai !!!");
                                    t = 1;
                                    break;

                                }

                            }
                            if (t == 0) {
                                kh.insetKhachHang(new Khach_Hang(CMTND.getText().trim(), Ho_Ten.getText().trim(), SDT.getText().trim(), Dia_Chi_Nha.getText().trim(), Dia_Chi_Mail.getText().trim(), ComBox_ThanhP.getSelectedItem().toString()));

                            }

                        }
                        else{
                            JOptionPane.showMessageDialog(this,"SDT sai !!!");
                        
                        
                        }

                    }

                }
                else{
                
                    JOptionPane.showMessageDialog(this,"CMTND sai !!!");
                
                }
            }

        }


    }//GEN-LAST:event_hoan_Tat

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Nhap_Thong_Tin_Khach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nhap_Thong_Tin_Khach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nhap_Thong_Tin_Khach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nhap_Thong_Tin_Khach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nhap_Thong_Tin_Khach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CMTND;
    private javax.swing.JComboBox ComBox_ThanhP;
    private javax.swing.JTextField Dia_Chi_Mail;
    private javax.swing.JTextArea Dia_Chi_Nha;
    private javax.swing.JTextField Ho_Ten;
    private javax.swing.JTextField SDT;
    private javax.swing.JLabel Time;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
