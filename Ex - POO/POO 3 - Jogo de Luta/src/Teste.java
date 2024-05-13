import org.junit.*;
import static org.junit.Assert.*;

public class Teste {

    @Test
    public void testeGeral() {

        /*Dentro do método main, permita que o jogador instancie quantos personagens
        desejar, passando seus nomes como parâmetros para o construtor da classe
        Personagem.*/
        Personagem p1 = new Personagem("Ashen one");
        assertEquals("Ashen one", p1.getName());
        assertEquals(100, p1.getHp());

        Personagem p2 = new Personagem("Iudex Gundyr");
        assertEquals("Iudex Gundyr", p2.getName());
        assertEquals(100, p2.getHp());

        /*Permita que os personagens lutem entre si, chamando o método ataque de um
        personagem e passando como parâmetro o objeto do adversário a ser atacado.
        Repita o processo até que a vida de um dos personagens chegue a zero.*/
        while(p1.getHp() > 0 && p2.getHp() > 0) {

            p1.attack(p2);
            p2.attack(p1);

            System.out.println(p1.getName() + " hp: " + p1.getHp());
            System.out.println(p2.getName() + " hp: " + p2.getHp());
            System.out.println("---------------------------");

        }

        if(p1.getHp() <= 0)
            System.out.print(p2.getName());
        else
            System.out.print(p1.getName());

        System.out.println(" won!");

    }

}
