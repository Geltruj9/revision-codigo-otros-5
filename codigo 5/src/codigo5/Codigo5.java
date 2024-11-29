package codigo5;
// se corrigieron los errores de sintaxis que no daban el funcionamiento correcto, implementamos el scanner nextInt  para leer el numero entero , y en el ciclo while extrajimos el numero entero modificando los errores de sintaxis que se tenian  de los parentesis y las llaves y al final se cerro el close scanner para correr. 
import java.util.Scanner;

public class Codigo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); //arreglar errores de syntaxys
	  
	    System.out.print("Introduzca un numero:");
	    int ni = scanner.nextInt();  //leer un entero directamente y asi no lo repite
		int c = ni; //guarda el numero digital
	    
		int afo = 0; //contador de digitos "afortunados"
	    int noAfo = 0; // contador de digitos "no afortunados"
	    
	    //ciclo para analizar los numeros
	    while (ni > 0) 
		  int digito = ni % 10; //extrae el ultimo numero
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
	      }
		  ni /= 10; //elimina el ultimo digito
	    }
	     //compara los conteos de digitos afortunados y no afortunados
	    if (afo > noAfo) {
	      System.out.println("El " + c + " es un número afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    

	    scanner.close();   // close el scanner
	}
	}
