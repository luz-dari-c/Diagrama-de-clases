
package diagramadeclases.base;

import java.util.List;


public class Promotor extends Empleado {
    
    //PROPIEDADES
    private List <Proyecto> listaDeProyectos;

    public Promotor(){
       super(); //Llama al constructor de Empleado 
    }
    public Promotor(String n, String a){
       super(n,a);
    }
}
