/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Acer
 */
public class Animal {
    private int id;
    private String edad;
    private String imganimalcara;
    private String imganimalcuerpo;
    private String imganimal;
    private String genero;
    private String descripcion;
    private String nombre;
    private String peso;
    private  int id_Especie;
    private int id_Habitat;
    private  int id_Alimentacion;
    
  //  private String dirc;

    public Animal(int id, String edad, String imganimalcara, String imganimalcuerpo, String imganimal, String genero, String descripcion, String nombre, String peso, int id_Especie, int id_Habitat, int id_Alimentacion) {
        this.id = id;
        this.edad = edad;
        this.imganimalcara = imganimalcara;
        this.imganimalcuerpo = imganimalcuerpo;
        this.imganimal = imganimal;
        this.genero = genero;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.peso = peso;
        this.id_Especie = id_Especie;
        this.id_Habitat = id_Habitat;
        this.id_Alimentacion = id_Alimentacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_Especie() {
        return id_Especie;
    }

    public void setId_Especie(int id_Especie) {
        this.id_Especie = id_Especie;
    }

    public int getId_Habitat() {
        return id_Habitat;
    }

    public void setId_Habitat(int id_Habitat) {
        this.id_Habitat = id_Habitat;
    }

    public int getId_Alimentacion() {
        return id_Alimentacion;
    }

    public void setId_Alimentacion(int id_Alimentacion) {
        this.id_Alimentacion = id_Alimentacion;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
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
        return "Animal{" + "id=" + id + ", edad=" + edad + ", imganimalcara=" + imganimalcara + ", imganimalcuerpo=" + imganimalcuerpo + ", imganimal=" + imganimal + ", genero=" + genero + ", descripcion=" + descripcion + ", nombre=" + nombre + ", peso=" + peso + ", id_Especie=" + id_Especie + ", id_Habitat=" + id_Habitat + ", id_Alimentacion=" + id_Alimentacion + '}';
    }

   
    
    public boolean insertarAnimal(Animal obje,String sql) {
          
         boolean t=false;
        FileInputStream fis = null;
        PreparedStatement ps = null;
        ConnectBD obj=new ConnectBD();
        try {
            if(obj.crearConexion()){
            obj.getConexion().setAutoCommit(false);
             File file1=new File(obje.getImganimalcara());
             File file2=new File(obje.getImganimalcuerpo());
             File file3=new File(obje.getImganimal());
                
                
                
                
                t=true;
            }
        }catch (Exception ex) {
            t=false;
            System.out.println("Error "+ex.toString());
        } finally {
            try {
                ps.close();
                fis.close();
            } catch (Exception ex) {
                t=false;
                System.out.println("Errro "+ex.toString());
            }
        }
        return t;

        
}
}
