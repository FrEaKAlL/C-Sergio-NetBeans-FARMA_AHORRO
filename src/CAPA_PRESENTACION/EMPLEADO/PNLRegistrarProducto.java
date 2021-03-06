/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAPA_PRESENTACION.EMPLEADO;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;




/**
 *
 * @author Freak
 * @version Beta
 */
public class PNLRegistrarProducto extends javax.swing.JPanel {

    /**
     * Creates new form PNLRegistrarProducto
     */
    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public PNLRegistrarProducto() {
        initComponents();
        Producto= new CAPA_NEGOCIOS.PRODUCTO();
        pNLFechaRegistrar.setVisible(false);
        txtmlgProducto.setVisible(false);
        lblmlgProducto.setVisible(false);
        Producto.Tipo_Producto(cbxTipoProducto);
        Producto.Tipo_Venta_Producto(cbxTipoVentaProducto);
        cbxTipoProducto.addActionListener(new ActionListener(){
            @Override 
            public void actionPerformed(ActionEvent e){
                if("Tabletas".equals(cbxTipoProducto.getSelectedItem().toString())){
                    txtmlgProducto.setVisible(true);
                    lblmlgProducto.setVisible(true);
                    txtmlgProducto.setText("");
                }else{
                    txtmlgProducto.setVisible(false);
                    lblmlgProducto.setVisible(false);
                    txtmlgProducto.setText("0");
                }
            }
        });
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

        txtRegistrarProducto = new javax.swing.JLabel();
        pnlBordeNegro = new javax.swing.JPanel();
        pnlPasoUno = new javax.swing.JPanel();
        lblpreProducto = new javax.swing.JLabel();
        txtmlgProducto = new javax.swing.JTextField();
        lblmlgProducto = new javax.swing.JLabel();
        lblidTipoProducto = new javax.swing.JLabel();
        cbxTipoProducto = new javax.swing.JComboBox();
        txtfrmProducto = new javax.swing.JTextField();
        lblfrmProducto = new javax.swing.JLabel();
        pNLFechaRegistrar = new CAPA_PRESENTACION.PNLPonerFecha.PNLFechaRegistrar();
        lblfcadProducto = new javax.swing.JLabel();
        lblnbProducto = new javax.swing.JLabel();
        txtnbProducto = new javax.swing.JTextField();
        txtcodBarras = new javax.swing.JTextField();
        lblcodBarras = new javax.swing.JLabel();
        txtfcadProducto = new javax.swing.JFormattedTextField();
        txtpreProducto = new javax.swing.JFormattedTextField();
        pnlPasoDos = new javax.swing.JPanel();
        lbldecProducto = new javax.swing.JLabel();
        lblcatProducto = new javax.swing.JLabel();
        txtnbProveedor = new javax.swing.JTextField();
        lblnbProveedor = new javax.swing.JLabel();
        lblubProducto = new javax.swing.JLabel();
        cbxTipoVentaProducto = new javax.swing.JComboBox();
        lblidTipoVenta = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txadecProducto = new javax.swing.JTextArea();
        txtubProducto = new javax.swing.JTextField();
        btnGuardarPrducto = new javax.swing.JButton();
        txtcatProducto = new javax.swing.JFormattedTextField();

        txtRegistrarProducto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtRegistrarProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtRegistrarProducto.setText("Registar producto");
        txtRegistrarProducto.setToolTipText("");
        txtRegistrarProducto.setAlignmentY(0.0F);

        pnlBordeNegro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblpreProducto.setText("Precio por pieza");

        lblmlgProducto.setText("Miligramos");

        lblidTipoProducto.setText("Tipo de Producto");

        lblfrmProducto.setText("Formula");

        pNLFechaRegistrar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pNLFechaRegistrarFocusLost(evt);
            }
        });

        lblfcadProducto.setText("Fecha de caducidad");

        lblnbProducto.setText("Nombre del producto");

        txtcodBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodBarrasActionPerformed(evt);
            }
        });
        txtcodBarras.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcodBarrasFocusLost(evt);
            }
        });

        lblcodBarras.setText("Codigo de barras");

        txtfcadProducto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-M-d"))));
        txtfcadProducto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfcadProductoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfcadProductoFocusLost(evt);
            }
        });

        txtpreProducto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtpreProducto.setText("$");

        javax.swing.GroupLayout pnlPasoUnoLayout = new javax.swing.GroupLayout(pnlPasoUno);
        pnlPasoUno.setLayout(pnlPasoUnoLayout);
        pnlPasoUnoLayout.setHorizontalGroup(
            pnlPasoUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPasoUnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPasoUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfcadProducto)
                    .addComponent(lblidTipoProducto)
                    .addComponent(lblmlgProducto)
                    .addComponent(lblpreProducto)
                    .addComponent(lblcodBarras)
                    .addComponent(lblfrmProducto)
                    .addComponent(lblnbProducto))
                .addGap(30, 30, 30)
                .addGroup(pnlPasoUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfrmProducto)
                    .addComponent(cbxTipoProducto, 0, 241, Short.MAX_VALUE)
                    .addComponent(txtmlgProducto)
                    .addComponent(txtnbProducto)
                    .addComponent(txtcodBarras)
                    .addComponent(txtfcadProducto)
                    .addGroup(pnlPasoUnoLayout.createSequentialGroup()
                        .addComponent(pNLFechaRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtpreProducto))
                .addContainerGap())
        );
        pnlPasoUnoLayout.setVerticalGroup(
            pnlPasoUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPasoUnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPasoUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPasoUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPasoUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfcadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfcadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pNLFechaRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(pnlPasoUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfrmProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfrmProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPasoUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblidTipoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPasoUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmlgProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmlgProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPasoUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblpreProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtpreProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbldecProducto.setText("Descripcion");

        lblcatProducto.setText("Cantidad");

        lblnbProveedor.setText("Proveedor");

        lblubProducto.setText("Ubicacion");

        lblidTipoVenta.setText("Tipo de venta");

        txadecProducto.setColumns(10);
        txadecProducto.setRows(5);
        txadecProducto.setAutoscrolls(false);
        jScrollPane2.setViewportView(txadecProducto);

        btnGuardarPrducto.setText("GUARDAR");
        btnGuardarPrducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPrductoActionPerformed(evt);
            }
        });

        txtcatProducto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout pnlPasoDosLayout = new javax.swing.GroupLayout(pnlPasoDos);
        pnlPasoDos.setLayout(pnlPasoDosLayout);
        pnlPasoDosLayout.setHorizontalGroup(
            pnlPasoDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPasoDosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPasoDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnbProveedor)
                    .addComponent(lblcatProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblubProducto)
                    .addComponent(lbldecProducto)
                    .addComponent(lblidTipoVenta))
                .addGap(30, 30, 30)
                .addGroup(pnlPasoDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxTipoVentaProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(txtubProducto)
                    .addComponent(txtnbProveedor)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPasoDosLayout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(btnGuardarPrducto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtcatProducto))
                .addContainerGap())
        );
        pnlPasoDosLayout.setVerticalGroup(
            pnlPasoDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPasoDosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPasoDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTipoVentaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblidTipoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPasoDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblubProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtubProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPasoDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPasoDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcatProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcatProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPasoDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPasoDosLayout.createSequentialGroup()
                        .addComponent(lbldecProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addComponent(btnGuardarPrducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlBordeNegroLayout = new javax.swing.GroupLayout(pnlBordeNegro);
        pnlBordeNegro.setLayout(pnlBordeNegroLayout);
        pnlBordeNegroLayout.setHorizontalGroup(
            pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBordeNegroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPasoUno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlPasoDos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBordeNegroLayout.setVerticalGroup(
            pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBordeNegroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPasoUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlPasoDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRegistrarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                    .addComponent(pnlBordeNegro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtRegistrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlBordeNegro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // <editor-fold defaultstate="collapsed" desc="Cerrar calendario">
    private void pNLFechaRegistrarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pNLFechaRegistrarFocusLost
        // TODO add your handling code here:
        pNLFechaRegistrar.setVisible(false);
    }//GEN-LAST:event_pNLFechaRegistrarFocusLost

   // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Accion del btn Guardar">
    private void btnGuardarPrductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPrductoActionPerformed
        // TODO add your handling code here:
        if(!txtcodBarras.getText().equals("") && !txtnbProducto.getText().equals("")
                && !txtfcadProducto.getText().equals("") && !txtfrmProducto.getText().equals("")
                && !txtpreProducto.getText().equals("$") && !txtcatProducto.getText().equals("")
                && !txtmlgProducto.getText().equals("") && cbxTipoProducto.getSelectedIndex()!=0
                && cbxTipoVentaProducto.getSelectedIndex()!=0 && !txtnbProveedor.getText().equals("")){
            lblcodBarras.setForeground(Color.black);
            lblnbProducto.setForeground(Color.black);
            lblfcadProducto.setForeground(Color.black);
            lblfrmProducto.setForeground(Color.black);
            lblpreProducto.setForeground(Color.black);
            lblcatProducto.setForeground(Color.black);
            lblmlgProducto.setForeground(Color.black);
            lblidTipoProducto.setForeground(Color.black);
            lblidTipoVenta.setForeground(Color.black);
            lblnbProveedor.setForeground(Color.black);
            if(Producto.GuardarProducto(txtcodBarras.getText().trim(),txtnbProveedor.getText().trim(), txtfcadProducto.getText().trim(),
                    txtnbProducto.getText().trim(), txtfrmProducto.getText().trim(),cbxTipoProducto.getSelectedIndex(),
                    txtmlgProducto.getText().trim(),Float.parseFloat(""+txtpreProducto.getValue()),
                    txtubProducto.getText().trim(),cbxTipoVentaProducto.getSelectedIndex(),Integer.parseInt(""+txtcatProducto.getValue()),
                    txadecProducto.getText().trim())){
                JOptionPane.showMessageDialog(this, "Guardado",
                    "Guardado", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "No se pudo guardar",
                    "Error al guardar", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Proporcione datos requeridos",
                    "Error al guardar", JOptionPane.ERROR_MESSAGE);
            datosfaltantes();
            this.repaint();
            
        }
    }//GEN-LAST:event_btnGuardarPrductoActionPerformed
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Abrir fecha gana foco">
    private void txtfcadProductoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfcadProductoFocusGained
        // TODO add your handling code here:
        pNLFechaRegistrar.setVisible(true);
    }//GEN-LAST:event_txtfcadProductoFocusGained
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Perdiendo foco de fecha">
    private void txtfcadProductoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfcadProductoFocusLost
        // TODO add your handling code here:
        pNLFechaRegistrar.setVisible(false);
    }//GEN-LAST:event_txtfcadProductoFocusLost
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Checar si producto existe">
    private void txtcodBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodBarrasActionPerformed
        // TODO add your handling code here:
        String []ProductoD;
        ProductoD=Producto.BuscarProducto(txtcodBarras.getText(), true);
        if(!ProductoD[0].equals("")){
            txtcodBarras.setText("");
            JOptionPane.showMessageDialog(this, "El producto ya existe",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtcodBarrasActionPerformed

    private void txtcodBarrasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcodBarrasFocusLost
        // TODO add your handling code here:
        String []ProductoD;
        ProductoD=Producto.BuscarProducto(txtcodBarras.getText(), true);
        if(!ProductoD[0].equals("")){
            txtcodBarras.setText("");
            JOptionPane.showMessageDialog(this, "El producto ya existe",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtcodBarrasFocusLost
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Datos faltantes">
    private void datosfaltantes(){
        if(txtcodBarras.getText().equals("")){
            lblcodBarras.setForeground(Color.red);
        }else{
            lblcodBarras.setForeground(Color.black);
        }
        if(txtnbProducto.getText().equals("")){
            lblnbProducto.setForeground(Color.red);
        }else{
            lblnbProducto.setForeground(Color.black);
        }
        if(txtfcadProducto.getText().equals("")){
            lblfcadProducto.setForeground(Color.red);
        }else{
            lblfcadProducto.setForeground(Color.black);
        }
        if(txtfrmProducto.getText().equals("")){
            lblfrmProducto.setForeground(Color.red);
        }else{
            lblfrmProducto.setForeground(Color.black);
        }
        if(txtpreProducto.getText().equals("$")){
            lblpreProducto.setForeground(Color.red);
        }else{
            lblpreProducto.setForeground(Color.black);
        }
        if(txtcatProducto.getText().equals("")){
            lblcatProducto.setForeground(Color.red);
        }else{
            lblcatProducto.setForeground(Color.black);
        }
        if(txtmlgProducto.getText().equals("")){
            lblmlgProducto.setForeground(Color.red);
        }else{
            lblmlgProducto.setForeground(Color.black);
        }
        if(cbxTipoProducto.getSelectedIndex()==0){
            lblidTipoProducto.setForeground(Color.red);
        }else{
            lblidTipoProducto.setForeground(Color.black);
        }
        if(cbxTipoVentaProducto.getSelectedIndex()==0){
            lblidTipoVenta.setForeground(Color.red);
        }else{
            lblidTipoVenta.setForeground(Color.black);
        }
        if(txtnbProveedor.getText().equals("")){
            lblnbProveedor.setForeground(Color.red);
        }else{
            lblnbProveedor.setForeground(Color.black);
        }
    }
   // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Accion al cerrar calendario">
    public static void fechaselect(String fecha){
        txtfcadProducto.setText(fecha);
        pNLFechaRegistrar.setVisible(false);
        txtfrmProducto.requestFocus();
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Declaracion de variables">
    public static CAPA_NEGOCIOS.PRODUCTO Producto;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarPrducto;
    private javax.swing.JComboBox cbxTipoProducto;
    private javax.swing.JComboBox cbxTipoVentaProducto;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblcatProducto;
    private javax.swing.JLabel lblcodBarras;
    private javax.swing.JLabel lbldecProducto;
    private javax.swing.JLabel lblfcadProducto;
    private javax.swing.JLabel lblfrmProducto;
    private javax.swing.JLabel lblidTipoProducto;
    private javax.swing.JLabel lblidTipoVenta;
    private javax.swing.JLabel lblmlgProducto;
    private javax.swing.JLabel lblnbProducto;
    private javax.swing.JLabel lblnbProveedor;
    private javax.swing.JLabel lblpreProducto;
    private javax.swing.JLabel lblubProducto;
    public static CAPA_PRESENTACION.PNLPonerFecha.PNLFechaRegistrar pNLFechaRegistrar;
    private javax.swing.JPanel pnlBordeNegro;
    private javax.swing.JPanel pnlPasoDos;
    private javax.swing.JPanel pnlPasoUno;
    private javax.swing.JTextArea txadecProducto;
    private javax.swing.JLabel txtRegistrarProducto;
    private javax.swing.JFormattedTextField txtcatProducto;
    private javax.swing.JTextField txtcodBarras;
    private static javax.swing.JFormattedTextField txtfcadProducto;
    public static javax.swing.JTextField txtfrmProducto;
    private javax.swing.JTextField txtmlgProducto;
    public static javax.swing.JTextField txtnbProducto;
    private javax.swing.JTextField txtnbProveedor;
    private javax.swing.JFormattedTextField txtpreProducto;
    private javax.swing.JTextField txtubProducto;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
