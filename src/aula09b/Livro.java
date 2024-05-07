package aula09b;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Construtor
    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.leitor = leitor;
        this.paginaAtual = 0;
        this.aberto = false;
    }

    public String detalhes() {
        return "Livro [" + "Título = " + titulo + ", Autor = " + autor +
                ", Total de páginas = " + totalPaginas + ", Página atual = " +
                paginaAtual + ", Livro está aberto = " + aberto + "\n" +
                "Quem está lendo este livro = " +
                leitor.getNome() + "\n" +
                "Idade do Leitor = " + leitor.getIdade() + "\n" +
                "Gênero do Leitor = " + leitor.getGenero();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }
    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }
    public int getTotalPaginas() {
        return totalPaginas;
    }
    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }
    public int getPaginaAtual() {
        return paginaAtual;
    }
    public boolean getAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    public Pessoa getLeitor() {
        return leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int pagina) {
        if (pagina > this.totalPaginas) {
            this.paginaAtual = 0;
        } else {
            this.paginaAtual = pagina;
        }
    }

    @Override
    public void avancarPagina() {
        this.paginaAtual++;
    }

    @Override
    public void voltarPagina() {
        this.paginaAtual--;
    }
}
