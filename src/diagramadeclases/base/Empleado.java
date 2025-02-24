
package diagramadeclases.base;

import java.util.Date;
import java.util.List;


public class Empleado {
    //PROPIEDADES
 protected String dni;
 protected String nombre;
 protected String apellidos;
 protected String direccion;
 protected String telefono;
 protected String email;
 protected Date fechaContrato;
 protected Empresa empresa;
 protected List <Proyecto> listaDeProyectos;
 protected List <Tarea> listaDeTareas;
 
 //Constructor por defecto
 
 public Empleado(){
     
 }
 public Empleado(String nombre, String apellido){
     this.nombre = nombre;
     this.apellidos = apellido;
     
 }
}
