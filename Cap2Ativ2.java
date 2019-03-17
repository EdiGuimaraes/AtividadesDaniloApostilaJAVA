package atividades;
import java.util.*;
    public class Ati {
        public static void main(String[] args) {
            float deposito = 0, retirada =0, saldo = 0;
            
            try{
                System.out.println("Bem vindo a abertura de uma conta bancaria");
                System.out.println("Vamos iniciar nossos processos com um deposito:");
                Scanner sc = new Scanner(System.in);
                deposito = sc.nextFloat();
                System.out.println("Saldo atual:"+deposito);
                
                System.out.println("Digite quanto você quer retirar :");
                sc = new Scanner(System.in);
                retirada = sc.nextFloat();
                
                saldo = (deposito - retirada) ;
                System.out.println("Seu saldo atual é de :R$" + saldo );
            }
            catch (NumberFormatException erro){
                System.out.println("Houve um erro na conversao de dados, digite apenas numeros" +erro.toString());
            }   
        }
    }
