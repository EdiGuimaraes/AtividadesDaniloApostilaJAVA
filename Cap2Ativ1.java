package atividades;
import java.io.*;
    public class Ati {
        public static void main(String[] args) {
            String s ="";
            float base = 0, altura =0, area = 0;
            BufferedReader dado;
            try{
                System.out.println("Digite a base:");
                dado = new BufferedReader(new InputStreamReader(System.in));
                s = dado.readLine();
                base = Float.parseFloat(s);
                
                System.out.println("Digite a altura:");
                dado = new BufferedReader(new InputStreamReader(System.in));
                s = dado.readLine();
                altura = Float.parseFloat(s);
                
                area = ( base*altura )/2;
                System.out.println("Area:"+area);
            }
            catch (IOException erro){
                System.out.println("Houve um erro na entrada de dados"+ erro.toString());
            }
            catch (NumberFormatException erro){
                System.out.println("Houve um erro na conversao de dados, digite apenas numeros" +erro.toString());
            }
            
            
        }

    }
