package crawler.src.units;

public class Cuarto{
	int coordenadas[3];
	String descripcion;
	Creature[] criaturas;

	public int getCoordenadas(){
		return coordenadas;
	}

	public String describete(){
		/**
		TODO:
		Mandar tambien las descripciones de las criaturas.
		*/
		return new String(descripcion);
	}
	
}
