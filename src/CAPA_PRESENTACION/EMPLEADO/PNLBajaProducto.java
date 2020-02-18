/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAPA_PRESENTACION.EMPLEADO;

import static CAPA_PRESENTACION.EMPLEADO.PNLRegistrarProducto.Producto;
import javax.swing.JOptionPane;

/**
 *
 * @author Freak
 * @version Beta
 */
public class PNLBajaProducto extends javax.swing.JPanel {

    /**
     * Creates new form PNLBajaProducto
     */
    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public PNLBajaProducto() {
        initComponents();
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

        pnlBordeNegro = new javax.swing.JPanel();
        lblcodBarras = new javax.swing.JLabel();
        lblnbProducto = new javax.swing.JLabel();
        txtcodBarras = new javax.swing.JTextField();
        txtnbProducto = new javax.swing.JTextField();
        btnBuascar = new javax.swing.JButton();
        pnlDatosFill = new javax.swing.JPanel();
        lblfcadProducto = new javax.swing.JLabel();
        txtfcadProducto = new javax.swing.JFormattedTextField();
        lblcatProducto = new javax.swing.JLabel();
        txtcatProducto = new javax.swing.JFormattedTextField();
        lblpreProducto = new javax.swing.JLabel();
        txtpreProducto = new javax.swing.JFormattedTextField();
        btnBaja = new javax.swing.JButton();
        lblnbProveedor = new javax.swing.JLabel();
        txtnbProveedor = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        txtBajaProducto = new javax.swing.JLabel();

        pnlBordeNegro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblcodBarras.setText("Codigo de barras");

        lblnbProducto.setText("Nombre del producto");

        btnBuascar.setText("BUSCAR");
        btnBuascar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuascarActionPerformed(evt);
            }
        });

        pnlDatosFill.setVisible(false);

        lblfcadProducto.setText("Fecha de caducidad");

        txtfcadProducto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-M-d"))));
        txtfcadProducto.setEnabled(false);

        lblcatProducto.setText("Cantidad");

        txtcatProducto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtcatProducto.setEnabled(false);

        lblpreProducto.setText("Precio por Pieza");

        txtpreProducto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtpreProducto.setEnabled(false);

        btnBaja.setText("Baja");
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });

        lblnbProveedor.setText("Proveedor");

        txtnbProveedor.setEnabled(false);

        javax.swing.GroupLayout pnlDatosFillLayout = new javax.swing.GroupLayout(pnlDatosFill);
        pnlDatosFill.setLayout(pnlDatosFillLayout);
        pnlDatosFillLayout.setHorizontalGroup(
            pnlDatosFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosFillLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlDatosFillLayout.createSequentialGroup()
                .addGroup(pnlDatosFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfcadProducto)
                    .addComponent(lblcatProducto)
                    .addComponent(lblpreProducto)
                    .addComponent(lblnbProveedor))
                .addGroup(pnlDatosFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosFillLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(pnlDatosFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpreProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(txtfcadProducto)
                            .addComponent(txtnbProveedor)))
                    .addGroup(pnlDatosFillLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtcatProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnlDatosFillLayout.setVerticalGroup(
            pnlDatosFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosFillLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlDatosFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfcadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfcadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcatProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcatProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBordeNegroLayout = new javax.swing.GroupLayout(pnlBordeNegro);
        pnlBordeNegro.setLayout(pnlBordeNegroLayout);
        pnlBordeNegroLayout.setHorizontalGroup(
            pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBordeNegroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDatosFill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlBordeNegroLayout.createSequentialGroup()
                        .addGroup(pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcodBarras)
                            .addComponent(lblnbProducto))
                        .addGap(30, 30, 30)
                        .addGroup(pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnbProducto)
                            .addComponent(txtcodBarras)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBordeNegroLayout.createSequentialGroup()
                                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuascar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        pnlBordeNegroLayout.setVerticalGroup(
            pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBordeNegroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuascar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlDatosFill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtBajaProducto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtBajaProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtBajaProducto.setText("Baja producto");
        txtBajaProducto.setToolTipText("");
        txtBajaProducto.setAlignmentY(0.0F);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlBordeNegro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBajaProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBajaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlBordeNegro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // <editor-fold defaultstate="collapsed" desc="Btn Buscar producto">
    private void btnBuascarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuascarActionPerformed
        // TODO add your handling code here:
        String []ProductoD;
        if(!txtcodBarras.getText().trim().equals("") && txtnbProducto.getText().trim().equals("")){
            ProductoD=Producto.BuscarProducto(txtcodBarras.getText().trim(),true);
            if(!ProductoD[0].equals("")){
                pnlDatosFill.setVisible(true);
                txtcodBarras.setText(ProductoD[0]);
                txtnbProducto.setText(ProductoD[1]);
                txtnbProveedor.setText(ProductoD[2]);
                txtfcadProducto.setText(ProductoD[3]);
                txtcatProducto.setText(ProductoD[4]);
                txtpreProducto.setText("$"+Float.parseFloat(ProductoD[5]));
                txtpreProducto.requestFocus();
            }else{
                JOptionPane.showMessageDialog(this, "Sin resultados",
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            if(txtcodBarras.getText().trim().equals("") && !txtnbProducto.getText().trim().equals("")){
                ProductoD=Producto.BuscarProducto(txtnbProducto.getText().trim(), false);
                if(!ProductoD[0].equals("")){
                    pnlDatosFill.setVisible(true);
                    txtcodBarras.setText(ProductoD[0]);
                    txtnbProducto.setText(ProductoD[1]);
                    txtnbProveedor.setText(ProductoD[2]);
                    txtfcadProducto.setText(ProductoD[3]);
                    txtcatProducto.setText(ProductoD[4]);
                    txtpreProducto.setText("$"+Float.parseFloat(ProductoD[5]));
                    txtpreProducto.requestFocus();
                }else{
                    JOptionPane.showMessageDialog(this, "Sin resultados",
                        "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                if(!txtcodBarras.getText().trim().equals("") && !txtnbProducto.getText().trim().equals("")){
                    ProductoD=Producto.BuscarProducto(txtcodBarras.getText().trim(), txtnbProducto.getText().trim());
                    if(!ProductoD[0].equals("")){
                        pnlDatosFill.setVisible(true);
                        txtcodBarras.setText(ProductoD[0]);
                        txtnbProducto.setText(ProductoD[1]);
                        txtnbProveedor.setText(ProductoD[2]);
                        txtfcadProducto.setText(ProductoD[3]);
                        txtcatProducto.setText(ProductoD[4]);
                        txtpreProducto.setText("$"+Float.parseFloat(ProductoD[5]));
                        txtpreProducto.requestFocus();
                    }else{
                        JOptionPane.showMessageDialog(this, "Sin resultados",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnBuascarActionPerformed
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Btn Baja">
    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        // TODO add your handling code here:
            if(Producto.BajaProducto(txtcodBarras.getText().trim(),txtnbProducto.getText().trim())){
            JOptionPane.showMessageDialog(this, "El producto a sido dado de baja",
                "Baja", JOptionPane.INFORMATION_MESSAGE);
            Limpiar();
        }else{
            JOptionPane.showMessageDialog(this, "No se pudo dar de baja el producto",
                "Error al dar de Baja", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBajaActionPerformed
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Btn Cancelar">
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Limpiar">
    private void Limpiar(){
        txtcodBarras.setText("");
        txtnbProducto.setText("");
        txtnbProveedor.setText("");
        txtfcadProducto.setText("");
        txtcatProducto.setText("");
        txtpreProducto.setText("");
        pnlDatosFill.setVisible(false);
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Delaracion de variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnBuascar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel lblcatProducto;
    private javax.swing.JLabel lblcodBarras;
    private javax.swing.JLabel lblfcadProducto;
    private javax.swing.JLabel lblnbProducto;
    private javax.swing.JLabel lblnbProveedor;
    private javax.swing.JLabel lblpreProducto;
    private javax.swing.JPanel pnlBordeNegro;
    private javax.swing.JPanel pnlDatosFill;
    private javax.swing.JLabel txtBajaProducto;
    private javax.swing.JFormattedTextField txtcatProducto;
    private javax.swing.JTextField txtcodBarras;
    private static javax.swing.JFormattedTextField txtfcadProducto;
    private static javax.swing.JTextField txtnbProducto;
    private javax.swing.JTextField txtnbProveedor;
    private javax.swing.JFormattedTextField txtpreProducto;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
