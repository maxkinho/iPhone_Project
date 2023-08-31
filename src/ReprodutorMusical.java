import java.util.stream.Stream;

// Interface para o Reprodutor Musical
public class ReprodutorMusical{
        private boolean tocarMusica = false;
        private boolean pausarMusica = false;
        private boolean proximaMusica = false;
        private boolean musicaAnterior = false;
        private boolean abrirReprodutorMusical = false;

        public void abrirPlayer() {
                abrirReprodutorMusical = true;
                System.out.println("Abrindo player de música.");
        }

        public void tocar() {
                tocarMusica = true;
                System.out.println("Tocando música.");
        }
        public void pausar() {
                pausarMusica = true;
                tocarMusica = false;
                System.out.println("Musica pausada.");
        }
        public void passarMusica() {
                proximaMusica = true;
                tocarMusica = false;
                System.out.println("Próxima música.");
                tocarMusica = true;
        }
        public void voltarMusica() {
                musicaAnterior = true;
                tocarMusica = false;
                System.out.println("Música anterior.");
                tocarMusica = true;
        }
}
