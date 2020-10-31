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
    
    // Re-Open
    
    
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
    /*
    String [] nombres =new String[10]; // 0 P. Naturaleza Hondurena 1 P. Nuevo amanecer 2 P. Light Blues
    String [] direcciones =new String[4];
    String [] nombresV =new String[10];
    String [] direccionesV =new String[10];
    String [] centrosV = new String[10];
    int [] nID =new int[10];
    int [] cVT =new int[10];
    int [] vt =new int[10];
    */
    
    String [] nombres =new String[10]; // 0 P. Naturaleza Hondurena 1 P. Nuevo amanecer 2 P. Light Blues String verificado mediante ejecucion sin problemas. 20201026 04:07PM 
    String [] direcciones =new String[4]; // String verificado mediante ejecucion sin problemas. 20201026 04:07PM
    
    
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
	  System.out.println(" 03 Registro de votos foraneos");
	  System.out.println(" 04 Visualizacion de candidatos");
	  System.out.println(" 05 Detalle general de votacion");
	  System.out.println(" 06 Salir ");
	  System.out.println(" ===================================GESTION DE OPCIONES PRINCIPAL===========================");
	  System.out.println(" Su opcion ingresada es: "); op1=tD.nextInt();
	  } /* llave de cierre del DoWhile Menu Principal */ while(op1>4);
	  
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
					  System.out.println("                 UNIVERSIDAD TECNOLOGICA DE HONDURAS GRUPO F LUN-JUE 19:20                 ");
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
			  System.out.println(" Votante numero 01");
			  System.out.println(" Bienvenido al registro de voto como ciudadano");
			  System.out.print("   Ingrese el nombre completo segun este aparesca en su identificacion: "); nombresV[0] = tD.nextLine();
			  System.out.print("   Ingrese la direccion exacta de su casa o lugar donde recide: "); direccionesV[0] =tD.nextLine();
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
				  
			  }
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



// Errores en desarollo del proyecto.
/*
Dada la inexperiencia y la falta de poder entender algunos casos en al momento de ralizar el derrollo iremos detallan los errores encontrados asi como los sitios encontrado para la
solucion del mismo con el fin de facilitar el por que de los errores en sitanxis.

Explicacion solucion al caso (error en en la declaracion o metodo de asignacion del String impedia la compilacion del desarrollo).

Solucion a error 1  (Empleando NetBeans Ver. 12 Mac OSX 
cd /Users/axelcarcamo/Axel_Carcamo/UTH_POO/UTH_POO_PTF/PPO_PRF; JAVA_HOME=/Users/axelcarcamo/Library/Java/JavaVirtualMachines/jdk-15.0.1.jdk/Contents/Home "/Applications/NetBeans/Apache NetBeans 12.1.app/Contents/Resources/NetBeans/netbeans/java/maven/bin/mvn" "-Dexec.args=-classpath %classpath main.POO_PRF" -Dexec.executable=/Users/axelcarcamo/Library/Java/JavaVirtualMachines/jdk-15.0.1.jdk/Contents/Home/bin/java -Dexec.classpathScope=runtime org.codehaus.mojo:exec-maven-plugin:1.5.0:exec
Running NetBeans Compile On Save execution. Phase execution is skipped and output directories of dependency projects (with Compile on Save turned on) will be used instead of their jar artifacts.
Scanning for projects...

*/




/*  Error 1 20201026

-----------------------< com.mycompany:PPO_PRF >------------------------
Building PPO_PRF 1.0-SNAPSHOT
--------------------------------[ jar ]---------------------------------

--- exec-maven-plugin:1.5.0:exec (default-cli) @ PPO_PRF ---
Error: Unable to initialize main class main.POO_PRF
Caused by: java.lang.VerifyError: Bad local variable type
Exception Details:
  Location:
    main/POO_PRF.main([Ljava/lang/String;)V @1793: iload
  Reason:
    Type top (current frame, locals[82]) is not assignable to integer
  Current Frame:
    bci: @1793
    flags: { }
    locals: { '[Ljava/lang/String;', 'java/util/Scanner', integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, top, integer, top, integer, top, integer, top, integer, top, integer, top, integer, top, integer, top, integer, top, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, integer, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, '[Ljava/lang/String;', '[Ljava/lang/String;', '[Ljava/lang/String;', '[Ljava/lang/String;', '[Ljava/lang/String;', '[I', '[I', '[I' }
    stack: { integer }
  Bytecode:
    0000000: bb00 0759 b200 09b7 000f 4c03 3d03 3e03
    0000010: 3604 0336 0603 3607 0336 0803 3609 0336
    0000020: 0a03 360b 0336 0c03 360d 0336 0e03 360f
    0000030: 0336 1003 3611 0336 1203 3613 0336 1403
    0000040: 3615 0336 1603 3617 0336 1803 3619 0336
    0000050: 1a03 361b 0336 1c03 361d 0336 1e03 361f
    0000060: 0336 2003 3621 0336 2203 3623 0336 2403
    0000070: 3625 0336 2703 3629 0336 2b03 362d 0336
    0000080: 2f03 3631 0336 3303 3635 0336 3703 3638
    0000090: 0336 3903 363a 0336 3b03 363c 0336 3d03
    00000a0: 363e 0336 3f03 3640 0336 4103 3642 0336
    00000b0: 4303 3644 100a bd00 123a 5607 bd00 123a
    00000c0: 5710 0abd 0012 3a58 100a bd00 123a 5910
    00000d0: 0abd 0012 3a5a 100a bc0a 3a5b 100a bc0a
    00000e0: 3a5c 100a bc0a 3a5d b200 1412 18b6 001a
    00000f0: b200 1412 20b6 001a b200 1412 20b6 001a
    0000100: b200 1412 20b6 001a b200 1412 22b6 001a
    0000110: b200 1412 24b6 001a b200 1412 26b6 001a
    0000120: b200 1412 28b6 001a b200 1412 26b6 001a
    0000130: b200 1412 2ab6 001a b200 1412 2cb6 001a
    0000140: b200 1412 20b6 001a b200 1412 20b6 001a
    0000150: b200 1412 2eb6 001a b200 1412 30b6 001a
    0000160: b200 1412 32b6 001a b200 1412 34b6 001a
    0000170: b200 1412 18b6 001a b200 1412 18b6 001a
    0000180: b200 1412 36b6 001a b200 1412 38b6 001a
    0000190: b200 1412 3ab6 001a b200 1412 3cb6 001a
    00001a0: b200 1412 3eb6 001a b200 1412 40b6 001a
    00001b0: b200 1412 42b6 001a b200 1412 44b6 001a
    00001c0: b200 1412 38b6 001a b200 1412 46b6 001a
    00001d0: 2bb6 0048 3d1c 07a3 ffb1 1caa 0000 0d08
    00001e0: 0000 0001 0000 0004 0000 001d 0000 0261
    00001f0: 0000 0a37 0000 0cdd b200 1412 18b6 001a
    0000200: b200 1412 36b6 001a b200 1412 4cb6 001a
    0000210: b200 1412 4eb6 001a b200 1412 50b6 001a
    0000220: b200 1412 52b6 001a b200 1412 54b6 001a
    0000230: b200 1412 56b6 001a b200 1412 18b6 001a
    0000240: b200 1412 46b6 001a 2bb6 0048 3e1d 07a4
    0000250: 0007 1d9b ffa5 1daa 0000 01a2 0000 0001
    0000260: 0000 0004 0000 001d 0000 008b 0000 00f9
    0000270: 0000 0167 b200 1412 18b6 001a b200 1412
    0000280: 58b6 001a b200 1412 5ab6 001a b200 1412
    0000290: 5cb6 001a 1956 032b b600 5e53 b200 1412
    00002a0: 62b6 001a 1957 032b b600 5e53 b200 1412
    00002b0: 64b6 001a b200 1412 66b6 001a b200 1419
    00002c0: 5603 3219 5703 32ba 0068 0000 b600 1ab2
    00002d0: 0014 126c b600 1ab2 0014 1218 b600 1aa7
    00002e0: 0c3c b200 1412 18b6 001a b200 1412 6eb6
    00002f0: 001a b200 1412 70b6 001a b200 1412 5cb6
    0000300: 001a 1956 042b b600 5e53 b200 1412 62b6
    0000310: 001a 1957 042b b600 5e53 b200 1412 72b6
    0000320: 001a b200 1412 74b6 001a b200 1419 5604
    0000330: 3219 5704 32ba 0068 0000 b600 1ab2 0014
    0000340: 1276 b600 1ab2 0014 1218 b600 1aa7 0bce
    0000350: b200 1412 18b6 001a b200 1412 78b6 001a
    0000360: b200 1412 70b6 001a b200 1412 5cb6 001a
    0000370: 1956 052b b600 5e53 b200 1412 62b6 001a
    0000380: 1957 052b b600 5e53 b200 1412 72b6 001a
    0000390: b200 1412 74b6 001a b200 1419 5605 3219
    00003a0: 5705 32ba 0068 0000 b600 1ab2 0014 127a
    00003b0: b600 1ab2 0014 1218 b600 1aa7 0b60 b200
    00003c0: 1412 18b6 001a b200 1412 7cb6 001a b200
    00003d0: 1412 7eb6 001a b200 1412 80b6 001a b200
    00003e0: 1412 18b6 001a b200 1412 82b6 001a b200
    00003f0: 1412 18b6 001a a70b 25b2 0014 1284 b600
    0000400: 86b2 0014 1289 b600 86b2 0014 1289 b600
    0000410: 86b2 0014 1289 b600 86b2 0014 1289 b600
    0000420: 86b2 0014 1218 b600 1ab2 0014 128b b600
    0000430: 1ab2 0014 1218 b600 1aa7 0ae2 b200 1412
    0000440: 18b6 001a b200 1412 8db6 001a b200 1412
    0000450: 8fb6 001a b200 1412 91b6 0086 1958 032b
    0000460: b600 5e53 b200 1412 93b6 0086 1959 032b
    0000470: b600 5e53 b200 1412 18b6 001a b200 1412
    0000480: 95b6 001a b200 1412 18b6 001a b200 1412
    0000490: 97b6 001a b200 1412 99b6 001a b200 1412
    00004a0: 9bb6 001a b200 1412 18b6 001a 2bb6 0048
    00004b0: 3605 1505 06a3 ffcf 1505 04a0 0007 1506
    00004c0: 360f 1505 05a0 0007 1506 361a 1505 06a0
    00004d0: 0007 1506 3625 b200 1412 9db6 0086 195b
    00004e0: 032b b600 484f b200 1419 5803 32ba 009f
    00004f0: 0000 b600 1ab2 0014 1959 0332 ba00 a200
    0000500: 00b6 001a b200 1419 5b03 2eba 00a3 0000
    0000510: b600 1ab2 0014 1218 b600 1ab2 0014 1236
    0000520: b600 1ab2 0014 1218 b600 1ab2 0014 12a6
    0000530: b600 1ab2 0014 128f b600 1ab2 0014 1291
    0000540: b600 8619 5804 2bb6 005e 53b2 0014 1293
    0000550: b600 8619 5904 2bb6 005e 53b2 0014 1218
    0000560: b600 1ab2 0014 1295 b600 1ab2 0014 1218
    0000570: b600 1ab2 0014 1297 b600 1ab2 0014 1299
    0000580: b600 1ab2 0014 129b b600 1ab2 0014 1218
    0000590: b600 1a2b b600 4836 0615 0606 a3ff bf15
    00005a0: 0604 a000 0715 0636 1015 0605 a000 0715
    00005b0: 0636 1b15 0606 a000 0715 0636 27b2 0014
    00005c0: 129d b600 8619 5b04 2bb6 0048 4fb2 0014
    00005d0: 1958 0432 ba00 9f00 00b6 001a b200 1419
    00005e0: 5904 32ba 00a2 0000 b600 1ab2 0014 195b
    00005f0: 042e ba00 a300 00b6 001a b200 1412 18b6
    0000600: 001a b200 1412 36b6 001a b200 1412 18b6
    0000610: 001a b200 1412 a8b6 001a b200 1412 8fb6
    0000620: 001a b200 1412 91b6 0086 1958 052b b600
    0000630: 5e53 b200 1412 93b6 0086 1959 052b b600
    0000640: 5e53 b200 1412 18b6 001a b200 1412 95b6
    0000650: 001a b200 1412 18b6 001a b200 1412 97b6
    0000660: 001a b200 1412 99b6 001a b200 1412 9bb6
    0000670: 001a b200 1412 18b6 001a 2bb6 0048 3607
    0000680: 1506 06a3 ffbf 1507 04a0 0007 1507 3611
    0000690: 1507 05a0 0007 1507 361c 1507 06a0 0007
    00006a0: 1507 3629 b200 1412 9db6 0086 195b 052b
    00006b0: b600 484f b200 1419 5805 32ba 009f 0000
    00006c0: b600 1ab2 0014 1959 0532 ba00 a200 00b6
    00006d0: 001a b200 1419 5b05 2eba 00a3 0000 b600
    00006e0: 1ab2 0014 1218 b600 1ab2 0014 1236 b600
    00006f0: 1ab2 0014 12aa b600 862b b600 4836 0415
    0000700: 0415 529f 0018 1504 1553 9f00 1115 0415
    0000710: 549f 000a 1504 1555 a0ff d915 04ab 0000
    0000720: 0000 0456 0000 0004 0000 004e 0000 03d0
    0000730: 0000 0053 0000 002b 0000 006e 0000 0413
    0000740: 0000 0073 0000 01ff b200 1412 18b6 001a
    0000750: b200 1412 acb6 001a b200 1412 8fb6 001a
    0000760: b200 1412 91b6 0086 1958 052b b600 5e53
    0000770: b200 1412 93b6 0086 1959 052b b600 5e53
    0000780: b200 1412 18b6 001a b200 1412 95b6 001a
    0000790: b200 1412 18b6 001a b200 1412 97b6 001a
    00007a0: b200 1412 99b6 001a b200 1412 9bb6 001a
    00007b0: b200 1412 18b6 001a 2bb6 0048 3608 1508
    00007c0: 06a3 ffbf 1508 04a0 0007 1508 3612 1507
    00007d0: 05a0 0007 1508 361d 1507 06a0 0007 1508
    00007e0: 362b b200 1412 9db6 0086 195b 052b b600
    00007f0: 484f b200 1419 5806 32ba 009f 0000 b600
    0000800: 1ab2 0014 1959 0632 ba00 a200 00b6 001a
    0000810: b200 1419 5b06 2eba 00a3 0000 b600 1ab2
    0000820: 0014 1218 b600 1ab2 0014 1236 b600 1ab2
    0000830: 0014 1218 b600 1ab2 0014 12ae b600 1ab2
    0000840: 0014 128f b600 1ab2 0014 1291 b600 8619
    0000850: 5805 2bb6 005e 53b2 0014 1293 b600 8619
    0000860: 5905 2bb6 005e 53b2 0014 1218 b600 1ab2
    0000870: 0014 1295 b600 1ab2 0014 1218 b600 1ab2
    0000880: 0014 1297 b600 1ab2 0014 1299 b600 1ab2
    0000890: 0014 129b b600 1ab2 0014 1218 b600 1a2b
    00008a0: b600 4836 0915 0906 a3ff bf15 0904 a000
    00008b0: 0715 0936 1315 0905 a000 0715 0936 1e15
    00008c0: 0906 a000 0715 0936 2db2 0014 129d b600
    00008d0: 8619 5b05 2bb6 0048 4fb2 0014 1958 1006
    00008e0: 32ba 009f 0000 b600 1ab2 0014 1959 1006
    00008f0: 32ba 00a2 0000 b600 1ab2 0014 195b 1006
    0000900: 2eba 00a3 0000 b600 1ab2 0014 1218 b600
    0000910: 1ab2 0014 1236 b600 1aa7 0292 b200 1412
    0000920: 18b6 001a b200 1412 b0b6 001a b200 1412
    0000930: 8fb6 001a b200 1412 91b6 0086 1958 052b
    0000940: b600 5e53 b200 1412 93b6 0086 1959 052b
    0000950: b600 5e53 b200 1412 18b6 001a b200 1412
    0000960: 95b6 001a b200 1412 18b6 001a b200 1412
    0000970: b2b6 001a b200 1412 99b6 001a b200 1412
    0000980: 9bb6 001a b200 1412 18b6 001a 2bb6 0048
    0000990: 360a 150a 06a3 ffbf 150a 04a0 0007 150a
    00009a0: 3614 150a 05a0 0007 150a 361f 150a 06a0
    00009b0: 0007 150a 362f b200 1412 9db6 0086 195b
    00009c0: 052b b600 484f b200 1419 5807 32ba 009f
    00009d0: 0000 b600 1ab2 0014 1959 0732 ba00 a200
    00009e0: 00b6 001a b200 1419 5b07 2eba 00a3 0000
    00009f0: b600 1ab2 0014 1218 b600 1ab2 0014 1236
    0000a00: b600 1ab2 0014 1218 b600 1ab2 0014 12b4
    0000a10: b600 1ab2 0014 128f b600 1ab2 0014 1291
    0000a20: b600 8619 5805 2bb6 005e 53b2 0014 1293
    0000a30: b600 8619 5905 2bb6 005e 53b2 0014 1218
    0000a40: b600 1ab2 0014 1295 b600 1ab2 0014 1218
    0000a50: b600 1ab2 0014 12b6 b600 1ab2 0014 1299
    0000a60: b600 1ab2 0014 129b b600 1ab2 0014 1218
    0000a70: b600 1a2b b600 4836 0b15 0b06 a3ff bf15
    0000a80: 0b04 a000 0715 0b36 1515 0b05 a000 0715
    0000a90: 0b36 2015 0b06 a000 0715 0b36 31b2 0014
    0000aa0: 129d b600 8619 5b05 2bb6 0048 4fb2 0014
    0000ab0: 1958 0832 ba00 9f00 00b6 001a b200 1419
    0000ac0: 5908 32ba 00a2 0000 b600 1ab2 0014 195b
    0000ad0: 082e ba00 a300 00b6 001a b200 1412 18b6
    0000ae0: 001a b200 1412 36b6 001a a700 c1b2 0014
    0000af0: 1284 b600 86b2 0014 1289 b600 86b2 0014
    0000b00: 1289 b600 86b2 0014 1289 b600 86b2 0014
    0000b10: 1289 b600 86b2 0014 1218 b600 1ab2 0014
    0000b20: 128b b600 1ab2 0014 1218 b600 1aa7 007e
    0000b30: b200 1412 84b6 0086 b200 1412 89b6 0086
    0000b40: b200 1412 89b6 0086 b200 1412 89b6 0086
    0000b50: b200 1412 89b6 0086 b200 1412 18b6 001a
    0000b60: b200 1412 8bb6 001a b200 1412 18b6 001a
    0000b70: a700 3bb2 0014 1218 b600 1ab2 0014 12b8
    0000b80: b600 1ab2 0014 12ba b600 1ab2 0014 12bc
    0000b90: b600 1ab2 0014 1218 b600 1ab2 0014 128b
    0000ba0: b600 1ab2 0014 1218 b600 1a15 0f15 1060
    0000bb0: 1511 6015 1260 1513 6015 1460 1515 6015
    0000bc0: 1660 1517 6015 1860 363c 151a 151b 6015
    0000bd0: 1c60 151d 6015 1e60 151f 6015 2060 1521
    0000be0: 6015 2360 1523 6036 2415 2515 2760 1529
    0000bf0: 6015 2b60 152d 6015 2f60 1531 6015 3360
    0000c00: 1535 6015 3760 3638 bb00 be59 12c0 b700
    0000c10: c2bf b200 1412 36b6 001a b200 1412 18b6
    0000c20: 001a b200 1412 c4b6 001a b200 1412 18b6
    0000c30: 001a b200 1412 c6b6 001a b200 1412 c8b6
    0000c40: 001a b200 1412 cab6 001a b200 1412 ccb6
    0000c50: 001a b200 1412 18b6 001a b200 1412 ceb6
    0000c60: 0086 2bb6 0048 3604 1504 07a3 ffaf 1504
    0000c70: aa00 0000 0000 020d 0000 0001 0000 0004
    0000c80: 0000 0020 0000 0052 0000 010e 0000 01ca
    0000c90: b200 1412 18b6 001a b200 1412 d0b6 001a
    0000ca0: b200 1412 18b6 001a b200 1412 36b6 001a
    0000cb0: b200 1412 d2b6 0086 bb00 be59 12c0 b700
    0000cc0: c2bf b200 1412 18b6 001a b200 1412 d4b6
    0000cd0: 001a b200 1412 18b6 001a b200 1412 36b6
    0000ce0: 001a b200 1412 d2b6 0086 2bb6 0048 363d
    0000cf0: b200 1412 36b6 001a b200 1412 18b6 001a
    0000d00: b200 1412 36b6 001a b200 1412 d6b6 0086
    0000d10: 2bb6 0048 3640 b200 1412 36b6 001a b200
    0000d20: 1412 18b6 001a b200 1412 36b6 001a b200
    0000d30: 1412 d8b6 0086 2bb6 0048 3643 b200 1412
    0000d40: 36b6 001a b200 1412 dab6 001a b200 1415
    0000d50: 3dba 00dc 0000 b600 1ab2 0014 1540 ba00
    0000d60: dd00 00b6 001a b200 1415 43ba 00de 0000
    0000d70: b600 1ab2 0014 1218 b600 1aa7 01a0 b200
    0000d80: 1412 18b6 001a b200 1412 dfb6 001a b200
    0000d90: 1412 18b6 001a b200 1412 36b6 001a b200
    0000da0: 1412 d2b6 0086 2bb6 0048 363e b200 1412
    0000db0: 36b6 001a b200 1412 18b6 001a b200 1412
    0000dc0: 36b6 001a b200 1412 d6b6 0086 2bb6 0048
    0000dd0: 3641 b200 1412 36b6 001a b200 1412 18b6
    0000de0: 001a b200 1412 36b6 001a b200 1412 d8b6
    0000df0: 0086 2bb6 0048 3644 b200 1412 36b6 001a
    0000e00: b200 1412 dab6 001a b200 1415 3eba 00dc
    0000e10: 0000 b600 1ab2 0014 1541 ba00 dd00 00b6
    0000e20: 001a b200 1415 44ba 00de 0000 b600 1ab2
    0000e30: 0014 1218 b600 1aa7 00e4 b200 1412 84b6
    0000e40: 0086 b200 1412 89b6 0086 b200 1412 89b6
    0000e50: 0086 b200 1412 89b6 0086 b200 1412 89b6
    0000e60: 0086 b200 1412 18b6 001a b200 1412 8bb6
    0000e70: 001a b200 1412 18b6 001a a700 a1b2 0014
    0000e80: 1218 b600 1ab2 0014 12b8 b600 1ab2 0014
    0000e90: 12ba b600 1ab2 0014 12bc b600 1ab2 0014
    0000ea0: 1218 b600 1ab2 0014 128b b600 1ab2 0014
    0000eb0: 1218 b600 1aa7 0066 b200 1412 18b6 001a
    0000ec0: b200 1412 e1b6 001a b200 1412 18b6 001a
    0000ed0: b200 1412 8bb6 001a b200 1412 18b6 001a
    0000ee0: a700 3bb2 0014 1218 b600 1ab2 0014 12b8
    0000ef0: b600 1ab2 0014 12ba b600 1ab2 0014 12bc
    0000f00: b600 1ab2 0014 1218 b600 1ab2 0014 128b
    0000f10: b600 1ab2 0014 1218 b600 1ab1          
  Stackmap Table:
    full_frame(@392,{Object[#308],Object[#7],Integer,Integer,Integer,Top,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Top,Integer,Top,Integer,Top,Integer,Top,Integer,Top,Integer,Top,Integer,Top,Integer,Top,Integer,Top,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Top,Top,Top,Top,Top,Top,Top,Top,Top,Top,Top,Top,Top,Top,Top,Top,Top,Object[#308],Object[#308],Object[#308],Object[#308],Object[#308],Object[#309],Object[#309],Object[#309]},{})
    same_frame_extended(@504)
    same_frame_extended(@598)
    same_frame(@628)
    same_frame_extended(@738)
    same_frame_extended(@848)
    same_frame_extended(@958)
    same_frame(@1017)
    same_frame_extended(@1084)
    same_frame_extended(@1156)
    full_frame(@1218,{Object[#308],Object[#7],Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Top,Integer,Top,Integer,Top,Integer,Top,Integer,Top,Integer,Top,Integer,Top,Integer,Top,Integer,Top,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Top,Top,Top,Top,Top,Top,Top,Top,Top,Top,Top,Top,Top,Top,Top,Top,Top,Object[#308],Object[#308],Object[#308],Object[#308],Object[#308],Object[#309],Object[#309],Object[#309]},{})
    same_frame(@1228)
    same_frame(@1238)
    same_frame_extended(@1371)
    same_frame_extended(@1449)
    same_frame(@1459)
    same_frame(@1469)
    same_frame_extended(@1602)
    same_frame_extended(@1680)
    same_frame(@1690)
    same_frame(@1700)
    same_frame_extended(@1777)
    same_frame(@1819)
    same_frame(@1864)
    same_frame(@1920)
    same_frame_extended(@1998)
    same_frame(@2008)
    same_frame(@2018)
    same_frame_extended(@2151)
    same_frame_extended(@2229)
    same_frame(@2239)
    same_frame(@2249)
    same_frame_extended(@2332)
    same_frame(@2388)
    same_frame_extended(@2466)
    same_frame(@2476)
    same_frame(@2486)
    same_frame_extended(@2619)
    same_frame_extended(@2697)
    same_frame(@2707)
    same_frame(@2717)
    same_frame_extended(@2797)
    same_frame_extended(@2864)
    same_frame_extended(@2931)
    same_frame(@2987)
    full_frame(@3090,{Object[#308],Object[#7],Integer,Integer,Integer,Top,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Top,Integer,Top,Integer,Top,Integer,Top,Integer,Top,Integer,Top,Integer,Top,Integer,Top,Integer,Top,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Top,Top,Top,Top,Top,Top,Top,Top,Top,Top,Top,Top,Top,Top,Top,Top,Top,Object[#308],Object[#308],Object[#308],Object[#308],Object[#308],Object[#309],Object[#309],Object[#309]},{})
    same_frame(@3098)
    same_frame_extended(@3216)
    same_frame(@3266)
    same_frame_extended(@3454)
    same_frame_extended(@3642)
    same_frame_extended(@3709)
    same_frame(@3768)
    same_frame(@3811)
    same_frame(@3867)

Command execution failed.
org.apache.commons.exec.ExecuteException: Process exited with an error: 1 (Exit value: 1)
    at org.apache.commons.exec.DefaultExecutor.executeInternal (DefaultExecutor.java:404)
    at org.apache.commons.exec.DefaultExecutor.execute (DefaultExecutor.java:166)
    at org.codehaus.mojo.exec.ExecMojo.executeCommandLine (ExecMojo.java:764)
    at org.codehaus.mojo.exec.ExecMojo.executeCommandLine (ExecMojo.java:711)
    at org.codehaus.mojo.exec.ExecMojo.execute (ExecMojo.java:289)
    at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo (DefaultBuildPluginManager.java:137)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:210)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:156)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:148)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:117)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:81)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:56)
    at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:128)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:305)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:192)
    at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:105)
    at org.apache.maven.cli.MavenCli.execute (MavenCli.java:957)
    at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:289)
    at org.apache.maven.cli.MavenCli.main (MavenCli.java:193)
    at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
    at jdk.internal.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:64)
    at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke (Method.java:564)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:282)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:225)
    at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:406)
    at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:347)
------------------------------------------------------------------------
BUILD FAILURE
------------------------------------------------------------------------
Total time:  0.805 s
Finished at: 2020-10-26T15:24:55-06:00
------------------------------------------------------------------------
Failed to execute goal org.codehaus.mojo:exec-maven-plugin:1.5.0:exec (default-cli) on project PPO_PRF: Command execution failed.: Process exited with an error: 1 (Exit value: 1) -> [Help 1]

To see the full stack trace of the errors, re-run Maven with the -e switch.
Re-run Maven using the -X switch to enable full debug logging.

For more information about the errors and possible solutions, please read the following articles:
[Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException
*/
