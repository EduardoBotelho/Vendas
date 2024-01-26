package Serviço;

import Model.Cliente;
import Repository.clienteRepository;
import org.springframework.stereotype.Service;

@Service
public class clienteService {

    private clienteRepository repository;

    public clienteService(clienteRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        clienteRepository clienteRepository = new clienteRepository();
        this.repository.persistir(cliente);
    }

    private void validarCliente(Cliente cliente) {

    }
}
