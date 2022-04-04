import java.util.Scanner;

class Atvd1{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        while(true){
            System.out.println("Escolha um número");
            int N = ler.nextInt();
            if (N % 2 == 0){
                System.out.println("É par!!!!!");
            }
            else{
                System.out.println("É ímpar!!!");
            }
            System.out.print("Quer continuar?(Sim/Yes ou não/Not): "); 
            String ns =ler.next();
            if(!ns.equals("Yes") && !ns.equals("yes") && !ns.equals("Sim") && !ns.equals("sim") && !ns.equals("s") && !ns.equals("S") && !ns.equals("Y") && !ns.equals("y")){
                System.exit(0);
            }
        }
    }
}