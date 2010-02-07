package crawler;

public class Criatura {
	Cuarto actual;
	Mapa dungeon;
	
	public String mira(){
		return actual.descripcion;
	}
	
	//TODO: hacer que efectue el cambio de habitacion
	public int caminarA(char direccion){
		switch (direccion){
		case 'n':
			if(actual.n){
				dungeon.dameelCuarto(actual.x, actual.y+1, actual.z);
				return 0;
			}break;
		case 's':
			if(actual.s){
				dungeon.dameelCuarto(actual.x, actual.y-1, actual.z);
				return 0;
			}break;
		case 'e':
			if(actual.e){
				dungeon.dameelCuarto(actual.x+1, actual.y, actual.z);
				return 0;
			}break;
		case 'o':
			if(actual.o){
				dungeon.dameelCuarto(actual.x-1, actual.y, actual.z);
				return 0;
			}break;
		case 'r':
			if(actual.r){
				dungeon.dameelCuarto(actual.x,actual.y,actual.z+1);
				return 0;
			}break;
		case 'b':
			if(actual.b){
				dungeon.dameelCuarto(actual.x,actual.y,actual.z-1);
				return 0;
			}break;
		}
		//si no se pudo mover, retorna -1
		return -1;
	}
}
