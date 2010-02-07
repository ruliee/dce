package crawler;

public class Cuarto {
	//descripción del cuarto
	String descripcion;
	//puertas
	boolean n,s,e,o,r,b;//nota: r es arriba y b es abajo
	//TODO: arreglo de Criaturas (NPCs) contenidas.
	//TODO: arreglo de Items contenidos.
	//coordenadas de la habitación
	int x,y,z;
	
	public Cuarto(String descripcion,boolean n, boolean s,boolean e,boolean o,
			int x,int y, int z){
		this.descripcion = descripcion;
		this.n = n;
		this.s = s;
		this.e = e;
		this.o = o;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
}
