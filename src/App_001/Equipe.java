package App_001;

import java.util.ArrayList;
import java.util.List;

public class Equipe {

	private String nome;
	private int vitoria;
	private int derrota;
	private int empate;
	private List<Jogo> ultimosJogos;

	public Equipe(String nome) {
		this.nome = nome;
		this.ultimosJogos = new ArrayList<>();
	}

	public void adicionarJogo(Jogo jogo) {
		ultimosJogos.add(jogo);
	}

	// Método para imprimir média

	public void printMediaGS() {
		double totalGolsSofridos = mediaGolsSofrido();
		Imprimir("Média de Gols Sofridos: " + totalGolsSofridos);
	}

	public void printMediaGM() {
		double totalGolsMarcados = mediaGolsMarcados();
		Imprimir("Média de Gols Marcados: " + totalGolsMarcados);

	}

	public void printMediaPB() {
		double totalDePossaDeBola = mediaPB();
		Imprimir("Média da Posse de bola: " + totalDePossaDeBola + "%");
	}

	public void printMediaChuteGol() {
		double totalDeChute = mediaChuteGol();

		Imprimir("Média de Chutes ao gol: " + totalDeChute);
	}

	public void printMediaFN() {
		double totalDeFinalizacao = mediaFN();
		Imprimir("Média de Finalizações: " + totalDeFinalizacao);
	}

	// Métodos para calcular as médias

	double mediaGolsSofrido() {
		double totalGolsSofridos = 0;
		for (Jogo jogo : ultimosJogos) {
			totalGolsSofridos += jogo.getGolsSofridos();
		}
		return totalGolsSofridos / 5;
	}

	double mediaGolsMarcados() {
		double totalGolsMarcados = 0;
		for (Jogo jogo : ultimosJogos) {
			totalGolsMarcados += jogo.getGolsMarcados();
		}
		return totalGolsMarcados / 5;
	}

	double mediaPB() {
		double totalDePossaDeBola = 0;
		for (Jogo jogo : ultimosJogos) {
			totalDePossaDeBola += jogo.getPosseBola();
		}
		return totalDePossaDeBola / 5;
	}

	double mediaChuteGol() {
		double totalDeChutes = 0;
		for (Jogo jogo : ultimosJogos) {
			totalDeChutes += jogo.getChutesGol();
		}
		return totalDeChutes / 5;
	}

	double mediaFN() {
		double totalDeFinalizacao = 0;
		for (Jogo jogo : ultimosJogos) {
			totalDeFinalizacao += jogo.getFinalizacoes();
		}
		return totalDeFinalizacao / 5;
	}

	// Método para comparar equipes

	void compararGS(Equipe e) {
		double mSofridosE1 = this.mediaGolsSofrido();
		double mSofridosE2 = e.mediaGolsSofrido();

		Imprimir("Melhor média de Gols Sofridos!");

		if (mSofridosE1 < mSofridosE2) {
			Imprimir("Equipe: " + this.getNome() + "\nMédia: " + mSofridosE1);
		} else if (mSofridosE2 < mSofridosE1) {
			Imprimir("Equipe: " + e.getNome() + "\nMédia: " + mSofridosE2);
		} else {
			Imprimir("Empate");
		}
	}

	void compararGM(Equipe e) {
		double mMarcadosE1 = this.mediaGolsMarcados();
		double mMarcadosE2 = e.mediaGolsMarcados();

		Imprimir("Melhor média de Gols Marcados!");

		if (mMarcadosE1 > mMarcadosE2) {
			Imprimir("Equipe: " + this.getNome() + "\nMédia: " + mMarcadosE1);
		} else if (mMarcadosE2 > mMarcadosE1) {
			Imprimir("Equipe: " + e.getNome() + "\nMédia: " + mMarcadosE2);
		}
	}

	void compararPB(Equipe e) {
		double mPosseBolaE1 = this.mediaPB();
		double mPosseBolaE2 = e.mediaPB();

		Imprimir("Melhor média Posse de Bola!");

		if (mPosseBolaE1 > mPosseBolaE2) {
			Imprimir("Equipe: " + this.getNome() + "\nMédia: " + mPosseBolaE1 + "%");
		} else if (mPosseBolaE2 > mPosseBolaE1) {
			Imprimir("Equipe: " + e.getNome() + "\nMédia: " + mPosseBolaE2 + "%");
		}

	}

	void compararChute(Equipe e) {
		double mChuteE1 = this.mediaChuteGol();
		double mChuteE2 = e.mediaChuteGol();

		Imprimir("Melhor média Chutes ao Gol!");

		if (mChuteE1 > mChuteE2) {
			Imprimir("Equipe: " + this.getNome() + "\nMédia: " + mChuteE1);
		} else if (mChuteE2 > mChuteE1) {
			Imprimir("Equipe: " + e.getNome() + "\nMédia: " + mChuteE2);
		}
	}

	void compararFN(Equipe e) {
		double mFN1 = this.mediaFN();
		double mFN2 = e.mediaFN();

		Imprimir("Melhor média Finalizações!");

		if (mFN1 > mFN2) {
			Imprimir("Equipe: " + this.getNome() + "\nMédia: " + mFN1);
		} else if (mFN2 > mFN1) {
			Imprimir("Equipe: " + e.getNome() + "\nMédia: " + mFN2);
		}
	}

	// Método para imprimir

	private void Imprimir(String Texto) {
		System.out.println(Texto);
	}

	// Gets e Sets

	void adicionarVitoria() {
		setVitoria(1);
	}

	void adicionarEmpate() {
		setEmpate(1);
	}

	void adicionarDerrota() {
		setDerrota(1);
	}

	// Getters e Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Jogo> getUltimosJogos() {
		return ultimosJogos;
	}

	public void setUltimosJogos(List<Jogo> ultimosJogos) {
		this.ultimosJogos = ultimosJogos;
	}

	public int getVitoria() {
		return vitoria;
	}

	public void setVitoria(int vitoria) {
		this.vitoria += vitoria;
	}

	public int getDerrota() {
		return derrota;
	}

	public void setDerrota(int derrota) {
		this.derrota += derrota;
	}

	public int getEmpate() {
		return empate;
	}

	public void setEmpate(int empate) {
		this.empate += empate;
	}

	public void nomeEquipe(String nomeEquipe) {
		setNome(nomeEquipe);
	}
}
