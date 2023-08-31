public class Smartphone {
    // Classe para o aparelho Smartphone
        private boolean conectando = false;
        private boolean emChamada = false;
        private boolean destravarSmartphone = false;
        private boolean recebendoChamada = false;
        private boolean naoAtende = false;

        public void travarSmartphone() {
            destravarSmartphone = false;
            System.out.println("Smartphone travado, destrave para poder utilizar seus recursos");
        }

        public void destravarSmartphone() {
            destravarSmartphone = true;
            System.out.println("Smartphone destravado, você ja pode realizar chamadas, escutar músicas ou navegar na " +
                    "internet.");
        }

        public void realizarChamada() {
            if (destravarSmartphone = true) {
            conectando = true;
            System.out.println("Realizando chamada.");
            } else {
                System.out.println("Destrave seu iPhone");
            }
        }

        public void desligarChamada() {
            conectando = false;
            System.out.println("Desligando chamada.");
        }

        public void atenderChamada() {
            if (conectando && !emChamada) {
                emChamada = true;
                System.out.println("Recebendo chamada.");
                System.out.println("Chamada atendida.");
            }
        }

        public void iniciarCaixaPostal() {
            if (naoAtende = true) {
                System.out.println("Sua chamada está sendo encaminhada para a caixa postal e estará sujeita a " +
                        "cobrança após o sinal");
            }
        }

        public void recebendoLigacao() {
            recebendoChamada = true;
            System.out.println("Trim Trim Trim, recebendo chamada!");
        }

        public void destinatarioNaoAtendeTelefone() {
            naoAtende = true;
        }

        public void ouvirCorreioDeVoz() {
            System.out.println("Você tem zero mensagens em seu correio de voz.");
        }
    }
