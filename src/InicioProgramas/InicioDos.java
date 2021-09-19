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
public class InicioDos {
    public static void main(String []argumentos  ) throws ParseException
    {
         Estudiante es1 = new Estudiante(1600001201,"INGENIERIA DE SISTEMAS", 1212220992,"SANDRA","LINARES");
         Estudiante es2 = new Estudiante(1610001202,"INGENIERIA ELECTRONICA", 1212349333,"JUAN","CALDERON");
         Estudiante es3 = new Estudiante(1650001203,"INGENIERIA INDUSRIAL", 1212099356,"CESAR","RAMIREZ");
         Estudiante es4 = new Estudiante(1600001204,"INGENIERIA DE SISTEMAS", 1214878555,"PEDRO","ROMERO");
         Estudiante es5 = new Estudiante(1600001205,"INGENIERIA DE SISTEMAS", 121793444,"LUIS","DIAZ"); 
         System.out.println("-----------------ARRAY DE ESTUDIANTES----------------------------------------------");
         Estudiante matriz[]=new Estudiante[5];  
         matriz[0]=es1;
         matriz[1]=es2;
         matriz[2]=es3;
         matriz[3]=es4;
         matriz[4]=es5;        
         for (int x=0;x<matriz.length;x++)
         {
             System.out.println("---------------------------------------------------------------");
             Estudiante p = matriz[x];
             BigDecimal valor = new BigDecimal(p.getIdentificacion());  
             System.out.println("Estudiante "+ " Identificación "+ valor.toString() +" Nombres "+p.getNombres() + " Apellidos " + p.getApellidos()); 
             valor = new BigDecimal(p.getCodigo() );  
             System.out.println("Programa "+ p.getPrograma() + " Codigo " + valor.toString() );             
             // System.out.println("---------------------------------------------------------------");
          }
         System.out.println("---------------------------------------------------------------");
    }
}
