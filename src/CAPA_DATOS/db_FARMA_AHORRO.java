/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAPA_DATOS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Freak
 * @version Beta
 */
public class db_FARMA_AHORRO {
    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public db_FARMA_AHORRO() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Conexion = DriverManager.getConnection("jdbc:mysql://localhost/FARMA_AHORRO","root","123ser__");
        }catch(ClassNotFoundException cnfe){
            JOptionPane.showMessageDialog(null,"No se conecto 1 Error: "+cnfe.getMessage());
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,"No se conecto 2");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se conecto 3");
        }finally{
            if (Conexion==null){
                CreaDB();
            }
        }
    }// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Crea DataBase">
    private void CreaDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Conexion = DriverManager.getConnection("jdbc:mysql://localhost/sys","root","123ser__");
            String[] CreaBase = null;
            CreaBase[0] = "CREATE DATABASE ADMON";
            CreaBase[1] = "USE ADMON;";
            CreaBase[2] = "CREATE TABLE Usuarios ("
                    + "idUsuario MEDIUMINT NOT NULL AUTO_INCREMENT,"
                    + "";
            
        }catch(ClassNotFoundException cnfe){
            JOptionPane.showMessageDialog(null,"No se conecto 1 Error: "+cnfe.getMessage());
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,"No se conecto 2");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se conecto 3");
        }
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Manda Conexion">
    public Connection getConexion(){
        return Conexion;
    }// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Ejecuta SQL">
    public boolean EjecutaSQL(String Sql){
        try{
            Statement st = Conexion.createStatement();
            st.execute(Sql);
            return true;
        }catch(SQLException sqle){
            return false;
        }
    }// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Declaracion de variables">
    Connection Conexion = null;
    // </editor-fold>
}
