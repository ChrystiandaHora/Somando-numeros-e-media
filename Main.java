import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  
  int media;
  int soma;
  int valor1 = 0;
  int valor2 = 0;
  int valor3 = 0;
  int valor4 = 0;
  int valor5 = 0;

  System.out.println("Digite um Valor: ");
    Scanner sc = new Scanner(System. in);
    valor1 = sc.nextInt();
    System.out.println("Digite um Valor: ");
    valor2 = sc.nextInt();
    System.out.println("Digite um Valor: ");
    valor3 = sc.nextInt();
    System.out.println("Digite um Valor: ");
    valor4 = sc.nextInt();
    System.out.println("Digite um Valor: ");
    valor5 = sc.nextInt();

    System.out.println("_______________");

   soma = valor1+valor2+valor3+valor4+valor5;
   System.out.println("a soma desses valores é: " + soma);

   System.out.println("_______________");

   media = soma/5;
   System.out.println("a media desses valores é: " + media);




    
  }
}