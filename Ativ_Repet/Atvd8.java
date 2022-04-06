import java.util.Scanner;

class Atvd8{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Número de vezes a ser encontrado: ");
        int ph = ler.nextInt();
        long nph = 1;
        long n1ph = nph + 1; 
        System.out.print("1 ");
        for(int i=ph-1 ; i>=1 ; i--){
            n1ph -= nph;
            nph += n1ph;
            System.out.print(nph + " ");
        }

    }
}