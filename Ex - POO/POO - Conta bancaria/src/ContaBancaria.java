public class ContaBancaria {

    //ATRIBUTOS
    private int number;
    private double balance;
    private String owner;
    //Lista de todos os números de conta existentes (criado para garantir que não existam números duplicados)
    private static int[] numbers = new int[1];
    private static int numberOfAccounts;

    //CONSTRUTOR
    public ContaBancaria(int number, String owner) {

        //Cria um novo array que tem mais um de tamanho do que "numbers"
        int[] aux = new int[numbers.length + 1];

        for(int i = 0; i < numbers.length; i++) {

            //Verifica se o número ja existe
            if (number == numbers[i]) {
                System.out.println("Número de conta já existente! Tente novamente");
                return;
            }

            //Preenche o array aux com todos os números já existentes em number
            aux[i] = numbers[i];

        }
            this.number = number;
            this.balance = 0;
            this.owner = owner;

            numberOfAccounts++;
            //Define numbers como aux, trazendo todos os valores nele existentes + 1 de espaço para o próximo número
            numbers = aux;
            numbers[numberOfAccounts] = number;

    }

    //MÉTODOS
    public void deposit(int value) {
        if (value > 0)
            balance += value;
        else
            System.out.println("Não foi possível depositar (o valor é menor do que o permitido)!");
    }

    public void withdraw(int value) {
        balance -= value;
    }

    //GET
    public double getBalance() {
        return balance;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    //TOSTRING
    @Override
    public String toString() {
        return "ContaBancaria{" +
                "number=" + number +
                ", balance=" + balance +
                ", owner='" + owner + '\'' +
                '}';
    }
}
