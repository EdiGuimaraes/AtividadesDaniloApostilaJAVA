package atividades;
import javax.swing.JOptionPane;
    public class Ati {
        public static void main(String[] args) {
            String aux = "";
            float bytes = 0, mega =2,i = 0;
            
            try{
                aux = JOptionPane .showInputDialog("Digite o primeiro numero em bytes");
                bytes = Float.parseFloat(aux);
                
                i = bytes/262144;
                
                JOptionPane.showMessageDialog(null,"Tamanho do arquivo em bytes:" + bytes +"\n Tempo: "+ i );
                
            }
            catch (NumberFormatException erro){
                JOptionPane.showMessageDialog(null, "Houve um erro na conversao de dados, digite apenas numeros" +erro.toString());
            }
            System.exit(0);
        }
        
    }
