
package main.prf_ver_d;

import java.util.*;

public class EJ_Funciones {
    public static void main(String[] args) {
        Scanner tD1=new Scanner (System.in);
        
        ArrayList <String> RINFP =new ArrayList<String>();
        
        int op1=0;
        

        
          System.out.println(" ===========================================================================================");
	  System.out.println(" ||                                                                                       ||");
	  System.out.println(" ||                                                                                       ||");
	  System.out.println(" ||                                                                                       ||");
	  System.out.println(" ||                         7MMF     7MF MMPMMMMMMYMM  7MMF    7MMF                       ||");
	  System.out.println(" ||                          MM       M  P    MM    7   MM      MM                        ||");
	  System.out.println(" ||                          MM       M       MM        MM      MM                        ||");
	  System.out.println(" ||                          MM       M       MM        MMmmmmmmMM                        ||");
	  System.out.println(" ||                          MM       M       MM        MM      MM                        ||");
	  System.out.println(" ||                          YM       M       MM        MM      MM                        ||");
	  System.out.println(" ||                           bbmmmmdd       JMML      JMML    JMML                       ||");
	  System.out.println(" ||                                                                                       ||");
	  System.out.println(" ||                                                                                       ||");
	  System.out.println(" ||                            Universidad Tecnologica de Honduras                        ||");
	  System.out.println(" ||                              Programacion Orientada a Objetos                         ||");
	  System.out.println(" || La universidad en colaboracion con el estado trabajo en un desarrollo para el sistema ||");
	  System.out.println(" ||        Electoral para la siguiente gestion de elecciones de nuestro Pais              ||");
	  System.out.println(" ===========================================================================================");
	  System.out.println(" ===========================================================================================");
	  System.out.println("");
	  do{
	  System.out.println(" ==================================== MENU DE OPCIONES PRINCIPAL ===========================");
	  System.out.println(" 01 Registro de candidato presidencial. ");
	  System.out.println(" 02 Registro de candidato para alcalde. ");
          System.out.println(" 03 Regustro de cantidato para diputado ");
	  System.out.println(" 04 Procedimiento de votacion ");
	  System.out.println(" 05 Visualizacion de boleta presidencial");
	  System.out.println(" 06 Visualizacion de boleta para alcaldes");
          System.out.println(" 07 Visualizacion de boleta de diputados");
          System.out.println(" 08 Estado de votacion");
          System.out.println(" 09 Visualizar porcentaje de votos por segmento");
	  System.out.println(" 10 Salir ");
	  System.out.println(" ==================================== MENU DE OPCIONES PRINCIPAL ===========================");
          System.out.println(" Su opcion ingresada es: "); op1=tD1.nextInt();
	  } /* llave de cierre del DoWhile Menu Principal */ while(op1>10);
          if (op1==1){
              ELP();
          }
          
    }
    
    public static void EN1(){
        // EN1 = Enunciado uno puede ser un titulo o cabezera previo a la solicitud de informacion. Tomar en cuenta y considerar.
        //       Sulen ser indicaciones que usaremos en el proyecto.
        
        System.out.println(" ============================================================================================");  
        System.out.println(" ============================= REGISTRO DE CANDIDATO ========================================");
        System.out.println(" ============================================================================================");
        System.out.println(" En este segmento se ingresan lo datos generales del postulante al cargo de presidencia por  ");
        System.out.println(" realizar el ingreso de informacion de manera correcta y sin errores para la gestion de datos");
        System.out.println(" eficiente asi tambien la consulta o busqueda en general segun el caso lo amerite");
        System.out.println(" ============================================================================================");
        System.out.println(" ");
    }
    
    public static void ELP(){
        
        // ELP = Eleccion de partido politico. Presidentes
        Scanner tD=new Scanner(System.in);
        int op1
        
          do{
	  System.out.println(" =============================== SELECCION DE FILIACION POLITICA ===========================");
	  System.out.println(" 01 Partido Liberal. ");
	  System.out.println(" 02 Partido Nacional ");
          System.out.println(" 03 Partido Democracia Cristiana");
	  System.out.println(" 04 Partido Unificacion Democratica ");
	  System.out.println(" 05 rtido Alianza Patriotica");
	  System.out.println(" 06 Partido Alianza y Refundacion");
          System.out.println(" 07 Partido Anticorrupcion");
          System.out.println(" 08 Partido Innovacion");
	  System.out.println(" 09 Salir ");
	  System.out.println(" =============================== SELECCION DE FILIACION POLITICA ===========================");
          System.out.println(" Su opcion ingresada es: "); op1=tD.nextInt();
          }while(op1>9);
          if (op1==1){
              
          }
    }
    
    public static void RINFP(){
       // RINFP = Registro de informacion de presidentes. 
       Scanner tD=new Scanner(System.in);
        System.out.println("Por favor ingerse su nombre completo: "); 
        ArrayList.add("")=tD.nextLine();
       
       
       
        
    }
    
}

/* Partidos Politicos.
Actualmente son 8 partidos activos.

01 Partido Liberal.
02 Partido Nacional.
03 Partido Democracia Cristiana.
04 Partido Unificacion Democratica.
05 Partido Alianza Patriotica.
06 Partido Alianza y Refundacion.
07 Partido Anticorrupcion.
08 Partido Innovacion y Unidad Social

Tomar en cuenta que alguna veces los partidos tienen distinto movimientos a lo interior.
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Datos que se requieren por participante:
Nombre completo    :
Edad               :
Numero de Identidad:
Nacionalidad       :
Departamento       :
Estado Civil       :
Nombre del Movimiento:

*/


/* Alcaldes
Pueden ser segun los movimientos a lo interno del partido.

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Datos que se requieren por participante:
Nombre completo    :
Edad               :
Numero de Identidad:
Nacionalidad       :
Estado Civil       :
*/

/* Diputados

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Datos que se requieren por participante:
Nombre completo    :
Edad               :
Numero de Identidad:
Nacionalidad       :
Estado Civil       :

*/
