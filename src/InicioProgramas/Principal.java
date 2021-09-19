package InicioProgramas;
import Cuentas.*;
import Personas.*;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {
    public static void main(String []argumentos  ) throws ParseException 
    {
            
        Persona matriz[]=new Persona[10];
        //hacer com mas de una jerarquia            
         System.out.print("Herencia de la clase Persona");
         Date ahora = new Date();
         //Date ahora;
         SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");         
         ahora=formatoFecha.parse("01-03-2000");
         Empleado ob = new Empleado("Administrador", ahora, 2000000,86987222,"JUAN ANDRES","MORALES DIAZ");
         
         Persona y = new Persona(86987222,"JUAN ANDRES","MORALES DIAZ");
         ob=(Empleado)y;
         
         BigDecimal valor = new BigDecimal(ob.getIdentificacion());         
         //System.out.println("Empleado "+ " Identificación "+ valor.toString() +" Nombres "+ob.getNombres() + " Apellidos " + ob.getApellidos()); 
         valor = new BigDecimal(ob.getSalario());  
         //System.out.println("Cargo "+ ob.getCargo() + " Salario " + valor.toString() + " Fecha de ingreso " + formatoFecha.format(ob.getFechaIngreso()) );             
         Empleado ob1= new Empleado("Ad", ahora, 1688780,7222,"ANDRES","MORALES DIAZ");
         Empleado ob2 = new Empleado("Adm", ahora, 1300000,987222,"JUAN ","MORALES ");
         Empleado ob3 = new Empleado("Admi", ahora, 1300000,6987222,"JOSE","DIAZ");
         Empleado ob4 = new Empleado("Admin", ahora, 1405000,987222,"PEDRO","MARTINEZ");
         matriz[0]=ob;
         matriz[1]=ob1;
         matriz[2]=ob2;
         matriz[3]=ob3;
         matriz[4]=ob4;         
         System.out.println("---------------------------------------------------------------");             
         for (int x=0;x<5;x++)
         {
             Empleado o;
             o = (Empleado) matriz[x];             
             valor = new BigDecimal(o.getIdentificacion());         
             System.out.println("Empleado "+ " Identificación "+ valor.toString() +" Nombres "+o.getNombres() + " Apellidos " + o.getApellidos()); 
             valor = new BigDecimal(o.getSalario());  
             System.out.println("Cargo "+ o.getCargo() + " Salario " + valor.toString() + " Fecha de ingreso " + formatoFecha.format(o.getFechaIngreso()) );             
          }
         Estudiante es1 = new Estudiante(1600001201,"INGENIERIA DE SISTEMAS", 12120992,"SANDRA","LINARES");
         Estudiante es2 = new Estudiante(1610001202,"INGENIERIA ELECTRONICA", 12109333,"JUAN","CALDERON");
         Estudiante es3 = new Estudiante(1650001203,"INGENIERIA INDUSRIAL", 12120993,"CESAR","RAMIREZ");
         Estudiante es4 = new Estudiante(1600001204,"INGENIERIA DE SISTEMAS", 12148555,"PEDRO","ROMERO");
         Estudiante es5 = new Estudiante(1600001205,"INGENIERIA DE SISTEMAS", 12134444,"LUIS","DIAZ");         
         matriz[5]=es1;
         matriz[6]=es2;
         matriz[7]=es3;
         matriz[8]=es4;
         matriz[9]=es5;         
         for (int x=5;x<matriz.length;x++)
         {
             Estudiante o;
             o = (Estudiante) matriz[x];
             valor = new BigDecimal(o.getIdentificacion());  
             System.out.println("Estudiante "+ " Identificación "+ valor.toString() +" Nombres "+o.getNombres() + " Apellidos " + o.getApellidos()); 
             valor = new BigDecimal(o.getCodigo() );  
             System.out.println("Programa "+ o.getPrograma() + " Codigo " + valor.toString() );             
          }
         
         System.out.println("EL tipo de dato de cada posición es...");
         for (int x=0;x<matriz.length;x++)
             if (matriz[x] instanceof Empleado)
             {
                System.out.println("Matriz["+ x + "]=Empleado"    );             
             }
             else if (matriz[x] instanceof Estudiante)
             {
                System.out.println("Matriz["+ x + "]=Estudiante"    );             
             }
             
          }
         /*
         System.out.print("Herencia de la clase Persona");
         Date ahora = new Date();
         Empleado ob = new Empleado("Administrador", ahora, 2000000,86987222,"JUAN ANDRES","MORALES DIAZ");
         SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");         
         BigDecimal valor = new BigDecimal(ob.getIdentificacion());         
         System.out.println("Empleado "+ " Identificación "+ valor.toString() +" Nombres "+ob.getNombres() + " Apellidos " + ob.getApellidos()); 
         valor = new BigDecimal(ob.getSalario());  
         System.out.println("Cargo "+ ob.getCargo() + " Salario " + valor.toString() + " Fecha de ingreso " + formatoFecha.format(ob.getFechaIngreso()) );          
         
         System.out.println("Herencia de la clase Cuenta");
         System.out.println("---------------------------------------------------------------------------------------------------");
         System.out.println("Herencia de la clase Cuenta ---> Cuenta Ahorros");
         CuentaAhorros micuenta1 =new CuentaAhorros(25000,"JOSE CALDERON","5319803-899",0,0);         
         System.out.println("Cliente-->" + micuenta1.getCliente());
         System.out.println("Numero de cuenta-->" + micuenta1.getNumerocuenta() );
         System.out.println("Cuota de mantenimiento-->" + micuenta1.getCuotamantenimiento());
         System.out.println("Saldo inicial-->" + micuenta1.getSaldo() );
         System.out.println("Adicionar dinero --> 100000");
         micuenta1.setSaldo(100000);
         System.out.println("Saldo actual-->" + micuenta1.getSaldo() );
         System.out.println("---------------------------------------------------------------------------------------------------");
         System.out.println("Herencia de la clase Cuenta ---> Cuenta Debito");
         CuentaDebito micuenta2 = new CuentaDebito(45000,"00098999-23",1,100,"SANDRA MILENA PALACIOS","0012383-001",0,0);         
         System.out.println("Cliente-->" + micuenta2.getCliente());
         System.out.println("Numero de cuenta-->" + micuenta2.getNumerocuenta() );
         System.out.println("Cuota de mantenimiento-->" + micuenta2.getCuotaMantenimiento());
         System.out.println("Chequera-->" + micuenta2.getChequera());                  
         System.out.println("Cheque inicial-->" + micuenta2.getNumeracionInicial() );
         System.out.println("Cheque final-->" + micuenta2.getNumeracionFinal());
         System.out.println("Saldo inicial-->" + micuenta2.getSaldo() );
         System.out.println("Adicionar dinero --> 5000000");
         micuenta2.setSaldo(5000000);
         System.out.println("Saldo actual-->" + micuenta2.getSaldo() );
         System.out.println("---------------------------------------------------------------------------------------------------");
         
       }
       * 
       */
}
