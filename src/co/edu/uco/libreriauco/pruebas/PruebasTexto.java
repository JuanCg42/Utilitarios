package co.edu.uco.libreriauco.pruebas;// En que paquete está la clase

import co.edu.uco.libreriauco.transversal.utilitarios.UtilFecha;
import co.edu.uco.libreriauco.transversal.utilitarios.UtilObjeto;
import co.edu.uco.libreriauco.transversal.utilitarios.UtilUUID;

import static co.edu.uco.libreriauco.transversal.utilitarios.UtilTexto.getUtilTexto;
import java.util.UUID;

public class PruebasTexto {//El modificador de acceso  desde cualquier lado se puede utilizar

	public static void main(String[] args) {//Void-> no retorna resultado 
		
		UUID miVariable = UtilUUID.generar();
		
		//Me garantiza que este va ser mi valor por defecto
		
		System.out.println(UtilFecha.obtenerFechaActual());
		System.out.println(miVariable);
		System.out.println(getUtilTexto().obtenerLongitudCadena(miVariable.toString(), false));

		
	
	}

}
