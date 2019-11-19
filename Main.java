package eDziennik;

import eDziennik.Marks.AddMark;
import eDziennik.Marks.Matematyka;
import eDziennik.Users.DataBase;
import eDziennik.Users.Login;
import eDziennik.Users.Register;
import eDziennik.Users.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) throws FileNotFoundException
    {
        read();
//        Scanner scanner = new Scanner(System.in);
//        String command;
//        do
//        {
//            System.out.println("wpisz (login) by się zalogować, lub (register) by się zarejestrować");
//            command = scanner.nextLine();
//            if (command.equals("register"))
//            {
//                Register register = new Register();
//                register.register();
//            }
//            else if (command.equals("login"))
//            {
//                Login login = new Login();
//                User user;
//                do
//                {
//                    user = login.login();
//                }
//                while (user == null);
//            }
//        }
//        while (!command.equals("register") || (command.equals("login")));
//        System.out.println("Użytkownicy: " + DataBase.listOfUsers);
        AddMark addMark = new AddMark();
        addMark.addMark();
        addMark.addMark();
        addMark.addMark();
        System.out.println(Matematyka.listOfMarks);
        save();

    }

    public static void save() throws FileNotFoundException
    {
        List<User> listOfUsers = DataBase.listOfUsers;
        PrintWriter save = new PrintWriter(new FileOutputStream("Database.txt"));

        for (User user : listOfUsers)
        {
            StringBuilder stringBuilder = new StringBuilder();
            int size = listOfUsers.size();
            stringBuilder.append(user.getName());
            stringBuilder.append(",");
            stringBuilder.append(user.getUsername());
            stringBuilder.append(",");
            stringBuilder.append(user.getSurname());
            stringBuilder.append(",");
            stringBuilder.append(user.getPassword());

            System.out.println(stringBuilder);
            save.println(stringBuilder.toString());
        }
        save.close();
    }


    public static void read() throws FileNotFoundException
    {
        Scanner read = new Scanner(new File("Database.txt"));
        while (read.hasNextLine())
        {
            String user = read.nextLine();
            String[] userdata = user.split(",");

            String username = userdata[1];
            String name = userdata[0];
            String surnamename = userdata[2];
            String password = userdata[3];
            DataBase.listOfUsers.add(new User(username, name, surnamename, password));
        }
    }
}
