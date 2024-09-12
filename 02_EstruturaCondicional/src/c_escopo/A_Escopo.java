package c_escopo;

public class A_Escopo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10; // Variável de instância, acessível em toda a classe
		System.out.println(x);
		
		for (int i = 0; i < 10; i++) {
		    // 'i' é acessível apenas dentro deste laço
		}

	}

	void exemplo() {
	    int y = 5; // Variável local, acessível apenas dentro deste método
	    System.out.println(y);
	}
}
