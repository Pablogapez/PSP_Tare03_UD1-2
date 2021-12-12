import JuegoCiudades.AlmacenComida;
import JuegoCiudades.Ciudad;
public class Juego {

	public static void main(String[] args) {
		//Creamos el almacen
		AlmacenComida almacen = new AlmacenComida();
		Thread aComida=new Thread(almacen);
		aComida.start();
		//Creamos ciudades
		Ciudad c1=new Ciudad("Madrid", almacen);
		Ciudad c2=new Ciudad("Barcelona", almacen);
		c1.start();
		c2.start();
	}

}
