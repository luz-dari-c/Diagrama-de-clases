
package diagramadeclases.base;

import java.util.List;


public class Documento {
    //PROPIEDADES
 private String codigo;
 private String descripcion;
 private String tipo;
 private Tarea tarea;
 private List<Version> listaDeVersiones;   
 
 //CONSTRUCTORES
 
 public Documento(){
     
 }
 
 public Documento(String codigo, String descripcion ){
    
     this.codigo = codigo;
     this.descripcion = descripcion;
 }
 
}
