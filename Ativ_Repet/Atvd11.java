import java.util.Scanner;

class Atvd11{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 0;

        while(true){
            System.out.print("Escolha um numero: ");
            n = ler.nextInt();

            if(n < 2){
                System.out.println("Invalido, repita");
            }
          else{
            break;
          }
        }
        
        for(int i=2; i<=n/2; i++){
            if(n % i ==0){
                System.out.println("Nao eh primo \nO seu primeiro divisor eh " + i);
                System.exit(0);
            }
        }
        System.out.println("Eh primo.");
    }
}