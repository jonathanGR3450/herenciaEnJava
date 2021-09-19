/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InicioProgramas;
import Personas.*;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author ingsistemas
 */
public class InicioUno {
    public static void main(String []argumentos  ) throws ParseException
    {
        //hacer com mas de una jerarquia            
         System.out.println("---------------------------------------------------------------");
         System.out.println("Herencia de la clase Persona");
         System.out.println("---------------------------------------------------------------");
         Date ahora = new Date();
         //Date ahora;
         SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");         
         ahora=formatoFecha.parse("05-04-2015");         
         Empleado ob1 = new Empleado("Administrador", ahora, 2500000,1121523256,"JUAN FELIPE","MORALES DIAZ");
         System.out.println("Empleado: " +ob1.getNombres() + " " + ob1.getApellidos()); 
         BigDecimal valor = new BigDecimal(ob1.getIdentificacion());
         System.out.println("Identificación: "+ ob1.getIdentificacion() + " Identificación: " + valor.toString() ); 
         Empleado ob2= new Empleado("Ad", ahora, 1688780,30147222,"ANDRES","DIAZ");
         Empleado ob3 = new Empleado("Adm", ahora, 1800000,1121987222,"JUAN ","MORENO");
         Empleado ob4 = new Empleado("Admi", ahora, 3900000,6987222,"JOSE","DIAZ");
         Empleado ob5 = new Empleado("Admin", ahora, 2405000,15987222,"PEDRO","MARTINEZ");
         
         System.out.println("-----------------ARRAY DE EMPLEADOS----------------------------------------------");
         Empleado matriz[]=new Empleado[5];         
         matriz[0]=ob1;
         matriz[1]=ob2;
         matriz[2]=ob3;
         matriz[3]=ob4;
         matriz[4]=ob5;
         
         for (int x=0;x<5;x++)
         {
                System.out.println("---------------------------------------------------------------");
                Empleado p = (Empleado) matriz[x];
                System.out.println("Empleado: " +p.getNombres() + " " + p.getApellidos()); 
                valor = new BigDecimal(p.getIdentificacion());
                System.out.println("Identificación: "+ p.getIdentificacion() + " Identificación: " + valor.toString() ); 
                valor = new BigDecimal(p.getSalario());
                System.out.println("Cargo "+ p.getCargo() + " Salario " + valor.toString() + " Fecha de ingreso " + formatoFecha.format(p.getFechaIngreso()) );             
                System.out.println("---------------------------------------------------------------");
         }
         System.out.println("---------------------------------------------------------------");
         
    }
}
