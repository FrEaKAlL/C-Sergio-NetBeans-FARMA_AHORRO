/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAPA_NEGOCIOS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Freak
 * @version Beta
 */
public class EMPLEADO {
    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public EMPLEADO(){
        CAPA_DATOS.db_FARMA_AHORRO conexion=new CAPA_DATOS.db_FARMA_AHORRO();
        Conexion = conexion.getConexion();
    }// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Registrar Empleado">
    public boolean RegistrarEmpleado(String nbEmpleado,String appEmpleado,
            String apmEmpleado,String usuario,String pwsEmpleado, int idEmpleado) {
        
        try{
            if(idEmpleado==0){
                query="INSERT INTO Empleado(nbEmpleado,appEmpleado,apmEmpleado,usuario,pwsEmpleado) "
                        + "VALUES (?,?,?,?,?)";
                pstatement = (PreparedStatement) Conexion.prepareStatement(query);
                pstatement.setString(1,nbEmpleado);
                pstatement.setString(2,appEmpleado);
                pstatement.setString(3,apmEmpleado);
                pstatement.setString(4,usuario);
                pstatement.setString(5,pwsEmpleado);
                pstatement.executeUpdate();
                return true;
            }else{
                query="UPDATE Empleado SET nbEmpleado=?,appEmpleado=?,apmEmpleado=?,usuario=?,pwsEmpleado=? "
                        + "WHERE idEmpleado = '"+idEmpleado+"'";
                pstatement = (PreparedStatement) Conexion.prepareStatement(query);
                pstatement.setString(1,nbEmpleado);
                pstatement.setString(2,appEmpleado);
                pstatement.setString(3,apmEmpleado);
                pstatement.setString(4,usuario);
                pstatement.setString(5,pwsEmpleado);
                pstatement.executeUpdate();
                return true;
            }
            
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,sqle.getMessage());
        }
        return false;
    }// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="LLenar filas tabla empleados">
    public void setFilasEmpleado(DefaultTableModel modeloTabla){
        for(int i=0;i<modeloTabla.getRowCount();i++){
            modeloTabla.removeRow(i);
            i-=1;
        }
        query="select nbEmpleado,appEmpleado,apmEmpleado,usuario,pwsEmpleado from Empleado where idEmpleado>1";
        try{
            
            statement = Conexion.createStatement();
            result = statement.executeQuery(query);
            Object objeto[]=new Object[5];
            while(result.next()) {
                for(int i=0;i<objeto.length;i++){
                    
                    objeto[i]=result.getObject(i+1);
                }
                modeloTabla.addRow(objeto);
            }
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,sqle.getMessage());
        }
    }// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Delete Empleado">
    public boolean DeleteEmpleado(String nbEmpleado,String appEmpleado,String apmEmpleado,
            String usuario,String pwsEmpleado) {
        try{
            query="DELETE FROM Empleado WHERE nbEmpleado='"+nbEmpleado+"' "
                    + "and appEmpleado='"+appEmpleado+"' "
                    + "and apmEmpleado='"+apmEmpleado+"' "
                    + "and usuario='"+usuario+"' "
                    + "and pwsEmpleado='"+pwsEmpleado+"'";
            pstatement = (PreparedStatement) Conexion.prepareStatement(query);
            pstatement.executeUpdate();
            return true;
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,sqle.getMessage());
        }
        return false;
    }// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Existe el empleado para modificar">
    public int isExistEmpleado(String nbEmpleado,String appEmpleado,
            String apmEmpleado,String usuario,String pwsEmpleado){
        int idEmpleado =0;
        try{
            query="SELECT * FROM Empleado WHERE nbEmpleado='"+nbEmpleado+"'"
                + "and appEmpleado='"+appEmpleado+"' "
                + "and apmEmpleado='"+apmEmpleado+"' "
                + "and usuario='"+usuario+"' "
                + "and pwsEmpleado='"+pwsEmpleado+"' "
                + "and idEmpleado>1";
            statement = Conexion.createStatement();
            result = statement.executeQuery(query);
                if(result.next()){
                    idEmpleado=Integer.parseInt(result.getString("idEmpleado"));
                }
                return idEmpleado;
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,sqle.getMessage());
        }
        return idEmpleado;
    }// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Delaracion de varaiables">
    private Connection Conexion = null;
    private PreparedStatement pstatement; 
    private Statement statement;
    private ResultSet result;
    private String query;
    // </editor-fold>
}
