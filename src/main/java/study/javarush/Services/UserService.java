package study.javarush.Services;

import study.javarush.DAO.UserDao;
import study.javarush.modeles.User;

public class UserService {
    private UserDao usersDao = new UserDao();

    public UserService() {
    }
    public void saveUser(User user) {
        usersDao.save(user);
    }
}
