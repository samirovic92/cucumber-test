package login;

public class AuthenticationsServiceImpl implements AuthenticationsService {

    public boolean isLoggedIn(String userName, String password) {
        return userName !=null && password !=null ;
    }
}
