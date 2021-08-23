package test;

import javabeans.Persona;

public class EjecutandoJavaBeans {

	public static void main(String[] args) {
		/* La clase persona debe ser serializable ya que si el objeto persona es necesario trasnferirlo en la red
		 * de un servidor a otro servidor, entonces se tiene que aplicar el concepto de serializacion, convirtiendo nuestro objeto en 0 y 1 (bits)
		 * Y cuando se recibe este objeto en el otro servidor se aplica el concepto de de-serializacion*/
		Persona persona = new Persona(); 
		
		// podemos crear un objeto sin pasar ningun argumento gracias a que tenemos un constructor vacio
		persona.setNombre("Miguel");
		persona.setApellido("Ramos");
		
		
		System.out.println("El nombre es: " + persona.getNombre());
		System.out.println("El Apellido es: " + persona.getApellido());
		System.out.println(persona);

	}

}
