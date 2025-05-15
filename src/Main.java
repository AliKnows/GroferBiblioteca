import com.rimaygood.Biblio4.Modelos.Libro;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    var libros1 = new Libro();
    var libros2 = new Libro();
    var libros3 = new Libro();

    libros1.setTitNombre("Rayuela");
    libros1.setTitFechaPublicacion(1999);
    libros1.setTitNombreAutor("Julio Cortazar");
    libros2.setTitNombre("Cien años");
    libros2.setTitFechaPublicacion(1800);
    libros2.setTitNombreAutor("Garcia Marquez");
    libros3.setTitNombre("El tunel");
    libros3.setTitFechaPublicacion(2001);
    libros3.setTitNombreAutor("Ernesto Sabato");


    ArrayList<Libro> listadeLibros = new ArrayList<>();
    listadeLibros.add(libros1);
    listadeLibros.add(libros2);
    listadeLibros.add(libros3);


        for (int i = 0; i < listadeLibros.size(); i++) {
            System.out.println("El Libro es: " + listadeLibros.get(i).getTitNombre());
            System.out.println("El autor es: " + listadeLibros.get(i).getTitNombreAutor() );
            System.out.println("----------- \n");


        }


    }

}
