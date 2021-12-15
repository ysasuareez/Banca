package MainApp;

import Models.CuentaCorriente;
import Models.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	public static void main (String[]args) {
		Scanner s = new Scanner(System.in);
		
		//variables que utilizaremos
		ArrayList<Persona> listapersonas = new ArrayList <Persona>();
		int opc = 0;
		int i = 1;
		int contadorCuentas = 1;
		
		//damos la bienvenida al usuario
		System.out.println();
		System.out.println("B I E N V E N I D O");

		System.out.println("\n¿Qué operación desea realizar?");
		
		//planteamos las opciones numeradas del 1 al 4
		do {				
			System.out.println("\nMENU:");
			System.out.println("Elija una opción: (Por ejemplo 1)");
			System.out.println(("\n1. Nuevo usuario.\n2. Acceder a operaciones. \n3. Borrar persona.\n4. Salir."));
			opc = Integer.parseInt(s.nextLine());

			switch (opc) {
				// añadir persona / si se elige esta opcion se pediran todos los datos necesarios por teclado
				case 1:
					System.out.println("\nHa elegido la opción de crear nuevo usuario.");
					System.out.println("A continuacion se le pedirá que rellene una serie de campos.\n");
					
					System.out.println("Inserte un nombre:");
					String nombre = s.nextLine();
					System.out.println("Inserte un apellido:");
					String apellido = s.nextLine();
					System.out.println("Inserte un dni:");
					String dni = s.nextLine();
					System.out.println("Inserte un sueldo:");			
					double sueldo = Integer.parseInt(s.nextLine());
					
					//una vez el usuario los introduce, se añaden al arraylist // empezamos con cuenta corriente null
					CuentaCorriente c = new CuentaCorriente(contadorCuentas++, 0, null);
					listapersonas.add(new Persona(nombre, apellido, dni, sueldo, c));	
					
					System.out.println("\n** Cuenta creada con éxito ** ");
					System.out.println("Gracias por confiar en nosotros.");
					break;
					
				// acceder a las operaciones con su posición
				case 2:
					i = 0;
					// imprime todas las cuentas existentes
					System.out.printf("\nCuentas Bancarias Registradas:\n");
					for(Persona p : listapersonas) {
						System.out.println(i + ". " + p.nombre + ". " + p.dni);
						i++;
					}
					System.out.println("\nElija una de ellas, escribiendo su posicion.\n(Por ejemplo '6').");
					
					//solicita al usuario que elija la posicion de su cuenta
					int posicion_editar = Integer.parseInt(s.nextLine());
					
					//funcion del submenu (abajo)
					mostrarSubmenúB(listapersonas, posicion_editar);				
					
					break; 
					
				case 3:
					//eliminar personas
					i = 0;
					System.out.printf("\nBorrar persona:\n");
					System.out.printf("\nLista de personas:\n");
					
					for(Persona p : listapersonas) {
						System.out.println(i + ". " + p);
						i++;
					}
					
					//solicita al usuario que elija la posicion de la cuenta que desee borrae
					System.out.println("\nElija una de ellas, escribiendo su posicion.\n(Por ejemplo '6'.)");
					
					int posicion_borrar = Integer.parseInt(s.nextLine());
					listapersonas.remove(posicion_borrar);
					
					System.out.println("\n Persona borrada");
					break;
					
				//sale del menu
				case 4:
					System.out.println("\nGracias por confiar en nosotros, ");
					System.out.println("esperamos verle pronto.");
					break;
					
				default: 
					System.out.println("\nNo es un número válido.");
					break;
				
			}
		
		} while(opc!=4);
			
	}

								
	public static void mostrarSubmenúB(ArrayList<Persona> listapersonas, int posicion_editar) {

		Scanner s = new Scanner(System.in);
		
		Persona persona_editar = listapersonas.get(posicion_editar);
		
		//informamos al usuario del proceso y las opciones
		System.out.println("\nHa elegido a la persona nº" + posicion_editar);
		System.out.println("**MOSTRANDO SUBMENÚ**");
		System.out.println("\n¿Qué operacion desea realizar?");
		System.out.println("(Por ejemplo: '1'");
		System.out.println(("1. Cobrar sueldo.\n2. Sacar pasta. \n3. Subir sueldo.\n4. Mostrar detalles de la persona."));
		int opc = Integer.parseInt(s.nextLine());

		switch (opc) {
			//cobrar sueldo
			case 1:
				persona_editar.cobrarSueldo();		
				break;
				
			case 2:
				//sacar dinero (como hemos puesto ya en su clase, esto no ocurrira a menos que 
				//el usuario cuente con ese dinero
				double cantidad_sacar = 0;
				
				System.out.println("\nCantidad que quieres sacar:");			
				cantidad_sacar = Integer.parseInt(s.nextLine());
				
				persona_editar.sacarPasta(cantidad_sacar);	
				break; 
				
			case 3:
				//cambia su sueldo
				double sueldo_nuevo = 0;				
				
				System.out.println("\nSueldo nuevo:");			
				sueldo_nuevo = Integer.parseInt(s.nextLine());
				
				persona_editar.cambiarSueldo(sueldo_nuevo);
				break;
				
			case 4:
				//muestra los datos de la persona seleccionada
				String datos_persona = persona_editar.toString();				
				System.out.println("\nSus datos son:" + datos_persona);
				
				//System.out.println(persona_editar);
				
				break;
			
			//en el caso de que el usuario no introduzca una opción valida, lanzará este mensaje
			default: 
				System.out.println("\nNo es un número válido.");
				break;
			
		}		
		
		
	}
	

}