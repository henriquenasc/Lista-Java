public class Funcionarios{
	private String nome;
	private String numeroMatricula;
	private int grauEscolaridade;
	private double tempoServico;
	private double salario;

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return nome;
	}

	public void setNumeroMatricula(String numMatricula){
		this.numeroMatricula = numMatricula;
	}

	public String getNumeroMatricula(){
		return numeroMatricula;
	}

	public void setGrauEscolaridade(int grauEscolaridade){
		this.grauEscolaridade = grauEscolaridade;
	}

	public int getGrauEscolaridade(){
		return grauEscolaridade;
	}

	public void setTempoServico(double tempoServico){
		this.tempoServico = tempoServico;
	}
	public double getTempoServico(){
		return tempoServico;
	}

	public void setSalario(double salario){
		this.salario = salario;
	}

	public double getSalario(){
		return salario;
	}
}