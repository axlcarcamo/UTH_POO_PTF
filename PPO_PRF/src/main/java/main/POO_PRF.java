/*
Univerisidad Tecnologica de Honduras
Catedratico : Ing. Walter Suazo.
Tema        : Proyecto final.
Proyecto    : Sistema electoral
Clase       : Progframacion Orientada a Objetos.
Grupo       : F-1
Fecha       : 20201022    22:37 Inicio
 */

/*
integrantes de grupo:

- Odeth Torrez        Numero de cuenta:    
- Yisela Molina	      Numero de cuenta:
- Zurisadai Mejia     Numero de cuenta:

- Axel Carcamo.       Numero de cuenta:
- Frelyn Aguilar.     Numero de cuenta:
- Jesison Hernandez   Numero de cuenta:

*/
package main;

/*
 * @author axelcarcamo
 */

import java.util.Scanner;
public class POO_PRF {
  public static void main(String[] args) {
	  Scanner tD=new Scanner(System.in);
		
    // Declaracion de variables
    
    
    // Datos tipo entero
    
    int op1=0; // Gestion de opciones principal
    int op2=0; // Registro de candidatos
    
    /* Datos tipo String (Cadena de Texto).
    String nombre="";     // Debe ir el nombre completo en el ingreso de datos.
    String nombreV="";    // Debe ir el nombre completo en el ingreso de datos. V hace referencia que es la variable que se debe asociar al votante
    String edad="";	  // Solo entero crear una condicion que no admita numeros negativos o decimales.
    String edadV="";      // Solo entero crear una condicion que no admita numeros negativos o decimales.V hace referencia que es la variable que se debe asociar al votante
    String direccion="";  // Direccion no tan especifica.
    String direccionV=""; // Direccion no tan especifica.V hace referencia que es la variable que se debe asociar al votante
    String centro="";	  // Centro de botacion Nombre de la escuela o centro educativo donde realizo su voto.
    String mesa="";       // Numero de mesa donde voto.
    */
    
    // Arreglos tipo String ( Nombres, NombresV, Direcciones, DireccionesV).
    String [] nombres  = new String [4]; // 0 P. Naturaleza Hondurena 1 P. Nuevo amanecer 2 P. Light Blues
    String [] direcciones = new String [4];
    String [] nombresV = new String [10];
    String [] direccionesV = new String[10];
    
  
   /* Banner correspondiente a la univerisidad */
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
	  System.out.println(" ===================================GESTION DE OPCIONES PRINCIPAL===========================");
	  System.out.println(" 01 Registro de candidatos. ");
	  System.out.println(" 02 Registro de voto de un ciudadano");
	  System.out.println(" 03 Registro de centros de votacion");
	  System.out.println(" 04 Salir ");
	  System.out.println(" ===================================GESTION DE OPCIONES PRINCIPAL===========================");
	  System.out.println(" Su opcion ingresada es: "); op1=tD.nextInt();
	  } // llave de cierre del DoWhile Menu Principal
	  while(op1>4);
	  
	  switch (op1) {
		  case 1:
			  do {
			  System.out.println(" ===========================================================================================");
			  System.out.println("");
			  System.out.println(" Bienvenido al registro de candidatos donde le comentamos que existen unicamente 3 partidos ");
			  System.out.println(" A los cuales se puede asociar un candidato los cuales abajo se describen:                  ");
			  System.out.println(" 01 Partido Naturalez Hondureña");
			  System.out.println(" 02 Partido Nuevo amanecer ");
			  System.out.println(" 03 Partido Light Blues    ");
			  System.out.println(" 04 Salir ");
			  System.out.println(" ===========================================================================================");
			  System.out.println(" Su opcion ingresada es: "); op2 = tD.nextInt();
			  } while (op2>4 && op2<0);// llave de cierre do While seleccion de partido politico
			  
			  switch (op2){
				  case 1:
					  System.out.println(" ===========================================================================================");
					  System.out.println(" Su seleccion corresponde al Partido Naturaleza Hondureña                                   ");
					  System.out.println(" Necesitamos los datos general del candidato:                                               ");
					  System.out.println("  Ingrese el nombre completo del candidato: "); nombres[0]= tD.nextLine();
					  System.out.println(" Ingrese la direccion exacta del candidato: "); direcciones[0]=tD.nextLine();
					  System.out.println(" Datos ingresados correctamente su candidato fue inscrito para la participacion electoral   ");
					  System.out.println(" Detalles registrados:                                                                      ");
					  System.out.println( " Nombre: " + nombres[0] + " Direccion: " + direcciones[0]);
					  System.out.println("  Ahora forma parte del PARTIDO NATURALEZA HONDURENA");
					  System.out.println(" ===========================================================================================");
				
					  break;
				  case 2: 
					  
					  System.out.println(" ===========================================================================================");
					  System.out.println(" Su seleccion corresponde al Partido Nuevo Amanecer");
					  System.out.println(" Necesitamos los datos general del candidato: ");
					  System.out.println("  Ingrese el nombre completo del candidato: "); nombres[1]= tD.nextLine();
					  System.out.println(" Ingrese la direccion exacta del candidato: "); direcciones[1]=tD.nextLine();
					  System.out.println(" Datos ingresados correctamente su candidato fue inscrito para la participacion electoral ");
					  System.out.println(" Detalles registrados: ");
					  System.out.println( " Nombre: " + nombres[1] + " Direccion: " + direcciones[1] );
					  System.out.println("  Ahora forma parte del PARTIDO NUEVO AMANECER");
					  System.out.println(" ===========================================================================================");
					  break;
				  case 3: 
					  System.out.println(" ===========================================================================================");
					  System.out.println(" Su seleccion corresponde al Partido Light Blues");
					  System.out.println(" Necesitamos los datos general del candidato: ");
					  System.out.println("  Ingrese el nombre completo del candidato: "); nombres[2] = tD.nextLine();
					  System.out.println(" Ingrese la direccion exacta del candidato: "); direcciones[2] = tD.nextLine();
					  System.out.println(" Datos ingresados correctamente su candidato fue inscrito para la participacion electoral ");
					  System.out.println(" Detalles registrados: ");
					  System.out.println(" Nombre: " + nombres[2] + " Direccion: " + direcciones[2]);
					  System.out.println("  Ahora forma parte del PARTIDO LIGHT BLUES");
					  System.out.println(" ===========================================================================================");
					  break;
				  case 4:
					  System.out.println(" ===========================================================================================");
					  System.out.println(" Usted a decidido abandonar el proceso de registro o incripsion de un candidato en este     ");
					  System.out.println(" Esperamos cuente con la informacion necesaria en posteriorme te en caso de ser asi enviarla");
					  System.out.println(" a la siguiente direciom de correo: carcamo@me.com con el fin de validarla                  ");
					  System.out.println(" ===========================================================================================");
					  System.out.println("                  UNIVERSIDAD TECNOLOGICA DE HONDURAS GRUPO F LUN-JUE 19:20                 ");
					  System.out.println(" ===========================================================================================");
					  break;
					  
				 default:
					 System.out.print(" Saliendo.");System.out.print(".....");System.out.print(".....");System.out.print(".....");System.out.print(".....");
					 System.out.println(" ===========================================================================================");
					 System.out.println("                  UNIVERSIDAD TECNOLOGICA DE HONDURAS GRUPO F LUN-JUE 19:20                 ");
					 System.out.println(" ===========================================================================================");
					 break;
				  
			  } // llave de cierre switch para asociacion de un cantidado
			  
			  break;
		  case 2: 
			  System.out.println(" ===========================================================================================");
			  System.out.println("");
			  System.out.println(" Bienvenido al registro de voto como ciudadano");
			  System.out.println(" Ingrese su nombre: "); 
			  break;
		  case 3: 
			  System.out.println("");
			  break;
		  case 4: 
			  System.out.println(" ===========================================================================================");
			  System.out.println("           Su opcion fue la numero 4 por la cual ha decicido salir del software             ");
			  System.out.println(" ===========================================================================================");
			  System.out.println("                  UNIVERSIDAD TECNOLOGICA DE HONDURAS GRUPO F LUN-JUE 19:20                 ");
			  System.out.println(" ===========================================================================================");
			  break;
		  default:
			  System.out.println(" ===========================================================================================");
			  System.out.println(" La opcion ingresada no existe por ello y por razones de seguridad el sistema cerrara esta  ");
			  System.out.println(" sesion en caso de tener problemas con la gestion de opciones buscar el grupo F de la clase ");
			  System.out.println(" Programacio Orientada a Objetos del Ing. Walter Suazo ellos le podrian ayudar.             ");
			  System.out.println(" ===========================================================================================");
			  System.out.println("                  UNIVERSIDAD TECNOLOGICA DE HONDURAS GRUPO F LUN-JUE 19:20                 ");
			  System.out.println(" ===========================================================================================");
			  
			  break;
		  
	  }// llave de cierre del switch menu de opciones.
		
  } // llave cierra la metodo main
}// llave cierra clase
// Nomenclaturas
// Nomenclaturas
// Nomenclaturas
