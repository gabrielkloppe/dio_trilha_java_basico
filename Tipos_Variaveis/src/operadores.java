
public class operadores {

    /**
     * @param args
     */
    public static void main(String[] args) {

            //Atribuição
        //String nome = "GLEYSON";
        //int idade = 22;
        //double peso = 68.5;
        //char sexo = 'M';
        //boolean doadorOrgao = false;
        //Date dataNascimento = new Date();
                
        
            //Aritméticos
        //double soma = 10.5 + 15.7;
        //int subtração = 113 - 25;
        //int multiplicacao = 20 * 7;        
        //int divisao = 15 / 3;
        //int modulo = 18 % 3;
        //double resultado = (10 * 7) + (20/4);
        
            //classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);

            //qual o resultado das expressoes abaixo?
        String concatenacao ="?";  
        
        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);      

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

         System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

            //Unários
        //(+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;
        //(-) Operador unário de valor negativo – nega um número ou expressão aritmética;
        //(++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;
        //(--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;
        //(!) Operador unário lógico de negação – nega o valor de uma expressão booleana;    

           
        int numero = 5;
		
            //Imprimindo o numero negativo
        System.out.println(- numero);

            //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

            //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

            //ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);

            //Ternário
        //O operador ternário é representado pelos símbolos ?: utilizados na seguinte estrutura de sintaxe:

        //<Expressão Condicional>`` ``<Caso condição seja true>``  ``<Caso condição seja false>
        int a, b;

        a = 5;
        b = 6;

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";
        */

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a==b) ? "verdadeiro" : "false";

        System.out.println(resultado);

        //Outro exemplo
        //int resultado = a == b ? 1 : 20;

        //System.out.println(resultado);

            //Relacionais
        //== Quando desejamos verificar se uma variável é IGUAL A outra.
        //!= Quando desejamos verificar se uma variável é DIFERENTE da outra.
        //> Quando desejamos verificar se uma variável é MAIOR QUE a outra.
        //>= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
        //< Quando desejamos verificar se uma variável é MENOR QUE outra.
        //<= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
    
        
    int numero1 = 1;
    int numero2 = 2;

    if(numero1 > numero2)
	    System.out.print("Numero 1 maior que numero 2");
     
    if(numero1 < numero2)
	    System.out.print("Numero 1 menor que numero 2");

    if(numero1 >= numero2)
	    System.out.print("Numero 1 maior ou igual que numero 2");

    if(numero1 <= numero2)
	    System.out.print("Numero 1 menor ou igual que numero 2");

    if(numero1 != numero2)
	    System.out.print("Numero 1 é diferente de numero 2");

        // ComparacaoAvancada.java

        String nome1 = "JAVA";
      
        String nome2 = "JAVA";
        
        System.out.println(nome1 == nome2); //true
        
        String nome3 = new String("JAVA");
        
        System.out.println(nome1 == nome3); //false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); //true

           //equals na parada
           System.out.println(nome1.equals(nome2)); //??
           System.out.println(nome2.equals(nome3)); //??
           System.out.println(nome3.equals(nome4)); //??

        int numero10 = 130;
        int numero20 = 130;
        System.out.println(numero10 == numero20); //true
        
        Integer numero100 = 130;
        Integer numero200 = 130;

        //System.out.println(numero100 == numero200); //false
        
        // A razão pela qual o resultado é false, é devido o Java tratar os valores
        // Como objetos a partir de agora.
        // Qual a solução ?
        // Quando queremos comparar objetos, usamos o método equals
        
        System.out.println(numero100.equals(numero200)); 

            //Lógicos
        //&& Operador Lógico "E"
        //|| Operador Lógico "OU"
        
        
    boolean condicao1=true;
    boolean condicao2=false;         

        /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
        expressões. 
        É como se estivesse escrito:
        "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
        */

    if(condicao1 && condicao2)
	    System.out.print("Os dois valores precisam ser verdadeiros");

        //Se condicao1 OU condicao2 for verdadeira, executar código.
    if(condicao1 || condicao2)
	    System.out.print("Um dos valores precisa ser verdadeiro");
       
       System.out.println("FIM");
    } 
 }