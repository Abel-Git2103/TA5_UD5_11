import javax.swing.JOptionPane;

public class SemanaAPP {

	public static void main(String[] args) {
		
		String dia = JOptionPane.showInputDialog("�Qu� dia es hoy?");
		
		switch (dia) {
			case "Lunes":
				System.out.println("Hoy es " + dia + " y es d�a laboral");
				break;
			case "Martes":
				System.out.println("Hoy es " + dia + " y es d�a laboral");
				break;
			case "Mi�rcoles":
				System.out.println("Hoy es " + dia + " y es d�a laboral");
				break;
			case "Jueves":
				System.out.println("Hoy es " + dia + " y es d�a laboral");
				break;
			case "Viernes":
				System.out.println("Hoy es " + dia + " y es d�a laboral");
				break;
			case "S�bado":
				System.out.println("Hoy es " + dia + " y es d�a festivo");
				break;
			case "Domingo":
				System.out.println("Hoy es " + dia + " y es d�a festivo");
				break;
			default:
				System.out.println("El texto introducido no es correcto");
				
		}
	}
}
