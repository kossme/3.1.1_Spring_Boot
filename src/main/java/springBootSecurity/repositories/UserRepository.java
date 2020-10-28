package springBootSecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import springBootSecurity.model.User;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long>
{
/*   @Query("SELECT u FROM Role u WHERE u.name = :name")
   User findByUsername(@Param("name") String name);*/

   User findByUsername(String username);

}