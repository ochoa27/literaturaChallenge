package com.libros.cursoalura;

import com.libros.cursoalura.apprun.Run;
import com.libros.cursoalura.service.ConsumoAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursoaluraApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CursoaluraApplication.class, args);

//		ConsumoAPI consumoAPI=new ConsumoAPI();
//		consumoAPI.obtenerDatos();
	}


	@Override
	public void run(String... args) throws Exception {
//		Run run	= new Run();
//		run.GetDatosLibros();

		ConsumoAPI consumoAPI=new ConsumoAPI();
		consumoAPI.obtenerDatos();
		System.out.println("respuesta " +consumoAPI.obtenerDatos());
		System.out.println("oelo si i");


	}
}
