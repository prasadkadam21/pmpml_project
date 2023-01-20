package com.web.PMPML.Project.service;

import java.util.List;

import com.web.PMPML.Project.model.Admin;

public interface AdminService {
    public List<Admin>  getAllAdmin();

    public void saveAdmin(Admin admin);

    public Admin updateAdminById(int  admin_id,Admin admin);


    public void deleteAdminById(int  admin_id);
}
