package model;

import java.io.Serializable;
import java.util.Collection;


public class UsersList implements Serializable {

    Collection<User> usersList;

    public Collection<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(Collection<User> usersList) {
        this.usersList = usersList;
    }

    @Override
    public String toString() {
        return "UsersList{" +
                "usersList=" + usersList +
                '}';
    }
}


