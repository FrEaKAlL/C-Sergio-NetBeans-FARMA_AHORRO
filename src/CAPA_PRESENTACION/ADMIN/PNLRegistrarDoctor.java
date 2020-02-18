/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAPA_PRESENTACION.ADMIN;

import CAPA_NEGOCIOS.DOCTOR;
import CAPA_PRESENTACION.HILOS.TIPOS;
import javax.swing.JOptionPane;
import static CAPA_PRESENTACION.ADMIN.PNLTablaDoctores.idDoctor;
/**
 *
 * @author Freak
 * @version Beta
 */
public class PNLRegistrarDoctor extends javax.swing.JPanel {

    /**
     * Creates new form PNLRegistrarDoctor
     */
    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public PNLRegistrarDoctor() {
        initComponents();
    }// </editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtRegistrarDoctor = new javax.swing.JLabel();
        pnlBordeNegro = new javax.swing.JPanel();
        lblnbDoctor = new javax.swing.JLabel();
        lblappDoctor = new javax.swing.JLabel();
        lblapmDoctor = new javax.swing.JLabel();
        btnCancelarD = new javax.swing.JButton();
        lblturno = new javax.swing.JLabel();
        lbldiasLaborales = new javax.swing.JLabel();
        txtnbDoctor = new javax.swing.JTextField();
        txtappDoctor = new javax.swing.JTextField();
        txtapmDoctor = new javax.swing.JTextField();
        btnRegistrarD = new javax.swing.JButton();
        cbxLunes = new javax.swing.JCheckBox();
        cbxMartes = new javax.swing.JCheckBox();
        cbxJueves = new javax.swing.JCheckBox();
        cbxViernes = new javax.swing.JCheckBox();
        cbxMiercoles = new javax.swing.JCheckBox();
        cbxSabado = new javax.swing.JCheckBox();
        cbxDomingo = new javax.swing.JCheckBox();
        cmbTurno = new javax.swing.JComboBox();

        txtRegistrarDoctor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtRegistrarDoctor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtRegistrarDoctor.setText("Registar doctor");
        txtRegistrarDoctor.setToolTipText("");
        txtRegistrarDoctor.setAlignmentY(0.0F);

        pnlBordeNegro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblnbDoctor.setText("Nombre");

        lblappDoctor.setText("Apellido Paterno");

        lblapmDoctor.setText("Apellido Materno");

        btnCancelarD.setText("CANCELAR");
        btnCancelarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarDActionPerformed(evt);
            }
        });

        lblturno.setText("Turno");

        lbldiasLaborales.setText("Dias laborales");

        btnRegistrarD.setText("REGISTRAR");
        btnRegistrarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDActionPerformed(evt);
            }
        });

        cbxLunes.setText("Lunes");
        cbxLunes.setName("0"); // NOI18N

        cbxMartes.setText("Martes");
        cbxMartes.setName("1"); // NOI18N

        cbxJueves.setText("Jueves");
        cbxJueves.setName("3"); // NOI18N

        cbxViernes.setText("Viernes");
        cbxViernes.setName("4"); // NOI18N

        cbxMiercoles.setText("Miercoles");
        cbxMiercoles.setName("2"); // NOI18N

        cbxSabado.setText("Sabado");
        cbxSabado.setName("5"); // NOI18N

        cbxDomingo.setText("Domingo");
        cbxDomingo.setName("6"); // NOI18N

        cmbTurno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Turno--", "Matutino", "Vespertino" }));

        javax.swing.GroupLayout pnlBordeNegroLayout = new javax.swing.GroupLayout(pnlBordeNegro);
        pnlBordeNegro.setLayout(pnlBordeNegroLayout);
        pnlBordeNegroLayout.setHorizontalGroup(
            pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBordeNegroLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbldiasLaborales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblappDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblapmDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblturno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblnbDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelarD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtapmDoctor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtappDoctor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtnbDoctor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegistrarD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlBordeNegroLayout.createSequentialGroup()
                        .addGroup(pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxJueves, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxLunes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxMartes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxViernes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxDomingo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxMiercoles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxSabado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(cmbTurno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70))
        );
        pnlBordeNegroLayout.setVerticalGroup(
            pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBordeNegroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblnbDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnbDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblappDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtappDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblapmDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtapmDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblturno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbldiasLaborales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cbxMartes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(cbxDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarD, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(btnRegistrarD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRegistrarDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBordeNegro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtRegistrarDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlBordeNegro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // <editor-fold defaultstate="collapsed" desc="Btn Cancelar">
    private void btnCancelarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarDActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_btnCancelarDActionPerformed
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Btn Regristrar">
    private void btnRegistrarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDActionPerformed
        // TODO add your handling code here:
        String nbDoctor=TIPOS.clearEspacios(txtnbDoctor.getText());
        String appDoctor=TIPOS.clearEspacios(txtappDoctor.getText());
        String apmDoctor=TIPOS.clearEspacios(txtapmDoctor.getText());
        String turno=null;
        if(cmbTurno.getSelectedIndex()!=0){
            turno = (String) cmbTurno.getSelectedItem();
        
        Doctor = new DOCTOR();
        int []Dias=verdias();
        if(Doctor.RegistrarDoctor(nbDoctor, appDoctor, apmDoctor, turno, idDoctor)){
            if(idDoctor!=0){
                Doctor.RegistrarDiasDoctor(Dias, idDoctor,"U");
            }else{
                Doctor.RegistrarDiasDoctor(Dias, Doctor.RegistrarDias(nbDoctor,appDoctor, 
                    apmDoctor, turno),"A");
            }
            
            JOptionPane.showMessageDialog(this, "Guardado",
                    "Guardado", JOptionPane.INFORMATION_MESSAGE);
            pNLTAblaDoctores.deleteTabla();
            pNLTAblaDoctores.deletebtn();
            pNLTAblaDoctores.editbtn();
            Limpiar();
        }else{
            JOptionPane.showMessageDialog(this, "No se pudo guardar",
                    "Error al guardar", JOptionPane.ERROR_MESSAGE);
        }
        } else {
            JOptionPane.showMessageDialog(this, "Campo Turno faltante",
                                "Requiere", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarDActionPerformed
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Dias laborales">
    private int[] verdias(){
        int cot=0;
        if(cbxLunes.isSelected()){
            cot++;
        }
        if(cbxMartes.isSelected()){
            cot++;
        }
        if(cbxMiercoles.isSelected()){
            cot++;
        }
        if(cbxJueves.isSelected()){
            cot++;
        }
        if(cbxViernes.isSelected()){
            cot++;
        }
        if(cbxSabado.isSelected()){
            cot++;
        }
        if(cbxDomingo.isSelected()){
            cot++;
        }
        int []dias=new int[cot];
        cot=0;
        if(cbxLunes.isSelected()){
            dias[cot]=0;
            cot++;
        }
        if(cbxMartes.isSelected()){
            dias[cot]=1;
            cot++;
        }
        if(cbxMiercoles.isSelected()){
            dias[cot]=2;
            cot++;
        }
        if(cbxJueves.isSelected()){
            dias[cot]=3;
            cot++;
        }
        if(cbxViernes.isSelected()){
            dias[cot]=4;
            cot++;
        }
        if(cbxSabado.isSelected()){
            dias[cot]=5;
            cot++;
        }
        if(cbxDomingo.isSelected()){
            dias[cot]=6;
            cot++;
        }
        return dias;
    }// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Limpiar">
    public static void Limpiar(){
        txtnbDoctor.setText("");
        txtappDoctor.setText("");
        txtapmDoctor.setText("");
        cmbTurno.setSelectedIndex(0);
        cbxLunes.setSelected(false);
        cbxMartes.setSelected(false);
        cbxMiercoles.setSelected(false);
        cbxJueves.setSelected(false);
        cbxViernes.setSelected(false);
        cbxSabado.setSelected(false);
        cbxDomingo.setSelected(false);
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Delaracion de varaiables">
    public static CAPA_NEGOCIOS.DOCTOR Doctor;
    public static CAPA_PRESENTACION.ADMIN.PNLTablaDoctores pNLTAblaDoctores=new PNLTablaDoctores();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarD;
    private javax.swing.JButton btnRegistrarD;
    public static javax.swing.JCheckBox cbxDomingo;
    public static javax.swing.JCheckBox cbxJueves;
    public static javax.swing.JCheckBox cbxLunes;
    public static javax.swing.JCheckBox cbxMartes;
    public static javax.swing.JCheckBox cbxMiercoles;
    public static javax.swing.JCheckBox cbxSabado;
    public static javax.swing.JCheckBox cbxViernes;
    public static javax.swing.JComboBox cmbTurno;
    private javax.swing.JLabel lblapmDoctor;
    private javax.swing.JLabel lblappDoctor;
    private javax.swing.JLabel lbldiasLaborales;
    private javax.swing.JLabel lblnbDoctor;
    private javax.swing.JLabel lblturno;
    private javax.swing.JPanel pnlBordeNegro;
    private javax.swing.JLabel txtRegistrarDoctor;
    public static javax.swing.JTextField txtapmDoctor;
    public static javax.swing.JTextField txtappDoctor;
    public static javax.swing.JTextField txtnbDoctor;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}