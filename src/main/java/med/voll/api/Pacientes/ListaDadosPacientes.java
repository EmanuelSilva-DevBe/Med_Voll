package med.voll.api.Pacientes;

public record ListaDadosPacientes(
        String nome,
        int idade,
        String email,
        String telefone
) {
    public ListaDadosPacientes(Paciente paciente){
        this(paciente.getNome(), paciente.getIdade(), paciente.getEmail(),
                paciente.getTelefone());
    }

}
