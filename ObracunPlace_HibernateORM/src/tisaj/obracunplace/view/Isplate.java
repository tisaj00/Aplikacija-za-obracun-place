/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tisaj.obracunplace.view;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import tisaj.obracunplace.controller.ObradaIsplata;
import tisaj.obracunplace.model.Isplata;

import tisaj.obracunplace.pomocno.ObracunPlaceException;

/**
 *
 * @author Josip DODAT DATUM I SVE ZA DATUM
 *
 */
public class Isplate extends javax.swing.JFrame {

    private ObradaIsplata obradaEntitet;

    /**
     * Creates new form Isplate
     */
    public Isplate() {
        initComponents();
        obradaEntitet = new ObradaIsplata();
        ucitajIsplate();
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
        txtNaziv = new javax.swing.JTextField();
        txtVrsta = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        btnOčisti = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstEntiteti = new javax.swing.JList<>();
        dpDatumIsplate = new com.github.lgooddatepicker.components.DatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Isplate");

        jLabel1.setText("Naziv isplate");
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel2.setText("Vrsta isplate");
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel3.setText("Datum isplate");
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        btnDodaj.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josip\\Documents\\NetBeansProjects\\NetBeans\\ObracunPlace_HibernateORM\\src\\tisaj\\obracunplace\\view\\image\\Button-Add-icon (1).png")); // NOI18N
        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josip\\Documents\\NetBeansProjects\\NetBeans\\ObracunPlace_HibernateORM\\src\\tisaj\\obracunplace\\view\\image\\Button-Refresh-icon.png")); // NOI18N
        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josip\\Documents\\NetBeansProjects\\NetBeans\\ObracunPlace_HibernateORM\\src\\tisaj\\obracunplace\\view\\image\\Button-Delete-icon.png")); // NOI18N
        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        btnOčisti.setText("Očisti");
        btnOčisti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOčistiActionPerformed(evt);
            }
        });

        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstEntiteti);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dpDatumIsplate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnDodaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnPromjeni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addComponent(btnObrisi))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(150, 150, 150)
                                        .addComponent(btnOčisti, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel3))
                            .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtVrsta, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtVrsta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3))
                            .addComponent(dpDatumIsplate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPromjeni)
                            .addComponent(btnObrisi))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOčisti)
                            .addComponent(btnDodaj))
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        Isplata entitet = new Isplata();

        preuzmiVrijednosti(entitet);

        try {
            obradaEntitet.save(entitet);
        } catch (ObracunPlaceException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return;
        }

        ucitajIsplate();
        ocistiPolja();

    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        Isplata entitet = lstEntiteti.getSelectedValue();

        if (entitet == null) {
            JOptionPane.showConfirmDialog(null, "Prvo odaberite isplatu");
        }

        preuzmiVrijednosti(entitet);

        try {
            obradaEntitet.save(entitet);
        } catch (ObracunPlaceException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return;
        }

        ucitajIsplate();

        ocistiPolja();
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        Isplata entitet = lstEntiteti.getSelectedValue();

        if (entitet == null) {
            JOptionPane.showConfirmDialog(null, "Prvo odaberite isplatu");
        }

        try {
            obradaEntitet.delete(entitet);
            ucitajIsplate();
            ocistiPolja();
        } catch (ObracunPlaceException ex) {
            JOptionPane.showMessageDialog(null, "Ne mogu obrisati isplatu");
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void btnOčistiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOčistiActionPerformed
        ocistiPolja();
    }//GEN-LAST:event_btnOčistiActionPerformed

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        Isplata entitet = lstEntiteti.getSelectedValue();
        if (entitet == null) {
            return;
        }

        txtNaziv.setText(entitet.getNazivIsplate());
        txtVrsta.setText(entitet.getVrstaIsplate());

    }//GEN-LAST:event_lstEntitetiValueChanged

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnOčisti;
    private javax.swing.JButton btnPromjeni;
    private com.github.lgooddatepicker.components.DatePicker dpDatumIsplate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<Isplata> lstEntiteti;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JTextField txtVrsta;
    // End of variables declaration//GEN-END:variables

    private void ucitajIsplate() {
        DefaultListModel<Isplata> i = new DefaultListModel<>();
        for (Isplata m : obradaEntitet.getLista()) {
            i.addElement(m);
        }
        lstEntiteti.setModel(i);
    }
    private void ocistiPolja() {
        txtNaziv.setText("");
        txtVrsta.setText("");

    }

    private void preuzmiVrijednosti(Isplata entitet) {
        entitet.setNazivIsplate(txtNaziv.getText());
        entitet.setVrstaIsplate(txtVrsta.getText());

    }
}
