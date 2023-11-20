package ar.com.codoacodo.entity;

import java.time.LocalDate;
public class MainOrador {

	public static void main(String[] args) {
		//crear un objeto de la clase orador, que luego enviare a la db
		Orador nuevoOrador = new Orador("Carlos","Lopez","email@mail.com","JAVA",LocalDate.now());
		
		System.out.println(nuevoOrador);
	}

}
