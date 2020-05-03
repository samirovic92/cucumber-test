package login;

public interface AuthenticationsService {

    boolean isLoggedIn(String userName, String password);
}
