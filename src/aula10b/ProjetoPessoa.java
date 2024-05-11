package aula10b;

public class ProjetoPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Funcionario funcionario = new Funcionario();

        pessoa.setNome("Larissa");
        pessoa.setIdade(23);
        pessoa.setGenero("Feminino");

        aluno.setNome("Lais");
        aluno.setIdade(20);
        aluno.setGenero("Feminino");
        aluno.setCurso("Ciência da Computação");

        professor.setNome("Professor Gustavo Guanabara");
        professor.setIdade(35);
        professor.setGenero("Masculino");
        professor.setEspecialidade("Professor de Programação");

        funcionario.setNome("Lulu");
        funcionario.setIdade(29);
        funcionario.setGenero("Feminino");
        funcionario.setTrabalhando(true);


        System.out.println(pessoa.detalhesPessoa());
        System.out.println(aluno.detalhesPessoa());
        System.out.println(professor.detalhesPessoa());
        System.out.println(funcionario.detalhesPessoa());

    }
}
