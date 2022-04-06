import java.util.Scanner;

class Atvd3{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("A base:");
        int base = ler.nextInt();
        System.out.print("O expoente:");
        int expoente = ler.nextInt();
        long conta = base;
        if(expoente == 0){
            System.out.println("O valor eh: 1");
            System.exit(0);
        }
        for(int i=expoente-1; i>=1; i--){
            conta *= base;
        }
        System.out.println("O valor eh: " + conta);
    }
}