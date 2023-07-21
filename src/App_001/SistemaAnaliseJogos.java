package App_001;

import java.util.Scanner;

public class SistemaAnaliseJogos {
	public static void main(String[] args) {
		// Criação das instâncias das equipes

		Scanner entrada = new Scanner(System.in);

		System.out.printf("Informe o Nome da Equipe 1: ");
		String nomeEquipe1 = entrada.next();
		Equipe equipe1 = new Equipe(nomeEquipe1);

		System.out.printf("Informe o Nome da Equipe 2: ");
		String nomeEquipe2 = entrada.next();
		Equipe equipe2 = new Equipe(nomeEquipe2);

		System.err.println("\n--------------------------\n");
//
		for (int i = 0; i < 5; i++) {
			System.out.printf("Informe os dados da " + (i + 1) + "º Partidado do time: " + equipe1.getNome() + "\n");

			System.out.println();
			
			System.out.printf("Gols Marcados: ");
			int GolsMarcados = entrada.nextInt();

			System.out.printf("Gols Sofridos: ");
			int GolsSofridos = entrada.nextInt();

			System.out.printf("Finalizações: ");
			int finalizacoes = entrada.nextInt();

			System.out.printf("Gols Chutes ao gol: ");
			int chutesGol = entrada.nextInt();
			
			System.out.printf("Posse de bola: ");
			double posseBola = entrada.nextInt();

			if (GolsMarcados > GolsSofridos) {
				equipe1.adicionarVitoria();
			} else if (GolsMarcados < GolsSofridos) {
				equipe1.adicionarDerrota();
			} else {
				equipe1.adicionarEmpate();
			}

			System.out.println();

			equipe1.adicionarJogo(new Jogo(GolsSofridos, GolsMarcados, posseBola, chutesGol, finalizacoes));
		}

		for (int i = 0; i < 5; i++) {
			System.out.printf("Informe os dados da " + (i + 1) + "º Partidado do time: " + equipe2.getNome() + "\n");

			System.out.println();

			System.out.printf("Gols Marcados: ");
			int GolsMarcados = entrada.nextInt();

			System.out.printf("Gols Sofridos: ");
			int GolsSofridos = entrada.nextInt();

			System.out.printf("Finalizações: ");
			int finalizacoes = entrada.nextInt();

			System.out.printf("Gols Chutes ao gol: ");
			int chutesGol = entrada.nextInt();
			
			System.out.printf("Posse de bola: ");
			double posseBola = entrada.nextInt();

			System.out.println();

			if (GolsMarcados > GolsSofridos) {
				equipe2.adicionarVitoria();
			} else if (GolsMarcados < GolsSofridos) {
				equipe2.adicionarDerrota();
			} else {
				equipe2.adicionarEmpate();
			}

			equipe2.adicionarJogo(new Jogo(GolsSofridos, GolsMarcados, posseBola, chutesGol, finalizacoes));
		}

		entrada.close();

		// Adição dos jogos às respectivas equipes
//		equipe1.adicionarJogo(new Jogo(3, 0, 56, 4, 14));
//		equipe1.adicionarJogo(new Jogo(1, 2, 31, 5, 12));
//		equipe1.adicionarJogo(new Jogo(3, 0, 54, 4, 13));
//		equipe1.adicionarJogo(new Jogo(0, 1, 35, 4, 13));
//		equipe1.adicionarJogo(new Jogo(1, 1, 32, 4, 14));
//
//		equipe2.adicionarJogo(new Jogo(3, 2, 56, 5, 17));
//		equipe2.adicionarJogo(new Jogo(2, 0, 54, 5, 18));
//		equipe2.adicionarJogo(new Jogo(2, 0, 65, 7, 20));
//		equipe2.adicionarJogo(new Jogo(1, 0, 58, 5, 18));
//		equipe2.adicionarJogo(new Jogo(1, 1, 51, 2, 17));

		// Chamada dos métodos de cálculo de média e desempenho para cada equipe
//
		System.out.println("Média da Equipe: " + equipe1.getNome() + "\n");
		equipe1.printMediaGS();
		equipe1.printMediaGM();
		equipe1.printMediaPB();
		equipe1.printMediaChuteGol();
		equipe1.printMediaFN();
		System.out.printf("\nHistórico: " + equipe1.getVitoria() + "V " + equipe1.getEmpate() + "E "
				+ equipe1.getDerrota() + "D");

		System.out.println("\n--------------------------\n");

		System.out.println("Média da Equipe: " + equipe2.getNome() + "\n");
		equipe2.printMediaGS();
		equipe2.printMediaGM();
		equipe2.printMediaPB();
		equipe2.printMediaChuteGol();
		equipe2.printMediaFN();

		System.out.printf("\nHistórico: " + equipe2.getVitoria() + "V " + equipe2.getEmpate() + "E "
				+ equipe2.getDerrota() + "D");

		System.out.println("\n--------------------------\n");

		equipe1.compararGS(equipe2);
		System.out.println("\n--------------------------\n");
		equipe1.compararGM(equipe2);
		System.out.println("\n--------------------------\n");
		equipe1.compararPB(equipe2);
		System.out.println("\n--------------------------\n");
		equipe1.compararChute(equipe2);
		System.out.println("\n--------------------------\n");
		equipe1.compararFN(equipe2);

	}
}
