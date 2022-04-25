import java.util.Scanner;

class Atvd4{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Escolha um número positivo: ");
        int n = ler.nextInt();
        while(true){
            if(n >= 0 ){
                double e = 0;
                    e = 1+1/n;
                    e = Math.pow(e,n);
                System.out.println("O valor eh " + e);
                System.exit(0);
            }
            System.out.println("Eh negativo.");
        }
    }
}