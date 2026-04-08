package relatorios;

import apoio.ItemRelatorio;
import interfaces.Exportador;

import java.util.List;

public class RelatorioFinanceiro extends Relatorio{

    public RelatorioFinanceiro(Exportador exportador) {
        super(exportador);
    }

    @Override
    public void gerar(boolean detalhado) {
        List<ItemRelatorio> itensFiltrado = filtrarItensDetalhado(detalhado);
        exportador.exportar("Relatório Financeiro",itens,calcularTotal(itensFiltrado));
    }
}
