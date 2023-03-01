package JogoDoNumeroDaSorte;
import java.util.*;


public class JogoDoNumeroSecreto{
  public static void main(String[] args){

    Random numeroRandom = new Random();

    // Gerando numero randomico.
    int numeroSecreto = numeroRandom.nextInt(10);

    // Criando entrada.
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Jogo da adivinhacao");
    System.out.println("");  
    
    // Opcoes de escolha do jogador pela quantidade de chances.
    System.out.println("Qual nivel voce escolhe?");
    System.out.println("Nível 1: Tres chances.");
    System.out.println("Nível 2: Cinco chances.");
    System.out.println("Nível 3: Oito chances.");
    int nivel = entrada.nextInt();
    
    // Colocando o resultado default como Perdedor.
    char resultado = 'P';
    
    // Definindo a quantidade de chutes default.
    int quantidadeChutes = 1;
    
    switch(nivel){
      case 1: quantidadeChutes = 3; break;
      case 2: quantidadeChutes = 5; break;
      case 3: quantidadeChutes = 8; break;
      default:
        System.out.println("Opcao invalida. Tera apenas uma chance.");
        break;
      }

    for(int i = 1; i <= quantidadeChutes; i++){
      System.out.println("Qual seu chute de 0 a 10?");

      // Entrada do chute do jogador.
      int chute = entrada.nextInt();
      System.out.println("");
      
      // Condicao para ver se jogador acertou ou não.
      if(chute == numeroSecreto){

        System.out.println("Acertou o numero secreto foi " + numeroSecreto + '.');
        resultado = 'V';
        quantidadeChutes = i;
        break;
      } else {
          System.out.println("Tente novamente.");
      }

      System.out.println("Voce chutou " + i + " de " + quantidadeChutes + " chutes.");

      }

    // Analizando se o resultado é V de Vencedor ou P de Perdedor.
    if(resultado == 'V'){
      System.out.println("");
      System.out.println("Parabens, voce ganhou o jogo da adivinhacao no " + quantidadeChutes+ "° chute.");
    } else {
        System.out.println("");
        System.out.println("O numero sorteado foi: " + numeroSecreto + ". Infelizmente vace nao conseguiu.");
        System.out.println("Tente novamente, uma hora vai conseguir.");
    }
  }   
}