public class MainBiblioteca {
    public static void main(String[] args) {

        Livro livro = new Livro("O Alquimista", "Paulo Coelho");

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central",livro);
       System.out.println(" A biblioteca se chama: "+biblioteca.getNome()+ "livro"+livro.getTitulo()+"Autor: "+livro.getAutor());
    }
}


