/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdatabases;

/**
 *
 * @author Zanny
 */
public class MainPanel extends javax.swing.JPanel {

    /**
     * Creates new form MainPanel
     */
    public MainPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        masterclassButton = new javax.swing.JButton();
        contestantsButton = new javax.swing.JButton();
        tournamentButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        masterclassButton.setText("Masterclasses");
        masterclassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterclassButtonActionPerformed(evt);
            }
        });
        masterclassButton.setBounds(50, 120, 191, 29);
        jLayeredPane3.add(masterclassButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        contestantsButton.setText("Contestants");
        contestantsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contestantsButtonActionPerformed(evt);
            }
        });
        contestantsButton.setBounds(50, 60, 191, 29);
        jLayeredPane3.add(contestantsButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tournamentButton.setText("Tournaments");
        tournamentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tournamentButtonActionPerformed(evt);
            }
        });
        tournamentButton.setBounds(50, 90, 191, 29);
        jLayeredPane3.add(tournamentButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane3.setBounds(210, 130, 290, 210);
        jLayeredPane2.add(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Poker.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBounds(0, 0, 700, 450);
        jLayeredPane2.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void contestantsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contestantsButtonActionPerformed
        // Change to player menu
        MainFrame.mainFrame.setContentPane(MainFrame.mainFrame.playerMenu);
        MainFrame.mainFrame.setVisible(true);
    }//GEN-LAST:event_contestantsButtonActionPerformed

    private void tournamentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tournamentButtonActionPerformed
        // Change to toernooi menu
        MainFrame.mainFrame.setContentPane(MainFrame.mainFrame.toernooiMenu);
        MainFrame.mainFrame.setVisible(true);
    }//GEN-LAST:event_tournamentButtonActionPerformed

    private void masterclassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterclassButtonActionPerformed
        // Change to toernooi menu
        MainFrame.mainFrame.setContentPane(MainFrame.mainFrame.masterclassMenu);
        MainFrame.mainFrame.setVisible(true);
    }//GEN-LAST:event_masterclassButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton contestantsButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JButton masterclassButton;
    private javax.swing.JButton tournamentButton;
    // End of variables declaration//GEN-END:variables
}
