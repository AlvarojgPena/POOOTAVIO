package br.edu.mm.fatec.ProjetoCarrinho.Models;

import java.util.ArrayList;

public class Cesta {
    private double SomatorioTotal = 0;
    private Produto ProdutoAdcionavel;
    private double Total;

    ArrayList<Produto> Lista = new ArrayList<Produto>();

    public void adicionarItem(Produto ProdutoAdcionavel){
        Lista.add(ProdutoAdcionavel);
    }

    private double calcularTotal(){

        for (Produto ProdutoAdcionavel: Lista) {
            SomatorioTotal = SomatorioTotal + ProdutoAdcionavel.getPreco();
        }
        return SomatorioTotal;
    }

    public void calcularTudo(){
        Total = calcularTotal();
        System.out.printf("Total = R$%.2f", Total);
    }

    public void exibirLista(){
        for (Produto ProdutoAdcionavel: Lista) {
                System.out.println(ProdutoAdcionavel.toString());
        }
    }
}
