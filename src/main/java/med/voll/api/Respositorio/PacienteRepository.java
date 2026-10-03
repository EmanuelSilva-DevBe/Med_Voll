package med.voll.api.Respositorio;

import med.voll.api.Pacientes.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {



}
