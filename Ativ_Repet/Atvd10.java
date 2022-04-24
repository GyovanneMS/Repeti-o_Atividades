import java.util.Scanner;

class Atvd10{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 0;

        while(true){
            System.out.print("Escolha um numero: ");
            n = ler.nextInt();

            if(n >= 2){
                System.out.println("Invalido, repita");
                break;
            }
        }
        
        for(int i=2; i<=n/2; i++){
            if(n % i ==0){
                System.out.print("Nao eh primo");
                System.exit(0);
            }
        }
        System.out.print("Eh primo.");
    }
}
