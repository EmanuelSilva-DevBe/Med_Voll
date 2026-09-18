package med.voll.api.Medicos;

public record ListaDadosMedicos(
        String nome,
        String email,
        String crm,
        Especialidade especialidade
) {

    public ListaDadosMedicos (Medicos medico){
        this(medico.getNome(), medico.getCrm(), medico.getEmail(), medico.getEspecialidade());
    }
}
