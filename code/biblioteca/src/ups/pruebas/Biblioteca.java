package ups.pruebas;

import ups.modelo.dominio.libreria.*;

import java.util.ArrayList;

public class Biblioteca {

    public static void main(String[] args) {
        ArrayList<Libro> libros = cargarBiblioteca();

        for (int i = 0; i<libros.size(); i++) {
            Libro libro = libros.get(i);
            libro.imprimir();
        }
    }

    public static ArrayList<Libro> cargarBiblioteca() {
        // Lista de libros (lista principal)
        ArrayList<Libro> libros = new ArrayList<Libro>();

        // Asignando las copias de libros
        ArrayList<CopiaLibro> copiaLibros = new ArrayList<CopiaLibro>();
        copiaLibros.add( new CopiaLibro("001-001", "Buen Estado") );
        copiaLibros.add( new CopiaLibro("001-002", "Buen Estado") );
        copiaLibros.add( new CopiaLibro("001-003", "Estado Parcial") );
        copiaLibros.add( new CopiaLibro("001-004", "Buen Estado") );
        copiaLibros.add( new CopiaLibro("001-005", "Mal Estado") );

        // Asignando editorial
        Editorial editorial01 = new Editorial();
        editorial01.setNombre("Planeta Colombiana S.A.");
        editorial01.setDomicilio("Calle 73, N°7-60.");
        Ciudad ciudad01 = new Ciudad();
        ciudad01.setNombre("Bogotá");
        Pais pais01 = new Pais();
        pais01.setNombre("Colombia");
        ciudad01.setRefPais( pais01 );
        editorial01.setRefCiudad( ciudad01 );

        ArrayList<Editorial> editoriales = new ArrayList<Editorial>();
        editoriales.add( editorial01 );

        // Asignando los autores
        ArrayList<Autor> autores = new ArrayList<Autor>();
        Autor autor01 = new Autor();
        autor01.setNombre( "Alejandro" );
        autor01.setApellido( "Querejeta Barceló" );
        autor01.setEsPrincipal( Boolean.TRUE );
        autores.add( autor01 );

        // Creacion del libro y sus asignaciones
        Libro libro01 = new Libro(2016, "978-958-42-5584", "Anhelo que esto no sea París");
        libro01.setRefCopiaLibros( copiaLibros );
        libro01.setRefEditorial( editoriales );
        libro01.setRefAutores( autores );
        libros.add( libro01 );

        // Asignando las copias de libros
        ArrayList<CopiaLibro> copiaLibros02 = new ArrayList<CopiaLibro>();
        copiaLibros02.add( new CopiaLibro("002-001", "Buen Estado") );
        copiaLibros02.add( new CopiaLibro("002-002", "Buen Estado") );
        copiaLibros02.add( new CopiaLibro("002-003", "Estado Parcial") );
        copiaLibros02.add( new CopiaLibro("002-004", "Buen Estado") );
        copiaLibros02.add( new CopiaLibro("002-005", "Buen Estado") );
        copiaLibros02.add( new CopiaLibro("002-006", "Buen Estado") );

        // Asignando editorial
        Editorial editorial02 = new Editorial();
        editorial02.setNombre("Universidad de Oriente");
        editorial02.setDomicilio("Estado Sucre");
        Ciudad ciudad02 = new Ciudad();
        ciudad02.setNombre("Cumaná");
        Pais pais02 = new Pais();
        pais02.setNombre("Venezuela");
        ciudad02.setRefPais( pais02 );
        editorial02.setRefCiudad( ciudad02 );

        ArrayList<Editorial> editoriales02 = new ArrayList<Editorial>();
        editoriales02.add( editorial02 );

        // Asignando los autores
        ArrayList<Autor> autores02 = new ArrayList<Autor>();
        Autor autor02 = new Autor();
        autor02.setNombre( "César" );
        autor02.setApellido( "Lodeiros Seijó" );
        autor02.setEsPrincipal( Boolean.TRUE );
        autores02.add( autor02 );
        autor02 = new Autor();
        autor02.setNombre( "Marcos" );
        autor02.setApellido( "De Donato" );
        autor02.setEsPrincipal( Boolean.FALSE );
        autores02.add( autor02 );
        autor02 = new Autor();
        autor02.setNombre( "Julián" );
        autor02.setApellido( "Monge-Nájera" );
        autor02.setEsPrincipal( Boolean.FALSE );
        autores02.add( autor02 );

        Libro libro02 = new Libro(2002, "980-234-123-1", "Manual Práctico de Redacción Científica y Crítica de Artículos Científicos");
        libro02.setRefCopiaLibros( copiaLibros02 );
        libro02.setRefEditorial( editoriales02 );
        libro02.setRefAutores( autores02 );
        libros.add( libro02 );

        return libros;
    }
}
