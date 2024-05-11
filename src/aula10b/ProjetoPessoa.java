package aula10b;

public class ProjetoPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();
        Pessoa funcionario = new Funcionario();

        pessoa.setNome("Larissa");
        pessoa.setIdade(23);
        pessoa.setGenero("Feminino");
        System.out.println(pessoa.detalhesPessoa());

        aluno.setNome("Lais");
        aluno.setIdade(20);
        aluno.setGenero("Feminino");
        System.out.println(aluno.detalhesPessoa());

        professor.setNome("Professor Gustavo Guanabara");
        professor.setIdade(35);
        professor.setGenero("Masculino");
        System.out.println(professor.detalhesPessoa());

        funcionario.setNome("Lulu");
        funcionario.setIdade(29);
        funcionario.setGenero("Feminino");
        System.out.println(funcionario.detalhesPessoa());
    }
}
