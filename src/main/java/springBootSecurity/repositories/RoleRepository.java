package springBootSecurity.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import springBootSecurity.model.Role;

import javax.persistence.EntityManager;
import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    @Query("SELECT u FROM Role u WHERE u.name = :name")
    Role findByName(@Param("name") String name);

}
