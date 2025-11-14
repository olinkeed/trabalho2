package com.padaria.estoque.model.entidade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FornecedorTest {

    @Test
    void testConstrutorEGetters() {
        Fornecedor f = new Fornecedor(1, "Farinha & Cia", "42-99999-8888", "contato@farinha.com", "Ponta Grossa");
        assertEquals(1, f.getId(), "ID do construtor não foi retornado corretamente");
        assertEquals("Farinha & Cia", f.getNome(), "Nome do construtor não foi retornado corretamente");
        assertEquals("42-99999-8888", f.getTelefone(), "Telefone do construtor não foi retornado corretamente");
        assertEquals("contato@farinha.com", f.getEmail(), "Email do construtor não foi retornado corretamente");
        assertEquals("Ponta Grossa", f.getCidade(), "Cidade do construtor não foi retornada corretamente");
    }

    @Test
    void testSetters() {
        Fornecedor f = new Fornecedor();

        f.setId(10);
        f.setNome("Laticínios Irati");
        f.setTelefone("42-3422-1122");
        f.setEmail("pedidos@laticinios.com");
        f.setCidade("Irati");

        assertEquals(10, f.getId(), "O ID definido pelo setter está incorreto");
        assertEquals("Laticínios Irati", f.getNome(), "O Nome definido pelo setter está incorreto");
        assertEquals("42-3422-1122", f.getTelefone(), "O Telefone definido pelo setter está incorreto");
        assertEquals("pedidos@laticinios.com", f.getEmail(), "O Email definido pelo setter está incorreto");
        assertEquals("Irati", f.getCidade(), "A Cidade definida pelo setter está incorreta");
    }

    @Test
    void testToString() {
        Fornecedor f = new Fornecedor(5, "Ovos da Granja", "11-5555-4444", "ovos@granja.com", "São Paulo");

        String resultado = f.toString();
        assertEquals("Ovos da Granja (São Paulo)", resultado, "O formato do toString() está incorreto");
    }

    @Test
    void testComportamentoParaEntradasInvalidas() {
        Fornecedor f = new Fornecedor();

        f.setNome(null);
        f.setEmail(null);

        assertNull(f.getNome(), "O setter de Nome deveria aceitar null (comportamento atual)");
        assertNull(f.getEmail(), "O setter de Email deveria aceitar null (comportamento atual)");
    }
}
