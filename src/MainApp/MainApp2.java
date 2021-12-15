package MainApp;

import Models.CuentaCorriente;
import Models.Persona;

public class MainApp2 {
public static void main (String[]args) {
		
		Persona Ysabel = new Persona("Ysabel", "Suárez","17776070Y", 3000.0, null);
		Persona Rafa = new Persona("Rafael", "Sepúlveda", "24567812R", 2500.0, null);
		Persona Franco = new Persona("Franco", "Mancinelli", "34562323F", 2750.0, null);
		
		CuentaCorriente cc1 = new CuentaCorriente(3256325, 5000.0, Ysabel);
		CuentaCorriente cc2 = new CuentaCorriente(1224342, 4000.0, Rafa);
		CuentaCorriente cc3 = new CuentaCorriente(2345678, 3000.0, Franco);
		
		Ysabel.setCuentaCorriente(cc1);
		Rafa.setCuentaCorriente(cc2);
		Franco.setCuentaCorriente(cc3);
		
		System.out.println(Ysabel);
		System.out.println("");
		System.out.println(Rafa);
		System.out.println("");
		System.out.println(Franco);
		
		Ysabel.cambiarsueldo (+300);
		
		System.out.println("\nCambiar sueldo Ysabel.");
		System.out.println(Ysabel);		
		System.out.println();
		
		System.out.println("\nIngresar");
		CuentaCorriente arroz = Ysabel.getCuentaCorriente();
		arroz.sumarCantidad(345);		
		System.out.println(Ysabel);
		
		
		
		System.out.println("\nCobrar sueldo");
		Ysabel.cobrarSueldo();
		System.out.println(Ysabel);
		
		System.out.println("\nCambiar el sueldo:");
		Ysabel.cambiarSueldo(10000);
		System.out.println(Ysabel);
		
		
		
		
		
		
		
	}
}