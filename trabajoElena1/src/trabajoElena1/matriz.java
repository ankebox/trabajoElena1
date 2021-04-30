package trabajoElena1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class matriz {
	static Scanner sn = new Scanner (System.in);
	public static void main(String[] args) {
		boolean salir = false;
		int opcion;
		while(!salir) {
			System.out.println("1. Suma de dos matrices ");
			System.out.println("2. Producto de un escalar por una matriz");
			System.out.println("3. Producto de dos matrices");
			System.out.println("4. Transponer una matriz");
			System.out.println("5. Diagonal principal de una matriz");
			System.out.println("6. Comprobar si una matriz es simetrica");
			System.out.println("7. Potencia de una matriz cuadrada");
			System.out.println("8. Resta de dos matrices");
			System.out.println("9. SALIR");
			try {
			System.out.println("EJERCICIOS PROGRAMACION DE MATRICES");
			opcion = sn.nextInt();
			switch(opcion) {
			case 1: 
				sumar();
				
				break;
			case 2: 
				escalarMatriz();
				break;
			case 3:
				producto();
				break;
			case 4: 
				trasponer();
				System.out.println("\n");
				break;
			case 5: 
				diagonal();
				System.out.println("\n");
				break;
			case 6: 
				simetrica();
				System.out.println("\n");
				break;
			case 7: 
				nuevaMatriz();
				System.out.println("\n");
				break;
			case 8: 
				System.out.println("\n");
				break;
			case 9: 
				salir = true;
				break;
			default:
				System.out.println("Las Opciones son entre 1 y 9");
			}
			}catch(InputMismatchException e) {
				System.out.println("Debes seleccionar una opcion mediante un numero");
				sn.next();
			}
		}
		System.out.println("fin");
	}
	//------------------------------------------------------------------------------------------------------
	/*
	 * Metodo para hallar suma de dos matrices
	 * @param  
	 * */
	public static void sumar() {
		int matriz1[][] = nuevaMatriz() ;
		int matriz2[][] = nuevaMatriz() ;
		int matrizResultado[][] = new int[matriz1.length][matriz1[0].length];
		
		for(int i = 0; i < matriz1.length; i++) {
			for(int j = 0; j < matriz1[0].length; j++) {
				matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		imprimirMatriz(matrizResultado);
	}
	
	//------------------------------------------------------------------------------------------------
	/*
	 * Metodo para hallar producto de un escalar por una matriz 
	 * */
	public static void escalarMatriz() {
		System.out.println("Ahora crea la matriz");
		int matriz1[][] = nuevaMatriz() ;
		int matrizResultado[][] = new int[matriz1.length][matriz1[0].length];
		System.out.println("Introduce un numero para multiplicar por la matriz");
		int escalar = sn.nextInt();
		for(int i = 0; i < matriz1.length; i++) {
			for(int j = 0; j <matriz1[0].length; j++) {
				matrizResultado[i][j] = escalar * matriz1[i][j];
			}
		}
		imprimirMatriz(matrizResultado);
	}
	//---------------------------------------------------------------------------------------------
	/*
	 * Metodo para hallar producto de dos matrices
	 * @param  
	 * */
	public static void producto () {
		System.out.println("Ahora crea la primera matriz");
		int matriz1[][] = nuevaMatriz() ;
		System.out.println("Ahora crea la segunda matriz");
		int matriz2[][] = nuevaMatriz() ;
		int matrizResultado[][] = new int[matriz1.length][matriz2[0].length];
		for (int i = 0; i < matriz1.length; i++) {
			for(int j = 0; j < matriz2[0].length; j++) {
				for(int k = 0; k < matriz1[0].length; k++) {
					matrizResultado[i][j] += matriz1[i][k] * matriz2[k][j];
				}
			}
		}
		imprimirMatriz(matrizResultado);
	}
	//-----------------------------------------------------------------------------------------------
		/*
		 * Metodo para trasponer una matriz
		 * */
	public static void trasponer () {
		System.out.println("Ahora crea la matriz");
		int matriz1[][] = nuevaMatriz() ;
		int matrizResultado[][] = new int[matriz1[0].length][matriz1.length];
		for(int i = 0; i < matriz1.length; i++) {
			for(int j = 0; j < matriz1[0].length; j++) {
				matrizResultado[j][i] = matriz1[i][j];
			}
		}
		imprimirMatriz(matrizResultado);
	}
	//-----------------------------------------------------------------------------------------------
	/*
	 * Metodo para hallar diagonal principal de una matriz
	 * */
	public static void diagonal() {
		System.out.println("Ahora crea la matriz");
		int matriz1[][] = nuevaMatriz() ;
		int matrizResultado[] = new int[matriz1.length];
		if(esCuadrada(matriz1)) {
			for(int i = 0; i < matriz1.length; i++) {
				matrizResultado[i] = matriz1[i][i];
			}
		}
	}
	//-----------------------------------------------------------------------------------------------
		/*
		 * Metodo para comprobar si una matriz es simetrica
		 * */
	public static void simetrica() {
		String respuesta = "Es simetrica!!";
		System.out.println("Ahora crea la matriz");
		int matriz1[][] = nuevaMatriz() ;
		if(esCuadrada(matriz1)) {
			for (int i = 0; i < matriz1.length; i++) {
				for (int j = 0; j < matriz1[0].length; j++) {
					if(matriz1[i][j] != matriz1[j][i]) {
						respuesta = "Esta matriz no es simetrica";
					}
				}
			}
			System.out.println(respuesta);
		}
	}
	//-----------------------------------------------------------------------------------------------
		/*
		 * Metodo para generar nueva matriz 
		 * */
	public static void potencia() {
		System.out.println("Ahora crea la matriz");
		int matriz1[][] = nuevaMatriz() ;
		int matrizResultado[][] = new int[matriz1.length][matriz1[0].length];
		System.out.println("Introduce el numero que elevaras la matriz");
		int exponente = sn.nextInt();
		//ME FALTA ESTOOOOOOOOOO###############################################################################
	}
	//-----------------------------------------------------------------------------------------------
	/*
	 * Metodo para generar nueva matriz 
	 * */
	public static int[][] nuevaMatriz() {
		System.out.println("ingrese la cantidad de filas");
		int n = sn.nextInt();
		System.out.println("ingrese la cantidad de columnas");
		int m = sn.nextInt();
		int matriz[][] = new int [n][m];
		System.out.println("ingrese valores de la matriz");
		for(int i=0; i<n; i++) {
			System.out.println("introducir valores de la " + i + "� fila");
			for(int j = 0; j < m; j++) {
				int num = sn.nextInt();
				matriz[i][j] = num;
			}
		}
		return matriz;
	}
	//------------------------------------------------------------------------------------------
	/*
	 * Metodo para imprimir matriz
	 * @param  m1 aqui le damos la matriz a imprimir
	 * */
	public static void imprimirMatriz(int m1[][]) {
		int n = m1.length;
		System.out.println("m: " + n);
		int m = m1[0].length;
		System.out.println("n: " + m);

		for(int i=0; i<n; i++) {
			System.out.println("\n");
			for(int j = 0; j < m; j++) {
				System.out.print(m1[i][j]+"\t");
			}
		}
		System.out.println("\n");
	}
	//---------------------------------------------------------------------------------------------------
	/*
	 * Metodo para comprobar si una matriz es cuadrada
	 * @param  m1 matriz  
	 * */
	public static boolean esCuadrada(int m1[][]) {
		if(m1.length != m1[0].length) {
			System.out.println("Introduce una matriz cuadrada y vuelve a intentarlo");
			return false;
		}
		return true;
	}
}