import java.util.Scanner;

class Atvd10{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        while(true){
            while(true){
                System.out.print("Escolha um numero: ");
                int n = ler.nextInt();
                if(n > 1){
                    for(int i=n-1; i>=2; i--){
                        int m = n % i;
                        if(m != 0){
                            System.out.println("O numero eh primo");
                        }
                    }
                    System.out.println("O numero nao primo");
                    if(!ler.equals("Yes") && !ler.equals("yes") && !ler.equals("Sim") && !ler.equals("sim") && !ler.equals("s") && !ler.equals("S") && !ler.equals("Y") && !ler.equals("y")){
                        System.exit(0);
                    }
                    break;
                }
                System.out.println("Por favor, um número acima de 1.");
            }
        }
    }
}