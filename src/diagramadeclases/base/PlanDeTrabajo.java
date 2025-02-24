
package diagramadeclases.base;

import java.util.Date;


public class PlanDeTrabajo {
 
    //PROPIEDADES
 private Tarea tarea;
 private Empleado trabajador;
 private Date FechaInicio;
 private Date FechaFin;
 private String descripcion;
    
    public PlanDeTrabajo(){
        
    }
    public PlanDeTrabajo(Tarea t, Empleado p){
        tarea = t;
        trabajador = p;
        
    }
}
