/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.City;
import model.Community;
import model.Doctor;
import model.Encounter;
import model.EncounterHistory;
import model.Hospital;
import model.Patient;
import model.VitalSigns;
import static ui.HospitalAdminFrame.encounterList;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anutej
 */
public class PatientPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientPanel
     */
    EncounterHistory encounterHistory;
    DefaultTableModel getDoctorsTblModel;
    DefaultTableModel tblEncounterModel;
    DefaultTableModel tblPatientModel;
    ArrayList<String> hospitalNames;
    String patientId;
    Patient patient;

    public PatientPanel(Patient p) {
        initComponents();
        tblPatientModel = (DefaultTableModel) tablePatientDetails.getModel();
        
        patient = p;
        patientId = p.getId();
        encounterHistory = p.getEncounterHistory();
        
        tfPatientName.setText(p.getName());
        tfPatientName.setEditable(false);
        
        tfPatientId.setText(p.getId());
        tfPatientId.setEditable(false);
        
        tfPatientAge.setText(String.valueOf(p.getAge()));
        tfPatientAge.setEditable(false);
        
        
        String gender = p.getGender();
        
        if(gender.equalsIgnoreCase("male")){
            rbPatientGenderMale.setSelected(true);
        }
        else if(gender.equalsIgnoreCase("female")){
            rbPatientGenderMale.setSelected(true);
        }
        else {
            rbPatientGenderOther.setSelected(true);
        }
        rbPatientGenderMale.setEnabled(false);
        rbPatientGenderFemale.setEnabled(false);
        rbPatientGenderOther.setEnabled(false);
        
        tfPatientCellPhone.setText(p.getPhoneNumber());
        tfPatientCellPhone.setEditable(false);
        
        tfHouseNumber.setText(p.getStreetAddress());
        tfHouseNumber.setEnabled(false);
        
        cbPatientCity.removeAllItems();
        cbPatientCity.addItem(p.getCity());
        cbPatientCity.setEnabled(false);

        cbPatientCommunity.removeAllItems();
        cbPatientCommunity.addItem(p.getCommunity());
        cbPatientCommunity.setEnabled(false);
        
        tfPatientUsername.setText(p.getUserName());
        tfPatientUsername.setEditable(false);
        
        tfPatientPassword.setText(p.getPassWord());
        tfPatientPassword.setEditable(false);
        
        tfPatientPostalCode.setText(String.valueOf(p.getPostalCode()));
        tfPatientPostalCode.setEditable(false);
        
        encounterHistory = p.getEncounterHistory();
        
        getDoctorsTblModel = (DefaultTableModel)tableGetDoctors.getModel();
        tblEncounterModel = (DefaultTableModel) tableGetEncounterHistory.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGender = new javax.swing.ButtonGroup();
        btnGetDoctors = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableGetDoctors = new javax.swing.JTable();
        btnLogout = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableGetEncounterHistory = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEncounterID = new javax.swing.JTextField();
        lblEncounterDoctorName = new javax.swing.JLabel();
        tfDoctorName = new javax.swing.JTextField();
        btnBookAppointment = new javax.swing.JButton();
        btnGetEncounterHistory = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfPatientName = new javax.swing.JTextField();
        tfPatientId = new javax.swing.JTextField();
        tfPatientAge = new javax.swing.JTextField();
        rbPatientGenderMale = new javax.swing.JRadioButton();
        rbPatientGenderFemale = new javax.swing.JRadioButton();
        rbPatientGenderOther = new javax.swing.JRadioButton();
        tfPatientCellPhone = new javax.swing.JTextField();
        cbPatientCommunity = new javax.swing.JComboBox<>();
        cbPatientCity = new javax.swing.JComboBox<>();
        tfHouseNumber = new javax.swing.JTextField();
        tfPatientPostalCode = new javax.swing.JTextField();
        btnEditPatient = new javax.swing.JButton();
        btnUpdatePatient = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfPatientUsername = new javax.swing.JTextField();
        tfPatientPassword = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePatientDetails = new javax.swing.JTable();
        dcEncounterDate = new com.toedter.calendar.JDateChooser();

        btnGetDoctors.setText("Get Doctors");
        btnGetDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDoctorsActionPerformed(evt);
            }
        });

        tableGetDoctors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor Name", "Doctor Id", "Gender", "Hospital Name", "Department", "Phone Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableGetDoctors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableGetDoctorsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableGetDoctors);

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        tableGetEncounterHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Encounter Id", "Encounter Date", "Temperature", "BP", "Heart Rate", "Doctor"
            }
        ));
        jScrollPane2.setViewportView(tableGetEncounterHistory);

        jLabel1.setText("Encounter ID");

        jLabel2.setText("Encounter Date");

        lblEncounterDoctorName.setText("Doctor Name");

        btnBookAppointment.setText("Book Appointment");
        btnBookAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAppointmentActionPerformed(evt);
            }
        });

        btnGetEncounterHistory.setText("Get Encounter History");
        btnGetEncounterHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetEncounterHistoryActionPerformed(evt);
            }
        });

        jLabel4.setText("Patient Name :");

        jLabel5.setText("Patient ID :");

        jLabel6.setText("Age : ");

        jLabel7.setText("Gender :");

        jLabel8.setText("Cell Phone : ");

        jLabel9.setText("House No:");

        jLabel10.setText("City :");

        jLabel11.setText("Community : ");

        jLabel12.setText("Postal Code :");

        btnGender.add(rbPatientGenderMale);
        rbPatientGenderMale.setText("Male");
        rbPatientGenderMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPatientGenderMaleActionPerformed(evt);
            }
        });

        btnGender.add(rbPatientGenderFemale);
        rbPatientGenderFemale.setText("Female");
        rbPatientGenderFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPatientGenderFemaleActionPerformed(evt);
            }
        });

        btnGender.add(rbPatientGenderOther);
        rbPatientGenderOther.setText("Other");
        rbPatientGenderOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPatientGenderOtherActionPerformed(evt);
            }
        });

        cbPatientCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbPatientCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPatientCommunityActionPerformed(evt);
            }
        });

        cbPatientCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbPatientCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPatientCityActionPerformed(evt);
            }
        });

        btnEditPatient.setText("Edit");
        btnEditPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPatientActionPerformed(evt);
            }
        });

        btnUpdatePatient.setText("Update");
        btnUpdatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePatientActionPerformed(evt);
            }
        });

        jLabel3.setText("Username");

        jLabel13.setText("Password");

        tablePatientDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Patient ID", "Age", "Gender", "House No.", "Community", "City", "ZipCode", "PhoneNo."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablePatientDetails);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel13))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbPatientGenderMale, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbPatientGenderFemale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbPatientGenderOther))
                                    .addComponent(tfPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbPatientCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tfHouseNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfPatientCellPhone, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbPatientCity, javax.swing.GroupLayout.Alignment.LEADING, 0, 105, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfPatientPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(tfPatientUsername)
                                    .addComponent(btnEditPatient, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfPatientPostalCode))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdatePatient))))
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGetDoctors)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEncounterID, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(dcEncounterDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblEncounterDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogout)
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGetEncounterHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnBookAppointment))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(tfPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLogout)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(tfPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbPatientGenderMale)
                            .addComponent(rbPatientGenderFemale)
                            .addComponent(rbPatientGenderOther)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tfPatientCellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tfHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(cbPatientCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cbPatientCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(tfPatientPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfPatientUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(tfPatientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGetDoctors)
                            .addComponent(btnEditPatient)
                            .addComponent(btnUpdatePatient))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtEncounterID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(dcEncounterDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEncounterDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166)))
                .addComponent(btnBookAppointment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGetEncounterHistory)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGetDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetDoctorsActionPerformed
        // TODO add your handling code here:

        //        String communityName = tfCommunityName.getText();
        String communityName = (String) cbPatientCommunity.getSelectedItem();
        hospitalNames = new ArrayList();
        //System.out.println(HospitalDirectory.getHospitals());
        for(Hospital hospital:HospitalAdminFrame.hospitals) {
            if(hospital.getCommunity().equals(communityName)) {
                hospitalNames.add(hospital.getHospitalName());
            }
        }
        System.out.println(hospitalNames);
        for(Doctor doctor:HospitalAdminFrame.doctors) {
            String hospitalName = doctor.getHospitalName();
            if(hospitalNames.contains(hospitalName)) {
                Object[] data = {doctor.getName(), doctor.getId(), doctor.getGender(),
                    doctor.getHospitalName(), doctor.getHospitalDepartment(), doctor.getPhoneNumber()};
                getDoctorsTblModel.addRow(data);
            }
        }
    }//GEN-LAST:event_btnGetDoctorsActionPerformed

    private void tableGetDoctorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableGetDoctorsMouseClicked
        // TODO add your handling code here:
        int row = tableGetDoctors.getSelectedRow();
        String doctorName = getDoctorsTblModel.getValueAt(row, 0).toString();
        tfDoctorName.setText(doctorName);
    }//GEN-LAST:event_tableGetDoctorsMouseClicked

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        JFrame patientFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        patientFrame.dispose();
        MainJFrame hf = new MainJFrame();
        hf.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnBookAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAppointmentActionPerformed
        // TODO add your handling code here:
        VitalSigns vitalSigns = new VitalSigns();
        String encounterId = txtEncounterID.getText();
        String doctorName = tfDoctorName.getText();
        Date encounterDate = dcEncounterDate.getDate();
        Encounter e = new Encounter(encounterId, patient.getName(), patient.getAge(), patient.getId(), vitalSigns,
            doctorName, encounterDate);
        encounterList.add(e);
        patient.getEncounterHistory().getEncounters().add(e);
    }//GEN-LAST:event_btnBookAppointmentActionPerformed

    private void btnGetEncounterHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetEncounterHistoryActionPerformed
        // TODO add your handling code here:
        //String patientId = txtEnterPatientId.getText();
        tblEncounterModel.setRowCount(0);
        for (Encounter en : encounterHistory.getEncounters()) {
            SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
            String date = dateformat.format(en.getEncounterDate());
            Object[] data = {en.getEncounterId(), date,
                en.getVitalSigns().getTemperature(), en.getVitalSigns().getBloodPressure(),
                en.getVitalSigns().getHeartRate(), en.getDoctorName()};
            tblEncounterModel.addRow(data);
            System.out.println(en.getPatientId());
        }
    }//GEN-LAST:event_btnGetEncounterHistoryActionPerformed

    private void rbPatientGenderMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPatientGenderMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPatientGenderMaleActionPerformed

    private void rbPatientGenderFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPatientGenderFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPatientGenderFemaleActionPerformed

    private void rbPatientGenderOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPatientGenderOtherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPatientGenderOtherActionPerformed

    private void cbPatientCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPatientCommunityActionPerformed
        // TODO add your handling code here:
        String chosenCity = String.valueOf(cbPatientCity.getSelectedItem());
        String chosenCommunity = String.valueOf(cbPatientCommunity.getSelectedItem());
        for (City obj : AddCityPanel.cityList) {
            if (obj.getCityName().equals((chosenCity))) {
                for (Community comm : obj.getCommunities()) {
                    if (comm.getCommunityName().equals(chosenCommunity)) {
                        tfPatientPostalCode.setText(comm.getZipcode().toString());
                    }
                }
            }
        }
    }//GEN-LAST:event_cbPatientCommunityActionPerformed

    private void cbPatientCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPatientCityActionPerformed
        // TODO add your handling code here:
        cbPatientCommunity.removeAllItems();
        String chosenCity = String.valueOf(cbPatientCity.getSelectedItem());
        for (City obj : AddCityPanel.cityList) {
            if (obj.getCityName().equals((chosenCity))) {
                for (Community comm : obj.getCommunities()) {
                    cbPatientCommunity.addItem(comm.getCommunityName());
                }
            }
        }
    }//GEN-LAST:event_cbPatientCityActionPerformed

    private void btnEditPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPatientActionPerformed
        // TODO add your handling code here:
        int index = 0;
        int commIndex = 0;
        tfPatientName.setEditable(true);
        tfPatientId.setEditable(false);
        tfPatientAge.setEditable(true);
        rbPatientGenderMale.setEnabled(true);
        rbPatientGenderFemale.setEnabled(true);
        rbPatientGenderOther.setEnabled(true);
        tfPatientCellPhone.setEditable(true);
        tfHouseNumber.setEnabled(true);
        cbPatientCity.setEnabled(true);
        cbPatientCommunity.setEnabled(true);
        tfPatientPostalCode.setEditable(true);
        tfPatientUsername.setEditable(true);
        tfPatientPassword.setEditable(true);
        for (City city : AddCityPanel.cityList) {
            cbPatientCity.addItem(city.getCityName());
            if(cbPatientCity.getSelectedItem().equals(city.getCityName())){
                index = AddCityPanel.cityList.indexOf(city);
                for(Community c: city.getCommunities()){
                    if(c.getCommunityName().equals(cbPatientCommunity.getSelectedItem())){
                        commIndex = city.getCommunities().indexOf(c);
                    }
                }
            }
        }
        cbPatientCity.setSelectedIndex(index);
        cbPatientCommunity.setSelectedIndex(commIndex);
    }//GEN-LAST:event_btnEditPatientActionPerformed

    private void btnUpdatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePatientActionPerformed
        // TODO add your handling code here:
        int index = 0;
        String patientId = tfPatientId.getText();
        String patientName = tfPatientName.getText();
        String patientPhNo = tfPatientCellPhone.getText();
        String patientAge = tfPatientAge.getText();

        rbPatientGenderMale.setActionCommand("Male");
        rbPatientGenderFemale.setActionCommand("Female");
        rbPatientGenderOther.setActionCommand("Other");
        String patientGender = btnGender.getSelection().getActionCommand();
        String houseNo = tfHouseNumber.getText();
        String patientCity = cbPatientCity.getSelectedItem().toString();
        String patientCommunity = cbPatientCommunity.getSelectedItem().toString();
        String zipcode = tfPatientPostalCode.getText();
        String username = tfPatientUsername.getText();
        String password = tfPatientPassword.getText();

        if(patientId.isEmpty() || patientName.isEmpty() || patientPhNo.isEmpty() || patientAge.isEmpty()
            || patientGender.isEmpty() || houseNo.isEmpty() || patientCity.isEmpty() || patientCommunity.isEmpty()
            || zipcode.isEmpty() || username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this,
                "Enter all Fields",
                "Try Again",
                JOptionPane.ERROR_MESSAGE);
        }
        else{
            //Patient selectedPatient = listOfPatients.getPatients().get(row);
            Patient updatedPatient = new Patient(patientPhNo, houseNo, patientCommunity, patientCity, Long.parseLong(zipcode), patientName,
                patientId, Integer.parseInt(patientAge), patientGender, "Patient", username,
                password, encounterHistory);

            for(Patient p:HospitalAdminFrame.patients) {
                if(patientId.equals(p.getId())) {
                    index = HospitalAdminFrame.patients.indexOf(p);
                    break;
                }
            }
            HospitalAdminFrame.patients.remove(index);
            HospitalAdminFrame.patients.add(index, updatedPatient);
            Object[] data = {patientName, patientId, patientAge, patientGender, houseNo, patientCommunity,
                patientCity, zipcode, patientPhNo};
            tblPatientModel.addRow(data);
        }
    }//GEN-LAST:event_btnUpdatePatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookAppointment;
    private javax.swing.JButton btnEditPatient;
    private javax.swing.ButtonGroup btnGender;
    private javax.swing.JButton btnGetDoctors;
    private javax.swing.JButton btnGetEncounterHistory;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdatePatient;
    private javax.swing.JComboBox<String> cbPatientCity;
    private javax.swing.JComboBox<String> cbPatientCommunity;
    private com.toedter.calendar.JDateChooser dcEncounterDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblEncounterDoctorName;
    private javax.swing.JRadioButton rbPatientGenderFemale;
    private javax.swing.JRadioButton rbPatientGenderMale;
    private javax.swing.JRadioButton rbPatientGenderOther;
    private javax.swing.JTable tableGetDoctors;
    private javax.swing.JTable tableGetEncounterHistory;
    private javax.swing.JTable tablePatientDetails;
    private javax.swing.JTextField tfDoctorName;
    private javax.swing.JTextField tfHouseNumber;
    private javax.swing.JTextField tfPatientAge;
    private javax.swing.JTextField tfPatientCellPhone;
    private javax.swing.JTextField tfPatientId;
    private javax.swing.JTextField tfPatientName;
    private javax.swing.JTextField tfPatientPassword;
    private javax.swing.JTextField tfPatientPostalCode;
    private javax.swing.JTextField tfPatientUsername;
    private javax.swing.JTextField txtEncounterID;
    // End of variables declaration//GEN-END:variables
}
