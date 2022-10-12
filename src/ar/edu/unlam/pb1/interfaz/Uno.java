package ar.edu.unlam.pb1.interfaz;

import ar.edu.unlam.pb1.dominio.Jugadores;
import java.util.Scanner;

public class Uno {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Seteamos el color de la carta de la mesa
		String cartaDeMesa;
		
		do {
			cartaDeMesa=setCarta();
		}while(cartaDeMesa=="Comodin");

		// nombre de los jugadores y las cartas
		System.out.println("Ingrese nombre jugador 1");

		Jugadores jugador1 = new Jugadores(teclado.next(), setCarta(), setCarta(), setCarta(), setCarta(), setCarta(), setCarta(), setCarta());

		System.out.println("Ingrese nombre jugador 2");

		Jugadores jugador2 = new Jugadores(teclado.next(), setCarta(), setCarta(), setCarta(), setCarta(), setCarta(), setCarta(), setCarta());
		// seteamos los turnos y jugamos
		int i = 2;
		do {

			int residuo = i % 2;
			int turno;
			if (residuo == 0) {
				turno = 1;
			} else {
				turno = 2;
			}
			switch (turno) {
			// Turno de jugador 1 si es par
			case 1:
				// Menu del jugador 1
				System.out.println("La carta en la mesa es: " + cartaDeMesa);
				System.out.println("Es el turno de: " + jugador1.getNombre() + " y sus cartas son: " + "\nOpción 1 = "
						+ jugador1.getCarta1() + "\nOpción 2 = " + jugador1.getCarta2() + "\nOpción 3 = "
						+ jugador1.getCarta3() + "\nOpción 4 = " + jugador1.getCarta4() + "\nOpción 5 = "
						+ jugador1.getCarta5() + "\nOpción 6 = " + jugador1.getCarta6()+  "\nOpción 7 = "
						+ jugador1.getCarta7() + "\nOpción 8 = Tomar una carta");
				int opcion1 = teclado.nextInt();
				// Eleccion del jugador 1
				switch (opcion1) {
				case 1:
					if (jugador1.getCarta1() == "Comodin") {
						menuComodin();
						int n = teclado.nextInt();
						cartaDeMesa = comodin(n);
						jugador1.setCarta1();
						i++;
					} else {
						if (compararCarta(jugador1.getCarta1(), cartaDeMesa) == true) {
							jugador1.setCarta1();
						}
						i++;
					}
					break;

				case 2:
					if (jugador1.getCarta2() == "Comodin") {
						menuComodin();
						int n = teclado.nextInt();
						cartaDeMesa = comodin(n);
						jugador1.setCarta2();
						i++;
					} else {

						if (compararCarta(jugador1.getCarta2(), cartaDeMesa) == true) {
							jugador1.setCarta2();
						}
						i++;
					}

					break;

				case 3:
					if (jugador1.getCarta3() == "Comodin") {
						menuComodin();
						int n = teclado.nextInt();
						cartaDeMesa = comodin(n);
						jugador1.setCarta3();
						i++;
					} else {

						if (compararCarta(jugador1.getCarta3(), cartaDeMesa) == true) {
							jugador1.setCarta3();
						}
						i++;
					}

					break;

				case 4:
					if (jugador1.getCarta4() == "Comodin") {
						menuComodin();
						int n = teclado.nextInt();
						cartaDeMesa = comodin(n);
						jugador1.setCarta4();
						i++;
					} else {

						if (compararCarta(jugador1.getCarta4(), cartaDeMesa) == true) {
							jugador1.setCarta4();
						}
						i++;
					}

					break;

				case 5:
					if (jugador1.getCarta5() == "Comodin") {
						menuComodin();
						int n = teclado.nextInt();
						cartaDeMesa = comodin(n);
						jugador1.setCarta5();
						i++;
					} else {

						if (compararCarta(jugador1.getCarta5(), cartaDeMesa) == true) {
							jugador1.setCarta5();
						}
						i++;
					}

					break;
				case 6:
					if (jugador1.getCarta6() == "Comodin") {
						menuComodin();
						int n = teclado.nextInt();
						cartaDeMesa = comodin(n);
						jugador1.setCarta6();
						i++;
					} else {

						if (compararCarta(jugador1.getCarta6(), cartaDeMesa) == true) {
							jugador1.setCarta6();
						}
						i++;
					}

					break;
				case 7:
					if (jugador1.getCarta7() == "Comodin") {
						menuComodin();
						int n = teclado.nextInt();
						cartaDeMesa = comodin(n);
						jugador1.setCarta7();
						i++;
					} else {

						if (compararCarta(jugador1.getCarta7(), cartaDeMesa) == true) {
							jugador1.setCarta7();
						}
						i++;
					}

					break;
				case 8:
					tomarCarta(jugador1);
					break;
				}
				break;
			// Turno de jugador 2 si es impar
			case 2:
				// Menu del jugador 2
				System.out.println("La carta en la mesa es: " + cartaDeMesa);
				System.out.println("Es el turno de: " + jugador2.getNombre() + " y sus cartas son: " + "\nOpción 1 = "
						+ jugador2.getCarta1() + "\nOpción 2 = " + jugador2.getCarta2() + "\nOpción 3 = "
						+ jugador2.getCarta3() + "\nOpción 4 = " + jugador2.getCarta4() + "\nOpción 5 = "
						+ jugador2.getCarta5() + "\nOpción 6 = " + jugador2.getCarta6()+  "\nOpción 7 = "
						+ jugador2.getCarta7() + "\nOpción 8 = Tomar una carta");
				int opcion2 = teclado.nextInt();
				// analizamos la eleccion del jugador 2
				switch (opcion2) {
				case 1:
					if (jugador2.getCarta1() == "Comodin") {
						menuComodin();
						int n = teclado.nextInt();
						cartaDeMesa = comodin(n);
						jugador2.setCarta1();
						i++;
					} else {

						if (compararCarta(jugador2.getCarta1(), cartaDeMesa) == true) {
							jugador2.setCarta1();
						}
						i++;
					}
					break;

				case 2:
					if (jugador2.getCarta2() == "Comodin") {
						menuComodin();
						int n = teclado.nextInt();
						cartaDeMesa = comodin(n);
						jugador2.setCarta2();
						i++;
					} else {

						if (compararCarta(jugador2.getCarta2(), cartaDeMesa) == true) {
							jugador2.setCarta2();
						}
						i++;
					}

					break;

				case 3:
					if (jugador2.getCarta3() == "Comodin") {
						menuComodin();
						int n = teclado.nextInt();
						cartaDeMesa = comodin(n);
						jugador2.setCarta3();
						i++;
					} else {

						if (compararCarta(jugador2.getCarta3(), cartaDeMesa) == true) {
							jugador2.setCarta3();
						}
						i++;
					}

					break;

				case 4:
					if (jugador2.getCarta4() == "Comodin") {
						menuComodin();
						int n = teclado.nextInt();
						cartaDeMesa = comodin(n);
						jugador2.setCarta4();
						i++;
					} else {

						if (compararCarta(jugador2.getCarta4(), cartaDeMesa) == true) {
							jugador2.setCarta4();
						}
						i++;
					}

					break;

				case 5:
					if (jugador2.getCarta5() == "Comodin") {
						menuComodin();
						int n = teclado.nextInt();
						cartaDeMesa = comodin(n);
						jugador2.setCarta5();
						i++;
					} else {

						if (compararCarta(jugador2.getCarta5(), cartaDeMesa) == true) {
							jugador2.setCarta5();
						}
						i++;
					}
					break;
				case 6:
					if (jugador2.getCarta6() == "Comodin") {
						menuComodin();
						int n = teclado.nextInt();
						cartaDeMesa = comodin(n);
						jugador2.setCarta6();
						i++;
					} else {

						if (compararCarta(jugador2.getCarta5(), cartaDeMesa) == true) {
							jugador2.setCarta6();
						}
						i++;
					}
					break;
				case 7:
					if (jugador2.getCarta7() == "Comodin") {
						menuComodin();
						int n = teclado.nextInt();
						cartaDeMesa = comodin(n);
						jugador2.setCarta7();
						i++;
					} else {

						if (compararCarta(jugador2.getCarta7(), cartaDeMesa) == true) {
							jugador2.setCarta7();
						}
						i++;
					}
					break;
				case 8:
					tomarCarta(jugador2);
					break;
				}

				break;
			}
		} while (jugador1.continuaJugando() == true && jugador2.continuaJugando() == true);

		// Dependiendo de quien gano felicitarlo
		if (jugador1.continuaJugando() == true) {
			System.out.println("Felicidades " + jugador2.getNombre() + " has ganado");
		} else {
			System.out.println("Felicidades " + jugador1.getNombre() + " has ganado");
		}
	}

	// Metodo para repartir cartas
	static String setCarta() {
		String cartaRoja = "Roja";
		String cartaAmarilla = "Amarilla";
		String cartaVerde = "Verde";
		String cartaCeleste = "Celeste";
		String comodin = "Comodin";
		String cartaElegida = "";
		int numeroAleatorio = (int) (Math.random() * 5 + 1);
		switch (numeroAleatorio) {
		case 1:
			cartaElegida = cartaRoja;

			break;

		case 2:
			cartaElegida = cartaAmarilla;

			break;

		case 3:
			cartaElegida = cartaVerde;

			break;

		case 4:
			cartaElegida = cartaCeleste;

			break;

		case 5:
			cartaElegida = comodin;

			break;
		}
		return cartaElegida;
	}

	// Metodo comodin
	static String comodin(int color) {
		String colorElegido = "";
		switch (color) {
		case 1:
			colorElegido = "Roja";
			break;
		case 2:
			colorElegido = "Amarilla";
			break;
		case 3:
			colorElegido = "Verde";
			break;
		case 4:
			colorElegido = "Celeste";
			break;
		}
		return colorElegido;
	}

	// Menu a la hora de tirar un comodin
	static void menuComodin() {
		System.out.println(
				"Elegir el color deseado :\nOpcion 1 = Roja\nOpcion 2 = Amarilla\nOpcion 3 = Verde\nOpcion 4 = Celeste");
	}

	// Comparar si la carta a tirar es compatible con la carta de mesa
	static boolean compararCarta(String carta, String cartaDeMesa) {
		if (carta != cartaDeMesa) {
			System.out.println("La carta no coincide");
			return false;
		}
		return true;
	}

	// Tomar una carta cuando el jugador quiera
	static void tomarCarta(Jugadores jugador) {
		if (jugador.getCarta1() == "sinCarta") {
			jugador.carta1 = setCarta();
		} else {
			if (jugador.getCarta2() == "sinCarta") {
				jugador.carta2 = setCarta();
			} else {
				if (jugador.getCarta3() == "sinCarta") {
					jugador.carta3 = setCarta();
				} else {
					if (jugador.getCarta4() == "sinCarta") {
						jugador.carta4 = setCarta();
					} else {
						if (jugador.getCarta5() == "sinCarta") {
							jugador.carta5 = setCarta();
						}
					}
				}
			}
		}
	}
}