/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Product;
import Business.ProDemographic;
import Business.ProAddress;
import Business.ProAccount;
import Business.ProLicense;
import Business.ProMedical;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author dell
 */
public class ViewJPanel extends javax.swing.JPanel {
    private String path;

    /**
     * Creates new form ViewJPanel
     */
    public ViewJPanel(ProDemographic proDemographic, ProAddress proAddress, ProAccount proAccount, ProLicense proLicense, ProMedical proMedical) {
        initComponents();
        displayProduct(proDemographic, proAddress, proAccount, proLicense, proMedical);
    }
    
    private void displayProduct(ProDemographic proDemographic, ProAddress proAddress, ProAccount proAccount, ProLicense proLicense, ProMedical proMedical)
    {
        String productfirstname = proDemographic.getFirstName();
        firstnameTextField.setText(productfirstname);
        
        String productlastname = proDemographic.getLastName();
        lastnameTextField.setText(productlastname);
        
        String productphonenumber = proDemographic.getPhoneNumber();
        phonenumberTextField.setText(productphonenumber);
        
        String productdateofbirth = proDemographic.getDateOfBirth();
        dateofbirthTextField.setText(productdateofbirth);
        
        String productage = proDemographic.getAge();
        ageTextField.setText(productage);
        
        String productheight = proDemographic.getHeight();
        heightTextField.setText(productheight);
        
        String productweight = proDemographic.getWeight();
        weightTextField.setText(productweight);
        
        String productSSN = proDemographic.getSSN();
        SSNTextField.setText(productSSN);
        
        String productstreetaddress = proAddress.getStreetAddress();
        streetaddressTextField.setText(productstreetaddress);
        
        String productcity = proAddress.getCity();
        cityTextField.setText(productcity);
        
        String productstate = proAddress.getState();
        stateTextField.setText(productstate);
        
        String productzipcode = proAddress.getZipCode();
        zipcodeTextField.setText(productzipcode);
        
        String productsbankname = proAccount.getSBankName();
        SbanknameTextField.setText(productsbankname);
        
        String productsroutingnumber = proAccount.getSRoutingNumber();
        SroutingnumberTextField.setText(productsroutingnumber);
        
        String productsaccountnumber = proAccount.getSAccountNumber();
        SaccountnumberTextField.setText(productsaccountnumber);
        
        String productsaccountbalance = proAccount.getSAccountBalance();
        SaccountbalanceTextField.setText(productsaccountbalance);
        
        String productsaccounttype = proAccount.getSAccountType();
        SaccounttypeTextField.setText(productsaccounttype);
        
        String productcbankname = proAccount.getCBankName();
        CbanknameTextField.setText(productcbankname);
        
        String productcroutingnumber = proAccount.getCRoutingNumber();
        CroutingnumberTextField.setText(productcroutingnumber);
        
        String productcaccountnumber = proAccount.getCAccountNumber();
        CaccountnumberTextField.setText(productcaccountnumber);
        
        String productcaccountbalance = proAccount.getCAccountBalance();
        CaccountbalanceTextField.setText(productcaccountbalance);
        
        String productcaccounttype = proAccount.getCAccountType();
        CaccounttypeTextField.setText(productcaccounttype);
        
        String productlicensenumber = proLicense.getLicenseNumber();
        licensenumberTextField.setText(productlicensenumber);
        
        String productissueddate = proLicense.getIssuedDate();
        issueddateTextField.setText(productissueddate);
        
        String productexpirationdate = proLicense.getExpirationDate();
        expirationdateTextField.setText(productexpirationdate);
        
        String productbloodtype = proLicense.getBloodType();
        bloodtypeTextField.setText(productbloodtype);
        
        String productmedicalrecordnumber = proMedical.getMedicalRecordNumber();
        medicalrecordTextField.setText(productmedicalrecordnumber);
        
        String productalergy1 = proMedical.getAlergy1();
        alergy1TextField.setText(productalergy1);
        
        String productalergy2 = proMedical.getAlergy2();
        alergy2TextField.setText(productalergy2);
        
        String productalergy3 = proMedical.getAlergy3();
        alergy3TextField.setText(productalergy3);
        
        path = proLicense.getPicture().getAbsolutePath();
        ImageIcon icon = new ImageIcon(path);
        icon.setImage(icon.getImage().getScaledInstance(145,155,Image.SCALE_DEFAULT));
        pictureLabel.setIcon(icon);
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
        firstnameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lastnameTextField = new javax.swing.JTextField();
        phonenumberTextField = new javax.swing.JTextField();
        dateofbirthTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        heightTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        weightTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SSNTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        streetaddressTextField = new javax.swing.JTextField();
        cityTextField = new javax.swing.JTextField();
        stateTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        zipcodeTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CbanknameTextField = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        SroutingnumberTextField = new javax.swing.JTextField();
        CaccountnumberTextField = new javax.swing.JTextField();
        SbanknameTextField = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        SaccountbalanceTextField = new javax.swing.JTextField();
        CroutingnumberTextField = new javax.swing.JTextField();
        SaccountnumberTextField = new javax.swing.JTextField();
        SaccounttypeTextField = new javax.swing.JTextField();
        CaccounttypeTextField = new javax.swing.JTextField();
        CaccountbalanceTextField = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        issueddateTextField = new javax.swing.JTextField();
        licensenumberTextField = new javax.swing.JTextField();
        bloodtypeTextField = new javax.swing.JTextField();
        expirationdateTextField = new javax.swing.JTextField();
        alergy3TextField = new javax.swing.JTextField();
        alergy2TextField = new javax.swing.JTextField();
        alergy1TextField = new javax.swing.JTextField();
        medicalrecordTextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        pictureLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("View Information");

        firstnameTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("First Name :");

        lastnameTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lastnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameTextFieldActionPerformed(evt);
            }
        });

        phonenumberTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        dateofbirthTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        ageTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Date Of Birth :");

        heightTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        heightTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Age :");

        weightTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Last Name :");

        SSNTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SSNTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSNTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Phone Number :");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setText("SSN:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Height :");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("Weight :");

        streetaddressTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        cityTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTextFieldActionPerformed(evt);
            }
        });

        stateTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setText("Zip Code :");

        zipcodeTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel11.setText("State :");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel12.setText("City :");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel13.setText("Street Address :");

        CbanknameTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel26.setText("C Bank Name :");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel27.setText("S Account Type :");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel28.setText("C Account Type :");

        SroutingnumberTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        CaccountnumberTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        CaccountnumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaccountnumberTextFieldActionPerformed(evt);
            }
        });

        SbanknameTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel29.setText("C Account Balance :");

        SaccountbalanceTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        CroutingnumberTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        SaccountnumberTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SaccountnumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaccountnumberTextFieldActionPerformed(evt);
            }
        });

        SaccounttypeTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SaccounttypeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaccounttypeTextFieldActionPerformed(evt);
            }
        });

        CaccounttypeTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        CaccounttypeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaccounttypeTextFieldActionPerformed(evt);
            }
        });

        CaccountbalanceTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel30.setText("C Bank Routing Number :");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel31.setText("C Bank Account Number :");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel32.setText("S Account Balance :");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel33.setText("S Bank Account Number :");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel34.setText("S Bank Routing Number :");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel35.setText("S Bank Name :");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel36.setText("Checking");

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel37.setText("Saving");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel14.setText("Issued Date :");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel15.setText("License Number :");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel16.setText("Blood Type :");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel17.setText("Expiration Date :");

        issueddateTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        licensenumberTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        licensenumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licensenumberTextFieldActionPerformed(evt);
            }
        });

        bloodtypeTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        expirationdateTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        alergy3TextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        alergy3TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alergy3TextFieldActionPerformed(evt);
            }
        });

        alergy2TextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        alergy2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alergy2TextFieldActionPerformed(evt);
            }
        });

        alergy1TextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        medicalrecordTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        medicalrecordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalrecordTextFieldActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel18.setText("Alergy3 :");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel19.setText("Alergy2 :");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel20.setText("Alergy1 :");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel21.setText("Medical Record Number :");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel22.setText("Picture :");

        pictureLabel.setBackground(new java.awt.Color(255, 255, 255));
        pictureLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alergy2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alergy1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SSNTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(streetaddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zipcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(licensenumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(issueddateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(expirationdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bloodtypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(medicalrecordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(dateofbirthTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(phonenumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(firstnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(70, 70, 70)
                            .addComponent(lastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alergy3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel26)
                                .addComponent(jLabel30)
                                .addComponent(jLabel31)
                                .addComponent(jLabel29)
                                .addComponent(jLabel28))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CbanknameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CroutingnumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CaccountnumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CaccountbalanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CaccounttypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel36)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel35)
                                .addComponent(jLabel34)
                                .addComponent(jLabel33)
                                .addComponent(jLabel32)
                                .addComponent(jLabel27))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel37)
                                .addComponent(SbanknameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SroutingnumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SaccountnumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SaccountbalanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SaccounttypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(246, 246, 246))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(SbanknameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(SroutingnumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(SaccountnumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(SaccountbalanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(SaccounttypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phonenumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(dateofbirthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(SSNTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(streetaddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(stateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(zipcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(licensenumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(CbanknameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(CroutingnumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(CaccountnumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(CaccountbalanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(CaccounttypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(issueddateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(expirationdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(bloodtypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(medicalrecordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(alergy1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(alergy2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(alergy3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lastnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameTextFieldActionPerformed

    private void SSNTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SSNTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SSNTextFieldActionPerformed

    private void cityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTextFieldActionPerformed

    private void CaccountnumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaccountnumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaccountnumberTextFieldActionPerformed

    private void SaccountnumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaccountnumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaccountnumberTextFieldActionPerformed

    private void SaccounttypeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaccounttypeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaccounttypeTextFieldActionPerformed

    private void CaccounttypeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaccounttypeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaccounttypeTextFieldActionPerformed

    private void ageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextFieldActionPerformed

    private void licensenumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licensenumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_licensenumberTextFieldActionPerformed

    private void alergy3TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alergy3TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alergy3TextFieldActionPerformed

    private void alergy2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alergy2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alergy2TextFieldActionPerformed

    private void medicalrecordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalrecordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicalrecordTextFieldActionPerformed

    private void heightTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CaccountbalanceTextField;
    private javax.swing.JTextField CaccountnumberTextField;
    private javax.swing.JTextField CaccounttypeTextField;
    private javax.swing.JTextField CbanknameTextField;
    private javax.swing.JTextField CroutingnumberTextField;
    private javax.swing.JTextField SSNTextField;
    private javax.swing.JTextField SaccountbalanceTextField;
    private javax.swing.JTextField SaccountnumberTextField;
    private javax.swing.JTextField SaccounttypeTextField;
    private javax.swing.JTextField SbanknameTextField;
    private javax.swing.JTextField SroutingnumberTextField;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JTextField alergy1TextField;
    private javax.swing.JTextField alergy2TextField;
    private javax.swing.JTextField alergy3TextField;
    private javax.swing.JTextField bloodtypeTextField;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JTextField dateofbirthTextField;
    private javax.swing.JTextField expirationdateTextField;
    private javax.swing.JTextField firstnameTextField;
    private javax.swing.JTextField heightTextField;
    private javax.swing.JTextField issueddateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastnameTextField;
    private javax.swing.JTextField licensenumberTextField;
    private javax.swing.JTextField medicalrecordTextField;
    private javax.swing.JTextField phonenumberTextField;
    private javax.swing.JLabel pictureLabel;
    private javax.swing.JTextField stateTextField;
    private javax.swing.JTextField streetaddressTextField;
    private javax.swing.JTextField weightTextField;
    private javax.swing.JTextField zipcodeTextField;
    // End of variables declaration//GEN-END:variables
}
