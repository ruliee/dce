package crawler;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Mapa {
	Cuarto [][][]dungeon;
	/*
	 * NOTA:la posicion dungeon[0][0][0]
	 * es el primer piso en la esquina
	 * inferior izquierda (suroeste)
	*/
	//TODO: hacer que cargue el dungeon de un archivo.
	public Cuarto dameelCuarto(int x,int y,int z){
		return dungeon[x][y][z];
	}
	private void guardaCuartos(String file) {
		
		try {
			FileOutputStream os = new FileOutputStream(file);
			XMLEncoder encoder = new XMLEncoder(os);
			Mapa m = this;
			encoder.writeObject(m);
			encoder.close(); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("se jodieron los archivos");
		}
		

	}
	private Mapa cargaCuartos(String file) {
		
		try {
			FileInputStream os = new FileInputStream(file);
			XMLDecoder decoder = new XMLDecoder(os);
			Mapa m = (Mapa)decoder.readObject();
			decoder.close();
			return m;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("coño los archivos no aparecen");
			return null;
		}
		 
	

	}
}
