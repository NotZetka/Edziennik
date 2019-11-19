package eDziennik.Users;

import java.util.Scanner;

public class Login
{
    public User login()
    {
        int size = DataBase.listOfUsers.size();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj login");
        String login = scanner.nextLine();
        for (int i = 0; i < size; i++)
        {
            if (login.equals(DataBase.listOfUsers.get(i).getUsername()))
            {
                System.out.println("Podaj hasło");
                String password = scanner.nextLine();
                if (password.equals(DataBase.listOfUsers.get(i).getPassword()))
                {
                    System.out.println("zalogowano");
                    return DataBase.listOfUsers.get(i);
                }
                else
                {
                    System.out.println("błędne hasło");
                    do
                    {
                        System.out.println("wpisz hasło ponownie(1), lub przerwij(2)");
                        String a = scanner.nextLine();
                        if (a.equals("1"))
                        {
                            System.out.println("podaj hasło ponownie");
                            password = scanner.nextLine();
                        }
                        else
                        {
                           return null;
                        }
                    }
                    while (!password.equals(DataBase.listOfUsers.get(i).getPassword()));
                    return DataBase.listOfUsers.get(i);
                }
            }
        }

        System.out.println("nie znaleziono użytkownika");
        return null;
    }
}



