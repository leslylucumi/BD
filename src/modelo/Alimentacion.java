/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.ConnectBD;

/**
 *
 * @author Usuario
 */
public class Alimentacion {
     private int id;
    private String nombreA;

    public Alimentacion() {
    }

    public Alimentacion(int id, String nombreA) {
        this.id = id;
        this.nombreA = nombreA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    @Override
    public String toString() {
        return "Alimentacion{" + "id=" + id + ", nombreA=" + nombreA + '}';
    }

    public ResultSet consultarAlimentacion(String sql) {
              ConnectBD objc=new ConnectBD();
        ResultSet rs=null;
        if(objc.crearConexion()){
            try{
                rs=objc.getSt().executeQuery(sql);
            }catch(SQLException me){
                
            }
        }
        return rs;
    }
    
    
}
