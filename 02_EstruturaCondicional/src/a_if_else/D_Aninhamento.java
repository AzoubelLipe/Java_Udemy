package a_if_else;

public class D_Aninhamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 20;
		boolean temCarteira = true;

		if (idade >= 18) {
		    if (temCarteira) {
		        System.out.println("Pode dirigir.");
		    } else {
		        System.out.println("Você precisa de uma carteira de motorista.");
		    }
		} else {
		    System.out.println("Você é menor de idade.");
		}
	}

}
