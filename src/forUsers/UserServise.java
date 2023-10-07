package forUsers;

import userException.WrongLoginException;
import userException.WrongPasswordException;

import java.util.Objects;

public class UserServise {
    private final static String str = "^[a-zA-Z0-9_]+$";
    public static User createUser(String login, String password, String confirmPassword) {
        if (!login.matches(str) | !(login.length() <= 20)) {
            throw new WrongLoginException("Введен неправельный логин");
        }

        if (!password.matches(str) | !(password.length() <= 20)) {
            throw new WrongPasswordException("Введен неправельный пароль");
        }

        if (!Objects.equals(password, confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
        return new User(login, password, confirmPassword);
    }
}
