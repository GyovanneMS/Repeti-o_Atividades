import java.util.Scanner;

class Atvd12{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        long n = 0;

        while(true){
            System.out.print("Escolha um numero: ");
            n = ler.nextLong();
            if(n < 2){
              System.out.println("Invalido, repita");
            }
            else{
              break;
            }
        }
        
        for(int i=2; i<=n/2; i++){
          if(n % i ==0){
            System.out.println("Não é primo");
            System.out.print("Seus divisores são: 1");
            for(int l=2; l<=n; l++){
              if(n % l == 0){
                System.out.print(", " + l);
              }
            }
          System.exit(0);
        }
      }
    System.out.println("Eh primo.");
  }
}