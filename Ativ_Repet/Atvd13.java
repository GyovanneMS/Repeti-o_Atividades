import java.util.Scanner;

class Atvd13{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n = 0;

    while(true){
        System.out.print("Escolha um numero: ");
        n = ler.nextInt();

        if(n < 1){
            System.out.println("Invalido, repita");
        }
      else{
        break;
      }
    }

    int v = 2;
    int b = 0;
    int a = 1;
    int e = 
    while(true){
      v++;
      for(int i=2; i<=v/2; i++){
        if(n % i == 0){
          a++;
        }
      }
      if(a == )
      b++;
      if(b == n){
        System.exit(0);
      }
    }
  }
}