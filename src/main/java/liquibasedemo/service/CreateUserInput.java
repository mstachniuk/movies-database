package liquibasedemo.service;

public class CreateUserInput {
    private String email;
    private String password;

    public CreateUserInput(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
