package guru.springframework.examplebeans;

public class FakeDataSource {

    private String username;
    private String password;
    private String dblink;

    public FakeDataSource(String username, String password, String dblink) {
        this.username = username;
        this.password = password;
        this.dblink = dblink;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDblink() {
        return dblink;
    }

    public void setDblink(String dblink) {
        this.dblink = dblink;
    }
}
