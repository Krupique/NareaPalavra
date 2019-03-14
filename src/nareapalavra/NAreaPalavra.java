/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nareapalavra;

/**
 *
 * @author Henrique K. Secchi
 */
public class NAreaPalavra{

    public static void main(String[] args) {
        Arvore tree = new Arvore();
        tree.insere_palavra("HENRIQUE");
        tree.insere_palavra("HEYYA");
        tree.insere_palavra("CONTROL");
        tree.insere_palavra("CONTROLADORA");
        tree.insere_palavra("CONTROLLER");
        
        if(tree.procura_palavra("CONTROLLERR"))
            System.out.println("\nAchou");
        else
            System.out.println("\nNao achou!");
        
    }
    
}
