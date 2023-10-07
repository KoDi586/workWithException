package run;

import forUsers.User;
import forUsers.UserServise;

public class Main {
    public static void main(String[] args) {
        User[] users = {
                UserServise.createUser("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9"),
                UserServise.createUser("java_skypro_go", "D_1hWiKjjP_90", "D_1hWiKjjP_9"),
                UserServise.createUser("java_skypro_go&", "D_1hWiKjjP_9", "D_1hWiKjjP_9")
        };

                                            // 1.идеально
                                            // 2.пароли не совпадают
    }                                       // 3.логин содержит недопустимый символ
}