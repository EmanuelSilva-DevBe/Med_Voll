package med.voll.api.Pacientes;

import jakarta.validation.constraints.NotNull;
import med.voll.api.Endereco.DadosEndereco;
import med.voll.api.Endereco.Endereco;

public record DadosAtualizaPaciente(
        @NotNull
        Long id,
        String email,
        String nome,
        DadosEndereco endereco
) {
}
