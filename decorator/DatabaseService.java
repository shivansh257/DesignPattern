package decorator;

public class DatabaseService {
    public String getMailFromUsername(String username) {
        return username + "@gmail.com";
    }

    public String getPhoneNoFromUsername(String username) {
        return username + "@phone";
    }

    public String getFBUsernameFromUsername(String username) {
        return username + "@fb";
    }
}
