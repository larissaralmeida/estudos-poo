package aula09b;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "Masculino");
        p[1] = new Pessoa("Maria", 21, "Feminino");

        l[0] = new Livro("Aprendendo POO", "Guanabara", 500, p[0]);
        l[1] = new Livro("POO avançado com Java", "Guanabara", 300, p[1]);
        l[2] = new Livro("Aprendendo Java básico", "Jose da Silva", 600, p[1]);

        l[0].abrir();
        l[0].folhear(600);
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());

    }
}
