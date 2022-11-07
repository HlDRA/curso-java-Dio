import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int[] vetorX = {5,4,8,4,13,544,999,115,99,9,10,1,-54,112,0,0,1195,-45648};
        insertionSort(vetorX);
        for (int i = 0; i < vetorX.length; i++){
            System.out.print(vetorX[i] + " ");
        }
        
    }


    public static double tirarMedia(){
        double resultado = 0;
        double somatorio = 0;
        System.out.println("Digite a quantidade de numeros que deseja tirar a media: ");
        int quantidadeNumeros = sc.nextInt();
        for (int i = 0; i < quantidadeNumeros; i++){
            System.out.println("escolha o numero na posiÃ§Ã£o "+ (i+1) + ": ");
            somatorio += sc.nextDouble();
        }
        resultado = somatorio/quantidadeNumeros;
        return resultado;
    }


    public static int buscaLinear(int[] vetor, int chave){
        int resultado = -1;
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == chave) return i;
        }
        return resultado;
    }


    public static void insertionSort(int[] vetor){
        int backup = 0;
        int contador = 1;
        do{
            backup = vetor[contador];
            for (int i = contador - 1; i >= 0; i--){
                if (backup < vetor[i]){
                    vetor[i + 1] = vetor[i];
                    vetor[i] = backup;
                }
                else if (backup >= vetor[i]) break;
            }
            contador++;
        }while (contador < vetor.length);
    }
}
