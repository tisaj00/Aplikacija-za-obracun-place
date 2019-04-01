/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tisaj.obracunplace.view;

import java.awt.Toolkit;
import java.text.DateFormat;
import tisaj.obracunplace.controller.ObradaRadnik;
import tisaj.obracunplace.model.Radnik;
import tisaj.obracunplace.pomocno.ObracunPlaceException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


/**
 *
 * @author Josip   
 */
public class Radnici extends javax.swing.JFrame {

    private ObradaRadnik obradaRadnik;
    private DecimalFormat format;
    private SimpleDateFormat datum;
    
    /**
     * Creates new form Radnik
     */
    public Radnici() {
        initComponents();
        obradaRadnik = new ObradaRadnik();
        
        ucitajRadnike();
        
        seticon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntitet = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIme = new javax.swing.JTextField();
        txtPrezime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtOib = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSpol = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMobitel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtOsnovica = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtOpcina = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        btnOčisti = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtIban = new javax.swing.JTextField();
        txtDatum = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Radnici");
        setAutoRequestFocus(false);

        lstEntitet.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntitet);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Ime");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Prezime");

        txtIme.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtPrezime.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Oib");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Spol");

        txtSpol.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Mobitel");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Datum rođenja");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Osnovica po satu");

        txtOsnovica.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Općina prebivališta");

        btnDodaj.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDodaj.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josip\\Documents\\NetBeansProjects\\NetBeans\\ObracunPlace_HibernateORM\\src\\tisaj\\obracunplace\\view\\image\\Button-Add-icon (1).png")); // NOI18N
        btnDodaj.setText("Dodaj");
        btnDodaj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDodajMouseEntered(evt);
            }
        });
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPromjeni.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josip\\Documents\\NetBeansProjects\\NetBeans\\ObracunPlace_HibernateORM\\src\\tisaj\\obracunplace\\view\\image\\Button-Refresh-icon.png")); // NOI18N
        btnPromjeni.setText("Promjeni");
        btnPromjeni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPromjeniMouseEntered(evt);
            }
        });
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnObrisi.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josip\\Documents\\NetBeansProjects\\NetBeans\\ObracunPlace_HibernateORM\\src\\tisaj\\obracunplace\\view\\image\\Button-Delete-icon.png")); // NOI18N
        btnObrisi.setText("Obriši");
        btnObrisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnObrisiMouseEntered(evt);
            }
        });
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

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("IBAN");

        txtDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSpol, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtOib, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(txtIban, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDodaj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPromjeni, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnOčisti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnObrisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtMobitel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txtOsnovica))
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(115, 115, 115)
                                .addComponent(jLabel2))
                            .addComponent(txtOpcina, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(102, 102, 102))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSpol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOsnovica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMobitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtOpcina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjeni)
                            .addComponent(btnObrisi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOčisti))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstEntitetValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetValueChanged
        if(evt.getValueIsAdjusting()){
            return;
        }
        
        Radnik r = lstEntitet.getSelectedValue();
        if(r==null){
            return;
        }
        
        DateFormat dt = new SimpleDateFormat("dd.MM.yyyy.");
        
        
        
        try {
            txtOib.setText((r.getOib()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        txtIme.setText(r.getIme());
        txtPrezime.setText(r.getPrezime());
        txtSpol.setText(r.getSpol());
        
        try {
            dt.parse(txtDatum.getDate());
            
            txtDatum.setDate(new String(dt.format(r.getDatumRodenja())));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        txtMobitel.setText((r.getMobitel()));
   
        try {
            txtOsnovica.setText((r.getOsnovicaPoSatu()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        txtOpcina.setText(r.getOpcinaPrebivaliste());
        
        try {
            txtIban.setText(r.getIban()); 
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        
        
    }//GEN-LAST:event_lstEntitetValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
       Radnik r = new Radnik();
      
       if(!kontrola(r)){
           return;
       }
       
       try {
            obradaRadnik.save(r);
        } catch (ObracunPlaceException e){
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return;
        }
        
        ucitajRadnike();
        ocistiPolja();
        
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        Radnik r = lstEntitet.getSelectedValue();
        
        if(r==null){
            return;
        }
        
        
        if(!kontrola(r)){
           return;
        }
        
        try {
            obradaRadnik.save(r);
        } catch (ObracunPlaceException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return;
        }
        
        ucitajRadnike();
        ocistiPolja();
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        Radnik r = lstEntitet.getSelectedValue();
        
        if(r==null){
            JOptionPane.showConfirmDialog(null, "Prvo odaberite radnika");
        }
        try {
            obradaRadnik.delete(r);
            ucitajRadnike();
            ocistiPolja();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null,"Radnik nije obrisan");
        }
        
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void btnOčistiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOčistiActionPerformed
        ocistiPolja();
    }//GEN-LAST:event_btnOčistiActionPerformed

    private void btnDodajMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDodajMouseEntered
        
    }//GEN-LAST:event_btnDodajMouseEntered

    private void btnObrisiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnObrisiMouseEntered
        
    }//GEN-LAST:event_btnObrisiMouseEntered

    private void btnPromjeniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPromjeniMouseEntered
        
    }//GEN-LAST:event_btnPromjeniMouseEntered

    private void txtDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatumActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnOčisti;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Radnik> lstEntitet;
    private org.jdesktop.swingx.JXDatePicker txtDatum;
    private javax.swing.JTextField txtIban;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtMobitel;
    private javax.swing.JTextField txtOib;
    private javax.swing.JTextField txtOpcina;
    private javax.swing.JTextField txtOsnovica;
    private javax.swing.JTextField txtPrezime;
    private javax.swing.JTextField txtSpol;
    // End of variables declaration//GEN-END:variables

    private void ucitajRadnike() {
        DefaultListModel<Radnik> r = new DefaultListModel<>();
        for(Radnik m : obradaRadnik.getLista()){
            r.addElement(m);
        }
        lstEntitet.setModel(r);
    }
    
    private void ocistiPolja() {
       txtIme.setText("");
       txtPrezime.setText("");
       txtSpol.setText("");
       txtMobitel.setText("");
       txtOib.setText("");
       txtOsnovica.setText("");
       txtOpcina.setText("");
       txtIban.setText("");
       txtDatum.setText("");
       
       
    }
    
    
    private boolean kontrola(Radnik r) {
         r.setIme(txtIme.getText());
         r.setPrezime(txtPrezime.getText());
        r.setSpol(txtSpol.getText());
                
        try {
            r.setMobitel(txtMobitel.getText());
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showConfirmDialog(null, "Mobitel nije broj");
            return false;
        }
        
        try {
            r.setOib((txtOib.getText()));
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showConfirmDialog(null, "Oib nije broj");
            return false;
        }
        SimpleDateFormat formatt = new SimpleDateFormat("dd.MM.YYYY.");
     
        try {
            r.setDatumRodenja(formatt.parse(txtDatum.getText()));
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showConfirmDialog(null, "Datum nije broj");
            return false;
        }
        
        r.setOsnovicaPoSatu(txtOsnovica.getText());
        r.setOpcinaPrebivaliste(txtOpcina.getText());
        r.setIban(txtIban.getText());
 
        return true;
    }

    private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("pocetna.png")));
    }
}
