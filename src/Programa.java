import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Livro livro = new Livro("Em busca do Sentido da vida", 250);

        System.out.println(livro);

    }

}

class Livro{

    private String nome;
    private Integer numeroPaginas;

    public Livro(String nome, Integer numeroPaginas) {
        this.nome = nome;
        this.numeroPaginas = numeroPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
