import static org.junit.Assert.*;
import org.junit.Test;

public class Teste {

    @Test
    public void TesteGeral() {

        //Crie uma instância da classe Arquivo passando como parâmetro o nome do arquivo
        Arquivo arquivo = new Arquivo("Name before rename");
        assertEquals("Name before rename", arquivo.getName());
        assertEquals("",arquivo.getContent());
        assertEquals(0, arquivo.getSize());

        //Abra o arquivo chamando o método abrir
        System.out.println("File initial content: " + arquivo.open());

        //Use o método editar para modificar o arquivo
        arquivo.edit("New content being added!");
        assertEquals("New content being added!", arquivo.getContent());

        //Abra o arquivo novamente para visualizar as alterações
        System.out.println("File with content updated: " + arquivo.open());

        //Renomeie e limpe o arquivo
        arquivo.rename("Name after rename");
        assertEquals("Name after rename", arquivo.getName());

        arquivo.clear();
        assertEquals("", arquivo.getContent());

        //Abra o arquivo uma última vez para verificar as alterações
        System.out.println("File final content: " + arquivo.open());

    }

}
