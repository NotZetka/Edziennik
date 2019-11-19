package eDziennik.Users;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Register
{

    public void register()
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj nazwe użytkownia");
        String username = scanner.next();
        int size = DataBase.listOfUsers.size();
        if(size==0){
            System.out.println("podaj imię użytkownia");
            String name = scanner.next();
            System.out.println("podaj nazwisko użytkownia");
            String surnamename = scanner.next();
            System.out.println("podaj haslo");
            String password = scanner.next();

            DataBase.listOfUsers.add(new User(username, name, surnamename, password));
        }
        for (int i = 0; i < size; i++)
        {
            if (username.equals(DataBase.listOfUsers.get(i).getUsername()))
            {
                System.out.println("podana nazwa jest zajęta");
                break;
            }

            System.out.println("podaj imię użytkownia");
            String name = scanner.next();
            System.out.println("podaj nazwisko użytkownia");
            String surnamename = scanner.next();
            System.out.println("podaj haslo");
            String password = scanner.next();

            DataBase.listOfUsers.add(new User(username, name, surnamename, password));

        }

    }public void load()
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj nazwe użytkownia");
        String username = scanner.next();
        int size = DataBase.listOfUsers.size();
        if(size==0){
            System.out.println("podaj imię użytkownia");
            String name = scanner.next();
            System.out.println("podaj nazwisko użytkownia");
            String surnamename = scanner.next();
            System.out.println("podaj haslo");
            String password = scanner.next();

            DataBase.listOfUsers.add(new User(username, name, surnamename, password));
        }
        for (int i = 0; i < size; i++)
        {
            if (username.equals(DataBase.listOfUsers.get(i).getUsername()))
            {
                System.out.println("podana nazwa jest zajęta");
                break;
            }

            System.out.println("podaj imię użytkownia");
            String name = scanner.next();
            System.out.println("podaj nazwisko użytkownia");
            String surnamename = scanner.next();
            System.out.println("podaj haslo");
            String password = scanner.next();

            DataBase.listOfUsers.add(new User(username, name, surnamename, password));

        }

    }
}
