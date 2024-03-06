package tech.ada.todolist.usuario;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }
    public List<Usuario> getAllUsuarios() {
        return (List<Usuario>) repository.findAll();
    }

    public Usuario getUsuarioById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Usuario createUsuario(Usuario usuario) {
        return repository.save(usuario);
    }

    public Usuario updateUsuario(Integer id, Usuario usuario) {
        if (repository.existsById(id)) {
            usuario.setId(id);
            return repository.save(usuario);
        }
        return null;
    }

    public void deleteUsuario(Integer id) {
        repository.deleteById(id);
    }


}