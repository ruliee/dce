package crawler;

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
}
