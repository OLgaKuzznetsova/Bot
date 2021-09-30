package com.company;

import java.util.Scanner;

public class Main {
    private static int chatId = 0;
    private BotLogic botLogic = new BotLogic();

    public static void main(String[] args) {
        Main main1 = new Main();
        Scanner input = new Scanner(System.in);
        System.out.println(main1.botLogic.handleUserInput(chatId, ""));
        while (true) {
            var userInput = input.nextLine();
            var reply = main1.botLogic.handleUserInput(chatId, userInput);
            System.out.println(reply);
        }
    }
}
