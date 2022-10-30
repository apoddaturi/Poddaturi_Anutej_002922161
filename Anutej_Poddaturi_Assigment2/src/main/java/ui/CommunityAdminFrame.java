/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.City;
import model.Community;
import static ui.AddCityPanel.cityList;
import static ui.AddCommunityPanel.communityList;
import javax.swing.JPanel;
import ui.MainJFrame;

/**
 *
 * @author podda
 */
public class CommunityAdminFrame extends javax.swing.JFrame {

    /**
     * Creates new form CommunityAdminFrame
     */
    public CommunityAdminFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jSplitPaneCommunity = new javax.swing.JSplitPane();
        jPanelCommunity = new javax.swing.JPanel();
        jButtonAddCommunity = new javax.swing.JButton();
        jButtonAddCity = new javax.swing.JButton();
        btnLogoutCommunityAdminPanel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelCommunity.setBackground(new java.awt.Color(188, 151, 28));

        jButtonAddCommunity.setBackground(new java.awt.Color(67, 104, 227));
        jButtonAddCommunity.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddCommunity.setText("Add Community");
        jButtonAddCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCommunityActionPerformed(evt);
            }
        });

        jButtonAddCity.setBackground(new java.awt.Color(67, 104, 227));
        jButtonAddCity.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddCity.setText("Add City");
        jButtonAddCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCityActionPerformed(evt);
            }
        });

        btnLogoutCommunityAdminPanel.setBackground(new java.awt.Color(255, 51, 51));
        btnLogoutCommunityAdminPanel.setForeground(new java.awt.Color(255, 255, 255));
        btnLogoutCommunityAdminPanel.setText("Logout");
        btnLogoutCommunityAdminPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutCommunityAdminPanelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Community Admin");

        javax.swing.GroupLayout jPanelCommunityLayout = new javax.swing.GroupLayout(jPanelCommunity);
        jPanelCommunity.setLayout(jPanelCommunityLayout);
        jPanelCommunityLayout.setHorizontalGroup(
            jPanelCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCommunityLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonAddCity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAddCommunity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogoutCommunityAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCommunityLayout.setVerticalGroup(
            jPanelCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCommunityLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButtonAddCity)
                .addGap(18, 18, 18)
                .addComponent(jButtonAddCommunity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 327, Short.MAX_VALUE)
                .addComponent(btnLogoutCommunityAdminPanel)
                .addGap(18, 18, 18))
        );

        jSplitPaneCommunity.setTopComponent(jPanelCommunity);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPaneCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSplitPaneCommunity)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 822, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCommunityActionPerformed
        // TODO add your handling code here:
        AddCommunityPanel addCommunityPanel = new AddCommunityPanel();
        jSplitPaneCommunity.setRightComponent(addCommunityPanel);
        
        addCommunityPanel.tableModel.setRowCount(0);
        for(Community c: communityList){
            Object[] data = {c.getCommunityName(), c.getCityName(), c.getZipcode()};
            addCommunityPanel.tableModel.addRow(data);
        }
        
    }//GEN-LAST:event_jButtonAddCommunityActionPerformed

    private void jButtonAddCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCityActionPerformed
        // TODO add your handling code here:
        AddCityPanel addCityPanel = new AddCityPanel();
        jSplitPaneCommunity.setRightComponent(addCityPanel);
        
        addCityPanel.tableModel.setRowCount(0);
        for(City c: cityList){
            Object[] data = {c.getCityName(), c.getState()};
            addCityPanel.tableModel.addRow(data);
        }
    }//GEN-LAST:event_jButtonAddCityActionPerformed

    private void btnLogoutCommunityAdminPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutCommunityAdminPanelActionPerformed

        this.dispose();
        MainJFrame mainJFrame = new MainJFrame();
        mainJFrame.setVisible(true);
    }//GEN-LAST:event_btnLogoutCommunityAdminPanelActionPerformed

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
            java.util.logging.Logger.getLogger(CommunityAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommunityAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommunityAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommunityAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommunityAdminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogoutCommunityAdminPanel;
    private javax.swing.JButton jButtonAddCity;
    private javax.swing.JButton jButtonAddCommunity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCommunity;
    private javax.swing.JSplitPane jSplitPaneCommunity;
    // End of variables declaration//GEN-END:variables
}
