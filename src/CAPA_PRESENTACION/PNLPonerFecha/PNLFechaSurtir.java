/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAPA_PRESENTACION.PNLPonerFecha;


import static CAPA_PRESENTACION.EMPLEADO.PNLSurtirProducto.fechaselectS;
import CAPA_PRESENTACION.HILOS.TIPOS;
import java.awt.Image;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Freak
 * @version Beta
 */
public class PNLFechaSurtir extends javax.swing.JPanel {

    /**
     * Creates new form PNLFechaSurtir
     */
    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public PNLFechaSurtir() {
        modeloTabla = new DefaultTableModel(null, getColumnas()) {
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };
        initComponents();
        Date date = new Date();
        lblMes.setText(meses[date.getMonth()]);
        año = 1900 + date.getYear();
        iniciarCalendario(date.getMonth(), (1900 + date.getYear()));
        ponerIconos();
        String dat= "" + date.getDate();
        
        
        int C = modeloTabla.getColumnCount();
        int R = modeloTabla.getRowCount();
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                String valor = modeloTabla.getValueAt(r, c).toString();
                if (valor.equals("" + dat)) {
                    tablaFecha.changeSelection(r, c, false, false);
                    lblfecha.setText("" + año);
                }
            }
        }

    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Pintar columnas de la tabla">
    private String[] getColumnas() {
        String columnas[] = new String[]{"Do", "Lu", "Ma", "Mi", "Ju", "Vi", "Sá"};
        return columnas;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Se inicia llenado de calendario">
    private static void iniciarCalendario(int index, int año) {
        lblfecha.setText("" + año);
        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Date date = new Date("01-" + months[index] + "-" + año);
        
        ObtenerDias(date.getDay(), date.getMonth(), date.getYear());
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Obtener numero de dias">
    private static void ObtenerDias(int dia, int meses, int año) {
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dias = days[meses];
        int pos = 0;
        if (año % 4 == 0 && meses == 1) {
            dias = 29;
        }
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            modeloTabla.removeRow(i);
            i -= 1;
        }
        modeloTabla.addRow(new Object[]{"", "", "", "", "", "", ""});
        for (pos = 0; pos < 7; pos++) {
            if (dia == pos) {
                tablaFecha.setValueAt(1, 0, pos);
                pos = pos + 1;
                if (pos == 7) {
                    pos = 0;
                }
                llenarTabla(dias, pos);
                break;
            }
        }
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="LLenar la tabla">
    private static void llenarTabla(int dias, int P) {
        int p, c = 0, in = 2;
        if (P != 0) {
            for (int i = 2; i <= dias; i++) {
                tablaFecha.setValueAt(in++, c, P);
                P++;
                if (P == 7) {
                    P = 0;
                    c++;
                    modeloTabla.addRow(new Object[]{"", "", "", "", "", "", ""});
                }
            }
        } else {
            c = 1;
            modeloTabla.addRow(new Object[]{"", "", "", "", "", "", ""});
            for (int i = 2; i <= dias; i++) {
                tablaFecha.setValueAt(in++, c, P);
                P++;
                if (P == 7) {
                    P = 0;
                    c++;
                    modeloTabla.addRow(new Object[]{"", "", "", "", "", "", ""});
                }
            }
        }
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Poner iconos de next y back">

    private void ponerIconos() {
        iiD = new ImageIcon(getClass().getResource("/Imagenes/back.png"));
        Image img = iiD.getImage();
        Image ximg = img.getScaledInstance(30, 30, (int) CENTER_ALIGNMENT);
        ImageIcon ico = new ImageIcon(ximg);
        btnBack.setIcon(ico);
        iiE = new ImageIcon(getClass().getResource("/Imagenes/next.png"));
        Image imgE = iiE.getImage();
        Image ximgE = imgE.getScaledInstance(30, 30, (int) CENTER_ALIGNMENT);
        ImageIcon icoE = new ImageIcon(ximgE);
        btnNext.setIcon(icoE);
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Marcar fecha Edit">
    public static void MarcarFecha(String fecha){
        String fechaA[];
        fechaA=TIPOS.PonerFecha(fecha);
        int me =Integer.parseInt(fechaA[1]),Año=Integer.parseInt(fechaA[0]);
        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Date date = new Date(fechaA[2]+"-" + months[me-1] + "-" + fechaA[0]);
        String dat= "" + date.getDate();
        iniciarCalendario(me-1,Año);
        int C = modeloTabla.getColumnCount();
        int R = modeloTabla.getRowCount();
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                String valor = modeloTabla.getValueAt(r, c).toString();
                if (valor.equals("" + dat)) {
                    tablaFecha.changeSelection(r, c, false, false);
                    año=Integer.parseInt(fechaA[0]);
                    lblfecha.setText(año+"-"+meses[me-1]+"-"+fechaA[2]);
                }
            }
        }
        
    } 
    // </editor-fold>
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        lblMes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFecha = new javax.swing.JTable();
        lblfecha = new javax.swing.JLabel();

        btnBack.setMaximumSize(new java.awt.Dimension(589, 521));
        btnBack.setMinimumSize(new java.awt.Dimension(589, 521));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        lblMes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tablaFecha.setModel(modeloTabla);
        tablaFecha.setCellSelectionEnabled(true);
        tablaFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaFechaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaFecha);

        lblfecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfecha.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMes, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblfecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // <editor-fold defaultstate="collapsed" desc="Accion del btn Back">
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        int mes = 0;
        for (int i = 0; i < meses.length; i++) {
            if (meses[i].equals(lblMes.getText())) {
                mes = i;
            }
        }
        if (mes == 0) {
            mes = 11;
            lblMes.setText(meses[mes]);
            año = año - 1;
        } else {
            mes = mes - 1;
            lblMes.setText(meses[mes]);

        }
        iniciarCalendario(mes, año);
    }//GEN-LAST:event_btnBackActionPerformed
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Accion btn Next">
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:

        int mes = 0;
        for (int i = 0; i < meses.length; i++) {
            if (meses[i].equals(lblMes.getText())) {
                mes = i;
            }
        }
        if (mes == 11) {
            mes = 0;
            lblMes.setText(meses[mes]);
            año = año + 1;
        } else {
            mes = mes + 1;
            lblMes.setText(meses[mes]);
        }
        iniciarCalendario(mes, año);
    }//GEN-LAST:event_btnNextActionPerformed
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Accion de la tabla">
    private void tablaFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFechaMouseClicked
        // TODO add your handling code here:
        int colum = tablaFecha.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / tablaFecha.getRowHeight();
        String valor = modeloTabla.getValueAt(row, colum).toString();
        if (!valor.equals("")) {
            int mes = 0;
            for (int i = 0; i < meses.length; i++) {
                if (lblMes.getText().equals(meses[i])) {
                    mes = i + 1;
                }
            }
            lblfecha.setText(valor + "-" + lblMes.getText() + "-" + año);

                fechaselectS(año + "-" + mes + "-" + valor);

        }
    }//GEN-LAST:event_tablaFechaMouseClicked
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Declaracion de variables">
    private ImageIcon iiD, iiE;
    private static int año;
    public static DefaultTableModel modeloTabla;
    private static String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubrer", "Noviembre", "Diciembre"};
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNext;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMes;
    private static javax.swing.JLabel lblfecha;
    private static javax.swing.JTable tablaFecha;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
