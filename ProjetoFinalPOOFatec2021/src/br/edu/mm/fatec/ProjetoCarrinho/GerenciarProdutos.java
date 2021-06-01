package br.edu.mm.fatec.ProjetoCarrinho;

import br.edu.mm.fatec.ProjetoCarrinho.Models.Cesta;
import br.edu.mm.fatec.ProjetoCarrinho.Models.Contato;
import br.edu.mm.fatec.ProjetoCarrinho.Models.Fornecedor;
import br.edu.mm.fatec.ProjetoCarrinho.Models.Produto;

public class GerenciarProdutos {

    public static void main(String[] args) {

        Contato contato = new Contato("Antonio","19 99999-9999", "antoniomogifornece@yahoo.com.br");

        Cesta cesta = new Cesta();
        Fornecedor mogiMarcas = new Fornecedor(1,"Fornecedor Mogiano", "Avenida Bandeirantes, 234", contato);

        Produto ervilhaSeca = new Produto(1,"Ervilha Seca 100g ",8.00,1, mogiMarcas);

        Produto sacoFeijao = new Produto(2,"Feijão 1kg",20.00,1, mogiMarcas);

        Produto sacoArroz = new Produto(3,"Arroz 1kg",16.00,1, mogiMarcas);

        cesta.adicionarItem(ervilhaSeca);
        cesta.adicionarItem(sacoFeijao);
        cesta.adicionarItem(sacoArroz);
        
        cesta.exibirLista();

        cesta.calcularTudo();

        
    }

}
