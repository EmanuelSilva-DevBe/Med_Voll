package med.voll.api.Services;

import med.voll.api.Endereco.DadosEndereco;
import med.voll.api.Medicos.DadosMedicos;
import med.voll.api.Medicos.ListaDadosMedicos;
import med.voll.api.Medicos.Medicos;
import med.voll.api.Respositorio.MedicoRespository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService {

    private MedicoRespository repository;

    public MedicoService(MedicoRespository repository){
        this.repository = repository;
    }

    public void cadastraMedico(DadosMedicos dados){
        repository.save(new Medicos(dados));
    }


    public List<ListaDadosMedicos> listaMedicos(){
        return repository.findAll().stream()
                .map(ListaDadosMedicos::new)
                .toList();
    }
}
