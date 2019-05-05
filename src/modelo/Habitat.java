/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author germanny.lezama
 */
public class Habitat {
    private int id;
    private String nombreE;
    private String zona; 
    private String descripcion; 

    public Habitat(int id, String nombreE, String zona, String descripcion) {
        this.id = id;
        this.nombreE = nombreE;
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

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
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
        return "habitat{" + "id=" + id + ", nombreE=" + nombreE + ", zona=" + zona + ", descripcion=" + descripcion + '}';
    }
    
    public ResultSet consultarHabitat(String sql) {
        
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
