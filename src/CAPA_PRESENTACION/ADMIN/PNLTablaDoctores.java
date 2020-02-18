/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAPA_PRESENTACION.ADMIN;

import CAPA_NEGOCIOS.DOCTOR;
import CAPA_PRESENTACION.HILOS.Reader;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Image;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static CAPA_PRESENTACION.ADMIN.PNLRegistrarDoctor.txtnbDoctor;
import static CAPA_PRESENTACION.ADMIN.PNLRegistrarDoctor.txtappDoctor;
import static CAPA_PRESENTACION.ADMIN.PNLRegistrarDoctor.txtapmDoctor;
import static CAPA_PRESENTACION.ADMIN.PNLRegistrarDoctor.cmbTurno;
import static CAPA_PRESENTACION.ADMIN.PNLRegistrarDoctor.cbxLunes;
import static CAPA_PRESENTACION.ADMIN.PNLRegistrarDoctor.cbxMartes;
import static CAPA_PRESENTACION.ADMIN.PNLRegistrarDoctor.cbxMiercoles;
import static CAPA_PRESENTACION.ADMIN.PNLRegistrarDoctor.cbxJueves;
import static CAPA_PRESENTACION.ADMIN.PNLRegistrarDoctor.cbxViernes;
import static CAPA_PRESENTACION.ADMIN.PNLRegistrarDoctor.cbxSabado;
import static CAPA_PRESENTACION.ADMIN.PNLRegistrarDoctor.cbxDomingo;
import static CAPA_PRESENTACION.ADMIN.PNLRegistrarDoctor.Limpiar;
import java.util.StringTokenizer;

/**
 *
 * @author Freak
 * @version Beta
 */
public final class PNLTablaDoctores extends javax.swing.JPanel {

    /**
     * Creates new form PNLTablaDoctores
     */
    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public PNLTablaDoctores() {
        modeloTabla=new DefaultTableModel(null,getColumnas()){
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };
        initComponents();
        Doctor.setFilasDoctor(modeloTabla);
        //
        tablaDoctores.setDefaultRenderer(Object.class,new Reader());
        deletebtn();
        editbtn();
        for(int i=0;i<modeloTabla.getRowCount();i++){
            modeloTabla.setValueAt(btnEditar, i, 5);   
        }
        for(int i=0;i<modeloTabla.getRowCount();i++){
            modeloTabla.setValueAt(btnBorrar, i, 6);   
        }
        tablaDoctores.setRowHeight(30);
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Editor de Botnones">
    public void deletebtn(){
        iiD=new ImageIcon(getClass().getResource("/Imagenes/delete.png"));
        Image img= iiD.getImage();
        Image ximg= img.getScaledInstance(30, 30, (int) CENTER_ALIGNMENT);
        ImageIcon ico= new ImageIcon(ximg);
        btnBorrar.setIcon(ico);
    }   
    public void editbtn(){
        iiE=new ImageIcon(getClass().getResource("/Imagenes/Edit.png"));
        Image img= iiE.getImage();
        Image ximg= img.getScaledInstance(30, 30, (int) CENTER_ALIGNMENT);
        ImageIcon ico= new ImageIcon(ximg);
        btnEditar.setIcon(ico);
    }// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Pinta Columnas de la tabla">
    private String[] getColumnas(){
        String columnas[]=new String[]{"Nombre","Apellido P","Apellido M","Turno","Dias laborales","Editar","Borrar"};
        return columnas;
    }// </editor-fold>
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTablaDoctores = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDoctores = new javax.swing.JTable();

        txtTablaDoctores.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtTablaDoctores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTablaDoctores.setText("Empleados doctores");
        txtTablaDoctores.setToolTipText("");
        txtTablaDoctores.setAlignmentY(0.0F);

        tablaDoctores.setModel(modeloTabla);
        tablaDoctores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDoctoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDoctores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                    .addComponent(txtTablaDoctores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTablaDoctores, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // <editor-fold defaultstate="collapsed" desc="Accion botones tabla">
    private void tablaDoctoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDoctoresMouseClicked
        // TODO add your handling code here:
        int colum=tablaDoctores.getColumnModel().getColumnIndexAtX(evt.getX());
        int row=evt.getY()/tablaDoctores.getRowHeight();
        
        if(row <modeloTabla.getRowCount() && row>=0 &&colum<modeloTabla.getColumnCount()&&colum>=5){
            Object value= modeloTabla.getValueAt(0, 6);
            if(value instanceof JButton){
                ((JButton)value).doClick();
                JButton btn=(JButton)value;
                if(colum==5){
                    int respuesta=JOptionPane.showConfirmDialog(null, "¿Deseas editar doctor?");
                    if(JOptionPane.OK_OPTION==respuesta){
                        Limpiar();
                        txtnbDoctor.setText(modeloTabla.getValueAt(row, 0).toString());
                        txtappDoctor.setText(modeloTabla.getValueAt(row, 1).toString());
                        txtapmDoctor.setText(modeloTabla.getValueAt(row, 2).toString());
                        cmbTurno.setSelectedItem(modeloTabla.getValueAt(row, 3).toString());
                        checkDias(modeloTabla.getValueAt(row, 4).toString());
                        idDoctor=Doctor.RegistrarDias(txtnbDoctor.getText(),txtappDoctor.getText(), 
                            txtapmDoctor.getText(), (String)cmbTurno.getSelectedItem());
                    }
                }
                if(colum==6){
                    int respuesta=JOptionPane.showConfirmDialog(null, "¿Deseas doctor?");
                    if(JOptionPane.OK_OPTION==respuesta){
                        idDoctor=Doctor.RegistrarDias(modeloTabla.getValueAt(row, 0).toString(),
                                modeloTabla.getValueAt(row, 1).toString(),
                                modeloTabla.getValueAt(row, 2).toString(), 
                                modeloTabla.getValueAt(row, 3).toString());
                        if(Doctor.DeleteDoctor(idDoctor)){
                            JOptionPane.showMessageDialog(this, "Empleado eliminado",
                                "Eliminado", JOptionPane.INFORMATION_MESSAGE);
                            deleteTabla();
                            Limpiar();
                        }else{
                            JOptionPane.showMessageDialog(this, "Error al eliminar empleado",
                                "Error al guardar", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_tablaDoctoresMouseClicked
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Actualizar tabla">
    public void deleteTabla(){
        
        btnEditar=new JButton();
        btnBorrar=new JButton();
        Doctor.setFilasDoctor(modeloTabla);
        btnBorrar.setName("Delete");
        btnEditar.setName("Editar");
        for(int i=0;i<modeloTabla.getRowCount();i++){
            modeloTabla.setValueAt(btnEditar, i, 5);   
        }
        for(int i=0;i<modeloTabla.getRowCount();i++){
            modeloTabla.setValueAt(btnBorrar, i, 6);   
        }
        deletebtn();
        editbtn();
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Checkar los dias">
    private void checkDias(String dias){
        StringTokenizer st = new StringTokenizer(dias,",");
        while (st.hasMoreTokens()){
            switch(st.nextToken()){
                case "L":
                    cbxLunes.setSelected(true);
                    break;
                case "Ma":
                    cbxMartes.setSelected(true);
                    break;
                case "Mi":
                    cbxMiercoles.setSelected(true);
                    break;
                case "J":
                    cbxJueves.setSelected(true);
                    break;
                case "V":
                    cbxViernes.setSelected(true);
                    break;
                case "S":
                    cbxSabado.setSelected(true);
                    break;
                case "D":
                    cbxDomingo.setSelected(true);
                    break;
            }
        }
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Declaracion de variables">
    private static final CAPA_NEGOCIOS.DOCTOR Doctor = new DOCTOR();
    public static DefaultTableModel modeloTabla;
    public static JButton btnEditar=new JButton();
    public static JButton btnBorrar=new JButton();
    public static int idDoctor;
    public ImageIcon iiD,iiE;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDoctores;
    private javax.swing.JLabel txtTablaDoctores;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}