package atividades;
import javax.swing.JOptionPane;
    public class Ati {
        public static void main(String[] args) {
            String aux = "";
            float num1 = 0, num2 =0,i = 0;
            
            try{
                aux = JOptionPane .showInputDialog("Digite o primeiro numero");
                num1 = Float.parseFloat(aux);
                
                aux = JOptionPane .showInputDialog("Digite o segundo numero");
                num2 = Float.parseFloat(aux);
                
                i = num1 + num2;
                JOptionPane.showMessageDialog(null,"Soma:" + i);
                i = num1 - num2;
                JOptionPane.showMessageDialog(null,"Subtração:" + i);
                i = num1 * num2;
                JOptionPane.showMessageDialog(null,"Multiplicação:" + i);
                i = num1 / num2;
                JOptionPane.showMessageDialog(null,"Divisão:" + i);
                
            }
            catch (NumberFormatException erro){
                JOptionPane.showMessageDialog(null, "Houve um erro na conversao de dados, digite apenas numeros" +erro.toString());
            }
            System.exit(0);
        }
    }
