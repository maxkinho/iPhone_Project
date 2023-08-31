import javax.swing.*;
import javax.swing.plaf.OptionPaneUI;

public class NavegadorInternet {
    // Classe para o Navegador na Internet
    private String url = JOptionPane.showInputDialog(null, "Insira o endereço da webpage: ");
        public void abrirNavegador(String url) {
            System.out.println("Exibindo página: " + url);
        }

        public void adicionarNovaAba() {
            System.out.println("Nova aba adicionada.");
        }

        public void inserirUrl() {
            System.out.println(url);
            System.out.println("Carregando webpage.");
        }

        public void atualizarPagina() {
            System.out.println("Página atualizada.");
        }


}
