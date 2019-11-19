package eDziennik.Users;

import java.util.ArrayList;

public class User

{
    String username;
    String name;
    String surname;
    String password;

    public String getUsername()
    {
        return username;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public User(String username, String name, String surname, String password)
    {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.password = password;
    }

    public String getPassword()

    {
        return password;
    }


    @Override
    public String toString()
    {
        return "User{" +
                "Użytkownik='" + username + '\'' +
                ", Imie='" + name + '\'' +
                ", Nazwisko='" + surname + '\'' +
                '}';
    }
}
