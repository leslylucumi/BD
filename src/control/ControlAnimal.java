/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Animal;

/**
 *
 * @author Acer
 */
public class ControlAnimal {
    
    public boolean insertarAnimal (Animal obje) {
        String sql="Insert into Animales "+
                "value('"+obje.getId()+"', '"+obje.getEdad()+"', '"+obje.getImganimalcara()+"', '"+
                obje.getImganimalcuerpo()+"', '"+obje.getImganimal()+"', '"+obje.getGenero()+"', '"+obje.getDescripcion()+"', '"+obje.getNombre()+"', '"+obje.getPeso()+"', '"+
                obje.getId_Especie()+"','" +obje.getId_Habitat()+"','" +obje.getId_Alimentacion()+"')";
//        
        boolean f=false;
        f=obje.insertarAnimal(sql);
//        
        return f;
//    
}
}
