/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAPA_PRESENTACION.HILOS;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


/**
 *
 * @author Freak
 * @version Beta
 */
public class Reader extends DefaultTableCellRenderer{
    // <editor-fold defaultstate="collapsed" desc="clase abstract de tabla">
    @Override
    public Component getTableCellRendererComponent(JTable jtable, 
            Object value, boolean isSelected, boolean hasFocus, int row, int colum) {
        if(value instanceof JButton){
            JButton btn= (JButton)value;
            return btn;
        }
        return super.getTableCellRendererComponent(jtable, value, 
                isSelected, hasFocus, row, colum); //To change body of generated methods, choose Tools | Templates.
    }
    // </editor-fold>
}
