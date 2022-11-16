import br.edu.iftm.heranca.*;

public class Principal {

    public static void main(String[] args) {
        //Pessoa pessoa = new Pessoa("Andre", 36, 'M');
        Aluno aluno = new Aluno("Andre", 36, 'M', "123456", "Ciência da Computação");
        System.out.println(aluno);
        //Funcionario funcionario = new Funcionario("João", 22, 'M', "CRCA", "Secretária" );
        //System.out.println(funcionario);
        Pedagoga pedagogo = new Pedagoga("João", 22, 'M', "CRCA", "Pedagogo" );

        Professor professor = new Professor("Marcão", 19, 'M', "Desenvolvimento", "Desenvolvimento de jogos",
                "RPG", 700.00 );
        professor.receberAumento();
        System.out.println(professor);

    }
}
