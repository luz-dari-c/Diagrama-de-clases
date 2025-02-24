
package diagramadeclases.base;

import java.util.Date;
import java.util.List;


public class Proyecto {
  
    //PROPIEDADES
 private String nombreClave;
 private String denominacion;
 private Date fechaInicio;
 private Date fechaFin;
 private String estado;
 private Empresa empresa;
 private List <Empleado> listaDeEmpleados;
 private Promotor empleadoPromotor;
 private List <Tarea> listaDeTareas;

 
 public Proyecto(){
     
 }
 public Proyecto(String nombreClave, String denominacion){
     this.nombreClave = nombreClave;
     this.denominacion = denominacion;
 }
 
}
