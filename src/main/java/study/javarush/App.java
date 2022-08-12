package study.javarush;

import study.javarush.Services.UserService;
import study.javarush.modeles.User;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main( String[] args )
    {
        LOGGER.log(Level.INFO, "Начало программы");
        UserService userService = new UserService();
        User user = new User();
        user.setName("Маша");
        userService.saveUser(user);
        LOGGER.log(Level.INFO, "Конец программы");
    }
}
