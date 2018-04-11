package Summer.SpringBoot.beans;

public class Users {
    private Integer id;

    private String username;

    private String password;

    private String usertype;

    private String userper;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype == null ? null : usertype.trim();
    }

    public String getUserper() {
        return userper;
    }

    public void setUserper(String userper) {
        this.userper = userper == null ? null : userper.trim();
    }
}