/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAPA_NEGOCIOS;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Freak
 * @version Beta
 */
public class LOGIN {
    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public LOGIN(){
        CAPA_DATOS.db_FARMA_AHORRO conexion=new CAPA_DATOS.db_FARMA_AHORRO();
        Conexion = conexion.getConexion();
    }// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Login">
    public int ChecarLogin(String usuario, String pswEmpleado) {
        query="select idEmpleado,usuario,pwsEmpleado from Empleado";
        try{
            
            statement = Conexion.createStatement();
            result = statement.executeQuery(query);
            while(result.next()) {
                if(usuario.equals(result.getString("usuario"))){
                    if(pswEmpleado.equals(result.getString("pwsEmpleado"))){
                       return result.getInt(1); 
                    }
                }
            }
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,sqle.getMessage());
        }
        return 0;
    }// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Declaracion de variables">
    private Connection Conexion = null;
    private Statement statement;
    private ResultSet result;
    private String query;
    // </editor-fold>
}
