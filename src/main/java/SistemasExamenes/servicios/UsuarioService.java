package SistemasExamenes.servicios;

import java.util.Set;

import SistemasExamenes.entidades.Usuario;
import SistemasExamenes.entidades.UsuarioRol;

public interface UsuarioService {

	public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles);
	
}
