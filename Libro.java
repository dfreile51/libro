
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;
    private int vecesPrestado;
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int paginasLibro, boolean tipoDeLibro)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = paginasLibro;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = tipoDeLibro;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void imprimeAutor() {
        System.out.println(autor);
    }
    
    public void imprimeTitulo() {
        System.out.println(titulo);
    }
    
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    
    public void imprimirDetalles() {
        String imprimeDetalles = getDetalles();
        System.out.println(imprimeDetalles);
    }
    
    public String getDetalles() {
        String detallesTipoDeLibro = getTipoDeLibro();
        String segundoNumeroReferencia = "ZZZ";
        String detalles = ("Titulo: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas + ", Veces Prestado: " + vecesPrestado + ", Tipo de libro: " + detallesTipoDeLibro + ", Numero de Referencia: ");
        if (numeroReferencia != "") {
            detalles = detalles + (numeroReferencia);
        }
        else {
            detalles = detalles + (segundoNumeroReferencia);
        }
        return detalles;
    }
    
    public String getNumeroReferencia() {
        return numeroReferencia;
    }
    
    public void setNumeroReferencia(String nuevoNumeroReferencia) {
        if (nuevoNumeroReferencia.length() >= 3) {
            numeroReferencia = nuevoNumeroReferencia;
        }
        else {
            System.out.println("El número de referencia debe tener al menos 3 caracteres");
        }
    }
    
    public void prestar() {
        vecesPrestado = vecesPrestado + 1;
    }
    
    public int getVecesPrestado() {
        return vecesPrestado;
    }
    
    public String getTipoDeLibro() {
        String detallesTipoDeLibro;
        if (esLibroDeTexto == true) {
            detallesTipoDeLibro = "Es un libro de texto";
        }
        else {
            detallesTipoDeLibro = "No es un libro de texto";
        }
        return detallesTipoDeLibro;
    }
}
