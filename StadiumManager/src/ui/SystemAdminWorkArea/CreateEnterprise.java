/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import business.Business;
import business.Customer.CustomerDirectory;
import business.Enterprise;
import business.Enterprises.EnterpriseDirectory;
import business.Enterprises.EnterpriseUser;
import business.FlagClass;
import business.role.FoodBeverageEntAdminRole;
import business.role.HumanResourceEntAdmin;
import business.role.MerchendiseEntAdminRole;
import business.role.Role;
import business.role.TicketingAdmin;
import business.role.merchandiseShopOwner;
import business.useraccount.UserAccount;
import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author deepv
 */
public class CreateEnterprise extends javax.swing.JPanel {

    /**
     * Creates new form CreateEnterprise
     */
    Business business;
    CustomerDirectory customerDirectory;
    FlagClass flags;
    Map<String, Enterprise> network;
    EnterpriseDirectory enterpriseDirectory;

    public CreateEnterprise(Business business, UserAccount account, JPanel workAreaPanel) {
        initComponents();
        this.business = business;

        if (business.getNetworkList() == null) {
            this.network = new HashMap<String, Enterprise>();
        } else {
            this.network = business.getNetworkList();
        }

        this.customerDirectory = customerDirectory;
        this.flags = new FlagClass();

        JTableHeader tableHeader = tblCustomers.getTableHeader();
        tableHeader.setFont(new Font("Segoe UI", Font.BOLD, 12));
        ((DefaultTableCellRenderer) tableHeader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        populateCustomerRole();
        pnlUpdate.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPanelHeading = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCustomers = new javax.swing.JTable();
        pnlUpdate = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        txtManagerName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblAddUser = new javax.swing.JLabel();
        lblFirstName1 = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        pwdPassword = new javax.swing.JPasswordField();
        txtNetwork = new javax.swing.JTextField();
        btnCreateUser = new javax.swing.JButton();
        cmbEntType = new javax.swing.JComboBox<>();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(240, 255, 255));

        lblPanelHeading.setBackground(new java.awt.Color(0, 204, 255));
        lblPanelHeading.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblPanelHeading.setForeground(new java.awt.Color(0, 204, 255));
        lblPanelHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPanelHeading.setText("Enterprise");

        tblCustomers.setBackground(new java.awt.Color(255, 255, 255));
        tblCustomers.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "USER NAME", "PASSWORD", "FULL NAME"
            }
        ));
        tblCustomers.setSelectionBackground(new java.awt.Color(153, 209, 232));
        tblCustomers.setSelectionForeground(new java.awt.Color(0, 51, 51));
        jScrollPane2.setViewportView(tblCustomers);

        pnlUpdate.setBackground(new java.awt.Color(240, 255, 255));

        javax.swing.GroupLayout pnlUpdateLayout = new javax.swing.GroupLayout(pnlUpdate);
        pnlUpdate.setLayout(pnlUpdateLayout);
        pnlUpdateLayout.setHorizontalGroup(
            pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        pnlUpdateLayout.setVerticalGroup(
            pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
        );

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(153, 0, 0));
        btnDelete.setText("DELETE USER");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblLastName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLastName.setText("Network : ");

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPassword.setText("Password : ");

        lblAddUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAddUser.setForeground(new java.awt.Color(0, 102, 102));
        lblAddUser.setText("ADD NEW ENTERPRISE");

        lblFirstName1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFirstName1.setText("Enterprise : ");

        lblFirstName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFirstName.setText("Manager Name : ");

        btnCreateUser.setBackground(new java.awt.Color(175, 211, 211));
        btnCreateUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCreateUser.setForeground(new java.awt.Color(0, 102, 102));
        btnCreateUser.setText("CREATE");
        btnCreateUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCreateUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCreateUserMouseExited(evt);
            }
        });
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        cmbEntType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT ENT", "Food & Beverage", "Merchandise", "Human Resources", "Bookings" }));

        lblUserName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUserName.setText("Username : ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/enterpriseCreate.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(lblPanelHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDelete)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(lblAddUser))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(btnCreateUser)
                                        .addGap(33, 33, 33))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblLastName)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblUserName)
                                                .addComponent(lblPassword)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(txtNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pwdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblFirstName)
                                        .addComponent(lblFirstName1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmbEntType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtManagerName, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(pnlUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(339, 339, 339))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbEntType, pwdPassword, txtManagerName, txtNetwork, txtUserName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblPanelHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblAddUser)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstName)
                            .addComponent(txtManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstName1)
                            .addComponent(cmbEntType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastName)
                            .addComponent(txtNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserName)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(pwdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(btnCreateUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        String userName = txtUserName.getText();
        String password = pwdPassword.getText();
        String entType = cmbEntType.getSelectedItem().toString();

        if (!business.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
            JOptionPane.showMessageDialog(null, "UserName already taken!");
            txtUserName.setText("");
            pwdPassword.setText("");
        } else {
            if (cmbEntType.getSelectedItem().toString().equals("Food & Beverage")) {
                FoodBeverageEntAdminRole role = new FoodBeverageEntAdminRole();
                business.getUserAccountDirectory().createUserAccount(userName, txtManagerName.getText(), password, role, txtNetwork.getText());
            } else if (cmbEntType.getSelectedItem().toString().equals("Merchandise")) {
                MerchendiseEntAdminRole role = new MerchendiseEntAdminRole();
                business.getUserAccountDirectory().createUserAccount(userName, txtManagerName.getText(), password, role, txtNetwork.getText());
            } else if (cmbEntType.getSelectedItem().toString().equals("Human Resources")) {
                HumanResourceEntAdmin role = new HumanResourceEntAdmin();
                business.getUserAccountDirectory().createUserAccount(userName, txtManagerName.getText(), password, role, txtNetwork.getText());
            } else {
                TicketingAdmin role = new TicketingAdmin();
                business.getUserAccountDirectory().createUserAccount(userName, txtManagerName.getText(), password, role, txtNetwork.getText());
            }

            if (network.containsKey(txtNetwork.getText())) {
                for (Map.Entry<String, Enterprise> iteration : network.entrySet()) {
                    if (iteration.getKey().equals(txtNetwork.getText())) {
                        if (iteration.getValue().getEnterpriseDirectory() == null) {
                            enterpriseDirectory = new EnterpriseDirectory();
                        } else {
                            enterpriseDirectory = iteration.getValue().getEnterpriseDirectory();
                        }
                        EnterpriseUser enterprise = enterpriseDirectory.addEnterprise();
                        enterprise.setManagerType(cmbEntType.getSelectedItem().toString());
                        enterprise.setUserName(txtUserName.getText());
                    }
                }
            } else {
                Enterprise enterprise = new Enterprise();
                EnterpriseDirectory enterpriseDirectory1 = new EnterpriseDirectory();
                EnterpriseUser entUser = enterpriseDirectory1.addEnterprise();
                entUser.setManagerType(cmbEntType.getSelectedItem().toString());
                entUser.setUserName(txtUserName.getText());
                enterprise.setEnterpriseDirectory(enterpriseDirectory1);
                network.put(txtNetwork.getText(), enterprise);
                business.setNetworkList(network);
            }

            txtManagerName.setText("");
            cmbEntType.setSelectedItem("SELECT ENT");
            txtNetwork.setText("");
            txtUserName.setText("");
            pwdPassword.setText("");
        }
        populateCustomerRole();
    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRowIndex = tblCustomers.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a User");
            return;
        } else {
            DefaultTableModel model = (DefaultTableModel) tblCustomers.getModel();
            UserAccount selectedUserAccount = (UserAccount) model.getValueAt(selectedRowIndex, 0);
            UserAccount accountToBeRemoved = business.getUserAccountDirectory().fetchUserAccountUsingUserName(selectedUserAccount.getUsername());
            business.getUserAccountDirectory().removeAccount(accountToBeRemoved);
            JOptionPane.showMessageDialog(null, "User Account deleted successfully.");
            populateCustomerRole();

            business.Customer.Customer customer = business.getCustomerDirectory().findCustomer(selectedUserAccount.getUsername());
            business.getCustomerDirectory().removeCustomer(customer);
            business.getOrderDirectory().removeSelectedCustomerOrders(selectedUserAccount.getName());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        btnDelete.setBackground(new Color(248, 186, 186));
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        btnDelete.setBackground(Color.white);
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnCreateUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateUserMouseEntered
        btnCreateUser.setBackground(new Color(107, 174, 174));
    }//GEN-LAST:event_btnCreateUserMouseEntered

    private void btnCreateUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateUserMouseExited
        btnCreateUser.setBackground(new Color(175, 211, 211));
    }//GEN-LAST:event_btnCreateUserMouseExited

    private boolean validations() {
        boolean validData = true;
        if (txtManagerName == null || txtManagerName.getText().isBlank() || txtManagerName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the First Name.");
            validData = false;
            return validData;
        } else if (txtNetwork == null || txtNetwork.getText().isBlank() || txtNetwork.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the Last Name.");
            validData = false;
            return validData;
        } else if (txtUserName.getText().isBlank() || txtUserName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter a valid User Name.");
            validData = false;
            return validData;
        } else if (pwdPassword.getText().isBlank() || pwdPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the Password.");
            validData = false;
            return validData;
        } else {
            return true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox<String> cmbEntType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddUser;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblFirstName1;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPanelHeading;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel pnlUpdate;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JTable tblCustomers;
    private javax.swing.JTextField txtManagerName;
    private javax.swing.JTextField txtNetwork;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void populateCustomerRole() {
        DefaultTableModel model = (DefaultTableModel) tblCustomers.getModel();
        model.setRowCount(0);

        for (UserAccount userAccount : business.getUserAccountDirectory().getUserAccountList()) {
            Object[] row = new Object[3];
            if (userAccount.getRole() != null && userAccount.getRole().type != null && userAccount.getRole().type == Role.RoleType.FoodBeverageEntAdmin || userAccount.getRole().type == Role.RoleType.MerchendiseEntAdmin || userAccount.getRole().type == Role.RoleType.HumanResourceEntAdmin || userAccount.getRole().type == Role.RoleType.TicketingAdmin) {
                row[0] = userAccount;
                row[1] = userAccount.getPassword();
                row[2] = userAccount.getName();
                model.addRow(row);
            }
        }
    }
}
