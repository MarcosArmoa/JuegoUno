package ar.edu.unlam.pb1.dominio;

public class Jugadores {
private String nombre;
public String carta1;
public String carta2;
public String carta3;
public String carta4;
public String carta5;
public String carta6;
public String carta7;
//Constructor de la clase Jugadores
public Jugadores(String nombre, String carta1, String carta2, String carta3, String carta4, String carta5, String carta6, String carta7) {
    this.nombre = nombre;
    this.carta1 = carta1;
    this.carta2 = carta2;
    this.carta3 = carta3;
    this.carta4 = carta4;
    this.carta5 = carta5;
    this.carta6 = carta5;
    this.carta7 = carta5;
}

public Jugadores() {
	
}
//Cuando se descarta la carta se llama a setCartaN para cambiar a sin carta
public void setCarta1() {
    this.carta1 = "sinCarta";
}

public void setCarta2() {
    this.carta2 = "sinCarta";
}

public void setCarta3() {
    this.carta3 = "sinCarta";
}

public void setCarta4() {
    this.carta4 = "sinCarta";
}

public void setCarta5() {
    this.carta5 = "sinCarta";
}

public void setCarta6() {
    this.carta6 = "sinCarta";
}

public void setCarta7() {
    this.carta7 = "sinCarta";
}

public String getNombre() {
    return this.nombre;
}

public String getCarta1() {
    return this.carta1;
}

public String getCarta2() {
    return this.carta2;
}

public String getCarta3() {
    return this.carta3;
}

public String getCarta4() {
    return this.carta4;
}

public String getCarta5() {
    return this.carta5;
}

public String getCarta6() {
    return this.carta6;
}

public String getCarta7() {
    return this.carta7;
}

//Analizar si la partida continua 
public boolean continuaJugando() {
	while (this.getCarta1().equals("sinCarta") && this.getCarta2().equals("sinCarta") && 
		this.getCarta3().equals("sinCarta") && this.getCarta4().equals("sinCarta") &&
		this.getCarta5().equals("sinCarta") &&
		this.getCarta6().equals("sinCarta") &&
		this.getCarta7().equals("sinCarta")) {
		return false;
	}  return true;
}

}
