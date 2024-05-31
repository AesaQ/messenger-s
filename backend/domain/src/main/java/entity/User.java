package entity;

public abstract class User {
    User(String login, String password, String name) {
    }

    abstract String getLogin();

    abstract String getPassword();

    abstract String getName();

    abstract boolean equals(User p);

    public abstract String toString();
}
