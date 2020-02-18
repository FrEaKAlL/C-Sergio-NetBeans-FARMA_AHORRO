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
import java.util.Date;
import java.sql.Time;
import javax.swing.JOptionPane;

/**
 *
 * @author Freak
 * @version Beta
 */
public class HORA_ENTRADA_SALIDA {
    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public HORA_ENTRADA_SALIDA(){
        CAPA_DATOS.db_FARMA_AHORRO conexion=new CAPA_DATOS.db_FARMA_AHORRO();
        Conexion = conexion.getConexion();
    }// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Guardar entrada">
    public void RegistrarEntrada(int idEmpleado){
        date=new Date();
        fecha = new java.sql.Date(date.getTime());
        horaE =new Time(date.getTime());
        
        try{
            
            query="INSERT INTO hora_entrada_salida(idEmpleado,Dia,HoraEntrada) "
                        + "VALUES (?,?,?)";
                pstatement = (PreparedStatement) Conexion.prepareStatement(query);
                pstatement.setInt(1,idEmpleado);
                pstatement.setDate(2,fecha);
                pstatement.setTime(3,horaE);
                pstatement.executeUpdate();
            
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,sqle.getMessage());
        }        
        
    }// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Guardar Salida">
    public void RegistrarSalida(int idEmpleado){
        date=new Date();
        fecha = new java.sql.Date(date.getTime());
        horaS =new Time(date.getTime());
        
        try{
            
            query="UPDATE hora_entrada_salida SET HoraSalida=? "
                        + "WHERE idEmpleado = '"+idEmpleado+"' and Dia= '"+fecha+"'";
                pstatement = (PreparedStatement) Conexion.prepareStatement(query);
                pstatement.setTime(1, horaS);
                pstatement.executeUpdate();
            
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,sqle.getMessage());
        }        
        
    }// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Delaracion de varaiables">
    private Connection Conexion = null;
    private Date date;
    private java.sql.Date fecha;
    private Time horaE,horaS;
    private PreparedStatement pstatement; 
    private Statement statement;
    private ResultSet result;
    private String query;
    // </editor-fold>
}
