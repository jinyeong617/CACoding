package use_case.clear_users;

import entity.User;

public interface ClearUserDataAccessInterface {
    void save(User user);

    String clear();
}
