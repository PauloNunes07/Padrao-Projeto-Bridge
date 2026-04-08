import exportadores.ExportadorExcel;
import exportadores.ExportadorPDF;
import apoio.ItemRelatorio;
import relatorios.Relatorio;
import relatorios.RelatorioFinanceiro;
import relatorios.RelatorioVendas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ItemRelatorio produto1 = new ItemRelatorio("Produto A", 50);
        ItemRelatorio produto2 = new ItemRelatorio("Produto B", 200);
        ItemRelatorio produto3 = new ItemRelatorio("Produto C", 150);

        // 1° Cenário
        Relatorio relatorio1 = new RelatorioFinanceiro(new ExportadorPDF());
        relatorio1.adicionarItem(produto1);
        relatorio1.adicionarItem(produto2);
        relatorio1.adicionarItem(produto3);

        relatorio1.gerar(false);

        // 2° Cenário
        Relatorio relatorio2 = new RelatorioFinanceiro(new ExportadorExcel());
        relatorio2.adicionarItem(produto1);
        relatorio2.adicionarItem(produto2);
        relatorio2.adicionarItem(produto3);

        relatorio2.gerar(true);

        // 3° Cenário
        Relatorio relatorio3 = new RelatorioVendas(new ExportadorPDF());
        relatorio3.adicionarItem(produto1);
        relatorio3.adicionarItem(produto2);
        relatorio3.adicionarItem(produto3);

        relatorio3.gerar(true);

        // 4° Cenário
        Relatorio relatorio4 = new RelatorioVendas(new ExportadorExcel());
        relatorio4.adicionarItem(produto1);
        relatorio4.adicionarItem(produto2);
        relatorio4.adicionarItem(produto3);

        relatorio4.gerar(false);









    }
}