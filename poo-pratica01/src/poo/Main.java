package poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Professor> professoresLista = new ArrayList<Professor>();
		ArrayList<Aluno> alunosLista = new ArrayList<Aluno>();

		for (int i = 0; i < 1; i++) {
			Professor professor = new Professor();
			System.out.println("Cadastro dos professores\nInsira o nome:\n");
			professor.setNome(input.nextLine());

			System.out.println("Insira a data de nascimento (ano, mês, dia)\n");
			Integer ano = Integer.valueOf(input.nextLine());
			Integer mes = Integer.valueOf(input.nextLine());
			Integer dia = Integer.valueOf(input.nextLine());
			professor.setDataNasc(LocalDate.of(ano, mes, dia));
			

			System.out.println("Agora, o CPF:\n");
			professor.setCpf(Long.valueOf(input.nextLine()));

			System.out.println("\nInsira o siape do professor:");
			professor.setSiape(Long.valueOf(input.nextLine()));

			professoresLista.add(professor);

		}

		for (int i = 0; i < 1; i++) {
			Aluno aluno = new Aluno();
			System.out.println("\nCadastro de aluno\nInsira o nome:");
			aluno.setNome(input.nextLine());

			System.out.println("\nInsira a data de nascimento (ano, mês, dia)");

			Integer ano = Integer.valueOf(input.nextLine());
			Integer mes = Integer.valueOf(input.nextLine());
			Integer dia = Integer.valueOf(input.nextLine());
			aluno.setDataNasc(LocalDate.of(ano, mes, dia));

			System.out.println("\nAgora, o CPF:");
			aluno.setCpf(Long.valueOf(input.nextLine()));

			System.out.println("\nPor fim, a matrícula do aluno:");
			aluno.setMatricula(Long.valueOf(input.nextLine()));

			alunosLista.add(aluno);

		}

		input.close();
		
		System.out.println("\nAlunos cadastrados\n");
		for (Aluno aluno : alunosLista) {
			System.out.println(aluno.getNome());
			System.out.println(aluno.getCpf());
			System.out.println(aluno.getDataNasc());
			System.out.println(aluno.getMatricula());
		}
		
		System.out.println("\nProfessores cadastrados\n");
		for (Professor professor : professoresLista) {
			System.out.println(professor.getNome());
			System.out.println(professor.getCpf());
			System.out.println(professor.getDataNasc());
			System.out.println(professor.getSiape());
		
		}

	}

}
