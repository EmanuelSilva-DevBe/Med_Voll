package med.voll.api.Medicos;

import jakarta.validation.constraints.NotNull;
import med.voll.api.Endereco.DadosEndereco;

public record DadosAtualizaMedicos(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
