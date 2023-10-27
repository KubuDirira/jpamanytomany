package com.kubudirira.jpamanytomany.Role.service;

import com.kubudirira.jpamanytomany.Role.model.Role;

import java.util.List;

public interface IRoleService {

    public void save(Role role);
    public List<Role> get();
    public void delete(Integer id);
    public void update();

    public Role assignRoleUser(Integer user_id, Integer role_id);
}
