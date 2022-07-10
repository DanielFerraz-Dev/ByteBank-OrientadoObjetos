package byteBank;

public class CriaConta {

	public static void main(String[] args) {
    Conta contaDaniel = new Conta();
    contaDaniel.deposita(125);
    System.out.println(contaDaniel.consultaSaldo());
    boolean exitoOperacao = contaDaniel.saca(121);
    System.out.println(contaDaniel.consultaSaldo());
    System.out.println(exitoOperacao);
    
    Conta contaJanael = new Conta();
    contaJanael.deposita(500);
    contaJanael.transfere(200, contaDaniel);
    System.out.println(contaJanael.consultaSaldo() + " " + contaDaniel.consultaSaldo());
    
    Clientes daniel = new Clientes();
    daniel.nome = "Daniel Ferraz Oliveira";
    daniel.CPF = "077.582.385-64";
    daniel.profissao = "Programador";
    
    contaDaniel.titular = daniel;
    System.out.println(contaDaniel.titular.nome);
	}

}
