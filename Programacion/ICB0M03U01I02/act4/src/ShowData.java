public class ShowData {
	public static void main(String[] args){
		// Declaracion de variables
		int edad, estatura, numHermanos;
		double peso, temperatura;
		String nombre, dni;
		boolean antiguoAlumno, repetidor;
		char inicialDelNombre;

		//Inicializacion de variables
		edad = 18;
		peso = 62.3;
		nombre = "Lluis Mina";
		antiguoAlumno = true;
		dni = "01234567A";
		temperatura = 28.6;
		estatura = 173;
		inicialDelNombre = 'L';
		repetidor = false;
		numHermanos = 2;

		//Se muestra por pantalla el valor de cada variable
		System.out.println( "edad: " + edad);
		System.out.println( "peso: " + peso);
		System.out.println( "nombre: " + nombre);
		System.out.println( "antiguo alumno: " + antiguoAlumno);
		System.out.println( "dni: " + dni);
		System.out.println( "temperatura: " + temperatura);
		System.out.println( "estatura: " + estatura);
		System.out.println( "inicial del nombre: " + inicialDelNombre);
		System.out.println( "repetidor: " + repetidor);
		System.out.println( "numero de hermanos: " + numHermanos);
		
	}
}
