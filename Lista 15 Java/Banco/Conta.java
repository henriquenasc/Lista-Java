public class Conta{
	private String numero;
	private double saldo;

	public String getNumero(){
		return numero;
	}

	public void setNumero(String numero){
		this.numero = numero;
	}

	public double getSaldo(){
		return saldo;
	}

	public void setSaldo(double saldo){
		this.saldo = saldo;
	}

	public void sacar(double valor){
		this.saldo -= valor;
	}

	public void depositar(double valor){
		this.saldo += valor;
	}
}