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
public class Arvore {
    private Node raiz;
    
    public Arvore(){
        this.raiz = null;
    }
    
    public void initArvore(){
        this.raiz = null;
    }
    
    public void insere_palavra(String palavra)
    {
        char letra;
        Node aux;
        int i = 0;
        if(palavra.length() > 0)
        {
            if(raiz == null)
            {
                letra = palavra.charAt(i++);
                raiz = new Node(letra);
                
                if(i < palavra.length()) //Verifica se ainda tem alguma letra para ser inserida.
                    raiz.setLigacao(new Node(), letra);
                
                aux = raiz.getLigacao(letra);
            }
            else
                aux = raiz;
            
            if(i < palavra.length())
            {
                while(i < palavra.length())
                {
                    letra = palavra.charAt(i);
                    if(aux.getLetra(letra) == 0)
                        aux.setLetra(letra);

                    if (aux.getLigacao(letra) == null && i + 1 < palavra.length()) //So vai criar uma ligacao se haver mais letras
                        aux.setLigacao(new Node(), letra);

                    aux = aux.getLigacao(letra);
                    i++;
                }
            }
        }
        else
            System.out.println("Ta trollando frango?"); //Palavra vazia
        
    }

    
    public boolean procura_palavra(String palavra)
    {
        Node aux = raiz;
        boolean flag = true;
        char letra;
        int i = 0;
        
        while(aux != null && i < palavra.length() && flag)
        {
            letra = palavra.charAt(i++);
            if(aux.getLetra(letra) != 0)
                aux = aux.getLigacao(letra);
            else
                flag = false;
        }
        
        if(i < palavra.length())
            flag = false;
        
        return flag;
    }
}
