import java.util.Scanner;

public class Codigo6 {
	// se agrega main
	public static void main(String[] args) {
		// se agrega scanner para leer una entrada de la consola
		Scanner scan = new Scanner(System.in);
		// se agrega la palabra new para crear el array de tamaño 20
		int[] n = new int [20];
		//se agrega un + al auto increment del ciclo
	    for (int i = 0; i < 20; i++) {
	      n[i] = (int)(Math.random() * 381) + 20;
	      //se agrega la palabra out, para denotar que imprime fuera del sistema
	      System.out.print(n[i] + " ");
	    }
	    //se completa el println
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    //se agrega parentesis faltante
	    int opcion = scan.nextInt();
	    scan.nextLine();
	    // se arregla la condicional ternaria  al corregir su sintaxis
	    int multiplo = (opcion == 1) ? 5 : 7;
	    // se corrige sintaxis de ciclo for, que pretendia ser un foreach
	    for (int e : n) {
	    	if (e % multiplo == 0) {
		        System.out.print("[" + e + "] ");
		      //se coloca el else fuera del if para que cumpla su funcion, se cambia referencia in por out, para poder usar el metodo 
		      }else {
		    	  
			        System.out.print(e + " ");
		    }
		}
	    
	
		
		
	}// main
}// class
	  
	    