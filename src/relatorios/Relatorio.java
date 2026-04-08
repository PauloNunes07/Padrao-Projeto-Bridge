package relatorios;

import apoio.ItemRelatorio;
import interfaces.Exportador;

import java.util.ArrayList;
import java.util.List;

public abstract class Relatorio {
    protected Exportador exportador;
    protected List<ItemRelatorio> itens;

    public Relatorio(Exportador exportador) {
        this.exportador = exportador;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemRelatorio item) {
        this.itens.add(item);
    }

    protected double calcularTotal(List<ItemRelatorio> itensFiltrado) {
        double total = 0;
        for(ItemRelatorio item : itensFiltrado) {
            total += item.getValor();
        }
        return total;
    }


    protected List<ItemRelatorio> filtrarItensDetalhado(boolean detalhado) {
        List<ItemRelatorio> filtrados = new ArrayList<>();
        for(ItemRelatorio item : this.itens) {
            if(detalhado) {
                filtrados.add(item);
            }

            else {
                if(item.getValor() >= 100) {
                    filtrados.add(item);
                }

            }

        }
        return filtrados;
    }

    public abstract void gerar(boolean detalhado);

}
