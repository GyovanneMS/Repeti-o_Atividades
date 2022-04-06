import java.util.Scanner;

class Atvd10{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        while(true){
        System.out.print("Escolha um numero: ");
        int n = ler.nextInt();
        for(int i=n-1; i>=2; i--){
            int m = n % i;
            if(m == 0){
                System.out.println("Nao eh primo");
                System.exit(0);
            }
        }
        System.out.println("O numero eh primo");
        }
    }
}