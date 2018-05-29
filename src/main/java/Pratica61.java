
import java.util.Set;
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.Time;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica61 {
    public static void main(String[] args) {
        
        Time time1 = new Time();
        
        time1.addJogador("Goleiro", new Jogador(11, "Fulano 1"));
        time1.addJogador("Zagueiro", new Jogador(12, "Beltrano 1"));
        time1.addJogador("Atacante", new Jogador(13, "Cicrano 1"));
        time1.addJogador("Lateral", new Jogador(14, "José 1"));
        
        Time time2 = new Time();
        
        time2.addJogador("Lateral", new Jogador(21, "Fulano 2"));
        time2.addJogador("Atacante", new Jogador(22, "Beltrano 2"));
        time2.addJogador("Goleiro", new Jogador(23, "Cicrano 2"));
        time2.addJogador("Zagueiro", new Jogador(24, "José 2"));
        
        Set<String> entradas1 = time1.getJogadores().keySet();
        
        System.out.println("Posição \tTime 1 \t\t\t Time 2");
        
        for(String entrada1: entradas1) {
            System.out.println(entrada1+" \t "+time1.getJogadores().get(entrada1)+"     \t "+time2.getJogadores().get(entrada1));
        }
        
    }
}
