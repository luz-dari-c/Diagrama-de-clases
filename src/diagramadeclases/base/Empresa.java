
package diagramadeclases.base;

import java.util.List;


public class Empresa {
    //PROPIEDADES
 private String nit;
 private String nombre;
 private String tipo;
 private String web;
 private String telefono;
 private String email;
 private String direccion;
 private List <Empleado> listaDeEmpleados;
 private List <Proyecto> listaDeProyectos;
 
 public Empresa(){
     
 }
  public Empresa(String nit, String nombre){
     this.nit = nit;
     this.nombre = nombre;
     
 }
 
 
 
}
