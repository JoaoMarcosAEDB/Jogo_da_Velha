import java.util.Scanner;

public class jogo_velha1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		jogo_velha2 jogo = new jogo_velha2();
		String posicao;
		int valida = 0, Jogadas = 0;
		
		while(true) {//-----------------------------------------
			System.out.println("JOGO DA VELHA");
			jogo.Mostra();
			
						
			do {//Inicia jogador 1
				System.out.print("Jogador 1, informe uam posição:");
				posicao = ler.next();
				while(!jogo.Valido(posicao)) {
					System.out.println("Jogada inválida, tentar novamente!!");
					System.out.print("Jogador 1, informe sua posição:");
					posicao = ler.next();
					valida = 0;
				}
				jogo.Jogada(posicao, "X");
				valida = 1;
				
			}while(valida == 0); //Fim jogador 1--------------------------------------------------------
			
			Jogadas++;
			valida = 0;
			jogo.Mostra();
			if(!jogo.Ganhou(Jogadas).equals("NULL")) {
				break;
			}
			
			do {//Inicia jogador 2
				System.out.print("Jogador 2, informe sua posição:");
				posicao = ler.next();
				while(!jogo.Valido(posicao)) {
					System.out.println("Jogada inválida, tentar novamente!!");
					System.out.print("Jogador 2, informe uam posição:");
					posicao = ler.next();
					valida = 0;
				}
				jogo.Jogada(posicao, "O");
				valida = 1;
				
			}while(valida == 0); //Fim jogador 2--------------------------------------------------------
			
			Jogadas++;
			valida = 0;
			jogo.Mostra();
			if(!jogo.Ganhou(Jogadas).equals("NULL")) {
				break;
			}
			
	}
	}
}


		
	

