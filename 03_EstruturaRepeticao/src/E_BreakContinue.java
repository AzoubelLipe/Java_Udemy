
public class E_BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
		    if (i == 5) {
		        break;  // Sai do laço quando i for igual a 5
		    }
		    System.out.println("i: " + i);
		}
		
		for (int i = 0; i < 10; i++) {
		    if (i % 2 == 0) {
		        continue;  // Pula os números pares
		    }
		    System.out.println("i: " + i);
		}


	}

}
