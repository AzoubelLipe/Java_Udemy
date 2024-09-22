
public class D_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Azul";
		
		int tamanho = nome.length();
		char letra = nome.charAt(0);
		String maiuscula = nome.toUpperCase();
		String minuscula = nome.toLowerCase();
		String part = nome.substring(0, 2);
		String novaString = nome.replace('A', 'O');
		boolean igual = nome.equals("Azul");
		String nomeTrim = nome.trim();
		String formatada = String.format("Olá %s", nome);
		
		
		System.out.println(tamanho);
		System.out.println(letra);
		System.out.println(maiuscula);
		System.out.println(minuscula);
		System.out.println(part);
		System.out.println(novaString);
		System.out.println(igual);
		System.out.println(nomeTrim);
		System.out.println(formatada + "\n");
	}

}
