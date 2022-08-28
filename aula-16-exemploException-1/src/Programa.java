import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, divisao;
        //tenta executar
        try {
            System.out.print("Digite o número 1: ");
            num1 = sc.nextInt();
            System.out.print("Digite o número 2: ");
            num2 = sc.nextInt();
            divisao = num1 / num2;
            System.out.println("Resultado da divisão: " + divisao);
        }//catch dispara o erro se for de entrada de dados
        catch (InputMismatchException e){
            System.err.println("Erro na entrada de dados: tente mais tarde!");
        }//escopo local - por isso estou usando e
        //dispara o erro se for denominador errado
        catch (ArithmeticException e){
            System.err.println("Erro na divisão: O denominador não pode ser zero.");
        }//finally encerra o programa
        finally {
            System.out.println("Finalizando bloco try/catch/finally...");
            sc.close();
        }
    }

}
