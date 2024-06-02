import course2_work_4.WrongLoginExeption;
import course2_work_4.WrongPasswordExeption;

public class Main {
    private static final String REGEX = "^[a-zA-Z0-9_]*$";
    private static final String ALLOWED_CHARS = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM_";

    public static void main(String[] args) {
        try {
            checkCredentials("Zhuk>", "9992", "9992");
            System.out.println("Проверка пройдена");
        } catch (WrongLoginExeption | WrongPasswordExeption e) {
            System.out.println("Проверка не пройдена");
            e.printStackTrace();
        }
    }

    public static void checkCredentials(String login, String password, String confirmPassword) {
        if (login.length() > 20) {
            throw new WrongLoginExeption("Длинна логина больше 20 символов");
        }
        if (!login.matches(REGEX)) {
            throw new WrongLoginExeption("Логин содержит недопустимые символы");
        }
        if (password.length() > 20) {
            throw new WrongPasswordExeption("Длинна пароля больше 20 символов");
        }
        if (!password.matches(REGEX)) {
            throw new WrongPasswordExeption("Пароль содержит недопустимые символы");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordExeption("Пароли не совпадают");
        }
    }
}