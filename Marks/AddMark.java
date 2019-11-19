package eDziennik.Marks;

import java.util.Scanner;

public class AddMark
{
    public void addMark(){
    System.out.println("wybierz przedmiot(matematyka, polski, fizyka, informatyka, biologia, geografia, wf), lub napisz stop)");
        Scanner scanner =  new Scanner(System.in);
        Matematyka matematyka =  new Matematyka();
        String przedmiot = scanner.nextLine();
        do{
            if ("matematyka".equals(przedmiot)){
                int ocena = scanner.nextInt();
                Matematyka.listOfMarks.add(ocena);
            }

        }while (!przedmiot.equals("stop"));

}
}
