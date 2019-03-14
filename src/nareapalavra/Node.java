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
public class Node implements TF{
    private char[] alfabeto;
    private Node[] ligacoes;
    private static int N = TF.N;
    
    //Tabela ASC II: A=65 Z=90
    //Tabela ASC II: a=97 z=122
    public Node(char info)
    {
        alfabeto = new char[N];
        ligacoes = new Node[N];
        
        alfabeto[info - 65] = info;
    }
    
    public Node()
    {
        alfabeto = new char[N];
        ligacoes = new Node[N];
        
    }

    public char getLetra(int pos) {
        return alfabeto[pos - 65];
    }

    public void setLetra(char letra) {
        this.alfabeto[letra - 65] = letra;
    }

    public Node getLigacao(int pos) {
        return ligacoes[pos - 65];
    }

    public void setLigacao(Node lig, int pos) {
        this.ligacoes[pos - 65] = lig;
    }
    
    public int getTF()
    {
        return N;
    }
}
