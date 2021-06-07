package Main_package;


public class SignUpScreen extends javax.swing.JFrame {

    public SignUpScreen() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        singUpScreen_panel = new javax.swing.JPanel();
        back_to_home_screen_button = new javax.swing.JButton();
        javax.swing.JLabel singUpScreen_welcomeLabel = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        email_textField = new javax.swing.JTextField();
        password_label = new javax.swing.JLabel();
        password_textField = new javax.swing.JPasswordField();
        confirm_password_label = new javax.swing.JLabel();
        confirm_password_textField = new javax.swing.JPasswordField();
        name_label = new javax.swing.JLabel();
        surname_textField = new javax.swing.JTextField();
        surname_label = new javax.swing.JLabel();
        name_textField1 = new javax.swing.JTextField();
        phone_number_label = new javax.swing.JLabel();
        phone_number_textField = new javax.swing.JTextField();
        postal_code_label = new javax.swing.JLabel();
        postal_code_textField = new javax.swing.JTextField();
        country_label = new javax.swing.JLabel();
        country_ComboBox = new javax.swing.JComboBox<>();
        street_number_label = new javax.swing.JLabel();
        street_number_textField = new javax.swing.JTextField();
        country_label1 = new javax.swing.JLabel();
        street_number_textField1 = new javax.swing.JTextField();
        city_label = new javax.swing.JLabel();
        city_textField = new javax.swing.JTextField();
        singUp_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign up ");
        setResizable(false);

        singUpScreen_panel.setBackground(new java.awt.Color(51, 51, 51));

        back_to_home_screen_button.setBackground(new java.awt.Color(51, 51, 51));
        back_to_home_screen_button.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        back_to_home_screen_button.setForeground(new java.awt.Color(255, 255, 255));
        back_to_home_screen_button.setText("<");
        back_to_home_screen_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back_to_home_screen_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_to_home_screen_buttonActionPerformed(evt);
            }
        });

        singUpScreen_welcomeLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        singUpScreen_welcomeLabel.setForeground(new java.awt.Color(191, 0, 0));
        singUpScreen_welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        singUpScreen_welcomeLabel.setText("T&D");

        email_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email_label.setForeground(new java.awt.Color(255, 255, 255));
        email_label.setText("Email:");

        email_textField.setBackground(new java.awt.Color(204, 204, 204));
        email_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_textFieldActionPerformed(evt);
            }
        });

        password_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        password_label.setForeground(new java.awt.Color(255, 255, 255));
        password_label.setText("Password:");

        password_textField.setBackground(new java.awt.Color(204, 204, 204));
        password_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_textFieldActionPerformed(evt);
            }
        });

        confirm_password_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        confirm_password_label.setForeground(new java.awt.Color(255, 255, 255));
        confirm_password_label.setText("Confirm Password:");

        confirm_password_textField.setBackground(new java.awt.Color(204, 204, 204));
        confirm_password_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_password_textFieldActionPerformed(evt);
            }
        });

        name_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        name_label.setForeground(new java.awt.Color(255, 255, 255));
        name_label.setText("Name:");

        surname_textField.setBackground(new java.awt.Color(204, 204, 204));
        surname_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surname_textFieldActionPerformed(evt);
            }
        });

        surname_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        surname_label.setForeground(new java.awt.Color(255, 255, 255));
        surname_label.setText("Surname:");

        name_textField1.setBackground(new java.awt.Color(204, 204, 204));
        name_textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_textField1ActionPerformed(evt);
            }
        });

        phone_number_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        phone_number_label.setForeground(new java.awt.Color(255, 255, 255));
        phone_number_label.setText("Phone number:");

        phone_number_textField.setBackground(new java.awt.Color(204, 204, 204));
        phone_number_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_number_textFieldActionPerformed(evt);
            }
        });

        postal_code_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        postal_code_label.setForeground(new java.awt.Color(255, 255, 255));
        postal_code_label.setText("Postal code:");

        postal_code_textField.setBackground(new java.awt.Color(204, 204, 204));
        postal_code_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postal_code_textFieldActionPerformed(evt);
            }
        });

        country_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        country_label.setForeground(new java.awt.Color(255, 255, 255));
        country_label.setText("Country:");

        country_ComboBox.setBackground(new java.awt.Color(204, 204, 204));
        country_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua & Deps", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Central African Rep", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo", "Congo {Democratic Rep}", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland {Republic}", "Israel", "Italy", "Ivory Coast", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea North", "Korea South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar, {Burma}", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russian Federation", "Rwanda", "St Kitts & Nevis", "St Lucia", "Saint Vincent & the Grenadines", "Samoa", "San Marino", "Sao Tome & Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad & Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" }));
        country_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                country_ComboBoxActionPerformed(evt);
            }
        });

        street_number_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        street_number_label.setForeground(new java.awt.Color(255, 255, 255));
        street_number_label.setText("Street number:");

        street_number_textField.setBackground(new java.awt.Color(204, 204, 204));
        street_number_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                street_number_textFieldActionPerformed(evt);
            }
        });

        country_label1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        country_label1.setForeground(new java.awt.Color(255, 255, 255));
        country_label1.setText("Street:");

        street_number_textField1.setBackground(new java.awt.Color(204, 204, 204));
        street_number_textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                street_number_textField1ActionPerformed(evt);
            }
        });

        city_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        city_label.setForeground(new java.awt.Color(255, 255, 255));
        city_label.setText("City:");

        city_textField.setBackground(new java.awt.Color(204, 204, 204));
        city_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                city_textFieldActionPerformed(evt);
            }
        });

        singUp_button.setBackground(new java.awt.Color(51, 51, 51));
        singUp_button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        singUp_button.setForeground(new java.awt.Color(191, 0, 0));
        singUp_button.setText("Submit");
        singUp_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout singUpScreen_panelLayout = new javax.swing.GroupLayout(singUpScreen_panel);
        singUpScreen_panel.setLayout(singUpScreen_panelLayout);
        singUpScreen_panelLayout.setHorizontalGroup(
            singUpScreen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singUpScreen_panelLayout.createSequentialGroup()
                .addComponent(back_to_home_screen_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(singUpScreen_panelLayout.createSequentialGroup()
                .addGroup(singUpScreen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(singUpScreen_panelLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(singUpScreen_welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(singUpScreen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(singUpScreen_panelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(password_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, singUpScreen_panelLayout.createSequentialGroup()
                            .addGap(93, 93, 93)
                            .addGroup(singUpScreen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(email_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(password_label)
                                .addComponent(confirm_password_label)
                                .addComponent(name_label)
                                .addComponent(surname_label)
                                .addComponent(phone_number_label)
                                .addGroup(singUpScreen_panelLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(singUpScreen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(email_textField, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                                        .addComponent(confirm_password_textField)
                                        .addComponent(name_textField1)
                                        .addComponent(surname_textField)
                                        .addComponent(phone_number_textField))))))
                    .addGroup(singUpScreen_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(singUpScreen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(singUpScreen_panelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(postal_code_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(singUpScreen_panelLayout.createSequentialGroup()
                                .addGroup(singUpScreen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(street_number_label, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(singUpScreen_panelLayout.createSequentialGroup()
                                        .addGroup(singUpScreen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, singUpScreen_panelLayout.createSequentialGroup()
                                                .addComponent(postal_code_label, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(108, 108, 108))
                                            .addGroup(singUpScreen_panelLayout.createSequentialGroup()
                                                .addGroup(singUpScreen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(country_label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(singUpScreen_panelLayout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addGroup(singUpScreen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(street_number_textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(street_number_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(84, 84, 84)))
                                        .addGroup(singUpScreen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(country_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(city_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(singUpScreen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(country_ComboBox, 0, 174, Short.MAX_VALUE)
                                    .addComponent(city_textField)
                                    .addComponent(singUp_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        singUpScreen_panelLayout.setVerticalGroup(
            singUpScreen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singUpScreen_panelLayout.createSequentialGroup()
                .addComponent(back_to_home_screen_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(singUpScreen_welcomeLabel)
                .addGap(32, 32, 32)
                .addComponent(email_label, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirm_password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirm_password_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name_textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(surname_label, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(surname_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(phone_number_label, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phone_number_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(singUpScreen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postal_code_label, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(country_label, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(country_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(postal_code_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(singUpScreen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(country_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(city_label, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(city_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(street_number_textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(street_number_label, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(singUpScreen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(street_number_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(singUp_button))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(singUpScreen_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(singUpScreen_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //methods
    public void homeScreen() {
        
        //go back to home screen
        new HomeScreen().setVisible(true);
        dispose();
    }
    private void back_to_home_screen_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_to_home_screen_buttonActionPerformed
        homeScreen();
    }//GEN-LAST:event_back_to_home_screen_buttonActionPerformed

    private void email_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_textFieldActionPerformed

    private void password_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_textFieldActionPerformed

    private void confirm_password_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_password_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirm_password_textFieldActionPerformed

    private void surname_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surname_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surname_textFieldActionPerformed

    private void name_textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_textField1ActionPerformed

    private void phone_number_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone_number_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone_number_textFieldActionPerformed

    private void postal_code_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postal_code_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postal_code_textFieldActionPerformed

    private void country_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_country_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_country_ComboBoxActionPerformed

    private void street_number_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_street_number_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_street_number_textFieldActionPerformed

    private void street_number_textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_street_number_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_street_number_textField1ActionPerformed

    private void city_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_city_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_city_textFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_to_home_screen_button;
    private javax.swing.JLabel city_label;
    private javax.swing.JTextField city_textField;
    private javax.swing.JLabel confirm_password_label;
    private javax.swing.JPasswordField confirm_password_textField;
    private javax.swing.JComboBox<String> country_ComboBox;
    private javax.swing.JLabel country_label;
    private javax.swing.JLabel country_label1;
    private javax.swing.JLabel email_label;
    private javax.swing.JTextField email_textField;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextField name_textField1;
    private javax.swing.JLabel password_label;
    private javax.swing.JPasswordField password_textField;
    private javax.swing.JLabel phone_number_label;
    private javax.swing.JTextField phone_number_textField;
    private javax.swing.JLabel postal_code_label;
    private javax.swing.JTextField postal_code_textField;
    private javax.swing.JPanel singUpScreen_panel;
    private javax.swing.JButton singUp_button;
    private javax.swing.JLabel street_number_label;
    private javax.swing.JTextField street_number_textField;
    private javax.swing.JTextField street_number_textField1;
    private javax.swing.JLabel surname_label;
    private javax.swing.JTextField surname_textField;
    // End of variables declaration//GEN-END:variables
}
