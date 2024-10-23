public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Maria Silva", "123456789");

        ContaBancaria conta = new ContaBancaria("30000", cliente);

        System.out.println("Cliente: " + conta.getCliente().getNome());
        System.out.println("Número da conta: " + conta.getNumero());

}
}
