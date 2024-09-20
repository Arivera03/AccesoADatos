package FileRepaso;

import java.io.File;
import java.util.Arrays;

public class Exercici3 {
	public static void main (String args[]) {

		File docOrigen = new File("Documentos");
		File docDesti = new File("DOCS");


		if (!docOrigen.exists()) {
			System.out.println("COMPROVA QUE LA CARPETA DOCUMENTS ESTA CREADA I LA RUTA ES CORRECTA");
		}
// Reanomenem la carpeta Documents

		docOrigen.renameTo(docDesti);
		
// Creem dos objectes de tipus File on assignem la ruta d'origen i la ruta dest�. // (PER A LA CARPETA FOTOGRAFIAS) i canviem el nom
		

		
// Creem dos objectes de tipus File on assignem la ruta d'origen i la ruta dest�. // (PER A LA CARPETA LIBROS) i canviem el nom
		

		

		/* **********************************************************
         *  Llevem les extensions en FOTOS (REANOMENTANT ELS ARXIUS)
           ********************************************************** */
        
  // ABANS d'eliminar les extensions, imprimim la llista d'arxius ordenada cridant a la funci� imprimirLlistaArxius()


		
		

// Reanomenem els arxius, llenvant les Extensions cridant a la funci� llevarExtensionsArxius()


		
		

// DESPRES d'eliminar les extensions, imprimim de nou la llista d'arxius ordenadacridant a la funci� imprimirLlistaArxius()


	
		
    } // del main()
	

	
/*
 * IMPRIMIR LLISTA ARXIUS
 * 
 */
	
	
/*
 * 
 * LLEVAR EXTENSIONS ARXIUS
 * 	
 */
	
	



} // de la classe
