/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Mari (48) 99618-5728
 */
public class Aula5MathMaxMinDominio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float precoProdutoA[] = {11.2f, 15.12f};
        float precoProdutoB[] = {19.7f,20};
        System.out.println("O maior preco do produto A: "
                +Math.max(precoProdutoA[0],precoProdutoA[1]));
        System.out.println("O menor preco do produto B: " 
                +Math.min(precoProdutoB[0], precoProdutoB[1]));
        
        /*
        System.out.println("1 MB tem " + Math.pow(2, 10) + " KB");
        System.out.println("A raiz quadrada de 121 é " 
                + Math.sqrt(121) + " e a raiz cúbica de 1331 também é " 
                + Math.cbrt(1331));
        */

    }
    
}
