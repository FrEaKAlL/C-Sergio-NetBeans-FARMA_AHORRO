/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAPA_NEGOCIOS;

import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Freak
 * @version Beta
 */
public class PRODUCTO {
    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public PRODUCTO(){
        CAPA_DATOS.db_FARMA_AHORRO conexion=new CAPA_DATOS.db_FARMA_AHORRO();
        Conexion = conexion.getConexion();
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Guardar Producto">
    public boolean GuardarProducto(String codBarras,String nbProveedor,String fcadProducto,
            String nbProducto,String frmProducto,int idTipoProducto,String mlgProducto,float preProducto,
            String ubProducto,int idTipoVentaProducto,int catProducto,String decProducto){
        boolean guardado=false;
        try{
            query="INSERT INTO Productos(codBarras,nbProveedor,fcadProducto,nbProducto,frmProducto,"
                    + "idTipoProducto,mlgProducto,preProducto,ubProducto,idTipoVentaProducto,catProducto,"
                    + "decProducto) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
                pstatement = (PreparedStatement) Conexion.prepareStatement(query);
                pstatement.setString(1,codBarras);
                pstatement.setString(2,nbProveedor);
                pstatement.setString(3,fcadProducto);
                pstatement.setString(4,nbProducto);
                pstatement.setString(5,frmProducto);
                pstatement.setInt(6,idTipoProducto);
                pstatement.setString(7,mlgProducto);
                pstatement.setDouble(8,preProducto);
                pstatement.setString(9,ubProducto);
                pstatement.setInt(10,idTipoVentaProducto);
                pstatement.setInt(11,catProducto);
                pstatement.setString(12,decProducto);
                pstatement.executeUpdate();
                guardado=true;
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,sqle.getMessage());
            guardado=false;
        }
        return guardado;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Tipo de porducto">
    public void Tipo_Producto(JComboBox tipoProducto){
        try{
            query="SELECT * FROM Tipo_Producto";
            statement = Conexion.createStatement();
            result = statement.executeQuery(query);
            while(result.next()){
                tipoProducto.addItem(result.getString("nbTipoProducto"));
            }
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,sqle.getMessage());
        }  
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Tipo de venta de producto">
    public void Tipo_Venta_Producto(JComboBox tipoVentaProducto){
        try{
            query="SELECT * FROM Tipo_Venta_Producto";
            statement = Conexion.createStatement();
            result = statement.executeQuery(query);
            while(result.next()){
                tipoVentaProducto.addItem(result.getString("nbTipoVentaProducto"));
            }
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,sqle.getMessage());
        }  
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Buscar producto">
    public String[] BuscarProducto(String texto,boolean tipo){
        String []Producto=new String [6];
        for(int i=0;i<Producto.length;i++){
            Producto[i]="";
        }
        try{
            if(tipo){
                query="call buscarPorCodBarras('"+texto+"')";
                PreparedStatement ps=Conexion.prepareStatement(query);
                result =ps.executeQuery();
                if(result.next()){
                    Producto[0] = result.getString("codBarras");
                    Producto[1] = result.getString("nbProducto");
                    Producto[2] = result.getString("nbProveedor");
                    Producto[3] = result.getString("fcadProducto");
                    Producto[4] = result.getString("catProducto");
                    Producto[5] = result.getString("preProducto");
                }
                return Producto;
            }else{
                query="call buscarPorNbProducto('"+texto+"')";
                PreparedStatement ps=Conexion.prepareStatement(query);
                result =ps.executeQuery();
                if(result.next()){
                    Producto[0] = result.getString("codBarras");
                    Producto[1] = result.getString("nbProducto");
                    Producto[2] = result.getString("nbProveedor");
                    Producto[3] = result.getString("fcadProducto");
                    Producto[4] = result.getString("catProducto");
                    Producto[5] = result.getString("preProducto");
                }
                return Producto;
            }
            
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,sqle.getMessage());
        }   
        return Producto;
    }
    public String[] BuscarProducto(String codBarras,String nbProducto){
        String []Producto=new String [6];
        for(int i=0;i<Producto.length;i++){
            Producto[i]="";
        }
        try{
        query="call buscarPorCodBarrasNbProducto('"+codBarras+"','"+nbProducto+"')";
                PreparedStatement ps=Conexion.prepareStatement(query);
                result =ps.executeQuery();
                if(result.next()){
                    Producto[0] = result.getString("codBarras");
                    Producto[1] = result.getString("nbProducto");
                    Producto[2] = result.getString("nbProveedor");
                    Producto[3] = result.getString("fcadProducto");
                    Producto[4] = result.getString("catProducto");
                    Producto[5] = result.getString("preProducto");
                }
                return Producto;
                }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,sqle.getMessage());
        }   
        return Producto;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Surtir producto">
    public boolean SurtirProducto(String codBarras,String nbProducto,String nbProveedor,String fcadProducto,
            String catProducto, float preProducto){
        boolean check=true;
        try{
                query="UPDATE Productos SET nbProducto=?,nbProveedor=?,fcadProducto=?,catProducto=?"
                        + ",preProducto=? WHERE codBarras = '"+codBarras+"'";
                pstatement = (PreparedStatement) Conexion.prepareStatement(query);
                pstatement.setString(1,nbProducto);
                pstatement.setString(2,nbProveedor);
                pstatement.setString(3,fcadProducto);
                pstatement.setString(4,catProducto);
                pstatement.setDouble(5,preProducto);
                pstatement.executeUpdate();
                return true;
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,sqle.getMessage());
        }
        return check;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Surtir producto">
    public boolean BajaProducto(String codBarras,String nbProducto){
        try{
            query="DELETE FROM Productos WHERE codBarras= '"+codBarras+"' AND nbProducto= '"+nbProducto+"'";
            pstatement = (PreparedStatement) Conexion.prepareStatement(query);
            pstatement.executeUpdate();
            return true;
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null, sqle.getMessage());
            return false;
        }
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Declaracion de variables">
    private Connection Conexion = null;
    private PreparedStatement pstatement; 
    private Statement statement;
    private ResultSet result;
    private String query;
    // </editor-fold>
}
