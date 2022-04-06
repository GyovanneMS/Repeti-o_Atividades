import java.util.Scanner;

class Atvd2{
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        // System.out.print("Feito");
         String login = "a";
         String senha = "a";
        // System.out.print("Feito-");

        for(int i=0; i<=2; i++){
            // System.out.print("Feito--");
            System.out.print("Login: ");
            String l = ler.next();
            System.out.print("Senha: ");
            String s = ler.next();
            // System.out.print("Feito---");

            if(login.equals(l) && senha.equals(s)){
                System.out.print("Bem vindo(a)" + login);
                break;
            }
            System.out.println("Login e/ou senha estão errados, repita por favor.");
        }
    }
}
