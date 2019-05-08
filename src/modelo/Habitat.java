/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.ConnectBD;

/**
 *
 * @author germanny.lezama
 */
public class Habitat {
    private int id;
    private String nombreH;
    private String zona; 
    private String descripcion; 

    public Habitat(int id, String nombreH) {
        this.id = id;
        this.nombreH = nombreH;
    }
    

    public Habitat(int id, String nombreH, String zona, String descripcion) {
        this.id = id;
        this.nombreH = nombreH;
        this.zona = zona;
        this.descripcion = descripcion;
    }

    public Habitat() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreH() {
        return nombreH;
    }

    public void setNombreH(String nombreH) {
        this.nombreH = nombreH;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "habitat{" + "id=" + id + ", nombreH=" + nombreH + ", zona=" + zona + ", descripcion=" + descripcion + '}';
    }
    
    public ResultSet consultarhabitat(String sql) {
        
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
