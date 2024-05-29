package entity;

public abstract class Person {
    Person(String login, String password, String name) {
    }

    abstract String getLogin();

    abstract String getPassword();

    abstract String getName();

    abstract boolean equals(Person p);

    public abstract String toString();
}
