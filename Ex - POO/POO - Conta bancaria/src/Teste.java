import org.junit.*;
import static org.junit.Assert.*;

public class Teste {

    //Função de teste da classe!!
    @Test
    public void TestesConta1() {
        ContaBancaria c1 =  new ContaBancaria(1, "Cainã Antunes");

        c1.deposit(200);
        //Assegura que o valor do saldo será o esperado (1000 do base + 200 do depósito)
        assertEquals(c1.getBalance(), 200, 0);
        System.out.println(c1);

        c1.withdraw(200);
        assertEquals(c1.getBalance(), 0, 0);
        System.out.println(c1);
    }

    @Test
    public void TestesConta2() {
        ContaBancaria c2 =  new ContaBancaria(2, "André Souza");
        c2.deposit(100);
        assertEquals(c2.getBalance(), 100, 0);
        System.out.println(c2);
    }

    //AfterClass -> Acontece depois de todos os outros testes da classe
        //Ocorre dessa forma para garantir que o teste será executado depois que todos os objetos já foram instanciados
    @AfterClass
    public static void TesteTotalContas() {
        assertEquals(ContaBancaria.getNumberOfAccounts(), 2);
        System.out.println("Total de contas criadas: " + ContaBancaria.getNumberOfAccounts());
    }

}