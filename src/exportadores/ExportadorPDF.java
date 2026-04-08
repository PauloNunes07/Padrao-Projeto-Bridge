package exportadores;

import interfaces.Exportador;
import apoio.ItemRelatorio;

import java.util.List;

public class ExportadorPDF implements Exportador {
    @Override
    public void exportar(String titulo, List<ItemRelatorio> itens, double total) {
        System.out.println("=== EXPORTANDO PDF ===");
        System.out.println("Título: " + titulo);
        System.out.println("Itens:");
        for(ItemRelatorio item : itens) {
            System.out.printf("- %s | R$ %.2f%n",item.getDescricao(),item.getValor());
        }
        System.out.println("Total: R$ " + total);
        System.out.println("======================");
    }
}
