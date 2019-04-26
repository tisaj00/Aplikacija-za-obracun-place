/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tisaj.obracunplace.view;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import tisaj.obracunplace.controller.ObradaVrstaPrimanja;
import tisaj.obracunplace.model.VrstaPrimanja;
import tisaj.obracunplace.pomocno.ObracunPlaceException;

/**
 *
 * @author Josip
 */
public class VrstePrimanja extends javax.swing.JFrame {

    private ObradaVrstaPrimanja obradaVrstaPrimanja;
    private DecimalFormat format;

    /**
     * Creates new form VrstePrimanja
     */
    public VrstePrimanja() {
        initComponents();
        obradaVrstaPrimanja = new ObradaVrstaPrimanja();
        NumberFormat nf = NumberFormat.getInstance(
                new Locale("hr")
        );
        format = (DecimalFormat) nf;
        format.applyPattern(".00");
        ucitajVrstePrimanja();
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
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        txtVrsta = new javax.swing.JTextField();
        txtKoeficijent = new javax.swing.JTextField();
        btnObrisi = new javax.swing.JButton();
        btnOčisti = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstEntiteti = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Naziv vrste primanja");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Koeficijent");

        btnDodaj.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDodaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tisaj/obracunplace/pomocno/Button-Add-icon (1).png"))); // NOI18N
        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPromjeni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tisaj/obracunplace/pomocno/Button-Refresh-icon.png"))); // NOI18N
        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        txtKoeficijent.setText("0");

        btnObrisi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnObrisi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tisaj/obracunplace/pomocno/Button-Delete-icon.png"))); // NOI18N
        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        btnOčisti.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtVrsta, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtKoeficijent, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPromjeni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnObrisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOčisti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtVrsta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtKoeficijent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnObrisi)
                            .addComponent(btnPromjeni)
                            .addComponent(btnDodaj))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOčisti, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        VrstaPrimanja entitet = new VrstaPrimanja();

        preuzmiVrijednosti(entitet);

        try {
            obradaVrstaPrimanja.save(entitet);
        } catch (ObracunPlaceException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return;
        }

        ucitajVrstePrimanja();
        ocistiPolja();

    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        VrstaPrimanja entitet = lstEntiteti.getSelectedValue();

        if (entitet == null) {
            JOptionPane.showConfirmDialog(null, "Prvo odaberite vrstu primanja");
        }

        preuzmiVrijednosti(entitet);

        try {
            obradaVrstaPrimanja.save(entitet);
        } catch (ObracunPlaceException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return;
        }

        ucitajVrstePrimanja();

        ocistiPolja();
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        VrstaPrimanja entitet = lstEntiteti.getSelectedValue();

        if (entitet == null) {
            JOptionPane.showConfirmDialog(null, "Prvo odaberite vrstu primanja");
        }

        try {
            obradaVrstaPrimanja.delete(entitet);
            ucitajVrstePrimanja();
            ocistiPolja();
        } catch (ObracunPlaceException ex) {
            JOptionPane.showMessageDialog(null, "Ne mogu obrisati");
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void btnOčistiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOčistiActionPerformed
        ocistiPolja();
    }//GEN-LAST:event_btnOčistiActionPerformed

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        VrstaPrimanja entitet = lstEntiteti.getSelectedValue();
        if (entitet == null) {
            return;
        }

        txtVrsta.setText(entitet.getNazivVrstePrimanja());
        txtKoeficijent.setText(format.format(entitet.getKoeficijent()));

    }//GEN-LAST:event_lstEntitetiValueChanged

    private void ocistiPolja() {
        txtKoeficijent.setText("0");
        txtVrsta.setText("");

    }

    private void preuzmiVrijednosti(VrstaPrimanja entitet) {

        try {
            entitet.setKoeficijent(new BigDecimal(
                    format.parse(txtKoeficijent.getText()).floatValue()
            )
            );
        } catch (Exception e) {
            e.printStackTrace();
        }

        entitet.setNazivVrstePrimanja(txtVrsta.getText());

    }

    private void ucitajVrstePrimanja() {
        DefaultListModel<VrstaPrimanja> m = new DefaultListModel<>();
        for (VrstaPrimanja vp : obradaVrstaPrimanja.getLista()) {
            m.addElement(vp);
        }
        lstEntiteti.setModel(m);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnOčisti;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<VrstaPrimanja> lstEntiteti;
    private javax.swing.JTextField txtKoeficijent;
    private javax.swing.JTextField txtVrsta;
    // End of variables declaration//GEN-END:variables
}
