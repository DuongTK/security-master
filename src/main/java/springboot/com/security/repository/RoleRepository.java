package springboot.com.security.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springboot.com.security.model.Role;
@Repository
public interface RoleRepository  extends CrudRepository<Role,Integer> {
    Role findByRole(String role);
}
