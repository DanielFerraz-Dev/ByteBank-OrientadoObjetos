package byteBank;

public class CriaConta {

	public static void main(String[] args) {
    Conta contaDaniel = new Conta();
    contaDaniel.saldo = 100;
    contaDaniel.deposita(20);
    System.out.println(contaDaniel.saldo);
    boolean exitoOperacao = contaDaniel.saca(121);
    System.out.println(contaDaniel.saldo);
    System.out.println(exitoOperacao);
	}

}
