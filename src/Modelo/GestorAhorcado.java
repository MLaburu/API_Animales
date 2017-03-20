package Modelo;

import java.util.ArrayList;
import java.util.Random;

public class GestorAhorcado {
	
	private ArrayList<String> animales = new ArrayList<>();
	private static GestorAhorcado miGestorAhorcado = new GestorAhorcado();
	
	
	private GestorAhorcado(){
		
	}
	
	public static GestorAhorcado getGestorAhorcado(){
		return miGestorAhorcado;
	}
	
	public void importAnimales(String path){
		
		animales.add("RINOCERONTE");
		animales.add("GALLINA");
		animales.add("PERRO");
		animales.add("CAMALEON");
	}
	
	
	public void initAhorcado(){
		Random rm = new Random();
		rm.nextInt(3);
		Ahorcado.getAhorcado().setTablero(animales.get(rm.nextInt(3)));
	}
}
