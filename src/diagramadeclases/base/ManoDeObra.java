
package diagramadeclases.base;

import java.util.Date;


public class ManoDeObra {
    //PROPIEDADES
 private Empleado trabajador;
 private Proyecto proyecto;
 private Date FechaInicio;
 private Date FechaFin;
 private String rol; 
 
 public ManoDeObra(){
     
 }
 
 public ManoDeObra(Empleado e, Proyecto p){
   trabajador = e;
   proyecto = p;
 }
}
