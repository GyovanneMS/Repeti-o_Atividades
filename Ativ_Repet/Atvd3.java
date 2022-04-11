import java.util.Scanner;

class Atvd3{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int base = 0;
        int expoente = 0;
        long conta = 0;

        while(true){
            System.out.print("A base:");
            base = ler.nextInt();
            System.out.print("O expoente:");
            expoente = ler.nextInt();
            conta = base;
            if(base >= 0 && expoente >= 0){
                break;
            }
        }

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