/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author AlbertoR
 */
public class Consultas extends Conexion{
    
    public boolean autenticacion(String user, String password){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String consulta = "select *from usuarios where usuario = ? and pass = ?";
            pst = getConnection().prepareStatement(consulta);
            pst.setString(1, user);
            pst.setString(2, password);
            rs = pst.executeQuery();
            
            if(rs.absolute(1)){
                return true;
            }
        } catch (Exception e) {
            System.err.println("Error: "+e);
        }finally{
            try {
                if(getConnection() != null) getConnection().close();
                if(pst != null) pst.close();
                if(rs != null) rs.close();
            } catch (Exception e) {
                System.err.println("Error: "+e);
            }               
        }
        return false;
    }
    
    public boolean registrar(String user, String password, String nombre, String apellido){
        PreparedStatement pst = null;
        
        try {
            String consulta = "insert into usuarios (usuario, pass, nombre, apellido) values(?, ?, ?, ?)";
            pst = getConnection().prepareStatement(consulta);
            pst.setString(1, user);
            pst.setString(2, password);
            pst.setString(3, nombre);
            pst.setString(4, apellido);
            
            
            if(pst.executeUpdate() == 1){
                return true;
            }
            
        } catch (Exception e) {
            System.err.println("Error: "+e);
        }finally{
            try {
                if(getConnection() != null) getConnection().close();
                if(pst != null) pst.close();
            } catch (Exception e) {
                System.err.println("Error: "+e);
            }
        }
        return false;
    }
    
    
}
