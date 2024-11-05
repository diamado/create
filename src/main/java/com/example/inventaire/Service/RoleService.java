package com.example.inventaire.Service;
import com.example.Repository.RoleRepository;
import com.example.inventaire.entities.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    
    private final RoleRepository roleRepository;

    
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
    
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
    
    public Role createRole(Role role) {
        return roleRepository.save(role);
    }
    
    public Role getRoleById(Long id) {
        return roleRepository.findById(id).orElse(null);
    }
    
    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }
}