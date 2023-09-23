package EXERCICIO_MODULO_07;

public class aluno {
	
	//ATRIBUTOS
	String nome;
	String curso;
	int idade;
	int media;
	
	//METODOS
	
	void mediafinal (int nota2) {
		media+=nota2;
		
		System.out.println ("A média final é " + media);
	}
	void verificaratributos () {
		System.out.println ("Os alunos cadastram o nome, curso, idade e a primeira média.");
	}

}
