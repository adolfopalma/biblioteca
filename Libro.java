public class Libro{

    String titulo, autor;
    int nEjemplares, nPrestados;

    public Libro(){
        titulo = "El Señor de los anillos";
        autor = "J.R.R Tolkien";
        nEjemplares = 10;
        nPrestados = 0;
    }

    public Libro(String titulo, String autor, int ejemplares, int prestados){
        this.titulo = titulo;
        this.autor = autor;
        this.nEjemplares = ejemplares;
        this.nPrestados = prestados;
    }

    public boolean prestamo(){
        if(nEjemplares > 0){
            nEjemplares--;
            nPrestados++;

            return true;
        }else{
            return false;
        }
    }

    public boolean devolucion(){
        if(nPrestados > 0){
            nPrestados--;
            nEjemplares++;

            return true;
        }else{
            return false;
        }
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNEjemplares() {
        return this.nEjemplares;
    }

    public void setNEjemplares(int nEjemplares) {
        this.nEjemplares = nEjemplares;
    }

    public int getNPrestados() {
        return this.nPrestados;
    }

    public void setNPrestados(int nPrestados) {
        this.nPrestados = nPrestados;
    }

    public void descripcion(){
        System.out.println("Titulo: " + this.titulo + ", Autor: " + this.autor + ", Ejemplares en biblioteca: " + this.nEjemplares + ", Ejemplares prestados: " + this.nPrestados);
    }
}