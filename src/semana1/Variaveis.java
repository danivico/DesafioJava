package semana1;

/**
 *  Descreva 5 tipos de variaveis  e associe 10 variavel com algum dado compativel com ela.
 *  
 *  Armazene a descrição da variavel em uma variavel e imprima as variaveis no console do seguinte modo:
 *
 *
 *  nomeDaVariavel: + variavelExplicação + tipoDaVariavel 
 *
 *
 *  Dica: Procure ser simples, Variaveis de ambiente não se aplicam nessa semana.
 *  Dica2: Para mostrar algo no console procure entender o metodo "print"
 *
 */

public class Variaveis {


    public static void main(String[] args) {
    	
    	int inteiro1 = 0;
    	int inteiro2 = 523423475;
    	String descinteiro ="� o tipo de dado capaz de armazenar 32 bits, ou seja,"
    			+ " de representar um n�mero inteiro "
    			+ "qualquer entre -2.147.483.648 e 2.147.483.647." ;
    	double double1 = 2.4;
    	double double2 = 6.24e-24;
    	String descdouble = "O tipo de dados double � usado quando precisamos armazenar"
    			+ " n�meros de ponto-flutuante (com parte fracion�ria) na faixa "
    			+ "4.94065645841246544e-324 at� 1.79769313486231570e+308, possui precis�o "
    			+ "de 14 ou 15 d�gitos significativos.";
    	
    	char char1 = 'a';
    	char char2 = 'z';
    	String descchar = "O tipo char guarda um, e apenas um, caractere. Esse caractere deve estar entre aspas simples.";
    	
    	boolean bool1 = true;
    	boolean bool2 = false;
    	boolean bool3 = 2<4;
    	String descbool = " O Booleano � um tipo de dado que permite apenas dois "
    			+ "valores, true (verdadeiro) ou false (false)";
    	
    	String string1 = "pouco";
    	String string2 = "Uma grande quantidade gigantescamente gigante de caractere, n�mero 123434234, s�mbolos @#$&�%%$*"
    			+ "��' :) XD o que for preciso armazenar dentro desta vari�vel";
    	String descstring = "A vari�vel string � utilizada para armazenar dados de qualquer tipo, desde um simples"
    			+ "caractere at� s�mbolos mais complexos";
    	
    	System.out.println("Tipo da vari�vel: Inteiro (int)" + "\n" + "Exemplos: " + inteiro1 + ", "
    			+ inteiro2 + "\n" +"Descri��o da vari�vel Inteiro: " + descinteiro + "\n");
    	
    	System.out.println("Tipo da vari�vel: Double" + "\n" + "Exemplos: " + double1 + ", " + double2 + "\n"
    			+ "Descri��o da vari�vel Double: " + descdouble + "\n");
    	
    	System.out.println("Tipo da vari�vel: Char" + "\n" + "Exemplos: " + char1 + ", " + char2 
    			+ "\n" + "Descri��o da vari�vel Char: " + descchar + "\n");
    	
    	System.out.println("Tipo de vari�vel: Boolean" + "\n" + "Exemplos: " + bool1 + ", " + bool2 + ", 2<4? " + bool3
    			+ "\n" + "Descri��o da vari�vel Boolean: " + descbool + "\n");
    	
    	System.out.println("Tipoe de vari�vel: String" + "\n" + "Exemplos: " + string1 + ", \n" + string2 + "\n"
    			+ "Descri��o da vari�vel String: " + descstring);
    	
    }
}
