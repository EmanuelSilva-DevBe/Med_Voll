package med.voll.api.Services;

import med.voll.api.Medicos.DadosAtualizaMedicos;
import med.voll.api.Pacientes.DadosAtualizaPaciente;
import med.voll.api.Pacientes.DadosPacientes;
import med.voll.api.Pacientes.ListaDadosPacientes;
import med.voll.api.Pacientes.Paciente;
import med.voll.api.Respositorio.PacienteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class PacienteService {
    private final PacienteRepository repository;

    public PacienteService(PacienteRepository repository){
        this.repository = repository;
    }

    public void cadastroPaciente(DadosPacientes dadosPacientes){
        repository.save(new Paciente(dadosPacientes));
    }

    public Page<ListaDadosPacientes> listarPacientes(Pageable paginacao){
        return repository.findAll(paginacao)
                .map(ListaDadosPacientes::new);
    }

    public void atualizaDados(DadosAtualizaPaciente dados){
        var paciente = repository.getReferenceById(dados.id());

        paciente.atualizaDados(dados);
    }

    public void excluirPaciente(Long id){
        var paciente = repository.getReferenceById(id);

        paciente.excluir();
    }


}
