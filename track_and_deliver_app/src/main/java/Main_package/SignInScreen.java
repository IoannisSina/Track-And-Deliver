package Main_package;


import java.sql.*;
import javax.swing.JOptionPane;


public class SignInScreen extends javax.swing.JFrame {

    
    public SignInScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        singIn_panel = new javax.swing.JPanel();
        javax.swing.JLabel singInScreen_welcomeLabel = new javax.swing.JLabel();
        singIn_email_label = new javax.swing.JLabel();
        singIn_passwordl_label = new javax.swing.JLabel();
        singIn_email_txt = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        signIn_button = new javax.swing.JButton();
        forgotPassword_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign in");
        setResizable(false);

        singIn_panel.setBackground(new java.awt.Color(51, 51, 51));
        singIn_panel.setRequestFocusEnabled(false);

        singInScreen_welcomeLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        singInScreen_welcomeLabel.setForeground(new java.awt.Color(191, 0, 0));
        singInScreen_welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        singInScreen_welcomeLabel.setText("T&D");

        singIn_email_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        singIn_email_label.setForeground(new java.awt.Color(255, 255, 255));
        singIn_email_label.setText("Email:");

        singIn_passwordl_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        singIn_passwordl_label.setForeground(new java.awt.Color(255, 255, 255));
        singIn_passwordl_label.setText("Password:");

        singIn_email_txt.setBackground(new java.awt.Color(240, 240, 240));
        singIn_email_txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        singIn_email_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singIn_email_txtActionPerformed(evt);
            }
        });

        jPasswordField1.setBackground(new java.awt.Color(240, 240, 240));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        signIn_button.setBackground(new java.awt.Color(51, 51, 51));
        signIn_button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        signIn_button.setForeground(new java.awt.Color(255, 255, 255));
        signIn_button.setText("Sign in");
        signIn_button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        signIn_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signIn_buttonActionPerformed(evt);
            }
        });

        forgotPassword_button.setBackground(new java.awt.Color(51, 51, 51));
        forgotPassword_button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        forgotPassword_button.setForeground(new java.awt.Color(191, 0, 0));
        forgotPassword_button.setText("Forgot Password;");
        forgotPassword_button.setBorder(null);

        javax.swing.GroupLayout singIn_panelLayout = new javax.swing.GroupLayout(singIn_panel);
        singIn_panel.setLayout(singIn_panelLayout);
        singIn_panelLayout.setHorizontalGroup(
            singIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singIn_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(singIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(singIn_passwordl_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(singIn_email_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(singIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(singIn_panelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(singInScreen_welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(singIn_panelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(forgotPassword_button, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(singIn_panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(singIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(signIn_button, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(singIn_email_txt)
                            .addComponent(jPasswordField1))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        singIn_panelLayout.setVerticalGroup(
            singIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singIn_panelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(singInScreen_welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                .addGroup(singIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(singIn_email_label)
                    .addComponent(singIn_email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(singIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(singIn_passwordl_label)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forgotPassword_button)
                .addGap(69, 69, 69)
                .addComponent(signIn_button)
                .addGap(161, 161, 161))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(singIn_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(singIn_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void singIn_email_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singIn_email_txtActionPerformed
        
    }//GEN-LAST:event_singIn_email_txtActionPerformed

    private void signIn_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signIn_buttonActionPerformed
        
        //open connection to DB and make 3 queries to check if users is simple user 
        //delivery or user working for company
        
        //----------------------
        Connection conn = DBconnect.GetConnection(); // creates and returns connection object;
        //----------------------
        String[] queries = {"SELECT name, surname, password FROM customer WHERE email=?", 
            "SELECT name, surname, password FROM delivery_man WHERE email=?", 
            "SELECT name, surname, password, working_company FROM employee WHERE email=?"};
        try{
            //query 0: simple user
            //query 1: delivery man user
            //query 2: employee user
            int user_type;
            PreparedStatement pst;
            ResultSet rs = null;
            for(user_type=0; user_type < 3; user_type++) {
                
                //chech the type of the user
                pst = conn.prepareStatement(queries[user_type]);
                pst.setString(1, singIn_email_txt.getText());
                rs = pst.executeQuery();
                
                if(rs.next()) break;
            }
           
            //if user_type == 0 then user is simple user
            //if user_type == 1 then user is delivery man user
            //if user_type == 2 then user is employee user
            if(user_type == 3) 
                JOptionPane.showMessageDialog(null, "Invalid Username or password");
            else {
                var user_name = rs.getString("name");
                var user_surname = rs.getString("surname");
                JOptionPane.showMessageDialog(null, "Welcome "+ user_name + " "+ user_surname);
                switch (user_type) {
                //set visible simple user main screen
                    case 0:
                        break;
                //set visible delivery man user main screen
                    case 1:
                        break;
                //set visible employee user
                    default:
                        break;
                }
                //Make login screen invisivble
                //setVisible(false);     
            }
            
            
            
           
        }catch(Exception ex){JOptionPane.showMessageDialog(null, ex);}
    }//GEN-LAST:event_signIn_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton forgotPassword_button;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton signIn_button;
    private javax.swing.JLabel singIn_email_label;
    private javax.swing.JTextField singIn_email_txt;
    private javax.swing.JPanel singIn_panel;
    private javax.swing.JLabel singIn_passwordl_label;
    // End of variables declaration//GEN-END:variables
}