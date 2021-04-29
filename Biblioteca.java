public class Biblioteca extends Libro{
    
    Libro libros[] = new Libro[10];

    public Biblioteca(){
        libros[0] = new Libro();
        libros[1] = new Libro("Ready Player one", "Ernest Clyne", 10, 10);
        libros[2] = new Libro();
        libros[3] = new Libro();
        libros[4] = new Libro();
        libros[5] = new Libro();
        libros[6] = new Libro();
        libros[7] = new Libro();
        libros[8] = new Libro();
        libros[9] = new Libro();
    }
}
