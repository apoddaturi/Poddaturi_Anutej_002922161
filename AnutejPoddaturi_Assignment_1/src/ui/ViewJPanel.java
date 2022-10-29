/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.HumanResources;
import model.EmployeeDetails;

/**
 *
 * @author podda
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    EmployeeDetails details;
    String img_Path;
    public ViewJPanel(EmployeeDetails details ) {
        initComponents();
        
        this.details = details;
        
        
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitle = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpProf = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        txtEmployeeID = new javax.swing.JTextField();
        lblEmployeeID = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtStartDate = new javax.swing.JTextField();
        lblLevel = new javax.swing.JLabel();
        txtLevel = new javax.swing.JTextField();
        lblTeamInfo = new javax.swing.JLabel();
        txtTeamInfo = new javax.swing.JTextField();
        lblPositionTitle = new javax.swing.JLabel();
        txtPositionTitle = new javax.swing.JTextField();
        lblCellNumber = new javax.swing.JLabel();
        txtCellNumber = new javax.swing.JTextField();
        lblEmailAddress = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        lblStartDate = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();

        txtTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTitle.setText("Employee Profile");

        tblEmpProf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Employee ID", "Age", "Gender", "Start Date", "Level", "Team Info", "Position Title", "Cell Phone Number", "Email Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmpProf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpProfMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpProf);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblEmployeeID.setText("Employee ID:");

        lblGender.setText("Gender:");

        lblLevel.setText("Level:");

        lblTeamInfo.setText("Team Info:");

        lblPositionTitle.setText("Position Title:");

        lblCellNumber.setText("Cell Phone Number:");

        lblEmailAddress.setText("Email Address:");

        txtEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailAddressActionPerformed(evt);
            }
        });

        lblStartDate.setText("Start Date:");

        lblName.setText("Name:");

        lblAge.setText("Age:");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblSearch.setText("Search");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblEmailAddress)
                            .addComponent(lblCellNumber)
                            .addComponent(lblPositionTitle)
                            .addComponent(lblTeamInfo)
                            .addComponent(lblLevel)
                            .addComponent(lblStartDate)
                            .addComponent(lblGender)
                            .addComponent(lblAge)
                            .addComponent(lblEmployeeID))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCellNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(112, 112, 112)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnUpdate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnDelete)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(lblSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(btnDelete)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmployeeID)
                            .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSearch)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStartDate)
                            .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLevel)
                            .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTeamInfo)
                            .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPositionTitle)
                            .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCellNumber)
                            .addComponent(txtCellNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmailAddress)
                            .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDelete, btnUpdate});

    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAddressActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here
         int selectedRowIndex = tblEmpProf.getSelectedRow();
        ArrayList<HumanResources> newEmpList = new ArrayList<HumanResources>();
        DefaultTableModel model = (DefaultTableModel) tblEmpProf.getModel();
        String selectedEmpId =  (String )model.getValueAt(selectedRowIndex, 1);
        HumanResources Selectedemp = new HumanResources();
        System.out.println("selected serial number--"+selectedEmpId);
        for(HumanResources e: details.getDetails()){
            if(e.getEmployeeid().equals(selectedEmpId)){
                Selectedemp = e;
            }else{
                newEmpList.add(e);
            }
        }
        DefaultTableModel dm = (DefaultTableModel) tblEmpProf.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
        details.setDetails(newEmpList);
        DefaultTableModel tblModel = (DefaultTableModel)tblEmpProf.getModel();
        for(HumanResources e: details.getDetails()){
           
            tblModel.addRow(new Object[]{
                e.getName(),
                e.getEmployeeid(),
                e.getAge(),
                e.getGender(),
                e.getStartdate(),
                e.getLevel(),
                e.getPositiontitle(),
                e.getEmailaddress(),
                e.getCellphonenumber()});
        }
         txtName.setText("");
         txtEmployeeID.setText("");
         txtAge.setText("");
         txtGender.setText("");
         txtStartDate.setText("");
         txtLevel.setText("");
         txtTeamInfo.setText("");
         txtPositionTitle.setText("");
         txtCellNumber.setText("");
         txtEmailAddress.setText("");
         
         
      
         
         
         
         
         populateTable();
         
        
     
         
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
//        DefaultTableModel model = (DefaultTableModel) tblEmpProf.getModel();
//        
//        int selectedRowIndex = tblEmpProf.getSelectedRow();
//        if(selectedRowIndex>=0){
//           model.setValueAt(txtName.getText(),selectedRowIndex,0);
//           model.setValueAt(txtEmployeeID.getText(),selectedRowIndex,1);
//           model.setValueAt(txtAge.getText(),selectedRowIndex,2);
//           model.setValueAt(txtGender.getText(),selectedRowIndex,3);
//           model.setValueAt(txtStartDate.getText(),selectedRowIndex,4);
//           model.setValueAt(txtLevel.getText(),selectedRowIndex,5);
//           model.setValueAt(txtTeamInfo.getText(),selectedRowIndex,6);
//           model.setValueAt(txtPositionTitle.getText(),selectedRowIndex,7);
//           model.setValueAt(txtCellNumber.getText(),selectedRowIndex,8);
//           model.setValueAt(txtEmailAddress.getText(),selectedRowIndex,9);
//           model.setValueAt(lblPhoto.getIcon(),selectedRowIndex,10);
//        }
//        else
//        {
//             JOptionPane.showMessageDialog(this,"Please select a row to Update");
//            
//        }
//        
            

            for(HumanResources e: this.details.getDetails()){
            if(txtName.getText().equals("") || txtEmployeeID.getText().equals("") || txtAge.getText().equals("") || 
               txtGender.getText().equals("") || txtStartDate.getText().equals("") || txtLevel.getText().equals("") ||
                txtTeamInfo.getText().equals("") || txtPositionTitle.getText().equals("") || txtCellNumber.getText().equals("") ||
                 txtEmailAddress.getText().equals("") )
            {
            JOptionPane.showMessageDialog(this, "Please enter all the details");
            return;
            }
            else{
            
                if(e.getEmailaddress()==null||e.getName()==null||e.getEmployeeid()==null|| e.getGender()==null ||e.getStartdate()==null ||e.getLevel()==null || e.getTeaminfo()==null ||e.getPositiontitle()==null||e.getCellphonenumber()==null)
            {
                continue;
            }
            if(e.getEmployeeid().equals(txtEmployeeID.getText()))
            {
                e.setName(txtName.getText());
                if(txtStartDate.getText().matches("\\d{4}-\\d{2}-\\d{2}")){
                    e.setStartdate(txtStartDate.getText());
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Please enter a valid date of format yyyy-mm-dd");
                    return;
                }
                if(txtGender.getText().matches("[a-zA-Z]+"))
                {e.setGender(txtGender.getText());}
                else{
                    JOptionPane.showMessageDialog(this, "Gender should only contain alphabets");
                return;
                
                }
                if(txtAge.getText().matches("[0-9]+"))
                {e.setAge(Integer.parseInt(txtAge.getText()));
                }
                else{
                    JOptionPane.showMessageDialog(this, "Age should only be numbers");
                return;
                }
                if(txtEmailAddress.getText().contains("@"))
                {
                    e.setEmailaddress(txtEmailAddress.getText());
                }
                else
                {
                JOptionPane.showMessageDialog(this, "Entered email id is not valid");
                return;
                }
                if(txtCellNumber.getText().matches("\\d{10}"))
                {
                e.setCellphonenumber(txtCellNumber.getText());
                }
                else
                {
                JOptionPane.showMessageDialog(this, "Phone Number should not be empty and should contain 10 numbers");
                return;
                }
                
                if(txtLevel.getText().matches("[a-zA-Z]+"))
                {e.setLevel(txtLevel.getText());}
                else
                {
                JOptionPane.showMessageDialog(this, "Level Info should contain only letters");
                return;
                }
                
                if(txtPositionTitle.getText().matches("[a-zA-Z]+"))
                {
                    e.setPositiontitle(txtPositionTitle.getText());
                }
                else
                {
                JOptionPane.showMessageDialog(this, "Position Info should contain only letters");
                return;
                }
                
                if(txtTeamInfo.getText().matches("[a-zA-Z]+"))
                {e.setTeaminfo(txtTeamInfo.getText());}
                else
                {
                JOptionPane.showMessageDialog(this, "Team Info should contain only letters");
                return;
                }
                      
            }
            }
            }
        
        DefaultTableModel dm = (DefaultTableModel) tblEmpProf.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
        
        
        DefaultTableModel tblModel = (DefaultTableModel)tblEmpProf.getModel();
        for(HumanResources e: details.getDetails()){
            tblModel.addRow(new Object[]{
                e.getName(), 
                e.getEmployeeid(), 
                e.getAge(), 
                e.getGender(),
                e.getStartdate(), 
                e.getLevel(), 
                e.getTeaminfo(), 
                e.getPositiontitle(), 
                e.getCellphonenumber(),
                e.getEmailaddress()
        });
    }//GEN-LAST:event_btnUpdateActionPerformed
    }
    private void tblEmpProfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpProfMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblEmpProf.getModel();
        
        txtName.setText(tblEmpProf.getValueAt(tblEmpProf.getSelectedRow(), 0).toString());
        txtEmployeeID.setText(tblEmpProf.getValueAt(tblEmpProf.getSelectedRow(), 1).toString());
        txtAge.setText(tblEmpProf.getValueAt(tblEmpProf.getSelectedRow(), 2).toString());
        txtGender.setText(tblEmpProf.getValueAt(tblEmpProf.getSelectedRow(), 3).toString());
        txtStartDate.setText(tblEmpProf.getValueAt(tblEmpProf.getSelectedRow(), 4).toString());
        txtLevel.setText(tblEmpProf.getValueAt(tblEmpProf.getSelectedRow(), 5).toString());
        txtTeamInfo.setText(tblEmpProf.getValueAt(tblEmpProf.getSelectedRow(), 6).toString());
        txtPositionTitle.setText(tblEmpProf.getValueAt(tblEmpProf.getSelectedRow(), 7).toString());
        txtCellNumber.setText(tblEmpProf.getValueAt(tblEmpProf.getSelectedRow(), 8).toString());
        txtEmailAddress.setText(tblEmpProf.getValueAt(tblEmpProf.getSelectedRow(), 9).toString());
       
        
    }//GEN-LAST:event_tblEmpProfMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblEmpProf.getModel();
        String search = txtSearch.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tablerow = new TableRowSorter<DefaultTableModel>(model);
        tblEmpProf.setRowSorter(tablerow);
        tablerow.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCellNumber;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPositionTitle;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JTable tblEmpProf;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCellNumber;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPositionTitle;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeamInfo;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblEmpProf.getModel();
        model.setRowCount(0);
        for(HumanResources emp : details.getDetails()) {
            Object[] row = new Object[11];
            row[0] = emp;
            row[1] = emp.getEmployeeid();
            row[2] = emp.getAge();
            row[3] = emp.getGender();
            row[4] = emp.getStartdate();
            row[5] = emp.getLevel();
            row[6] = emp.getTeaminfo();
            row[7] = emp.getPositiontitle();
            row[8] = emp.getCellphonenumber();
            row[9] = emp.getEmailaddress();
           
            
            
            model.addRow(row);
            
        }
         
    }
}