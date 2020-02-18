/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAPA_PRESENTACION.HILOS;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Freak
 * @version Beta
 */
public class TIPOS {
    // <editor-fold defaultstate="collapsed" desc="Limpiar espacios">
    public static String clearEspacios(String texto){
        int index=texto.length();
            if((""+texto.charAt(index-1)).equals(" ")){
                return clearEspacios(texto.substring(0, texto.length()-1));
            }
        return texto;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Validar Cantidad de Productos">
    public static String validarCantidad(String texto){
        if(texto.trim().equals("")){
            return "0";
        }
        return texto;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Contraseña sin espacios">
    public static boolean contraseñaEspacios(String texto){
        int index=texto.length();
            if((""+texto.charAt(index-1)).equals(" ")){
                return false;
            }
        return true;
    }
    // </editor-fold>
    public static String[] PonerFecha(String txtfchCaducidad){
        String []fecha=new String[3];
        StringTokenizer st = new StringTokenizer(txtfchCaducidad,"-");
        int i=0;
        while(st.hasMoreTokens()){
            fecha[i++]=st.nextToken();
        }
        return fecha;
    }
}
