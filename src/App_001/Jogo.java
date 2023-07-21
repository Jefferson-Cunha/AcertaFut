package App_001;

public class Jogo {

	private int golsSofridos;
	private int golsMarcados;
	private double posseBola;
	private int chutesGol;
	private int finalizacoes;

	public Jogo(int golsSofridos, int golsMarcados, double posseBola, int chutesGol, int finalizacoes) {
		this.golsSofridos = golsSofridos;
		this.golsMarcados = golsMarcados;
		this.posseBola = posseBola;
		this.chutesGol = chutesGol;
		this.finalizacoes = finalizacoes;
	}

	// Getters e Setters

	public int getGolsSofridos() {
		return golsSofridos;
	}

	public void setGolsSofridos(int golsSofridos) {
		this.golsSofridos = golsSofridos;
	}

	public int getGolsMarcados() {
		return golsMarcados;
	}

	public void setGolsMarcados(int golsMarcados) {
		this.golsMarcados = golsMarcados;
	}

	public double getPosseBola() {
		return posseBola;
	}

	public void setPosseBola(double posseBola) {
		this.posseBola = posseBola;
	}

	public int getChutesGol() {
		return chutesGol;
	}

	public void setChutesGol(int chutesGol) {
		this.chutesGol = chutesGol;
	}

	public int getFinalizacoes() {
		return finalizacoes;
	}

	public void setFinalizacoes(int finalizacoes) {
		this.finalizacoes = finalizacoes;
	}

}
