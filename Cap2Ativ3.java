package atividades;
import javax.swing.JOptionPane;
import java.util.Scanner;
    public class Ati {
        public static void main(String[] args) {
            Scanner aux = new Scanner(System.in);
            float peso = 0, altura =0, imc = 0;
            
           
                System.out.println("CALCULO DE IMC");
                System.out.println("Digite seu peso:");
                peso = aux.nextFloat();
                
                System.out.println("Digite sua altura:");
                altura = aux.nextFloat();
                
                imc = (peso)/(altura*altura);
                
                if(imc < 18.5)
                    System.out.println("Peso abaixo do normal");
                if((imc >= 18.5) && (imc <=24.4))
                     System.out.println("Peso ideal");
                if((imc >= 24.5) && (imc <=29.9))
                     System.out.println("Pré obesidade");
                if((imc >= 30) && (imc <= 34.9))
                     System.out.println("Obsidade classe 1");
                if((imc >= 35) && (imc <= 39.9))
                    System.out.println("Obesidade classe 2(severá)");
                if(imc > 39.9)
                    System.out.println("Obesidade classe 3(mórbida)");
            
            
        }
    }
