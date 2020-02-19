import javax.swing.JOptionPane;
        


public class Calculadora02 {
    
    public static void main(String[] args) {
        String numero01 =
                JOptionPane.showInputDialog("Digite um Numero: ");
        String numero02 =
                JOptionPane.showInputDialog("Digite outro numero: ");
        
        double number01 = Double.parseDouble (numero01);
        double number02 = Double.parseDouble (numero02);
        
        String operacao =
                JOptionPane.showInputDialog("Escolha a operação: ");
                
        double resultado = 0;
        if(operacao.equals("adicao")){
            resultado = number01 + number02;
        }
        if(operacao.equals("subtracao")){
             resultado = number01 - number02;
        
        }
        if(operacao.equals("multiplicacao")){
             resultado = number01 * number02;
        
        }
        if(operacao.equals("divisao")){
             resultado = number01/number02;
        
        }
        JOptionPane.showMessageDialog(null,"O resultado da operação é de: "+resultado,"Resultado",JOptionPane.PLAIN_MESSAGE);
    
    
    }
    
}
