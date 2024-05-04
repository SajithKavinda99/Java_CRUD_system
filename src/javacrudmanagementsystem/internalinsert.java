/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package javacrudmanagementsystem;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author dell
 */
public class internalinsert extends javax.swing.JInternalFrame {

    String ImagePath = null;
    public internalinsert() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        inseratemail = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inseartfullname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inseartaddress = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        inseartnic = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        inseartimg = new javax.swing.JPanel();
        insertimg = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        internalinsertclear = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        inseartemail = new javax.swing.JTextField();
        inseartmobile = new javax.swing.JTextField();

        inseratemail.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADDRESS");

        inseartfullname.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        inseartfullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inseartfullnameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FULL NAME");

        inseartaddress.setColumns(20);
        inseartaddress.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        inseartaddress.setRows(5);
        jScrollPane1.setViewportView(inseartaddress);

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MOBILE NUMBER");

        inseartnic.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        inseartnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inseartnicActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NIC NUMBER");

        insertimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        insertimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacrudmanagementsystem_img/plus-sign.png"))); // NOI18N
        insertimg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertimgMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout inseartimgLayout = new javax.swing.GroupLayout(inseartimg);
        inseartimg.setLayout(inseartimgLayout);
        inseartimgLayout.setHorizontalGroup(
            inseartimgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inseartimgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insertimg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        inseartimgLayout.setVerticalGroup(
            inseartimgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inseartimgLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(insertimg, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PROFILE PICTURE");

        jButton1.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacrudmanagementsystem_img/picture.png"))); // NOI18N
        jButton1.setText("   FROM GALLERY");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacrudmanagementsystem_img/camera.png"))); // NOI18N
        jButton2.setText("   CAMERA");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton3.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacrudmanagementsystem_img/delete.png"))); // NOI18N
        jButton3.setText("   CLEAR PHOTOS");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        internalinsertclear.setBackground(new java.awt.Color(0, 102, 51));
        internalinsertclear.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        internalinsertclear.setForeground(new java.awt.Color(255, 255, 255));
        internalinsertclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacrudmanagementsystem_img/clear-format.png"))); // NOI18N
        internalinsertclear.setText("   CLEAR");
        internalinsertclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internalinsertclearActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 102, 51));
        jButton5.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacrudmanagementsystem_img/arrows.png"))); // NOI18N
        jButton5.setText("   SUBMIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("E-mail ADDRESS");

        jPanel8.setBackground(new java.awt.Color(0, 0, 102));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("INSERT  DATA");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inseartemail.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        inseartemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inseartemailActionPerformed(evt);
            }
        });

        inseartmobile.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N

        javax.swing.GroupLayout inseratemailLayout = new javax.swing.GroupLayout(inseratemail);
        inseratemail.setLayout(inseratemailLayout);
        inseratemailLayout.setHorizontalGroup(
            inseratemailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(inseratemailLayout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addGroup(inseratemailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(internalinsertclear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inseartemail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inseartnic, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inseartfullname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inseartmobile))
                .addGap(18, 18, 18)
                .addGroup(inseratemailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(inseratemailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inseartimg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        inseratemailLayout.setVerticalGroup(
            inseratemailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inseratemailLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inseratemailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inseratemailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inseratemailLayout.createSequentialGroup()
                        .addComponent(inseartfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(inseartnic, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(inseartemail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inseartmobile, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inseratemailLayout.createSequentialGroup()
                        .addComponent(inseartimg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(inseratemailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(internalinsertclear)
                    .addComponent(jButton5))
                .addGap(18, 38, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inseratemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inseratemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        try {                                         
            
            String getname = inseartfullname.getText();
            String getaddress = inseartaddress.getText();
            String getnic = inseartnic.getText();
            String getemail = inseartemail.getText();
            int getmobile = Integer.parseInt(inseartmobile.getText());
            
            File b = new File(this.ImagePath);
            FileInputStream img = null;
            try {
                img = new FileInputStream(b);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(internalinsert.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Connection conn = DBConnection.connect();
            String insertsql = "INSERT INTO students (FullName, Address, `NIC Number`, Email, Mobile, Image) VALUES (?,?,?,?,?,?)";

            
            PreparedStatement insertpst = (PreparedStatement) conn.prepareStatement(insertsql);
            insertpst.setString(1, getname);
            insertpst.setString(2, getaddress);
            insertpst.setString(3, getnic);
            insertpst.setString(4, getemail);
            insertpst.setInt(5, getmobile);
            insertpst.setBlob(6, img);
            
            insertpst.executeUpdate();
            JOptionPane.showMessageDialog(null,"New Student Added.!");
            
        } catch (SQLException ex) {
            Logger.getLogger(internalinsert.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        insertimg.setIcon(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images","*.jpg","*.png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);

        if(result == JFileChooser.APPROVE_OPTION){
            File selectedfile = file.getSelectedFile();
            String path = selectedfile.getAbsolutePath();

            ImageIcon icon = new ImageIcon(path);
            Image in = icon.getImage();
            Image Modified = in.getScaledInstance(201, 229, java.awt.Image.SCALE_SMOOTH);
            icon = new ImageIcon(Modified);

            insertimg.setIcon(icon);
            ImagePath = path;

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void insertimgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertimgMouseClicked

        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images","*.jpg","*.png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);

        if(result == JFileChooser.APPROVE_OPTION){
            File selectedfile = file.getSelectedFile();
            String path = selectedfile.getAbsolutePath();

            ImageIcon icon = new ImageIcon(path);
            Image in = icon.getImage();
            Image Modified = in.getScaledInstance(201, 229, java.awt.Image.SCALE_SMOOTH);
            icon = new ImageIcon(Modified);

            insertimg.setIcon(icon);
            ImagePath = path;

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_insertimgMouseClicked

    private void inseartnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inseartnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inseartnicActionPerformed

    private void inseartfullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inseartfullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inseartfullnameActionPerformed

    private void internalinsertclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internalinsertclearActionPerformed
        inseartfullname.setText(null);
        inseartaddress.setText(null);
        inseartnic.setText(null);
        inseartemail.setText(null);
        inseartmobile.setText(null);
        insertimg.setIcon(null);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_internalinsertclearActionPerformed

    private void inseartemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inseartemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inseartemailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextArea inseartaddress;
    private javax.swing.JTextField inseartemail;
    private javax.swing.JTextField inseartfullname;
    private javax.swing.JPanel inseartimg;
    private javax.swing.JTextField inseartmobile;
    private javax.swing.JTextField inseartnic;
    private javax.swing.JPanel inseratemail;
    private javax.swing.JLabel insertimg;
    private javax.swing.JButton internalinsertclear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}