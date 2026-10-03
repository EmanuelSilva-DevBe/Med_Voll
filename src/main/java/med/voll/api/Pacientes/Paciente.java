package med.voll.api.Pacientes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.Endereco.Endereco;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity(name = "Pacientes")
@Table(name = "paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private int idade;
    private String email;
    private String telefone;
    private boolean ativo = true;

    @Embedded
    private Endereco endereco;

    public Paciente(DadosPacientes dados) {
        this.nome = dados.nome();
        this.cpf = dados.cpf();
        this.idade = dados.idade();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.endereco = new Endereco(dados.endereco());
    }

    public void atualizaDados(DadosAtualizaPaciente dados) {
        if (dados.email() != null) {
            this.email = dados.email();
        }if (dados.nome() != null) {
            this.nome = dados.nome();
        }if (dados.endereco() != null) {
            this.endereco.validaInformacoes(dados.endereco());
        }

    }

    public void excluir() {
        this.ativo = false;
    }
}
