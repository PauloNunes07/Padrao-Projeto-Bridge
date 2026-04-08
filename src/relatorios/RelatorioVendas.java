package relatorios;

import apoio.ItemRelatorio;
import interfaces.Exportador;

import java.util.List;

public class RelatorioVendas extends Relatorio{
    public RelatorioVendas(Exportador exportador) {
        super(exportador);
    }
    @Override
    public void gerar(boolean detalhado) {
        List<ItemRelatorio> itensFiltrados = filtrarItensDetalhado(detalhado);
        double total = calcularTotal(itensFiltrados);

        exportador.exportar("Relatório de Vendas", itensFiltrados, total);

    }
}
