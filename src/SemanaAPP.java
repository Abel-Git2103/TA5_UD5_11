import javax.swing.JOptionPane;

public class SemanaAPP {

	public static void main(String[] args) {
		
		String dia = JOptionPane.showInputDialog("¿Qué dia es hoy?");
		
		switch (dia) {
			case "Lunes":
				System.out.println("Hoy es " + dia + " y es día laboral");
				break;
			case "Martes":
				System.out.println("Hoy es " + dia + " y es día laboral");
				break;
			case "Miércoles":
				System.out.println("Hoy es " + dia + " y es día laboral");
				break;
			case "Jueves":
				System.out.println("Hoy es " + dia + " y es día laboral");
				break;
			case "Viernes":
				System.out.println("Hoy es " + dia + " y es día laboral");
				break;
			case "Sábado":
				System.out.println("Hoy es " + dia + " y es día festivo");
				break;
			case "Domingo":
				System.out.println("Hoy es " + dia + " y es día festivo");
				break;
			default:
				System.out.println("Hoy es " + dia + " y es día festivo");
				
		}
	}
}
