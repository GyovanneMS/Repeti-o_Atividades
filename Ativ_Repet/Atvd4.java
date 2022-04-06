import java.util.Scanner;

class Atvd4{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Escolha um número positivo; ");
        int n = ler.nextInt();
        while(true){
            if(n <= 0 ){
                double e = 0;
                for(int i=n-1; i<=1; i--){
                    e =  Math.pow(1+1/n, n);
                }
                System.out.println("O valor " + e);
                break;
            }
        System.out.println("Eh negativo.");
        }
    }
}