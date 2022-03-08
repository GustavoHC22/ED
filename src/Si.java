import java.util.Scanner;

public class Si {

	public static void main(String[] args) {
		//Variables globales.
		int turno = 0;
		int daño;
		//Variables personaje.
		String nombre;
		int salud;
		int fuerza;
		int magia;
		int poti;
		int suerte;
		//Variables enemigo 1.
		String nombre1 = "Lucario";
		int salud1;
		int fuerza1;
		int magia1;
		int poti1;
		int suerte1;
		//Estadísticas personaje.
		salud = 600;
		fuerza = 35;
		magia = 10;
		poti = 3;
		suerte = 50;
		//Estadísticas enemigo 1.
		salud1 = 500;
		fuerza1 = 30;
		magia1 = 20;
		poti1 = 4;
		suerte1 = 55;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el nombre de tu personaje:");
		nombre = sc.nextLine();
		System.out.println("¡Que comience el combate!");
		System.out.println();
		
		while(salud > 0 && salud1 > 0) {
			turno++;
			System.out.println("Turno:"+turno);
			System.out.println();
			System.out.println(nombre1+":");
			System.out.println("Salud: "+salud1);
			System.out.println("Pociones: "+poti1);
			System.out.println();
			System.out.println(nombre+":");
			System.out.println("Salud: "+salud);
			System.out.println("Pociones: "+poti);
			System.out.println();
			if(salud < 50 && poti1 > 0) {
				poti1--;
				salud1 += 50;
				System.out.println(nombre1+" ha usado una poción, su nueva salud es "+salud1);
			}else{
				int suerteDef = suerte + (int) (Math.random()*(100-0+1)+0);
				int suerteAt1 = suerte1 + (int) (Math.random()*(100-50+1)+50);
				int accion = (int) (Math.random()*(2-1+1)+1);
				switch(accion) {
					case 1:
						
					break;
					case 2:
						
					break;
				}
			}
			int suerteDef1 = suerte1 + (int) (Math.random()*(100-0+1)+0);
			int suerteAt = suerte + (int) (Math.random()*(100-50+1)+50);
			int accion;
			System.out.println("Selecciona una acción a realizar:");
			System.out.println("1) Ataque físico");
			System.out.println("2) Ataque mágico");
			System.out.println("3) Poción");
			accion = sc.nextInt();
			System.out.println();
			
			switch(accion) {
				case 1:
					daño = fuerza + (int) (Math.random()*(50-25+1)+25);
					System.out.println(nombre+" ha realizado un ataque físico de "+daño+" puntos de daño.");
					if(salud < 0) {
						System.out.println(nombre+" ha lanzado un ataque a la desesperada.");
					}else {
						
					}
				break;
				case 2:
					daño = magia + (int) (Math.random()*(100-0+1)+0);
					System.out.println(nombre+" ha realizado un ataque mágico de "+daño+" puntos de daño.");
					if(salud < 0) {
						System.out.println(nombre+" ha lanzado un ataque a la desesperada.");
					}else {
						
					}
				break;
				case 3:
					if(poti > 0) {
						poti--;
						salud += 50;
						System.out.println(nombre+" ha usado una poción, su nueva salud es "+salud);
					}else {
						System.out.println("No te quedan pociones, pierdes un turno.");
					}
				break;
				default:
					System.out.println("Has selccionado una acción inútil, pierdes el turno");
			}
			if(salud1 < 0){
				System.out.println(nombre+" ha ganado el combate.");
			}else if(salud < 0){
				System.out.println(nombre1+" ha ganado el combate.");
			}
			
			
		}
		
		System.out.println("");
		
	}

}
