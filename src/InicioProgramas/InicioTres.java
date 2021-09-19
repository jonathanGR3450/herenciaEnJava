/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InicioProgramas;
import Cuentas.*;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author ingsistemas
 */
public class InicioTres {
     public static void main(String []argumentos  )
     {
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
}
