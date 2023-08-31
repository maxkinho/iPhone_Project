// Classe Main para testar as funcionalidades
public class Main {
    public static void main(String[] args) {
        // Teste do Smartphone
        Smartphone iphone = new Smartphone();
            iphone.destravarSmartphone();
            iphone.recebendoLigacao();
            iphone.atenderChamada();
            iphone.desligarChamada();
            iphone.realizarChamada();
            iphone.destinatarioNaoAtendeTelefone();
            iphone.iniciarCaixaPostal();
            iphone.desligarChamada();
            iphone.realizarChamada();
            iphone.ouvirCorreioDeVoz();
            iphone.desligarChamada();
            iphone.travarSmartphone();


        // Teste do Navegador
        NavegadorInternet navegador = new NavegadorInternet();
            iphone.destravarSmartphone();
            navegador.abrirNavegador("https://www.exemplo.com");
            navegador.adicionarNovaAba();
            navegador.inserirUrl();
            navegador.atualizarPagina();
            iphone.travarSmartphone();

        // Teste do Reprodutor Musical
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
            iphone.destravarSmartphone();
            reprodutorMusical.abrirPlayer();
            reprodutorMusical.tocar();
            reprodutorMusical.passarMusica();
            reprodutorMusical.voltarMusica();
            reprodutorMusical.pausar();
            iphone.travarSmartphone();

    }


}
