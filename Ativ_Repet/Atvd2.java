import java.util.Scanner;

class Atvd2{
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String login = ler.next();
        String senha = ler.next();

        for(int i=0; i<=2; i++){
            System.out.print("Login: ");
            String l = ler.next();
            System.out.print("Senha: ");
            String s = ler.next();

            if(login.equals(l) && senha.equals(s)){
                System.out.print("Bem vindo(a) " + login + "!!");
                break;
            }
            if(i == 2){
                System.out.println("Senha bloqueada.");
                System.exit(0);
            }
            System.out.println("Login e/ou senha estão errados, repita por favor.");
        }
    }
}
