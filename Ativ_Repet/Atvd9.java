import java.util.Scanner;

class Atvd9{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Número de vezes a ser encontrado: ");
        int ph = ler.nextInt();
        long n1 = 1;
        long n2 = 1;
        if(ph < 2){
            System.out.print("1");
        }
        else{
            System.out.print("1, 1 --> 1");

            for(int i=0 ; i<ph-2 ; i++){
                long n3 = n1 + n2;
                System.out.print(", " + n3);
                n1 = n2;
                n2 = n3;
                System.out.print("-->" + (double)n2/n1);
            }
        }
    }
}