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
public class DOCTOR {
    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public DOCTOR(){
        CAPA_DATOS.db_FARMA_AHORRO conexion=new CAPA_DATOS.db_FARMA_AHORRO();
        Conexion = conexion.getConexion();
    }// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Registrar Empleado">
    public boolean RegistrarDoctor(String nbDoctor,String appDoctor,
            String apmDoctor,String turno,int idDoctor) {
        
        try{
            if(idDoctor==0){
                query="INSERT INTO Doctor (nbDoctor,appDoctor,apmDoctor,turno) "
                        + "VALUES (?,?,?,?)";
                pstatement = (PreparedStatement) Conexion.prepareStatement(query);
                pstatement.setString(1,nbDoctor);
                pstatement.setString(2,appDoctor);
                pstatement.setString(3,apmDoctor);
                pstatement.setString(4,turno);
                pstatement.executeUpdate();
                return true;
            }else{
                query="UPDATE Doctor SET nbDoctor=?,appDoctor=?,apmDoctor=?,turno=? "
                        + "WHERE idDoctor = '"+idDoctor+"'";
                pstatement = (PreparedStatement) Conexion.prepareStatement(query);
                pstatement.setString(1,nbDoctor);
                pstatement.setString(2,appDoctor);
                pstatement.setString(3,apmDoctor);
                pstatement.setString(4,turno);
                pstatement.executeUpdate();
                return true;
            }
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,sqle.getMessage());
        }
        return false;
    }// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Sacar idDoctor para Dias">
    public int RegistrarDias(String nbDoctor,String appDoctor,
            String apmDoctor,String turno) {
        int idDoctor=0;
        try{
            query="SELECT idDoctor FROM Doctor WHERE nbDoctor='"+nbDoctor+"'"
                    + "and appDoctor='"+appDoctor+"' "
                    + "and apmDoctor='"+apmDoctor+"' "
                    + "and turno='"+turno+"' ";
            statement = Conexion.createStatement();
            result = statement.executeQuery(query);
            if(result.next()){
                idDoctor=Integer.parseInt(result.getString("idDoctor"));
            }
        return idDoctor;
           
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,sqle.getMessage());
        }
        return idDoctor;
    }// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Registrar Dias">
    public boolean RegistrarDiasDoctor(int []dias,int idDoctor,String TipoDeCarga) {
        try{
            switch(TipoDeCarga){
                case "A":
                    query="INSERT INTO dias_laborales (idDoctor,indexDia) "
                        + "VALUES (?,?)";
                    pstatement = (PreparedStatement) Conexion.prepareStatement(query);
                    for(int i=0;i<dias.length;i++){
                        pstatement.setInt(1,idDoctor);
                        pstatement.setInt(2,dias[i]);
                        pstatement.executeUpdate();
                    }
                    break;
                case "U":
                    query="delete from dias_laborales where idDoctor = '"+idDoctor+"'";
                    pstatement= (PreparedStatement) Conexion.prepareStatement(query);
                    pstatement.executeUpdate();
                    RegistrarDiasDoctor(dias, idDoctor, "A");
                    break;
            }
                
            
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,sqle.getMessage());
        }
        return false;
    }// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="LLenar filas tabla Doctores datos doctor">
    public void setFilasDoctor(DefaultTableModel modeloTabla){
        for(int i=0;i<modeloTabla.getRowCount();i++){
            modeloTabla.removeRow(i);
            i-=1;
        }
        query="select idDoctor,nbDoctor,appDoctor,apmDoctor,Turno from Doctor";
        try{
            
            statement = Conexion.createStatement();
            result = statement.executeQuery(query);
            Object objeto[]=new Object[5];
            while(result.next()) {
                int index=1;
                
                for(int i=0;i<4;i++){
                    
                    objeto[i]=result.getObject(index+1);
                    
                    index++;
                }
                String idDoctor=result.getString(1);
                objeto[4]=DiasLaborales(idDoctor);
                modeloTabla.addRow(objeto);
                
            }
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,sqle.getMessage());
        }
    }// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Colocar nombre dia">
    private String DiasLaborales(String idDoctor){
        String dias = "";
        String query="select indexDia from dias_laborales where idDoctor='"+idDoctor+"'";
        try{
            Statement statement = Conexion.createStatement();
            ResultSet result = statement.executeQuery(query);
            while(result.next()) {
                switch(result.getString(1)){
                    case "0":
                        dias+="Lu,";
                        break;
                    case "1":
                        dias+="Ma,";
                        break;
                    case "2":
                        dias+="Mi,";
                        break;
                    case "3":
                        dias+="Ju,";
                        break;
                    case "4":
                        dias+="Vi,";
                        break;
                    case "5":
                        dias+="Sá,";
                        break;
                    case "6":
                        dias+="Do,";
                }
            }
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,sqle.getMessage());
        }
        return dias;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Delete">
    public boolean DeleteDoctor(int idDoctor){
        boolean isDelete=false;
        try{
            query="delete from dias_laborales where idDoctor = '"+idDoctor+"'";
                    pstatement= (PreparedStatement) Conexion.prepareStatement(query);
                    pstatement.executeUpdate();
                isDelete=true;
            
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,sqle.getMessage());
        }
        if(isDelete){
            try{
            query="DELETE FROM Doctor WHERE idDoctor='"+idDoctor+"'";
            pstatement= (PreparedStatement) Conexion.prepareStatement(query);
            pstatement.executeUpdate();
            isDelete=true;
            }catch(SQLException sqle){
                JOptionPane.showMessageDialog(null,sqle.getMessage());
            }
        }
        return isDelete;
    } 
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Delaracion de varaiables">
    private Connection Conexion = null;
    private PreparedStatement pstatement; 
    private Statement statement;
    private ResultSet result;
    private String query;
    // </editor-fold>
}
