package com.tmimi.a3tiers_users.business;

import com.tmimi.a3tiers_users.models.User;

import java.util.List;

public interface Services {
    // l'ensemble des fcts du systeme

    public User addUser(User user);
    public User updateUser(User user);
    public boolean deleteUser(int id);
    public User getUser(int id);
    public List<User> getUsers();
    public List<User> getUsersSortedByName();
}
