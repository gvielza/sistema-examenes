package SistemasExamenes.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import SistemasExamenes.entidades.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Usuario findByUsername(String username);
	
}
