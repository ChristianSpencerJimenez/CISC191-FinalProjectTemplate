// IMPORTS

package edu.sdccd.cisc191.template;//package edu.sdccd.cisc191.template;
import java.net.*;
import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
This is where I will write modules for the Arch. Project for CISC 191
 -Attempt to concept project
 -Current Module [1]
 */

public class Server {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime now = LocalDateTime.now();
        Scanner consoleInput = new Scanner(System.in);

        System.out.println("                                                                                 ");
        System.out.println("                                                                                 ");
        System.out.println("                                                                                 ");
        System.out.println(":::       ::: :::::::::: :::        ::::::::   ::::::::  ::::    ::::  ::::::::::");
        System.out.println(":+:       :+: :+:        :+:       :+:    :+: :+:    :+: +:+:+: :+:+:+ :+:       ");
        System.out.println("+:+       +:+ +:+        +:+       +:+        +:+    +:+ +:+ +:+:+ +:+ +:+       ");
        System.out.println("+#+  +:+  +#+ +#++:++#   +#+       +#+        +#+    +:+ +#+  +:+  +#+ +#++:++#  ");
        System.out.println("+#+ +#+#+ +#+ +#+        +#+       +#+        +#+    +#+ +#+       +#+ +#+       ");
        System.out.println(" #+#+# #+#+#  #+#        #+#       #+#    #+# #+#    #+# #+#       #+# #+#       ");
        System.out.println("  ###   ###   ########## ########## ########   ########  ###       ### ##########");
        System.out.println("                                                                                 ");
        System.out.println("=================================================================================");

        System.out.println("Hello, This is our meal selector terminal!");
        System.out.println("We recommend you look at out");
        System.out.print(dtf.format(now));

        String[] dinnerType = {"breakfast", "lunch", "dinner"};


        System.out.println("Please type your name.");
        while (true) {
            String userName = consoleInput.next();
            if (userName.length() < 2) {
                System.out.println("That name is to short!");
                continue;
            } else if (!userName.matches("[a-zA-Z]+")) {
                System.out.println("                         ");
                System.out.println("That is not a valid name, please try again.");
                System.out.println("-You must only use letters.");
                System.out.println("                         ");
            } else {

                /*
                 *
                 *  [begin second selection menu]
                 *  After the system has the users name, the system will ask for what kind of menu they would like to see
                 *  inputs that are not within the domain will have the user try again until they enter the correct option.
                 *  This next selection menu is about the same as the first name menu, however will dive into CASE for
                 *  showing menu options based on breakfast, lunch, and dinner.
                 *
                 */

                System.out.println("                         ");
                System.out.println("Hello " + userName + "! our food selection menu is...");
                System.out.println("Breakfast, Lunch, or Dinner.");
                System.out.println("                         ");
                System.out.println("What would you like to have?");
                System.out.println("[Enter one of the three options!]");
                System.out.println("                         ");
                while (true) {
                    String selectionType = consoleInput.next().toLowerCase();
                    if (selectionType.length() < 2) {
                        System.out.println("That's to short, type out 'Breakfast', 'Lunch', or 'Dinner'!");
                        continue;
                    } else if (!selectionType.matches("[a-zA-Z]+")) {
                        System.out.println("                         ");
                        System.out.println("That is not a valid type, please try again.");
                        System.out.println("-You must only use letters.");
                        System.out.println("                         ");
                        continue;
                    } else {
                        if (selectionType.matches(dinnerType[0])) {
                            System.out.println("You chose Breakfast");
                            BreakfastMenu.breakfastMenuList();
                            continue;
                        } else if (selectionType.matches(dinnerType[1])) {
                            System.out.println("You chose Lunch");
                            LunchMenu.lunchMenuList();
                            continue;
                        } else if (selectionType.matches(dinnerType[2])) {
                            System.out.println("You chose Dinner");
                            continue;
                        }else {
                            System.out.println("Invalid Selection.");
                            System.out.println("-Try typing a menu type like 'Breakfast', 'Lunch', or 'Dinner'!");
                            continue;
                        }
                            // I plan to use the case statement to detect what value was chosen in the menu array then display the correct menu.
                    }
                }
            }
        }
    }
}
class BreakfastMenu extends Server {
    public static void breakfastMenuList(){
        System.out.println("");
        System.out.println(":::::::::  :::::::::  ::::::::::     :::     :::    ::: ::::::::::   :::      :::::::: :::::::::::");
        System.out.println(":+:    :+: :+:    :+: :+:          :+: :+:   :+:   :+:  :+:        :+: :+:   :+:    :+:    :+:    ");
        System.out.println("+:+    +:+ +:+    +:+ +:+         +:+   +:+  +:+  +:+   +:+       +:+   +:+  +:+           +:+    ");
        System.out.println("+#++:++#+  +#++:++#:  +#++:++#   +#++:++#++: +#++:++    :#::+::# +#++:++#++: +#++:++#++    +#+    ");
        System.out.println("+#+    +#+ +#+    +#+ +#+        +#+     +#+ +#+  +#+   +#+      +#+     +#+        +#+    +#+    ");
        System.out.println("#+#    #+# #+#    #+# #+#        #+#     #+# #+#   #+#  #+#      #+#     #+# #+#    #+#    #+#    ");
        System.out.println("#########  ###    ### ########## ###     ### ###    ### ###      ###     ###  ########     ###    ");
        System.out.println("");
        System.out.println("==================================================================================================");
        //add menu etc
    }
}
class LunchMenu extends Server {
    public static void lunchMenuList() {
        System.out.println("");
        System.out.println(":::       :::    ::: ::::    :::  ::::::::  :::    :::");
        System.out.println(":+:       :+:    :+: :+:+:   :+: :+:    :+: :+:    :+:");
        System.out.println("+:+       +:+    +:+ :+:+:+  +:+ +:+        +:+    +:+");
        System.out.println("+#+       +#+    +:+ +#+ +:+ +#+ +#+        +#++:++#++");
        System.out.println("+#+       +#+    +#+ +#+  +#+#+# +#+        +#+    +#+");
        System.out.println("#+#       #+#    #+# #+#   #+#+# #+#    #+# #+#    #+#");
        System.out.println("########## ########  ###    ####  ########  ###    ###");
        System.out.println("");
        System.out.println("======================================================");
        //add menu etc
    }
}
class DinnerMenu extends Server {
    public static void dinnerMenuList() {
        System.out.println("");
        System.out.println("::::::::: ::::::::::: ::::    ::: ::::    ::: :::::::::: ::::::::: ");
        System.out.println(":+:    :+:    :+:     :+:+:   :+: :+:+:   :+: :+:        :+:    :+:");
        System.out.println("+:+    +:+    +:+     :+:+:+  +:+ :+:+:+  +:+ +:+        +:+    +:+");
        System.out.println("+#+    +:+    +#+     +#+ +:+ +#+ +#+ +:+ +#+ +#++:++#   +#++:++#: ");
        System.out.println("+#+    +#+    +#+     +#+  +#+#+# +#+  +#+#+# +#+        +#+    +#+");
        System.out.println("#+#    #+#    #+#     #+#   #+#+# #+#   #+#+# #+#        #+#    #+#");
        System.out.println("######### ########### ###    #### ###    #### ########## ###    ###");
        System.out.println("");
        System.out.println("===================================================================");
    }
}


















    }


}
