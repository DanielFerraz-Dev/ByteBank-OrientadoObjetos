package byteBank;

public class CriaConta {

	public static void main(String[] args) {
    Conta contaDaniel = new Conta();
    contaDaniel.deposita(125);
    System.out.println(contaDaniel.getSaldo());
    boolean exitoOperacao = contaDaniel.saca(121);
    System.out.println(contaDaniel.getSaldo());
    System.out.println(exitoOperacao);
    
    Conta contaJanael = new Conta();
    contaJanael.deposita(500);
    contaJanael.transfere(200, contaDaniel);
    System.out.println(contaJanael.getSaldo() + " " + contaDaniel.getSaldo());
    
    Clientes daniel = new Clientes();
    daniel.setNome("Daniel Ferraz Oliveira");
    System.out.println(contaDaniel.getTitular(daniel).getNome());
	}

}
