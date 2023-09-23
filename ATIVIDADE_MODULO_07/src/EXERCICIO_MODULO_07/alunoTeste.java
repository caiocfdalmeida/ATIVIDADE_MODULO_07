package EXERCICIO_MODULO_07;

public class alunoTeste {

	public static void main (String [] args) {
		
		aluno alunoTeste = new aluno ();
		
		alunoTeste.nome = "João Rocha";
		alunoTeste.curso = "Eletricista";
		alunoTeste.idade = 22;
		alunoTeste.media = 5;
		
		alunoTeste.mediafinal(2);
		
		alunoTeste.verificaratributos();
	}
}
