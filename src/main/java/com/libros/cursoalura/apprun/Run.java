package com.libros.cursoalura.apprun;

import com.libros.cursoalura.model.DatosLibros;
import com.libros.cursoalura.service.ConsumoAPI;
import com.libros.cursoalura.service.ConvierteDatos;

import java.util.Scanner;

public class Run {

    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private final String URLBASE = "https://gutendex.com/books";
    private ConvierteDatos conversor = new ConvierteDatos();



//    public void GetDatosLibros() {
//        var json = consumoAPI.obtenerDatos(URLBASE);
//        System.out.printf(json);
//        System.out.printf("estoy imprimiendo");
//        DatosLibros datosLibros = conversor.obtenerDatos(json, DatosLibros.class);
//        return datosLibros;
    }



