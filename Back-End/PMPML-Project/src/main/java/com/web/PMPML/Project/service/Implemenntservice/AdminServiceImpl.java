package com.web.PMPML.Project.service.Implemenntservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.PMPML.Project.model.Admin;
import com.web.PMPML.Project.repo.AdminRepo;
import com.web.PMPML.Project.service.AdminService;

@Service
public class AdminServiceImpl  implements AdminService {
    
        @Autowired
            AdminRepo adminRepo;


    @Override
    public List<Admin> getAllAdmin() {
        List<Admin> alist=adminRepo.findAll();
        return alist;
    }

    @Override
    public void saveAdmin(Admin admin) {
    // TODO Auto-generated method stub
    adminRepo.save(admin);
    
    }

    @Override
    public Admin updateAdminById(int admin_id,Admin admin) {
    // TODO Auto-generated method stub
    Admin adm=adminRepo.findById(admin_id).get();
    adm.setAdmin_name(admin.getAdmin_name());
    adm.setAdmin_username(admin.getAdmin_username());
    adm.setAdmin_phone(admin.getAdmin_phone());
    adm.setAdmin_address(admin.getAdmin_address());
    adm.setAdmin_email(admin.getAdmin_email());
    return adm;
    }


    @Override
    public void deleteAdminById(int admin_i) {
    // TODO Auto-generated method stub

    adminRepo.deleteById(admin_i);
    
    }
}
