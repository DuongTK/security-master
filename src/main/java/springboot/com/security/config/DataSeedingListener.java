//package springboot.com.security.config;
//
//import java.util.HashSet;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//import springboot.com.security.model.Role;
//import springboot.com.security.model.User;
//import springboot.com.security.repository.RoleRepository;
//import springboot.com.security.repository.UserRepository;
//
//
//@Component
//public class DataSeedingListener implements ApplicationListener<ContextRefreshedEvent> {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private RoleRepository roleRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent arg0) {
//        // Roles
//        if (roleRepository.findByRole("ROLE_ADMIN") == null) {
//            Role role = new Role();
//            role.setRole("ROLE_ADMIN");
//            roleRepository.save(role);
//        }
//
//        if (roleRepository.findByRole("ROLE_MEMBER") == null) {
//            Role role = new Role();
//            role.setRole("ROLE_MEMBER");
//            roleRepository.save(role);
//        }
//
//        // Admin account
//        if (userRepository.findByEmail("admin@gmail.com") == null) {
//            User admin = new User();
//            admin.setEmail("admin@gmail.com");
//            admin.setPassword(passwordEncoder.encode("123456"));
//            HashSet<Role> roles = new HashSet<>();
//            roles.add(roleRepository.findByRole("ROLE_ADMIN"));
//            roles.add(roleRepository.findByRole("ROLE_MEMBER"));
//            admin.setRoles(roles);
//            userRepository.save(admin);
//        }
//
//        // Member account
//        if (userRepository.findByEmail("member@gmail.com") == null) {
//            User user = new User();
//            user.setEmail("member@gmail.com");
//            user.setPassword(passwordEncoder.encode("123456"));
//            HashSet<Role> roles = new HashSet<>();
//            roles.add(roleRepository.findByRole("ROLE_MEMBER"));
//            user.setRoles(roles);
//            userRepository.save(user);
//        }
//    }
//
//}
