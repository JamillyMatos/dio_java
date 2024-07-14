package edu.jamilly.primeirasemana; //Pacote
public class MyClass 
{
    
    public static void main(String [] args)
    {
        String primeiroNome = "Jamilly";
        String segundoNome = "Matos";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome); // a Variavel pode ter o mesmo nome do método o que diferencia ela é que na atribuição vai ter o () passando o parâmetro ou nulo.

        System.out.print(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) // No parametro precisa colocar o tipo da variavel também
    {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome); 
        // return retorna o método da forma que eu descrevi 
        //.concat junta o primeiro nome com o segundo, poderia colocar apenas .concat(segundonome) mas ficaria junto por isso tem o (" ") para dar espaçamento.
    }
}
