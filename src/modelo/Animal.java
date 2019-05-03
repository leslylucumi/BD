/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Acer
 */
public class Animal {
    private String edad;
    private String imganimalcara;
    private String imganimalcuerpo;
    private String imganimal;
    private int genero;
    private String descripcion;
    private String nombre;
    private String peso;
  //  private String dirc;

    public Animal(String edad, String imganimalcara, String imganimalcuerpo, String imganimal, int genero, String descripcion, String nombre, String peso) {
        this.edad = edad;
        this.imganimalcara = imganimalcara;
        this.imganimalcuerpo = imganimalcuerpo;
        this.imganimal = imganimal;
        this.genero = genero;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getImganimalcara() {
        return imganimalcara;
    }

    public void setImganimalcara(String imganimalcara) {
        this.imganimalcara = imganimalcara;
    }

    public String getImganimalcuerpo() {
        return imganimalcuerpo;
    }

    public void setImganimalcuerpo(String imganimalcuerpo) {
        this.imganimalcuerpo = imganimalcuerpo;
    }

    public String getImganimal() {
        return imganimal;
    }

    public void setImganimal(String imganimal) {
        this.imganimal = imganimal;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" + "edad=" + edad + ", imganimalcara=" + imganimalcara + ", imganimalcuerpo=" + imganimalcuerpo + ", imganimal=" + imganimal + ", genero=" + genero + ", descripcion=" + descripcion + ", nombre=" + nombre + ", peso=" + peso + '}';
    }
    
    public boolean insertarAnimal(String sql) {
          ConnectBD objCon = new ConnectBD();

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        }
        return true;
    }   
}
