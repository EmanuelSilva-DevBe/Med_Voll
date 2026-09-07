package med.voll.api.Respositorio;

import med.voll.api.Medicos.Medicos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRespository extends JpaRepository<Medicos, Long> {
}
