package exportadores;

import interfaces.Exportador;
import apoio.ItemRelatorio;
import java.util.List;

public class ExportadorExcel implements Exportador {
    @Override
    public void exportar(String titulo, List<ItemRelatorio> itens, double total) {
        System.out.println("=== EXPORTANDO EXCEL ===");
        System.out.printf("[" + titulo + "]\n");

        for(ItemRelatorio item : itens) {
            System.out.printf("%s;%.2f%n", item.getDescricao(),item.getValor());
        }
        System.out.println("TOTAL; " + total);
        System.out.println("======================");
    }

}
