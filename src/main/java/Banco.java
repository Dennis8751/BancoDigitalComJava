import java.util.ArrayList;
import java.util.List;

public class Banco {

   List<Cliente> listaClientes;

    public Banco() {
        this.listaClientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliete){
        Cliente cliente = new Cliente(cliete.getNome(), cliete.getIdade());
        this.listaClientes.add(cliente);
    }

    public void removerCliente(String nome){
        if (!listaClientes.isEmpty()){
            listaClientes.removeIf(cliente -> cliente.getNome().equalsIgnoreCase(nome));
        }
        else {
            throw new RuntimeException("Cliente não existe");
        }
    }

    public void exibirCliente(){
        System.out.println(this.listaClientes);
    }

    public boolean clienteCadastrado(String nome){
        return listaClientes.stream().anyMatch(cliente -> cliente.getNome().equalsIgnoreCase(nome));
    }

    @Override
    public String toString() {
        return "Banco{" +
                "listaClientes=" + listaClientes +
                '}';
    }
}
