package sistemaFilaEspera;



import javax.swing.JOptionPane;

public class Program {
public static int idade;
public static String prioritaria = "Fila prioritaria";
public static String comum = "Fila comum";
	public static void main(String[] args) {

String aux = JOptionPane.showInputDialog(null, "Digite sua idade");
idade = Integer.parseInt(aux);
if(idade>=60 && idade<80) {
	JOptionPane.showMessageDialog(null, prioritaria);
} 
if(idade>=80 ){
	JOptionPane.showMessageDialog(null,prioritaria +  " 80+");
}

if(idade<60) {
	JOptionPane.showMessageDialog(null, comum);
}


}
}