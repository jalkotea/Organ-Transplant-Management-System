/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.HospitalVisitors;

import Business.EcoSystem;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Game of Threads
 */
public class NewVisitorSignUpJPanel extends javax.swing.JPanel {

    Object row[]= new Object[1];
    JPanel rightPanel;
    EcoSystem system;
    /**
     * Creates new form NewVisitorSingUpJPanel
     */
    public NewVisitorSignUpJPanel(EcoSystem system, JPanel rightPanel) {
        initComponents();
        this.rightPanel=rightPanel;
        this.system=system;
        ButtonGroup bg = new ButtonGroup();
        bg.add(yesBtn);
        bg.add(noBtn);
        populateDropdown(system);
    }

    public void populateDropdown(EcoSystem system){
        //we have to populate drop down based on the cities created by the sysadmin
        for(Network n: system.getNetworkList()){
            row[0] = n.getName();
            citycb.addItem(row[0]);
            
        }
    }
    
    public boolean checkPassword(String password){
      Pattern ptr = Pattern.compile("^[^0-9+_$]+[A-Za-z0-9+_$]*$");
      Matcher m = ptr.matcher(password);
      if(m.find())
        return true;
      else 
          return false;
    }
    
    public void clearFields(){
        emailTxt.setText("");
        passwordTxt.setText("");
        repasswordTxt.setText("");
    }
    
    public boolean checkEmail(String email){
        Pattern ptr = Pattern.compile("^[^0-9_$]+[A-Za-z0-9_$]*@[A-Za-z]+.[A-Za-z]+$");
      Matcher m = ptr.matcher(email);
      if(m.find())
        return true;
      else 
          return false;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        yesBtn = new javax.swing.JRadioButton();
        noBtn = new javax.swing.JRadioButton();
        submitBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        citycb = new javax.swing.JComboBox();
        passwordTxt = new javax.swing.JPasswordField();
        repasswordTxt = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel1.setText("Email");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 47, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel2.setText("Password");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 98, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel3.setText("Confirm Password");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 149, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel4.setText("Interested in Organ Donation?");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 254, -1, -1));

        emailTxt.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 44, 276, -1));

        yesBtn.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        yesBtn.setText("Yes");
        yesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesBtnActionPerformed(evt);
            }
        });
        add(yesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 250, -1, -1));

        noBtn.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        noBtn.setText("No");
        add(noBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 250, -1, -1));

        submitBtn.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 303, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel5.setText("City");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 202, -1, -1));

        add(citycb, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 201, 276, -1));

        passwordTxt.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 95, 276, -1));

        repasswordTxt.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        repasswordTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                repasswordTxtKeyPressed(evt);
            }
        });
        add(repasswordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 146, 276, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/Images/IMAGES/organdonationmain.jpg"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 349, 648, 353));
    }// </editor-fold>//GEN-END:initComponents

    private void yesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yesBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        if(emailTxt.getText().equals("")||passwordTxt.getText().equals("")||repasswordTxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter all values!");
        }
        else{
            boolean validateUser = checkEmail(emailTxt.getText());
            boolean validatePassword = checkPassword(passwordTxt.getText());
            if(validateUser && validatePassword){
                 if(yesBtn.isSelected()){
//                     Visitor v = new Visitor();
//                     v.setName(emailTxt.getText());
//                     v.setPassword(passwordTxt.getText());
                  //   VisitorDirectory vd= new VisitorDirectory();
                     //vd.createVisitor(emailTxt.getText(), passwordTxt.getText());
                     /*
                     TO-DO: need to add organization here
                     for now passing null
                     */
                     DonorRegistrationForm don = new DonorRegistrationForm(rightPanel, null);
                     CardLayout layout=(CardLayout)rightPanel.getLayout();
                     rightPanel.add("DonorRegistrationForm",don);
                     layout.next(rightPanel);
                   }
                 else if (noBtn.isSelected()){
                       final String to = emailTxt.getText();//"sushma_1395@yahoo.com";
                        boolean sessionDebug=false;
            String from = "tanmayee7@gmail.com"; 
            String host = "smtp.gmail.com";
            String user="tanmayee7@gmail.com";
            String pass = "";//we have to type the real password here for it to work
            //if it is gmail we have to enable less secure apps
            Properties properties = System.getProperties();  
            properties.setProperty("mail.smtp.host", host); properties.put("mail.smtp.starttls.required", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.host",host);  
            properties.put("mail.smtp.port", "587");  
            properties.put("mail.smtp.auth", "true");  
            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());  
            Session session;
            session = Session.getDefaultInstance(properties,  null);
            session.setDebug(sessionDebug);
            try{
            MimeMessage message = new MimeMessage(session);  
            message.setFrom(new InternetAddress(from));  
            message.setRecipient(Message.RecipientType.TO,new InternetAddress(to));  
            InternetAddress address;
            address = new InternetAddress(to);
            message.setSubject("Awareness Camp");  
            message.setText("Please visit awareness camp in "+citycb.getSelectedItem());  
            //message.setFileName(from);
            Transport transport = session.getTransport("smtp");
            transport.connect(host,user,pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            JOptionPane.showMessageDialog(null, "Please check your email for further details!");
            }
            catch(Exception e){
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Error!");
            }
        }
       }
                    else{
                            if(!validateUser){
                                JOptionPane.showMessageDialog(null, " Invalid Username. "
                                + "Username should be an email-ID with '_' and '@' as the only allowed special characters but should not start with an '_'");
                                
                                clearFields();
                            }
                            if(!validatePassword){
                                JOptionPane.showMessageDialog(null, "Invalid Password. "
                                + "Password should not start with a number or '+_$'. And it "
                                + "contains alphanumeric characters with '+_$' being the allowed special characters");
                                clearFields();
                               }
                             
                           }    
      }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void repasswordTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_repasswordTxtKeyPressed
        String repass = repasswordTxt.getText();
        Color originalColor = repasswordTxt.getBackground();
        String typedTxt= ""+ evt.getKeyChar();
       if(!typedTxt.isEmpty()){
                    if(typedTxt.equals("\b")){
                        repass=repass.substring(0, repass.length());
                    }
                    else{
                    repass += typedTxt;
                    }
        }
                if(passwordTxt.getText().equals(repass)){
                    repasswordTxt.setBackground(Color.yellow);
                    submitBtn.setEnabled(true);
                }
                else{
                    repasswordTxt.setBackground(Color.orange);
                    submitBtn.setEnabled(false);
                }
    }//GEN-LAST:event_repasswordTxtKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox citycb;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton noBtn;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JPasswordField repasswordTxt;
    private javax.swing.JButton submitBtn;
    private javax.swing.JRadioButton yesBtn;
    // End of variables declaration//GEN-END:variables
}