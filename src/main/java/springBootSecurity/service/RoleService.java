package springBootSecurity.service;

import org.springframework.security.core.GrantedAuthority;
import springBootSecurity.model.Role;

import java.util.List;

public interface RoleService {

    public List<Role> listRoles();

    Role getRoleById(int id);

    Role getRoleByName(String name);

    void save(Role role);
}
