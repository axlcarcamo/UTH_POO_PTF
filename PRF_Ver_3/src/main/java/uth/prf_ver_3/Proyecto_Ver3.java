/*
Univerisidad Tecnologica de Honduras
Catedratico : Ing. Walter Suazo.
Tema        : Proyecto final.
Proyecto    : Sistema electoral
Clase       : Progframacion Orientada a Objetos.
Grupo       : F-1
Fecha       : 20201022    22:37 Inicio avance inicial
Fecha	    :             21:50 Segundo avance del proyecto
Fecha       :             17:00 Tercer avance del proyecto
Fecha	    :		  22:00 Cuarto avance de proyecto.
Fecha       : 20201203    00:32 Quinto avance del proyecto.
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

import java.util.*;

package uth.prf_ver_3;

public class Proyecto_Ver3 {
    public static void main(String[] args) {
        Scanner tD=new Scanner(System.in);
        
    }
    
    
    public void Menu1(){
        int op1=0;
        Scanner tD1=new Scanner(System.in);
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
	  System.out.println(" =================================== GESTION DE OPCIONES PRINCIPAL ===========================");
	  System.out.println(" 01 Registro de candidato presidencial. ");
	  System.out.println(" 02 Registro de candidato para alcalde. ");
	  System.out.println(" 03 Registro de voto de un ciudadano");
	  System.out.println(" 04 Registro de votos foraneos");
	  System.out.println(" 05 Visualizacion de candidatos");
	  System.out.println(" 06 Detalle general de votacion");
	  System.out.println(" 07 Salir ");
	  System.out.println(" =================================== GESTION DE OPCIONES PRINCIPAL ===========================");
          System.out.println(" Su opcion ingresada es: "); op1=tD1.nextInt();
	  } /* llave de cierre del DoWhile Menu Principal */ while(op1>7);
    }
    
}
