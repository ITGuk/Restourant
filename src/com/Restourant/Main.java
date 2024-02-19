package com.Restourant;
import java.util.Scanner;

import com.Restourant.Colors;
import static com.Restourant.Colors.RED;
import static com.Restourant.Colors.RESET;

public class Main {
    public static Scanner console = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println(RED);
        System.out.println("\n" +
                " __        __   _                            _____       _____                                _        _ \n" +
                " \\ \\      / /__| | ___ ___  _ __ ___   ___  |_   _|__   | ____|_ __ ___  _ __ ___   ___ _ __ | |_ __ _| |\n" +
                "  \\ \\ /\\ / / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\   | |/ _ \\  |  _| | '_ ` _ \\| '_ ` _ \\ / _ \\ '_ \\| __/ _` | |\n" +
                "   \\ V  V /  __/ | (_| (_) | | | | | |  __/   | | (_) | | |___| | | | | | | | | | |  __/ | | | || (_| | |\n" +
                "    \\_/\\_/ \\___|_|\\___\\___/|_| |_| |_|\\___|   |_|\\___/  |_____|_| |_| |_|_| |_| |_|\\___|_| |_|\\__\\__,_|_|\n" +
                "                                                                                                         \n");
        System.out.println(RESET);
        Menu.OpenMenu();
    }
}