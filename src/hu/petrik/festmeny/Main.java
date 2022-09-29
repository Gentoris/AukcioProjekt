package hu.petrik.festmeny;

import hu.petrik.festmeny.Festmeny;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Festmeny> festmenyek = new ArrayList<>();

        Festmeny egy = new Festmeny("Mestermű", "Picasso", "Reneszánsz");
        egy.licit();
        Festmeny ketto = new Festmeny("Olaszosan", "Buon Giorno", "Toszkán");

        festmenyek.add(egy);
        festmenyek.add(ketto);


    System.out.println("Hány festmény szeretne felvenni?: ");
    Scanner sc = new Scanner(System.in);
    int festmenyMennyiseg = sc.nextInt();
        sc.nextLine();
    String festmenyNev;
    String festoNeve;
    String stilus;
        while (festmenyMennyiseg != 0) {

        System.out.print("Adja meg festmény Nevét: ");
        festmenyNev = sc.nextLine().toString();
        sc.nextLine();

        System.out.print("Adja meg Festő nevét: ");
        festoNeve = sc.nextLine().toString();
        sc.nextLine();

        System.out.print("Adja meg a stílust: ");
        stilus = sc.nextLine().toString();
        sc.nextLine();

        festmenyek.add(new Festmeny(festmenyNev, festoNeve, stilus));
        festmenyMennyiseg--;
    }
        egy.setElkelt(true);
    }
}