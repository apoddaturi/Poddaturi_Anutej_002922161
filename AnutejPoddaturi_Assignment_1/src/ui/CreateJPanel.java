/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.HumanResources;
import model.EmployeeDetails;

/**
 *
 * @author podda
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    EmployeeDetails emplst;
    String img_Path;
    public CreateJPanel(EmployeeDetails details ) {
        initComponents();
        this.emplst = details;
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblEmployeeID = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        lblTeamInfo = new javax.swing.JLabel();
        lblPositionTitle = new javax.swing.JLabel();
        lblCellNumber = new javax.swing.JLabel();
        lblEmailAddress = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmployeeID = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        txtPositionTitle = new javax.swing.JTextField();
        txtCellNumber = new javax.swing.JTextField();
        txtEmailAddress = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnPhoto = new javax.swing.JButton();
        lblPhoto = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        txtTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTitle.setText("Employee Profile");

        lblName.setText("Name:");

        lblAge.setText("Age:");

        lblEmployeeID.setText("Employee ID:");

        lblGender.setText("Gender:");

        lblLevel.setText("Level:");

        lblTeamInfo.setText("Team Info:");

        lblPositionTitle.setText("Position Title:");

        lblCellNumber.setText("Cell Phone Number:");

        lblEmailAddress.setText("Email Address:");

        lblStartDate.setText("Start Date:");

        txtEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailAddressActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnPhoto.setText("Photo");
        btnPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSave)
                            .addGroup(layout.createSequentialGroup()
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
                                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCellNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPhoto)
                            .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAge, lblCellNumber, lblEmailAddress, lblEmployeeID, lblGender, lblLevel, lblName, lblPositionTitle, lblTeamInfo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName)
                    .addComponent(btnPhoto))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployeeID)
                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartDate)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnSave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAddressActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        boolean flag=true;
        if(txtName.getText().equals("")||txtEmployeeID.getText().equals("")||txtAge.getText().equals("")||txtGender.getText().equals("")||txtStartDate.getText().equals("")||txtLevel.getText().equals("")||txtStartDate.getText().equals("")||txtLevel.getText().equals("")||txtTeamInfo.getText().equals("")||txtPositionTitle.getText().equals("")||txtCellNumber.getText().equals("")||txtEmailAddress.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please fill all the details");
            return;
         
        }
        else
        {
        
        String name = txtName.getText();
        String employeeid = txtEmployeeID.getText();
        int age = Integer.parseInt(txtAge.getText());
        String gender = txtGender.getText();
        String startdate = txtStartDate.getText();
        String level = txtLevel.getText();
        String teaminfo = txtTeamInfo.getText();
        String positiontitle = txtPositionTitle.getText();
        String cellphonenumber = txtCellNumber.getText();
        String emailaddress = txtEmailAddress.getText();
        
        HumanResources details = this.emplst.addNewEmployee();
        
        
        
        details.setName(name);
        details.setEmployeeid(employeeid);
        if(age>0){
        details.setAge(age);
        }
        else{
            flag=false;
            JOptionPane.showMessageDialog(this,"Age can only be positive");
            this.emplst.deleteEmployee(details);
            return;
        }
        if(gender.matches("[a-zA-Z]+"))
        {
            details.setGender(gender);
        }
        else{
            this.emplst.deleteEmployee(details);
            JOptionPane.showMessageDialog(this,"Gender can only have alphabets");
            return;
        }
        if(startdate.matches("\\d{4}-\\d{2}-\\d{2}"))
        {details.setStartdate(startdate);}
        else{
            this.emplst.deleteEmployee(details);
            JOptionPane.showMessageDialog(this,"Start Date can only be of format YYYY-MM-DD");
            return;
            
        }
        if(level.matches("[a-zA-Z]+"))
        {
        details.setLevel(level);
        }
        else{
            this.emplst.deleteEmployee(details);
            JOptionPane.showMessageDialog(this,"Level can only have alphabets");
            return;
        }
        if(teaminfo.matches("[a-zA-Z]+"))
        {
        details.setTeaminfo(teaminfo);
        }
        else{
        this.emplst.deleteEmployee(details);
        JOptionPane.showMessageDialog(this,"Team can only have alphabets");
            return;
        }
        if(teaminfo.matches("[a-zA-Z]+"))
        {
        details.setPositiontitle(positiontitle);
        }
        else{
            this.emplst.deleteEmployee(details);
            JOptionPane.showMessageDialog(this,"Position can only have alphabets");
            return;
        }
        if(cellphonenumber.matches("\\d{10}"))
        {details.setCellphonenumber(cellphonenumber);}
        else{
            this.emplst.deleteEmployee(details);
            JOptionPane.showMessageDialog(this,"Please enter valid phone number with 10 digits");
            return;
        }
        if(emailaddress.contains("@"))
        {details.setEmailaddress(emailaddress);}
        else
        {
            this.emplst.deleteEmployee(details);
            JOptionPane.showMessageDialog(this,"Email should be of correct format");
            return;
        }
            String img_path = null;
        details.setImage(img_path);
        
                if(!flag)
                        {
                            this.emplst.deleteEmployee(details);
                        }
         
                JOptionPane.showMessageDialog(this,"New Employee details added.");
         
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
         
         
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhotoActionPerformed
        // TODO add your handling code here:
        JFileChooser img_dir=new JFileChooser();
        
        img_dir.setCurrentDirectory(new File("user.dir"));
        
        FileNameExtensionFilter imgFormat= new FileNameExtensionFilter("All Pic","png","jpg");
        img_dir.addChoosableFileFilter(imgFormat);
        
        int file_option= img_dir.showSaveDialog(null);
        if(file_option==JFileChooser.APPROVE_OPTION )
        {
             File imgEmployeeFile= img_dir.getSelectedFile();
            String img_Path = imgEmployeeFile.getAbsolutePath();
             System.out.println(img_Path);
             ImageIcon imgSelected= new ImageIcon(img_Path);
             Image img= imgSelected.getImage().getScaledInstance(lblPhoto.getWidth(),lblPhoto.getHeight(), Image.SCALE_SMOOTH);
             lblPhoto.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_btnPhotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPhoto;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCellNumber;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPositionTitle;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCellNumber;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPositionTitle;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeamInfo;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
