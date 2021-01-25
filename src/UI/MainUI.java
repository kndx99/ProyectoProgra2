package UI;

import javax.swing.JInternalFrame;

public class MainUI extends javax.swing.JFrame {

    LoginUI loginUI;
    NewUserUI newUserUI;
    RequestUI requestUI;
    IncidentUI incidentUI;
    SearchUI searchUI;
    QueuesUI queuesUI;
    ModifyRequestUI modifyRequestUI;

    public MainUI() {
        initComponents();
        this.setSize(1200, 800);
        this.setLocationRelativeTo(null);
        crearLogin();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        loginMenuItem = new javax.swing.JMenuItem();
        newUserMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        menuRecord = new javax.swing.JMenu();
        IncidentRequestMenuItem = new javax.swing.JMenuItem();
        extendedRequestMenuItem = new javax.swing.JMenuItem();
        ModifyMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        SearchMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setLayout(null);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        loginMenuItem.setMnemonic('a');
        loginMenuItem.setText("Login");
        loginMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(loginMenuItem);

        newUserMenuItem.setText("New user");
        newUserMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(newUserMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        menuRecord.setText("Record");

        IncidentRequestMenuItem.setText("Incident Request");
        IncidentRequestMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncidentRequestMenuItemActionPerformed(evt);
            }
        });
        menuRecord.add(IncidentRequestMenuItem);

        extendedRequestMenuItem.setText("Extended Request");
        extendedRequestMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extendedRequestMenuItemActionPerformed(evt);
            }
        });
        menuRecord.add(extendedRequestMenuItem);

        ModifyMenuItem.setText("Modify Requests");
        ModifyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyMenuItemActionPerformed(evt);
            }
        });
        menuRecord.add(ModifyMenuItem);

        menuBar.add(menuRecord);

        editMenu.setMnemonic('e');
        editMenu.setText("Search");

        SearchMenuItem.setMnemonic('t');
        SearchMenuItem.setText("Search");
        SearchMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(SearchMenuItem);

        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarVentanas() {
        for (JInternalFrame internalFrame : desktopPane.getAllFrames()) {
            internalFrame.dispose();
        }
    }

    private void crearLogin() {
        loginUI = new LoginUI();
        loginUI.setLocation(desktopPane.getWidth() / 2 - loginUI.getWidth() / 2, desktopPane.getHeight() / 2 - loginUI.getHeight() / 2);
        loginUI.setVisible(true);
        desktopPane.add(loginUI);
    }

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void loginMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginMenuItemActionPerformed
        crearLogin();
    }//GEN-LAST:event_loginMenuItemActionPerformed

    private void newUserMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserMenuItemActionPerformed
        cerrarVentanas();
        newUserUI = new NewUserUI();
        newUserUI.setLocation(desktopPane.getWidth()/2 - newUserUI.getWidth()/2, desktopPane.getHeight()/2 - newUserUI.getHeight()/2);
        newUserUI.setVisible(true);
        desktopPane.add(newUserUI);

    }//GEN-LAST:event_newUserMenuItemActionPerformed

    private void IncidentRequestMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncidentRequestMenuItemActionPerformed
        cerrarVentanas();
        requestUI = new RequestUI();
        requestUI.setLocation(desktopPane.getWidth()/2 - requestUI.getWidth()/2, desktopPane.getHeight()/2 - requestUI.getHeight()/2);
        requestUI.setVisible(true);
        desktopPane.add(requestUI);
    }//GEN-LAST:event_IncidentRequestMenuItemActionPerformed

    private void extendedRequestMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extendedRequestMenuItemActionPerformed
        cerrarVentanas();
        incidentUI = new IncidentUI();
        incidentUI.setLocation(desktopPane.getWidth()/2 - incidentUI.getWidth()/2, desktopPane.getHeight()/2 - incidentUI.getHeight()/2);
        incidentUI.setVisible(true);
        desktopPane.add(incidentUI);
    }//GEN-LAST:event_extendedRequestMenuItemActionPerformed

    private void SearchMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchMenuItemActionPerformed
//        cerrarVentanas();
        searchUI = new SearchUI();
        searchUI.setLocation(desktopPane.getWidth()/2 - searchUI.getWidth()/2, desktopPane.getHeight()/2 - searchUI.getHeight()/2);
        searchUI.setVisible(true);
        desktopPane.add(searchUI);
    }//GEN-LAST:event_SearchMenuItemActionPerformed

    private void ModifyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyMenuItemActionPerformed
//        cerrarVentanas();
        modifyRequestUI = new ModifyRequestUI();
        modifyRequestUI.setVisible(true);
        desktopPane.add(modifyRequestUI);
    }//GEN-LAST:event_ModifyMenuItemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem IncidentRequestMenuItem;
    private javax.swing.JMenuItem ModifyMenuItem;
    private javax.swing.JMenuItem SearchMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuItem extendedRequestMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem loginMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuRecord;
    private javax.swing.JMenuItem newUserMenuItem;
    // End of variables declaration//GEN-END:variables

}
