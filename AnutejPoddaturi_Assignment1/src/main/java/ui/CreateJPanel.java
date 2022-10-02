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
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Employee;
import model.employeelist;

/**
 *
 * @author poddaturi anutej
 */
public class CreateJPanel extends javax.swing.JPanel {
    
    Employee sampleemp;
    employeelist emparray;
    public boolean valid=true,check=true;
    String imgPath;
//    ArrayList<String> existingID;
    /**
     * Creates new form CreateJPanel
     */
//    , ArrayList<String> existingIDs
    public CreateJPanel(Employee em) {
        initComponents();
//        this.emparray=emplst;
        this.sampleemp=em;
//        this.existingID=existingIDs;
//        System.out.println("Inside Create employee Jpanel"+emplst);
//        private String name,empId,age,gender,startDate,level,teamInfo,positionTitle,contactInfoPhoneNo,contactInfoEmailId,empPhoto;
//        Employee emp1= new Employee("foo","1","21","male","2121-21-21","junior","Alpha","junior","8919947616","foo@gmail.com","");
//        emparray.add()
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblEmployeeId = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        lblTeamInfo = new javax.swing.JLabel();
        lblPositionInfo = new javax.swing.JLabel();
        lblContactPhoneNo = new javax.swing.JLabel();
        lblContactEmaild = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmployeeId = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        txtPositionInfo = new javax.swing.JTextField();
        txtContactPhoneNo = new javax.swing.JTextField();
        txtEmailId = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblEmpPhoto = new javax.swing.JLabel();
        btnEmpImage = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create  Employee");

        lblName.setText("Name");

        lblEmployeeId.setText("Employee Id");

        lblAge.setText("Age");

        lblGender.setText("Gender");

        lblStartDate.setText("Start Date");

        lblLevel.setText("Level");

        lblTeamInfo.setText("Team info");

        lblPositionInfo.setText("Position info");

        lblContactPhoneNo.setText("Phone No");

        lblContactEmaild.setText("Email Id");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtEmployeeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeIdActionPerformed(evt);
            }
        });

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });

        txtStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartDateActionPerformed(evt);
            }
        });

        txtLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLevelActionPerformed(evt);
            }
        });

        txtTeamInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeamInfoActionPerformed(evt);
            }
        });

        txtPositionInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPositionInfoActionPerformed(evt);
            }
        });

        txtContactPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactPhoneNoActionPerformed(evt);
            }
        });

        txtEmailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIdActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnEmpImage.setText("Image");
        btnEmpImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblEmployeeId)
                            .addComponent(lblAge)
                            .addComponent(lblGender)
                            .addComponent(lblStartDate)
                            .addComponent(lblLevel)
                            .addComponent(lblTeamInfo))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPositionInfo)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTeamInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(txtLevel, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(txtStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(txtEmployeeId, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(txtGender, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(txtName))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEmpImage)
                                .addGap(26, 26, 26)
                                .addComponent(lblEmpPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblContactPhoneNo)
                                    .addComponent(lblContactEmaild))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContactPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(txtPositionInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(280, 280, 280))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmployeeId)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContactPhoneNo)
                            .addComponent(txtContactPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblContactEmaild)
                            .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnEmpImage))
                    .addComponent(lblEmpPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAge))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGender))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStartDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLevel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTeamInfo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPositionInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPositionInfo))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addGap(55, 55, 55))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeIdActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartDateActionPerformed

    private void txtLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLevelActionPerformed

    private void txtTeamInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeamInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeamInfoActionPerformed

    private void txtPositionInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPositionInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPositionInfoActionPerformed

    private void txtContactPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactPhoneNoActionPerformed

    private void txtEmailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIdActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
       try{
//        validating the inputs
        //creating employee object and adding details from inputs of the user
        // storing image
//      Storing the objects in a hashmap for faster retrivals and for updation and deletion purposes.
        
//        Validating field values:
//      emparray.addEmployee();
//        Employee emp= new Employee();
        if(txtName.getText().equals("") || txtEmployeeId.getText().equals("") || txtAge.getText().equals("") || 
               txtGender.getText().equals("") || txtStartDate.getText().equals("") || txtLevel.getText().equals("") ||
                txtTeamInfo.getText().equals("") || txtPositionInfo.getText().equals("") || txtContactPhoneNo.getText().equals("") ||
                 txtEmailId.getText().equals("") )
        {
        JOptionPane.showMessageDialog(this, "Please enter all the details");
        }
        else{
        this.sampleemp.setName(txtName.getText());
        this.sampleemp.setEmpId(txtEmployeeId.getText());
        this.sampleemp.setAge(txtAge.getText());
        this.sampleemp.setGender(txtGender.getText());
        if(txtStartDate.getText().matches("\\d{4}-\\d{2}-\\d{2}")){
            this.sampleemp.setStartDate(txtStartDate.getText());
        }
        else{
            JOptionPane.showMessageDialog(this, "Please enter a valid date");
        }
        this.sampleemp.setLevel(txtLevel.getText());
        this.sampleemp.setTeamInfo(txtTeamInfo.getText());
        this.sampleemp.setPositionTitle(txtPositionInfo.getText());
        if(txtContactPhoneNo.getText().length()==10)
        {
            char[] phonenumchararray= txtContactPhoneNo.getText().toCharArray();
            for(char chariter: phonenumchararray){
                if(!Character.isDigit(chariter))
                {
                    check=false;
                }
            }
        
        if(!check)
        {
            valid=false;
            JOptionPane.showMessageDialog(this, "Entered Phone number is not valid");
            return;
            
        }
        else{
            this.sampleemp.setContactInfoPhoneNo(txtContactPhoneNo.getText());
        }
        }
        
        if(!txtEmailId.getText().contains("@"))
        {
            JOptionPane.showMessageDialog(this, "Entered email id is not valid");
            return;
        }
        else{
            this.sampleemp.setContactInfoEmailId(txtEmailId.getText());
        }
        this.sampleemp.setEmpPhoto(imgPath);
//        temporaryemplist.add(emp);
//        emparray.setEmpArray(temporaryemplist);
        JOptionPane.showMessageDialog(this, "Employee details are saved");
        
            System.out.println("==============="+this.sampleemp.getName()+
            this.sampleemp.getEmpId()+
            this.sampleemp.getAge()+
            this.sampleemp.getGender()+
            this.sampleemp.getStartDate()+
            this.sampleemp.getLevel()+
            this.sampleemp.getTeamInfo()+
            this.sampleemp.getPositionTitle()+
            this.sampleemp.getContactInfoPhoneNo()+
            this.sampleemp.getContactInfoEmailId());
        
        System.out.println(txtName.getText()+"-----"+this.sampleemp+"====="+this.emparray);
        //resetting all the text field values
        txtName.setText("");
        txtAge.setText("");
        txtEmployeeId.setText("");
        txtContactPhoneNo.setText("");
        txtGender.setText("");
        txtLevel.setText("");
        txtTeamInfo.setText("");
        txtPositionInfo.setText("");
        txtStartDate.setText("");
        txtEmailId.setText("");
        
        
        }   
    }//GEN-LAST:event_btnSaveActionPerformed
       catch(Exception e){
           System.out.println(e.getMessage());
           
       }
    }
    private void btnEmpImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpImageActionPerformed
        // TODO add your handling code here:
        JFileChooser image_directory=new JFileChooser();
        
        image_directory.setCurrentDirectory(new File("user.dir"));
        
        FileNameExtensionFilter imageFormats= new FileNameExtensionFilter("All Pic","png","jpg");
        image_directory.addChoosableFileFilter(imageFormats);
        
        int file_option= image_directory.showSaveDialog(null);
        if(file_option==JFileChooser.APPROVE_OPTION )
        {
             File imgEmpFile= image_directory.getSelectedFile();
             imgPath= imgEmpFile.getAbsolutePath();
             System.out.println(imgPath);
             ImageIcon imageSelected= new ImageIcon(imgPath);
             Image img= imageSelected.getImage().getScaledInstance(lblEmpPhoto.getWidth(),lblEmpPhoto.getHeight(), Image.SCALE_SMOOTH);
             lblEmpPhoto.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_btnEmpImageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpImage;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblContactEmaild;
    private javax.swing.JLabel lblContactPhoneNo;
    private javax.swing.JLabel lblEmpPhoto;
    private javax.swing.JLabel lblEmployeeId;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPositionInfo;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContactPhoneNo;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtEmployeeId;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPositionInfo;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables
}
