// Tipos de variáveis em Java 
/* 
 * String -> Armazena texto
 * char -> Armazena uma única letra
 * int -> Números inteiros
 * float ->  Números decimais
 * double -> Números decimais. Maior precisão
 * 
*/
/*
 * Refras para criar variáveis 
 * Toda váriavel DEVE começar com letra minúscula
 * Não pode haver espaço no nome da váriavel
 * nomeAluno, endecoCliente,produtoAdiquirido
 */
public class Exemplo01{

    public static void main(String[] args) {
    
        
        String nome = "Nicollas Alves";
        int idade = 18;
        boolean chuva = true; // em variaveis booleanas eu uso true e false 
        char letra = 'N'; // todo char deve estar com aspas simples ''''''
        double salario = 12.000;
        float altura =(float) 1.64; // estou convertendo um double para float
            
        System.out.println("meu nome é:"+nome);
        System.out.println("minha idade é:" +idade);
        System.out.println("está chovendo" +chuva);
        System.out.println("A inicial do meu nome é"+ letra);
        System.out.println("Meu salario e"+ salario );
        System.out.println("eu tenho:"+altura+"metros");
    
    
    
    }
    
    
    
    }