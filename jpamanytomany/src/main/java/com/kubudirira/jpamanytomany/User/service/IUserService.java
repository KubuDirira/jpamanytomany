package com.kubudirira.jpamanytomany.User.service;


import com.kubudirira.jpamanytomany.User.model.User;

import java.util.List;

public interface IUserService {

    public void save(User user);
    public List<User> get();
    public void delete(Integer id);
    public void update();

    public User assignRoleToUser (Integer user_id, Integer role_id);

}
