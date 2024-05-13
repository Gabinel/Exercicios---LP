import org.junit.*;
import static org.junit.Assert.*;

public class Teste {

    @Test
    public void testeGeral() {

        //Crie uma instância da classe Arquivo passando como parâmetro o nome do arquivo
        Arquivo file = new Arquivo("Name before rename");
        assertEquals("Name before rename", file.getName());
        assertEquals("", file.getContent());
        assertEquals(0, file.getSize());

        //Abra o arquivo chamando o método abrir
        System.out.println("File initial content: " + file.open());

        //Use o método editar para modificar o arquivo
        file.edit("New content!");
        assertEquals("New content!", file.getContent());
        assertEquals(12, file.getSize());

        //Abra o arquivo novamente para visualizar as alterações
        System.out.println("File post edit content: " + file.open());

        //Renomeie e limpe o arquivo
        file.rename("Name after rename");
        assertEquals("Name after rename", file.getName());

        file.clear();
        assertEquals("", file.getContent());
        assertEquals(0, file.getSize());

        //Abra o arquivo uma última vez para verificar as alterações
        System.out.println("File final content: " + file.open());

    }

}
