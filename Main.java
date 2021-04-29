import java.lang.reflect.Method;

public class Main {

    public static void main(String args[]) {

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.descripcion();
        biblioteca.prestamo();
        biblioteca.descripcion();

        Libro libro1 = new Libro("Ready Player one", "Ernest Clyne", 10, 0);
        Libro libro2 = new Libro("El sabueso de los Baskerville", "Arthur Conan Doyle", 10, 0);

        libro1.descripcion();
        libro2.descripcion();

        libro1.prestamo();
        libro1.prestamo();
        libro1.prestamo();

        libro2.prestamo();
        libro2.prestamo();
        libro2.prestamo();

        libro1.descripcion();
        libro2.descripcion();

        libro1.devolucion();

        libro2.devolucion();
        libro2.devolucion();

        libro1.descripcion();
        libro2.descripcion();
    }

}
