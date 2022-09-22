package SistemasExamenes.servicios.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SistemasExamenes.entidades.Usuario;
import SistemasExamenes.entidades.UsuarioRol;
import SistemasExamenes.repositorios.RolRepository;
import SistemasExamenes.repositorios.UsuarioRepository;
import SistemasExamenes.servicios.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private RolRepository rolRepository;

	@Override
	public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) {
		// TODO Auto-generated method stub
		return null;
	}

}
