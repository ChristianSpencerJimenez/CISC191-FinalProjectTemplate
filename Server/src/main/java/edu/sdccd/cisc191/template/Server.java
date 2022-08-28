// IMPORTS

package edu.sdccd.cisc191.template;


import java.net.*;
import java.io.*;
//import java.util.Random;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

/**
This is where I will write modules for the Arch. Project for CISC 191
 -Attempt to concept project
 -Current Module [1]
 */

public class Server {
    public String test = "test";

    public static void main(String[] args) {
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
        System.out.println("==================================================================================================");


        FoodRecommendedTime.testTime();
        String[] dinnerType = {"breakfast", "lunch", "dinner"};
        System.out.println("Please type your name below:");
        System.out.println("==================================================================================================");
        while (true) {

            String userName = consoleInput.nextLine();
            if (userName.length() < 2) {
                System.out.println("==================================================================================================");
                System.out.println("That name is to short!");
                System.out.println("==================================================================================================");
                continue;
            } else if (!userName.matches("[a-zA-Z]+")) {
                System.out.println("==================================================================================================");
                System.out.println("                 Error, please enter only a first name");
                System.out.println("                  Special Characters are not allowed");
                System.out.println("==================================================================================================");
                continue;
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

                System.out.println("==================================================================================================");
                System.out.println("                                   Hello " + userName + "!");
                System.out.println("                             Our Food Options are... ");
                System.out.println("");
                System.out.println("                          Breakfast, Lunch, or Dinner.");
                System.out.println("");
                System.out.println("                          What would you like to have?");
                System.out.println("                        [Enter one of the three options!]");
                System.out.println("==================================================================================================");
            }
                while (true) {
                    String selectionType = consoleInput.next().toLowerCase();
                    if (selectionType.length() < 2) {
                        System.out.println("==================================================================================================");
                            System.out.println("          That's to short, type out 'Breakfast', 'Lunch', or 'Dinner'!");
                        System.out.println("==================================================================================================");
                    } else if (!selectionType.matches("[a-zA-Z]+")) {
                        System.out.println("==================================================================================================");
                            System.out.println("               That is not a valid type, please try again.");
                            System.out.println("                       -You must only use letters.");
                        System.out.println("==================================================================================================");
                    } else {
                        if (selectionType.matches(dinnerType[0])) {
                            System.out.println("==================================================================================================");
                            System.out.println("                           You chose Breakfast");
                            BreakfastMenu.breakfastMenuList();
                            break;
                        } else if (selectionType.matches(dinnerType[1])) {
                            System.out.println("==================================================================================================");
                            System.out.println("                             You chose Lunch");
                            LunchMenu.lunchMenuList();
                            break;
                        } else if (selectionType.matches(dinnerType[2])) {
                            System.out.println("==================================================================================================");
                            System.out.println("                             You chose Dinner");
                            DinnerMenu.dinnerMenuList();
                            break;
                        }else {
                            System.out.println("==================================================================================================");
                            System.out.println("                             Invalid Selection.");
                            System.out.println("        -Try typing a menu type like 'Breakfast', 'Lunch', or 'Dinner'!");
                            System.out.println("==================================================================================================");
                        }
                    }
                }
                break; // This break prevents a looping back to the original while(true) loop.
            }
        }
}

    //The following code below are subclasses that assist
    //the main server class above.

class FoodRecommendedTime extends Server {
    public static void testTime() {
        DateTimeFormatter formatted = DateTimeFormatter.ofPattern("HH");
        LocalDateTime current = LocalDateTime.now();
        int Time = Integer.parseInt(formatted.format(current));
        if (Time < 12) {
            System.out.println("");
            System.out.println("                     Hello and good morning! this is our menu terminal.");
            System.out.println("                        We recommend you look at our Breakfast menu!");
            System.out.println("==================================================================================================");

        } else if (Time < 18) {
            System.out.println("                     Hello and good afternoon, this is our menu terminal.");
            System.out.println("                        We recommend you look at our Lunch menu!");
            System.out.println("==================================================================================================");
        } else if (Time >= 18) {
            System.out.println("                     Hello and good evening, this is our menu terminal.");
            System.out.println("                        We recommend you look at our Dinner menu!");
            System.out.println("==================================================================================================");

        }
    }
}

    class BreakfastMenu extends Server {
        public static void breakfastMenuList() {

            Scanner consoleInput = new Scanner(System.in);
            String[] confirmSelection = {"yes", "no",};

            System.out.println("");
            System.out.println(":::::::::  :::::::::  ::::::::::     :::     :::    ::: ::::::::::   :::      :::::::: :::::::::::");
            System.out.println(":+:    :+: :+:    :+: :+:          :+: :+:   :+:   :+:  :+:        :+: :+:   :+:    :+:    :+:    ");
            System.out.println("+:+    +:+ +:+    +:+ +:+         +:+   +:+  +:+  +:+   +:+       +:+   +:+  +:+           +:+    ");
            System.out.println("+#++:++#+  +#++:++#:  +#++:++#   +#++:++#++: +#++:++    :#::+::# +#++:++#++: +#++:++#++    +#+    ");
            System.out.println("+#+    +#+ +#+    +#+ +#+        +#+     +#+ +#+  +#+   +#+      +#+     +#+        +#+    +#+    ");
            System.out.println("#+#    #+# #+#    #+# #+#        #+#     #+# #+#   #+#  #+#      #+#     #+# #+#    #+#    #+#    ");
            System.out.println("#########  ###    ### ########## ###     ### ###    ### ###      ###     ###  ########     ###    ");
            System.out.println("");
            System.out.println("                  Item Identifiers are the numbers to the left of the food item!");
            System.out.println("*==============================================*=================================================*");
            System.out.println("|                                              *                                                 |");
            System.out.println("|             Breakfast Options                *                  Drink Options                  |");
            System.out.println("|                                              *                                                 |");
            System.out.println("|----------------------------------------------*-------------------------------------------------|");
            System.out.println("|  [1] Waffles                $5.00            *      [4] Coffee                  $3.25          |\n" +
                    "|  [2] Eggs and Bacon         $6.00            *      [5] Milk                    $1.25          |\n" +
                    "|  [3] Cereal                 $2.00            *      [6] Orange Juice            $2.35          |");
            System.out.println("*==============================================*=================================================*");


            //Adding the monetary values to the items on the menu for final price calculation.
            double waffles = 5.00, eggsAndBacon = 6.00, cereal = 2.00;
            double coffee = 3.25, milk = 1.25, orangeJuice = 2.35;
            int selectedFoodInt = 0, selectedDrink = 0;

            int[][] breakfastSelection;                                                     // THIS IS THE DOUBLE ARRAY, Will set values to appropriate choices in menu to send to final.
            breakfastSelection = new int[1][1];

            String[] menuItemList;
            menuItemList = new String[]{"Waffles", "Eggs and Bacon", "Cereal"};

            //Selection
            System.out.println(" " +
                    "                                Please Select Your Food Option!\n" +
                    "                                 Enter the menu number below.");

            while (true) {
                String selectionMenuType = consoleInput.next();
                int selectedFood = 0;
                if (selectionMenuType.length() > 1) {
                    System.out.println("please only enter a single number selection.");

                } else if (!selectionMenuType.matches("[1-3]+")) {
                    System.out.println("Please enter a number selection between [1, 2, 3]");

                } else
                    selectedFood = Integer.parseInt(selectionMenuType);

                if (selectedFood == 1) {
                    System.out.println("you have selected menu item " +selectedFoodInt + ", " + menuItemList[0] + "\n" + "is this correct?");
                    consoleInput.next();

                    break;
                } else if (selectedFood == 2) {
                    System.out.println("you have selected menu item " +selectedFoodInt + ", " + menuItemList[1] + "\n" + "is this correct?");
                    consoleInput.next();

                    break;
                } else if (selectedFood == 3) {

                    selectedFoodInt = 3;
                    System.out.println("you have selected menu item " +selectedFoodInt + ", " + menuItemList[2] + "\n" + "is this correct?");
                    consoleInput.next();
                    break;
                }
            }
        }
    }
               //DRINK SELECTION AREA
        //  System.out.println("                                 Please Select Your Drink Option!\n" +
        //          "                                 Enter the menu number below.");
        //selection code
        // id do a "you selected (item) is this correct?" here
        // if not repeat the question then break;
        // After the break show user the order (food + drink) with total cost then resume Server?
        //I will need to figure out how to send these values to the server class.

        //add menu etc


        class LunchMenu extends Server {
            public static void lunchMenuList() {
                System.out.println("");
                System.out.println("             :::       :::    ::: ::::    :::  ::::::::  :::    :::");
                System.out.println("             :+:       :+:    :+: :+:+:   :+: :+:    :+: :+:    :+:");
                System.out.println("             +:+       +:+    +:+ :+:+:+  +:+ +:+        +:+    +:+");
                System.out.println("             +#+       +#+    +:+ +#+ +:+ +#+ +#+        +#++:++#++");
                System.out.println("             +#+       +#+    +#+ +#+  +#+#+# +#+        +#+    +#+");
                System.out.println("             #+#       #+#    #+# #+#   #+#+# #+#    #+# #+#    #+#");
                System.out.println("             ########## ########  ###    ####  ########  ###    ###");
                System.out.println("");
                System.out.println("==================================================================================================");
                //add menu etc
            }
        }

        class DinnerMenu extends Server {
            public static void dinnerMenuList() {
                System.out.println("");
                System.out.println("      ::::::::: ::::::::::: ::::    ::: ::::    ::: :::::::::: ::::::::: ");
                System.out.println("      :+:    :+:    :+:     :+:+:   :+: :+:+:   :+: :+:        :+:    :+:");
                System.out.println("      +:+    +:+    +:+     :+:+:+  +:+ :+:+:+  +:+ +:+        +:+    +:+");
                System.out.println("      +#+    +:+    +#+     +#+ +:+ +#+ +#+ +:+ +#+ +#++:++#   +#++:++#: ");
                System.out.println("      +#+    +#+    +#+     +#+  +#+#+# +#+  +#+#+# +#+        +#+    +#+");
                System.out.println("      #+#    #+#    #+#     #+#   #+#+# #+#   #+#+# #+#        #+#    #+#");
                System.out.println("      ######### ########### ###    #### ###    #### ########## ###    ###");
                System.out.println("");
                System.out.println("==================================================================================================");
            }
        }

        class ConfirmSelectionMenu extends Server {
            public static void confirmSelectionMenu() {
                System.out.println("test final");
            }
        }



















