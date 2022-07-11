package byteBank;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Clientes titular;
	
	int getNumero() {
		return numero;
	}

	void setNumero(int numero) {
		this.numero = numero;
	}

	Clientes getTitular(Clientes titular) {
		return titular;
	}

	void setTitular(Clientes titular) {
		this.titular = titular;
	}

	void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void deposita(double valor) {
		
		this.saldo = saldo + valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		}else {
			return false;
		}
	}
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
	}
	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
}
