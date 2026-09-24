/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5grupo17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Agos
 */
public class Directorio {
   private  Map<Long,Contacto> lista_clientes = new TreeMap<>(); 

    public Directorio() {
    
    }

    public void agregarContacto(Long telefono,Contacto contacto){
    lista_clientes.put(telefono, contacto);
    }
    
    public Contacto buscarContacto(Long telefono){
    
        return lista_clientes.get(telefono);
    }
    
    
    
    public Set<Long> buscarTelefono(String apellido){
    Set<Long> telefonos = new HashSet<>();
    
        for (Long telefono : lista_clientes.keySet()) {
            Contacto c = lista_clientes.get(telefono);
            if (c.getApellido().equalsIgnoreCase(apellido)) {
                telefonos.add(telefono);
            }
        }
        return telefonos;
    }
    
    public ArrayList<Contacto> buscarContactos(String Ciudad){
    ArrayList<Contacto> c = new ArrayList<>();
    
    for (Long telefono : lista_clientes.keySet()) {
         Contacto contacto = lista_clientes.get(telefono);
         c.add(contacto);
        
        }
    
    return c;
    }
    
    public Map<Long, Contacto> getLista_clientes() {
        return lista_clientes;
    }

    
    
    
}
