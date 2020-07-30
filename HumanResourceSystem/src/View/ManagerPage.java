package View;

import Model.Employee;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class ManagerPage extends javax.swing.JFrame {

    /**
     * Creates new form ManagerPage
     */
    ButtonGroup buttonGroup = new ButtonGroup();
    String gender;

    public ManagerPage() {
        initComponents();
        this.setLocationRelativeTo(null);
        buttonGroup.add(male_rb);
        buttonGroup.add(female_rb);

        String temp = "";
        List<Employee> ex = Controller.Methods.getAllEmployees();
        for (int i = 0; i < ex.size(); i++) {
            Employee emp = ex.get(i);
            String status;
            if (emp.isOnHoliday()) {
                status = "On Holiday";
            } else {
                status = "Working";
            }

            temp = "Employee ID : " + emp.getEmpId()
                    + "\nName : " + emp.getName()
                    + "\nAddress : " + emp.getAddress()
                    + "\nGender : " + emp.getGender()
                    + "\nPhone : " + emp.getPhone()
                    + "\nSalary : " + emp.getSalary() + " $"
                    + "\nDepartment : " + emp.getDepartment()
                    + "\nEmail : " + emp.getEmail()
                    + "\nStatus : " + status
                    + "\n ------------------------------------"
                    + "\n";

            empList.append(temp);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        phoneTf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailTf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordTf = new javax.swing.JTextField();
        addEmp = new javax.swing.JButton();
        exit_btn = new javax.swing.JButton();
        clear_fields_btn = new javax.swing.JButton();
        male_rb = new javax.swing.JRadioButton();
        female_rb = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        addressTf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        depTf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        salTf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        id_Tf = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        fire_id = new javax.swing.JTextField();
        fireEmp_btn = new javax.swing.JButton();
        exit2_btn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        search_name_tf = new javax.swing.JTextField();
        search_btn = new javax.swing.JButton();
        exit2_btn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        info_ta = new javax.swing.JTextArea();
        clear2_btn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        empList = new javax.swing.JTextArea();
        refresh_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin DashBoard");

        jLabel2.setText("Employee ID ");

        jLabel3.setText("Phone Number ");

        jLabel4.setText("Email ");

        jLabel5.setText("Password");

        addEmp.setText("Register Employee");
        addEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmpActionPerformed(evt);
            }
        });

        exit_btn.setText("Back To Main Menu");
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
            }
        });

        clear_fields_btn.setText("Clear Fields");
        clear_fields_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_fields_btnActionPerformed(evt);
            }
        });

        male_rb.setText("Male");
        male_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                male_rbActionPerformed(evt);
            }
        });

        female_rb.setText("Female");
        female_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                female_rbActionPerformed(evt);
            }
        });

        jLabel6.setText("Gender ");

        jLabel9.setText("Address");

        jLabel10.setText("Salary");

        jLabel11.setText("Department");

        jLabel12.setText("Employee Name ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit_btn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel2))
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12)))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(addressTf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addComponent(id_Tf, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(phoneTf)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(male_rb, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(female_rb, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                            .addComponent(passwordTf)
                            .addComponent(depTf)
                            .addComponent(emailTf)
                            .addComponent(salTf)
                            .addComponent(nameTf))
                        .addGap(81, 81, 81)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addEmp)
                .addGap(18, 18, 18)
                .addComponent(clear_fields_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(female_rb)
                    .addComponent(male_rb)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEmp)
                    .addComponent(clear_fields_btn))
                .addGap(13, 13, 13)
                .addComponent(exit_btn)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Add Employee", jPanel1);

        jLabel7.setText("Employee ID");

        fireEmp_btn.setText("Fire Employee");
        fireEmp_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fireEmp_btnActionPerformed(evt);
            }
        });

        exit2_btn.setText("Back To Main Menu");
        exit2_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit2_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit2_btn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fireEmp_btn)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(fire_id, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 161, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fire_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(fireEmp_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                .addComponent(exit2_btn)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Fire Employee", jPanel2);

        jLabel8.setText("Employee Name");

        search_btn.setText("Search");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });

        exit2_btn1.setText("Back To Main Menu");
        exit2_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit2_btn1ActionPerformed(evt);
            }
        });

        info_ta.setEditable(false);
        info_ta.setColumns(20);
        info_ta.setRows(5);
        jScrollPane1.setViewportView(info_ta);

        clear2_btn.setText("Clear Fields");
        clear2_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear2_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit2_btn1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(search_btn))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search_name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(clear2_btn)))
                        .addGap(0, 133, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(search_name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_btn)
                    .addComponent(clear2_btn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(exit2_btn1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Search Employee", jPanel3);

        empList.setEditable(false);
        empList.setColumns(20);
        empList.setRows(5);
        jScrollPane2.setViewportView(empList);

        refresh_btn.setText("Refresh");
        refresh_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refresh_btn)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refresh_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Employee List", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clear2_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear2_btnActionPerformed
        search_name_tf.setText("");
        info_ta.setText("");
    }//GEN-LAST:event_clear2_btnActionPerformed

    private void exit2_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit2_btn1ActionPerformed
        StartScreen mainPage = new StartScreen();
        this.setVisible(false);
        mainPage.setVisible(true);
    }//GEN-LAST:event_exit2_btn1ActionPerformed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed

        info_ta.setText("");
        if (search_name_tf.getText().equals("")) {
            JOptionPane.showMessageDialog(
                    this, "Enter Employee Name",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            search_name_tf.setText("");
        } else {

            List<Employee> em = Controller.Methods.searchEmployee("eq", "name", search_name_tf.getText());
            String info = "";
            if (em.isEmpty()) {
                JOptionPane.showMessageDialog(
                        this, "Employee Not Found",
                        "Error",
                        JOptionPane.WARNING_MESSAGE);
                search_name_tf.setText("");

            } else {
                for (int i = 0; i < em.size(); i++) {
                    Employee emp = em.get(i);
                    String status;
                    if (emp.isOnHoliday()) {
                        status = "On Holiday";
                    } else {
                        status = "Working";
                    }

                    info = "Employee ID : " + emp.getEmpId()
                            + "\nName : " + emp.getName()
                            + "\nAddress : " + emp.getAddress()
                            + "\nGender : " + emp.getGender()
                            + "\nPhone : " + emp.getPhone()
                            + "\nSalary : " + emp.getSalary() + " $"
                            + "\nDepartment : " + emp.getDepartment()
                            + "\nEmail : " + emp.getEmail()
                            + "\nStatus : " + status
                            + "\n ------------------------------------"
                            + "\n";

                    info_ta.append(info);
                }
            }
        }
    }//GEN-LAST:event_search_btnActionPerformed

    private void exit2_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit2_btnActionPerformed

        StartScreen mainPage = new StartScreen();
        this.setVisible(false);
        mainPage.setVisible(true);

    }//GEN-LAST:event_exit2_btnActionPerformed

    private void fireEmp_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fireEmp_btnActionPerformed
        if (fire_id.getText().equals("")) {
            JOptionPane.showMessageDialog(
                    this, "Enter Employee ID",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            fire_id.setText("");
        } else if (!(fire_id.getText().matches("[0-9]*"))) {
            JOptionPane.showMessageDialog(
                    this, "Employee ID Must Be Numbers Only",
                    "Invalid Data Type",
                    JOptionPane.ERROR_MESSAGE);
        } else {

            long r = Controller.Methods.deleteEmployee("eq", "empId", fire_id.getText());

            if (r >= 1) {
                JOptionPane.showMessageDialog(
                        this, "Employee Deleted From Database",
                        "Scucess",
                        JOptionPane.INFORMATION_MESSAGE);

                fire_id.setText("");
            } else {
                JOptionPane.showMessageDialog(
                        this, "Employee Not Found",
                        "Error",
                        JOptionPane.WARNING_MESSAGE);
                fire_id.setText("");
            }
        }
    }//GEN-LAST:event_fireEmp_btnActionPerformed

    private void female_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_female_rbActionPerformed
        gender = "Female";
    }//GEN-LAST:event_female_rbActionPerformed

    private void male_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_male_rbActionPerformed
        gender = "Male";
    }//GEN-LAST:event_male_rbActionPerformed

    private void clear_fields_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_fields_btnActionPerformed
        id_Tf.setText("");
        nameTf.setText("");
        addressTf.setText("");
        buttonGroup.clearSelection();
        phoneTf.setText("");
        emailTf.setText("");
        passwordTf.setText("");
        salTf.setText("");
        depTf.setText("");
    }//GEN-LAST:event_clear_fields_btnActionPerformed

    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btnActionPerformed
        StartScreen mainPage = new StartScreen();
        this.setVisible(false);
        mainPage.setVisible(true);
    }//GEN-LAST:event_exit_btnActionPerformed

    private void addEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmpActionPerformed

        List<Employee> idVer = Controller.Methods.searchEmployee("eq", "empId", id_Tf.getText());
        if (salTf.getText().equals("")
                || nameTf.getText().equals("")
                || phoneTf.getText().equals("")
                || id_Tf.getText().equals("")
                || depTf.getText().equals("")
                || addressTf.getText().equals("")
                || emailTf.getText().equals("")
                || (male_rb.isSelected() == false && female_rb.isSelected() == false)
                || passwordTf.getText().equals("")) {

            JOptionPane.showMessageDialog(
                    this, "Please fill in all fields",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else if (!(id_Tf.getText().matches("[0-9]*"))) {
            JOptionPane.showMessageDialog(
                    this, "Employee ID Must Be Numbers",
                    "Invalid Data Type",
                    JOptionPane.ERROR_MESSAGE);
        } else if (id_Tf.getText().length()!= 10) {
            JOptionPane.showMessageDialog(
                    this, "Employee ID Must Be Exactly 10 Numbers",
                    "Invalid ID length",
                    JOptionPane.ERROR_MESSAGE);
        } else if (!(phoneTf.getText().matches("[0-9]*"))) {
            JOptionPane.showMessageDialog(
                    this, "Phone Number Must Be Numbers Only",
                    "Invalid Data Type",
                    JOptionPane.ERROR_MESSAGE);
        } else if (!(salTf.getText().matches("[0-9]*"))) {
            JOptionPane.showMessageDialog(
                    this, "Salary Must Be Numbers Only",
                    "Invalid Data Type",
                    JOptionPane.ERROR_MESSAGE);
        } else if (idVer.size() >= 1) {
            JOptionPane.showMessageDialog(
                    this, "Accound ID is already used",
                    "Invalid Entry",
                    JOptionPane.ERROR_MESSAGE);
        } else {

            Controller.Methods.addEmployee(new Employee(id_Tf.getText(),
                    passwordTf.getText(),
                    nameTf.getText(),
                    gender,
                    phoneTf.getText(),
                    emailTf.getText(),
                    Integer.parseInt(salTf.getText()),
                    depTf.getText(),
                    addressTf.getText()
            ));

            JOptionPane.showMessageDialog(
                    this, "Emloyee Added To DataBase",
                    "Scucess",
                    JOptionPane.INFORMATION_MESSAGE);

            id_Tf.setText("");
            nameTf.setText("");
            addressTf.setText("");
            buttonGroup.clearSelection();
            phoneTf.setText("");
            emailTf.setText("");
            passwordTf.setText("");
            salTf.setText("");
            depTf.setText("");
        }
    }//GEN-LAST:event_addEmpActionPerformed

    private void refresh_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_btnActionPerformed
        empList.setText("");
        String temp = "";
        List<Employee> ex = Controller.Methods.getAllEmployees();
        for (int i = 0; i < ex.size(); i++) {
            Employee emp = ex.get(i);
            String status;
            if (emp.isOnHoliday()) {
                status = "On Holiday";
            } else {
                status = "Working";
            }

            temp = "Employee ID : " + emp.getEmpId()
                    + "\nName : " + emp.getName()
                    + "\nAddress : " + emp.getAddress()
                    + "\nGender : " + emp.getGender()
                    + "\nPhone : " + emp.getPhone()
                    + "\nSalary : " + emp.getSalary() + " $"
                    + "\nDepartment : " + emp.getDepartment()
                    + "\nEmail : " + emp.getEmail()
                    + "\nStatus : " + status
                    + "\n ------------------------------------"
                    + "\n";

            empList.append(temp);
        }
    }//GEN-LAST:event_refresh_btnActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmp;
    private javax.swing.JTextField addressTf;
    private javax.swing.JButton clear2_btn;
    private javax.swing.JButton clear_fields_btn;
    private javax.swing.JTextField depTf;
    private javax.swing.JTextField emailTf;
    private javax.swing.JTextArea empList;
    private javax.swing.JButton exit2_btn;
    private javax.swing.JButton exit2_btn1;
    private javax.swing.JButton exit_btn;
    private javax.swing.JRadioButton female_rb;
    private javax.swing.JButton fireEmp_btn;
    private javax.swing.JTextField fire_id;
    private javax.swing.JTextField id_Tf;
    private javax.swing.JTextArea info_ta;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton male_rb;
    private javax.swing.JTextField nameTf;
    private javax.swing.JTextField passwordTf;
    private javax.swing.JTextField phoneTf;
    private javax.swing.JButton refresh_btn;
    private javax.swing.JTextField salTf;
    private javax.swing.JButton search_btn;
    private javax.swing.JTextField search_name_tf;
    // End of variables declaration//GEN-END:variables
}