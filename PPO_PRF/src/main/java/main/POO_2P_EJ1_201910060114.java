/*
Univerisidad Tecnologica de Honduras
Catedratico : Ing. Walter Suazo.
Clase       : Progframacion Orientada a Objetos.
Fecha       : 20201027    19:30 Inicio
Tarea       : Autoasignacion.
 */


/* ===========================================  DESCRIPCION: ====================================================
Previo al arranque del proyecto de manera particular estado generando codigo con el fin de practica y entender 
cada una de las sentencias se que quizas no funcione al 100% pero de a poco estado involucrando lo aprendido bajo
mi criterio.

Como detalle puntual con el fin de poder dar una mejor lectura a codigo he hido comentando para que la intepretacion
sea lo mas facil posible se que el camino es bastante pero estoy hechandole con todo. y donde tengo dudas con respecto
a mi codigo es que cuando se llama el metodo Scanner (se salta una linea sin solicitar el ingreso o la utilizacion de 
la siguiente linea

*/
package main;

/*
 * @author axel carcamo
 */

import java.util.Scanner;
public class POO_2P_EJ1_201910060114 {
  public static void main(String[] args) {
	  Scanner tD=new Scanner(System.in);
		
    // Declaracion de variables
 
    // Datos tipo entero
    
    int op1=0; // Gestion de opciones principal
    int op2=0; // Registro de candidatos
    int op3=0; // Switch seleccion de contador de votos segun ciudad.
    int v100; int v101=0; int v102=0; int v103=0; int v104=0; int v105=0; int v106=0; int v107=0; int v108=0; int v109=0;
    int v10=0; int v11=0; int v12=0; int v13=0; int v14=0; int v15=0; int v16=0; int v17=0; int v18=0; int v19=0; // Registro de votos Primer partido
    int vpn1=0;
    int v20=0; int v21=0; int v22=0; int v23=0; int v24=0; int v25=0; int v26=0; int v27=0; int v28=0; int v29=0; // Registro de votos Segundo partido
    int vpn2=0;
    int v30=0, int v31=0, int v32=0, int v33=0, int v34=0, int v35=0, int v36=0, int v37=0, int v38=0, int v39=0; // Registro de votos Tercer Partido
    int vpn3=0;
    
    int vpn4=0;
    int vpn5=0;
    int vpn6=0;
    int vpn1=0;  int vpn12=0;  int vpn13=0; 
    int vpn21=0; int vpn22=0; int vpn23=0; 
    int vpn31=0; int vpn32=0; int vpn33=0;
    
    int vc1, vc2, vc3, vc4, vc5, vc6, vc7, vc8, vc9, vc10; // Contabilizar voto
    int crt, lez, cm;
    char S,s,N,n; // Consulta si desea continuar con el registro de votantes.
    
    // Arreglos tipo String ( Nombres, NombresV, Direcciones, DireccionesV).
        String []nombres =new String[22]; // 
        String [] direcciones =new String[22]; // 
        String [] nombresV =new String[10];
        String [] centrosV =new String[10];
	String au1="";
	String au2="";
	String au3="";
	String au4="";
    int []cVT =new int[10];
    int []vt  =new int[10];
    int []nID =new int[10];
    
    
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
	  System.out.println(" 01 Registro de candidatos.          ");
	  System.out.println(" 02 Registro de voto de un ciudadano ");
	  System.out.println(" 03 Registro de votos foraneos       ");
	  System.out.println(" 04 Salir                            ");
	  System.out.println(" ===================================GESTION DE OPCIONES PRINCIPAL===========================");
	  System.out.println(" Su opcion ingresada es: "); op1=tD.nextInt();
	  } /* llave de cierre del DoWhile Menu Principal */ while(op1>4 || op1<=0);
	  
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
			  } while (op2>4 || op2<0);// llave de cierre do While seleccion de partido politico
			  
			  switch (op2){
				  case 1:
					  System.out.println(" ===========================================================================================");
					  System.out.println(" Su seleccion corresponde al Partido Naturaleza Hondureña                                   ");
				 	  System.out.println(" Necesitamos los datos general del candidato:                                               ");
					  System.out.println(" Ingrese el nombre completo del candidato: "); 
					  au1=tD.nextLine();
					  nombres[1]=au1;
					  System.out.println(" Ingrese la direccion exacta del candidato: "); 
					  au2=tD.nextLine();
					  direcciones[0]=au2;
					  // System.out.print(" Ingrese la direccion exacta del candidato: ");  direcciones[0][0]=tD.nextLine();
					  System.out.println(" Datos ingresados correctamente su candidato fue inscrito para la participacion electoral   ");
					  System.out.println(" Detalles registrados:                                                                      ");
					  System.out.println(" Nombre: " + nombres[0]);
					  System.out.println(" Direccion: " + direcciones[0]);
					  System.out.println(" Ahora forma parte del PARTIDO NATURALEZA HONDURENA");
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
					  break;
					  
				 default:
					 System.out.print(" Saliendo.");System.out.print(".....");System.out.print(".....");System.out.print(".....");System.out.print(".....");
					 System.out.println(" ===========================================================================================");
					 break;
				  
			  } // llave de cierre switch para asociacion de un cantidado
			  
			  break;
		  case 2: 
			  System.out.println(" ===========================================================================================");
			  System.out.println(" Votante numero 01");
			  System.out.println(" Bienvenido al registro de voto como ciudadano");
			  System.out.print("   Ingrese el nombre completo segun este aparesca en su identificacion: "); nombresV[0][0]= tD.nextLine();
			  System.out.print("   Ingrese la direccion exacta de su casa o lugar donde recide: "); direccionesV[0][0] =tD.nextLine();
			  System.out.println(" ===========================================================================================");
			  System.out.println(" Seleccione a que partido otorgara su voto: ");
			  do{
			  System.out.println(" ===========================================================================================");
			  System.out.println("   01 Partido Naturalez Hondureña (ingreso debe ser numerico)");
			  System.out.println("   02 Partido Nuevo amanecer      (ingreso debe ser numerico) ");
			  System.out.println("   03 Partido Light Blues         (ingreso debe ser numerico)");
			  System.out.println(" ===========================================================================================");
			  v100=tD.nextInt();
			  }while(v100>3);
			  if(v100==1)
			  {
				  v10=v101;
			  } 
			  if (v100==2){
				  v20=v101;
			  }
			  if (v100==3){
				  v30=v101;
			  }
			  System.out.print("   Ingrese su numero de identidad: "); nID[0] = tD.nextInt();
			  System.out.println("                   Su nombres es: " + nombresV[0] );
			  System.out.println("                 Su Direccion es: " + direccionesV[0]);
			  System.out.println(" Su numero de indentificacion es: " + nID[0]);
			  System.out.println(" ===========================================================================================");
			  System.out.println("");
			  System.out.println(" ===========================================================================================");
			  System.out.println(" Votante numero 02");
			  System.out.println(" Bienvenido al registro de voto como ciudadano");
			  System.out.print("   Ingrese el nombre completo segun este aparesca en su identificacion: "); nombresV[1] = tD.nextLine();
			  System.out.print("   Ingrese la direccion exacta de su casa o lugar donde recide: "); direccionesV[1] =tD.nextLine();
			  do {
			  System.out.println(" ===========================================================================================");
			  System.out.println(" Seleccione a que partido otorgara su voto: ");
			  System.out.println(" ===========================================================================================");
			  System.out.println("   01 Partido Naturalez Hondureña (ingreso debe ser numerico)");
			  System.out.println("   02 Partido Nuevo amanecer      (ingreso debe ser numerico) ");
			  System.out.println("   03 Partido Light Blues         (ingreso debe ser numerico)");
			  System.out.println(" ===========================================================================================");
			  v101 = tD.nextInt();
			  }while (v101>3);
			  if(v101==1)
			  {
				  v11=v101;
			  } 
			  if (v101==2)
			  {
				  v21=v101;
			  }
			  if (v101==3)
			  {
				  v31=v101;
			  }
			  System.out.print("   Ingrese su numero de identidad: "); nID[1] = tD.nextInt();
			  System.out.println("                   Su nombres es: " + nombresV[1] );
			  System.out.println("                 Su Direccion es: " + direccionesV[1]);
			  System.out.println(" Su numero de indentificacion es: " + nID[1]);
			  System.out.println(" ===========================================================================================");
			  System.out.println("");
			  System.out.println(" ===========================================================================================");
			  System.out.println(" Votante numero 03");
			  System.out.println(" Bienvenido al registro de voto como ciudadano");
			  System.out.print("   Ingrese el nombre completo segun este aparesca en su identificacion: "); nombresV[2] = tD.nextLine();
			  System.out.print("   Ingrese la direccion exacta de su casa o lugar donde recide: "); direccionesV[2] =tD.nextLine();
			  do {
			  System.out.println(" ===========================================================================================");
			  System.out.println(" Seleccione a que partido otorgara su voto: ");
			  System.out.println(" ===========================================================================================");
			  System.out.println("   01 Partido Naturalez Hondureña (ingreso debe ser numerico)");
			  System.out.println("   02 Partido Nuevo amanecer      (ingreso debe ser numerico) ");
			  System.out.println("   03 Partido Light Blues         (ingreso debe ser numerico)");
			  System.out.println(" ===========================================================================================");
			  v102 = tD.nextInt();
			  } while (v101>3);
			  if(v102==1)
			  {
				  v12=v102;
			  } 
			  if (v102==2){
				  v22=v102;
			  }
			  if (v102==3){
				  v32=v102;
			  }
			  System.out.print("   Ingrese su numero de identidad: "); nID[2] = tD.nextInt();
			  System.out.println("                   Su nombres es: " + nombresV[2] );
			  System.out.println("                 Su Direccion es: " + direccionesV[2]);
			  System.out.println(" Su numero de indentificacion es: " + nID[2]);
			  System.out.println(" ===========================================================================================");
			  System.out.println("");
			  do {
			  System.out.print(" Desea continuar con el ingreso de votantes: (S|s  o  N|n "); op3 = tD.nextInt();
			  }while(op3!=S && op3!=s && op3!=N && op3!=n);
			  switch (op3) {
				  case 'S':
					  System.out.println(" ===========================================================================================");
					  System.out.println(" Votante numero 04");
					  System.out.println(" Bienvenido al registro de voto como ciudadano");
					  System.out.print("   Ingrese el nombre completo segun este aparesca en su identificacion: "); nombresV[2] = tD.nextLine();
					  System.out.print("   Ingrese la direccion exacta de su casa o lugar donde recide: "); direccionesV[2] = tD.nextLine();
					  do{
				          System.out.println(" ===========================================================================================");
				          System.out.println(" Seleccione a que partido otorgara su voto: ");
					  System.out.println(" ===========================================================================================");
					  System.out.println("   01 Partido Naturalez Hondureña (ingreso debe ser numerico)");
					  System.out.println("   02 Partido Nuevo amanecer      (ingreso debe ser numerico) ");
				          System.out.println("   03 Partido Light Blues         (ingreso debe ser numerico)");
					  System.out.println(" ===========================================================================================");
					  v103 = tD.nextInt();
					  }while (v103 > 3);
					  if (v103 == 1) 
					  {
						  v13 = v103;
					  }
					  if (v102 == 2)
					  {
						  v23 = v103;
					  }
					  if (v102 == 3)
					  {
						  v33 = v103;
					  }
					  System.out.print("   Ingrese su numero de identidad: "); nID[2] = tD.nextInt();
					  System.out.println("                   Su nombres es: " + nombresV[3]);
					  System.out.println("                 Su Direccion es: " + direccionesV[3]);
					  System.out.println(" Su numero de indentificacion es: " + nID[3]);
					  System.out.println(" ===========================================================================================");
					  System.out.println("");
					  System.out.println(" ===========================================================================================");
					  System.out.println(" Votante numero 05");
					  System.out.println(" Bienvenido al registro de voto como ciudadano");
					  System.out.print("   Ingrese el nombre completo segun este aparesca en su identificacion: "); nombresV[2] = tD.nextLine();
					  System.out.print("   Ingrese la direccion exacta de su casa o lugar donde recide: "); direccionesV[2] = tD.nextLine();
					  do{
				          System.out.println(" ===========================================================================================");
				          System.out.println(" Seleccione a que partido otorgara su voto: ");
					  System.out.println(" ===========================================================================================");
					  System.out.println("   01 Partido Naturalez Hondureña (ingreso debe ser numerico)");
					  System.out.println("   02 Partido Nuevo amanecer      (ingreso debe ser numerico) ");
				          System.out.println("   03 Partido Light Blues         (ingreso debe ser numerico)");
					  System.out.println(" ===========================================================================================");
					  v104 = tD.nextInt();
					  }
					  while (v104 > 3);
					  if (v104 == 1) 
					  {
						  v14 = v104;
					  }
					  if (v104 == 2) 
					  {
						  v24 = v104;
					  }
					  if (v104 == 3)
					  {
						  v34 = v104;
					  }
					  System.out.print("   Ingrese su numero de identidad: "); nID[2] = tD.nextInt();
					  System.out.println("                   Su nombres es: " + nombresV[6]);
					  System.out.println("                 Su Direccion es: " + direccionesV[6]);
					  System.out.println(" Su numero de indentificacion es: " + nID[6]);
					  System.out.println(" ===========================================================================================");
					  System.out.println("");
					  break;
				  case 's':
					  System.out.println(" ===========================================================================================");
					  System.out.println(" Votante numero 06");
					  System.out.println(" Bienvenido al registro de voto como ciudadano");
					  System.out.print("   Ingrese el nombre completo segun este aparesca en su identificacion: "); nombresV[2] = tD.nextLine();
					  System.out.print("   Ingrese la direccion exacta de su casa o lugar donde recide: "); direccionesV[2] = tD.nextLine();
					  do{
				          System.out.println(" ===========================================================================================");
				          System.out.println(" Seleccione a que partido otorgara su voto: ");
					  System.out.println(" ===========================================================================================");
					  System.out.println("   01 Partido Naturalez Hondureña (ingreso debe ser numerico");
					  System.out.println("   02 Partido Nuevo amanecer      (ingreso debe ser numerico) ");
				          System.out.println("   03 Partido Light Blues         (ingreso debe ser numerico)");
					  System.out.println(" ===========================================================================================");
					  v105 = tD.nextInt();
					  }
					  while (v105 > 3);
					  if (v105 == 1)
					  {
						  v15 = v105;
					  }
					  if (v105 == 2)
					  {
						  v25 = v105;
					  }
					  if (v105 == 3)
					  {
						  v35 = v105;
					  }
					  System.out.print("   Ingrese su numero de identidad: "); nID[2] = tD.nextInt();
					  System.out.println("                   Su nombres es: " + nombresV[4]);
					  System.out.println("                 Su Direccion es: " + direccionesV[4]);
					  System.out.println(" Su numero de indentificacion es: " + nID[4]);
					  System.out.println(" ===========================================================================================");
					  System.out.println("");
					  System.out.println(" ===========================================================================================");
					  System.out.println(" Votante numero 07");
					  System.out.println(" Bienvenido al registro de voto como ciudadano");
					  System.out.print("   Ingrese el nombre completo segun este aparesca en su identificacion: ");  nombresV[2] = tD.nextLine();
					  System.out.print("   Ingrese la direccion exacta de su casa o lugar donde recide: "); direccionesV[2] = tD.nextLine();
					  do{
				          System.out.println(" ===========================================================================================");
				          System.out.println(" Seleccione a que partido otorgara su voto: ");
					  System.out.println(" ===========================================================================================");
					  System.out.println("   01 Partido Naturaleza Hondureña (ingreso debe ser numerico");
					  System.out.println("   02 Partido Nuevo amanecer      (ingreso debe ser numerico) ");
				          System.out.println("   03 Partido Light Blues         (ingreso debe ser numerico)");
					  System.out.println(" ===========================================================================================");
					  v106 = tD.nextInt();
					  }while (v106 > 3);
					  if (v106 == 1)
					  {
						  v16 = v106;
					  }
					  if (v106 == 2)
					  {
						  v26 = v106;
					  }
					  if (v106 == 3)
					  {
						  v36 = v106;
					  }
					  System.out.print("   Ingrese su numero de identidad: "); nID[2] = tD.nextInt();
					  System.out.println("                   Su nombres es: " + nombresV[5]);
					  System.out.println("                 Su Direccion es: " + direccionesV[5]);
					  System.out.println(" Su numero de indentificacion es: " + nID[5]);
					  System.out.println(" ===========================================================================================");
					  System.out.println("");
					  break;
				  case 'N':
					  System.out.print(" Saliendo."); System.out.print("....."); System.out.print("....."); System.out.print("....."); System.out.print(".....");
					  System.out.println(" ===========================================================================================");
					  System.out.println("                  UNIVERSIDAD TECNOLOGICA DE HONDURAS GRUPO F LUN-JUE 19:20                 ");
					  System.out.println(" ===========================================================================================");
					  break;
				  case 'n':
					  System.out.print(" Saliendo."); System.out.print("....."); System.out.print("....."); System.out.print(".....");  System.out.print(".....");
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
			  } // llave de cierre de switch sub menu de ingreso de votantes cuando este requiere seguir ingreaando
			  vpn1= v10+v11+v12+v13+v14+v15+v16+v17+v18+v19; // Conteo de los votos locales (Primer partido)
			  vpn2= v20+v21+v22+v23+v24+v25+v26+v27+v29+v29; // Conteo de los votos locales (Segundo partido)
			  vpn3= v30+v31+v32+v33+v34+v35+v36+v37+v38+v39; // Conteo de los votos locales (Tercer partido)
			  vpn4 = vpn1+ vpn11 + vpn12 + vpn13; // Conteo de votos local y rural Partindo Naturaleza Hondureña.  3 Departamentos adicional a TGU.
			  vpn5 = vpn2+ vpn21 + vpn22 + vpn23; // Conteo de votos local y rural Partindo Nuevo Amanecer.        3 Departamentos adicional a TGU.
			  vpn6 = vpn3+ vpn31 + vpn32 + vpn33; // Conteo de votos local y rural Partindo Light Blues.           3 Departamentos adicional a TGU.
			    
		  case 3: 
			  System.out.println("");
			  do{
			  System.out.println(" ===========================================================================================");
			  System.out.println("                         INGRESO DE VOTOS CONTABULIZADOS AREA FORANEA                       ");
			  System.out.println(" ===========================================================================================");
			  System.out.println(" 01 Cortes");
			  System.out.println(" 02 La esperanza");
			  System.out.println(" 02 Comayagua");
			  System.out.println(" 04 Salir");
			  System.out.println(" ===========================================================================================");
			  System.out.print(" Su opcione es: "); op3 = tD.nextInt();
			  }while(op3>4);
			  switch (op3) {
				  case 1:
					 System.out.println(" ===========================================================================================");
					 System.out.println("                            INGRESO DE VOTOS DEPTO CORTES                                   ");
					 System.out.println(" ===========================================================================================");
					 System.out.println("");
					 System.out.print("    Ingrese la cantidad de votos para el Partido Naturaleza Honduña  "); vpn11 = tD.nextInt();
					 System.out.println("");
					 System.out.println(" ===========================================================================================");
					 System.out.println("");
					 System.out.print("    Ingrese la cantidad de votos para el Partido Nuevo Amanecer  "); vpn21 = tD.nextInt();
					 System.out.println("");
					 System.out.println(" ===========================================================================================");
					 System.out.println("");
					 System.out.print("    Ingrese la cantidad de votos para el Partido Light Blues  "); vpn31 = tD.nextInt();
					 System.out.println("");
					 System.out.println("  Segun la candidad de votos en este deparatamento la distribucion de los mismos es:");
					 System.out.println("  Partido Naturaleza Honduraña tiene: " + vpn11 + " votos en total" );
					 System.out.println("        Partido Nuevo Amanecer tiene: " + vpn21 + " votos en total " );
					 System.out.println("           Partido Light Blues tiene: " + vpn31 + " votos en total " );
					 System.out.println(" ===========================================================================================");
					  break;
				  case 2: 
					 System.out.println(" ===========================================================================================");
					 System.out.println("                            INGRESO DE VOTOS DEPTO LA ESPERANZA                             ");
					 System.out.println(" ===========================================================================================");
					 System.out.println("");
					 System.out.print("    Ingrese la cantidad de votos para el Partido Naturaleza Honduña  "); vpn12 = tD.nextInt();
					 System.out.println("");
					 System.out.println(" ===========================================================================================");
					 System.out.println("");
					 System.out.print("    Ingrese la cantidad de votos para el Partido Nuevo Amanecer  "); vpn22 = tD.nextInt();
					 System.out.println("");
					 System.out.println(" ===========================================================================================");
					 System.out.println("");
					 System.out.print("    Ingrese la cantidad de votos para el Partido Light Blues  "); vpn32 = tD.nextInt();
					 System.out.println("");
					 System.out.println("  Segun la candidad de votos en este deparatamento la distribucion de los mismos es:");
					 System.out.println("  Partido Naturaleza Honduraña tiene: " + vpn12 + " votos en total" );
					 System.out.println("        Partido Nuevo Amanecer tiene: " + vpn22 + " votos en total " );
					 System.out.println("           Partido Light Blues tiene: " + vpn32 + " votos en total " );
					 System.out.println(" ===========================================================================================");
					  break;
				  case 3: 
					 System.out.println(" ===========================================================================================");
					 System.out.println("                            INGRESO DE VOTOS DEPTO COMAYAGUA                                ");
					 System.out.println(" ===========================================================================================");
					 System.out.println("");
					 System.out.print("    Ingrese la cantidad de votos para el Partido Naturaleza Honduña  "); vpn13 = tD.nextInt();
					 System.out.println("");
					 System.out.println(" ===========================================================================================");
					 System.out.println("");
					 System.out.print("    Ingrese la cantidad de votos para el Partido Nuevo Amanecer  "); vpn23 = tD.nextInt();
					 System.out.println("");
					 System.out.println(" ===========================================================================================");
					 System.out.println("");
					 System.out.print("    Ingrese la cantidad de votos para el Partido Light Blues  "); vpn33 = tD.nextInt();
					 System.out.println("");
					 System.out.println("  Segun la candidad de votos en este deparatamento la distribucion de los mismos es:");
					 System.out.println("  Partido Naturaleza Honduraña tiene: " + vpn13 + " votos en total" );
					 System.out.println("        Partido Nuevo Amanecer tiene: " + vpn23 + " votos en total " );
					 System.out.println("           Partido Light Blues tiene: " + vpn33 + " votos en total " );
					 System.out.println(" ===========================================================================================");
					  break;
				  case 4: 
					  System.out.print(" Saliendo."); System.out.print("....."); System.out.print("....."); System.out.print("....."); System.out.print(".....");
					  System.out.println(" ===========================================================================================");
					  break;
				default:
					  System.out.println(" ===========================================================================================");
					  System.out.println(" La opcion ingresada no existe por ello y por razones de seguridad el sistema cerrara esta  ");
					  System.out.println(" sesion en caso de tener problemas con la gestion de opciones buscar el grupo F de la clase ");
					  System.out.println(" Programacio Orientada a Objetos del Ing. Walter Suazo ellos le podrian ayudar.             ");
					  System.out.println(" ===========================================================================================");
					break;
				  
			  }
			  break;
		  case 4: 
			  System.out.println(" ===========================================================================================");
			  System.out.println("           Su opcion fue la numero 4 por la cual ha decicido salir del software             ");
			  System.out.println(" ===========================================================================================");
			  break;
		  default:
			  System.out.println(" ===========================================================================================");
			  System.out.println(" La opcion ingresada no existe por ello y por razones de seguridad el sistema cerrara esta  ");
			  System.out.println(" sesion en caso de tener problemas con la gestion de opciones buscar el grupo F de la clase ");
			  System.out.println(" Programacio Orientada a Objetos del Ing. Walter Suazo ellos le podrian ayudar.             ");
			  System.out.println(" ===========================================================================================");
			  break;
			  
		  
	  }// llave de cierre del switch menu de opciones.
		
  } // llave cierra la metodo main
}// llave cierra clase


