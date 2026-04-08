package interfaces;

import apoio.ItemRelatorio;

import java.util.List;

public interface Exportador {
    public void exportar(String titulo, List<ItemRelatorio> itens, double total);
}
