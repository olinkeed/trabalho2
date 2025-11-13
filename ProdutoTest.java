package com.padaria.estoque.model.entidade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void testConstrutorEGetters() {
        Produto p = new Produto(1, "Pão Francês", 0.50, 100, 1);


        assertEquals(1, p.getId(), "ID do construtor não foi retornado corretamente");
        assertEquals("Pão Francês", p.getNome(), "Nome do construtor não foi retornado corretamente");
        assertEquals(0.50, p.getPreco(), "Preço do construtor não foi retornado corretamente");
        assertEquals(100, p.getQuantidade(), "Quantidade do construtor não foi retornada corretamente");
        assertEquals(1, p.getIdFornecedor(), "IdFornecedor do construtor não foi retornado corretamente");
    }

    @Test
    void testSetters() {
        Produto p = new Produto();

        p.setId(2);
        p.setNome("Bolo de Chocolate");
        p.setPreco(25.0);
        p.setQuantidade(10);
        p.setIdFornecedor(5);
        assertEquals(2, p.getId(), "O ID definido pelo setter está incorreto");
        assertEquals("Bolo de Chocolate", p.getNome(), "O Nome definido pelo setter está incorreto");
        assertEquals(25.0, p.getPreco(), "O Preço definido pelo setter está incorreto");
        assertEquals(10, p.getQuantidade(), "A Quantidade definida pelo setter está incorreta");
        assertEquals(5, p.getIdFornecedor(), "O IdFornecedor definido pelo setter está incorreto");
    }


    @Test
    void testToString() {
        Produto p = new Produto(1, "Bolo de Chocolate", 25.0, 5, 2);
        String resultado = p.toString();
        assertEquals("Bolo de Chocolate (Qtd: 5)", resultado, "O formato do toString() está incorreto");
    }

    @Test
    void testComportamentoParaEntradasInvalidas() {

        Produto p = new Produto();

        p.setPreco(-19.99);
        p.setQuantidade(-5);

        assertEquals(-19.99, p.getPreco(), "O setter de Preço deveria aceitar valor negativo (comportamento atual)");
        assertEquals(-5, p.getQuantidade(), "O setter de Quantidade deveria aceitar valor negativo (comportamento atual)");
    }

}
