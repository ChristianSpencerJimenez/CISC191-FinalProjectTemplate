// IMPORTS

package edu.sdccd.cisc191.template;


//import java.net.*;
//import java.io.*;
//import java.util.Random;
import java.util.Queue;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//import java.util.Set;

/**
This is where I will write modules for the Arch. Project for CISC 191
 -Attempt to concept project
 -Current Module [1]
 */

public class Server {
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
        while (true)
        {

            String userName = consoleInput.nextLine();
            if (userName.length() < 2)
            {
                System.out.println("==================================================================================================");
                System.out.println("That name is to short!");
                System.out.println("==================================================================================================");
                continue;
            }
            else if (!userName.matches("[a-zA-Z]+"))
            {
                System.out.println("==================================================================================================");
                System.out.println("                 Error, please enter only a first name");
                System.out.println("                  Special Characters are not allowed");
                System.out.println("==================================================================================================");
                continue;
            }
            else
            {
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
                System.out.println();
                System.out.println("                          Breakfast, Lunch, or Dinner.");
                System.out.println();
                System.out.println("                          What would you like to have?");
                System.out.println("                        [Enter one of the three options!]");
                System.out.println("==================================================================================================");
            }
            while (true)
            {
                String selectionType = consoleInput.next().toLowerCase();
                if (selectionType.length() < 2) {
                         System.out.println("==================================================================================================");
                         System.out.println("          That's to short, type out 'Breakfast', 'Lunch', or 'Dinner'!");
                         System.out.println("==================================================================================================");

                }
                else if (!selectionType.matches("[a-zA-Z]+"))
                {
                        System.out.println("==================================================================================================");
                        System.out.println("               That is not a valid type, please try again.");
                        System.out.println("                       -You must only use letters.");
                        System.out.println("==================================================================================================");

                }
                else
                {
                    if (selectionType.matches(dinnerType[0])) {
                        System.out.println("==================================================================================================");
                        System.out.println("                           You chose Breakfast");
                        BreakfastMenu.breakfastMenuList();
                        break;

                    }
                    else if (selectionType.matches(dinnerType[1]))
                    {
                        System.out.println("==================================================================================================");
                        System.out.println("                             You chose Lunch");
                        LunchMenu.lunchMenuList();
                        break;

                    }
                    else if (selectionType.matches(dinnerType[2]))
                    {
                        System.out.println("==================================================================================================");
                        System.out.println("                             You chose Dinner");
                        DinnerMenu.dinnerMenuList();
                        break;

                    }
                    else
                    {
                        System.out.println("==================================================================================================");
                        System.out.println("                             Invalid Selection.");
                        System.out.println("        -Try typing a menu type like 'Breakfast', 'Lunch', or 'Dinner'!");
                        System.out.println("==================================================================================================");
                    }
                }
            }
            break;// This break prevents a looping back to the original while(true) loop in SERVER class.
        }
    }
}
    //end of SERVER class


    //The following code below are subclasses that assist
    //the main server class above.

class FoodRecommendedTime extends Server {
    public static void testTime() {
        DateTimeFormatter formatted = DateTimeFormatter.ofPattern("HH");
        LocalDateTime current = LocalDateTime.now();
        int Time = Integer.parseInt(formatted.format(current));
        if (Time < 12) {
            System.out.println();
            System.out.println("                     Hello and good morning! this is our menu terminal.");
            System.out.println("                        We recommend you look at our Breakfast menu!");
            System.out.println("==================================================================================================");

        }
        else if (Time < 18)
        {
            System.out.println("                     Hello and good afternoon, this is our menu terminal.");
            System.out.println("                        We recommend you look at our Lunch menu!");
            System.out.println("==================================================================================================");
        }
        else if (Time >= 18)
        {
            System.out.println("                     Hello and good evening, this is our menu terminal.");
            System.out.println("                        We recommend you look at our Dinner menu!");
            System.out.println("==================================================================================================");

        }
    }
}

    class BreakfastMenu extends Server {
        public static void breakfastMenuList() {

            Scanner consoleInput = new Scanner(System.in);
            // String[] confirmSelection = {"yes", "no",};           ***YES NO SELECTION USING STRING LITERALS

            System.out.println();
            System.out.println(":::::::::  :::::::::  ::::::::::     :::     :::    ::: ::::::::::   :::      :::::::: :::::::::::");
            System.out.println(":+:    :+: :+:    :+: :+:          :+: :+:   :+:   :+:  :+:        :+: :+:   :+:    :+:    :+:    ");
            System.out.println("+:+    +:+ +:+    +:+ +:+         +:+   +:+  +:+  +:+   +:+       +:+   +:+  +:+           +:+    ");
            System.out.println("+#++:++#+  +#++:++#:  +#++:++#   +#++:++#++: +#++:++    :#::+::# +#++:++#++: +#++:++#++    +#+    ");
            System.out.println("+#+    +#+ +#+    +#+ +#+        +#+     +#+ +#+  +#+   +#+      +#+     +#+        +#+    +#+    ");
            System.out.println("#+#    #+# #+#    #+# #+#        #+#     #+# #+#   #+#  #+#      #+#     #+# #+#    #+#    #+#    ");
            System.out.println("#########  ###    ### ########## ###     ### ###    ### ###      ###     ###  ########     ###    ");
            System.out.println();
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


            double[][] foodSelectionTableCost = new double[3][3];
            foodSelectionTableCost[0][0] = 8.25;  //PRICE OF (Waffles + Coffee) = TotalCost
            foodSelectionTableCost[0][1] = 7.25;  //PRICE OF (Waffles + Milk)   = TotalCost
            foodSelectionTableCost[0][2] = 7.35;  //PRICE OF (Waffles + OrangeJuice) = TotalCost
            foodSelectionTableCost[1][0] = 9.25;  //PRICE OF (Eggs and Bacon + Coffee) = TotalCost
            foodSelectionTableCost[1][1] = 7.25;  //PRICE OF (Eggs and Bacon + Milk)   = TotalCost
            foodSelectionTableCost[1][2] = 8.25;  //PRICE OF (Eggs and Bacon + Orange Juice) = TotalCost
            foodSelectionTableCost[2][0] = 5.25;  //PRICE OF (Cereal + Coffee) = TotalCost
            foodSelectionTableCost[2][1] = 3.25;  //PRICE OF (Cereal + Milk)   = TotalCost
            foodSelectionTableCost[2][2] = 4.35;  //Price OF (Cereal + OrangeJuice) = TotalCost


            String[] menuDisplayDrinkItemList = new String[]{"Coffee",  "Milk"          , "Orange Juice" };
            String[] menuDisplayFoodItemList = new  String[]{"Waffles", "Eggs and Bacon", "Cereal"};

            //Selection integers to be used later when using the above array.
            int selectedFood = 0, selectedDrink = 0;

            System.out.println(" " +
                    "                                Please Select Your Food Option!\n" +
                    "                                 Enter the menu number below.");

            while (true) {
                String selectionMenuFoodType = consoleInput.next();
                if (selectionMenuFoodType.length() > 1) {
                    System.out.println("please only enter a single number selection.");

                } else if (!selectionMenuFoodType.matches("[1-3]+")) {                                          //Redundant way of domain restriction. Based on CH.2, however still works in this case.
                    System.out.println("Please enter a number selection between [1, 2, 3]");

                }
                else
                    selectedFood = Integer.parseInt(selectionMenuFoodType);
                    selectedFood -= 1; //SELECTED FOOD IS REDUCED BY ONE SO IT CAN BE READ CORRECTLY IN THE foodSelectionTableCost ARRAY.
                if (selectedFood == 0)
                {
                    System.out.println("you have selected menu item " + (selectedFood+1) + ", " + menuDisplayFoodItemList[0] + "\n");
                    break;
                }
                else if (selectedFood == 1) {
                    System.out.println("you have selected menu item " + (selectedFood+1) + ", " + menuDisplayFoodItemList[1] + "\n");
                    break;
                }
                else if (selectedFood == 2) {
                    System.out.println("you have selected menu item " + (selectedFood+1) + ", " + menuDisplayFoodItemList[2] + "\n");
                    break;
                }
            }
            while (true)
            {
                String selectionMenuDrinkType = consoleInput.next();

                if (selectionMenuDrinkType.length() > 1)
                {
                    System.out.println("please only enter a single number selection.");
                }
                else if (!selectionMenuDrinkType.matches("[4-6]+"))   //Redundant way of domain restriction. Based on CH.2, however still works in this case.
                    System.out.println("Please enter a number selection between [4, 5, 6]");
                else
                    System.out.println(" " +
                            "                                Please Select Your Drink Option!\n" +
                            "                                 Enter the menu number below.");

                    selectedDrink = Integer.parseInt(selectionMenuDrinkType);
                    selectedDrink -= 1; //SELECTED FOOD IS REDUCED BY ONE SO IT CAN BE READ CORRECTLY IN THE foodSelectionTableCost ARRAY.
                if (selectedDrink == 3)
                {
                    System.out.println("you have selected menu item " + (selectedDrink+1) + ", " + menuDisplayDrinkItemList[0] + "\n");
                    break;
                }
                else if (selectedFood == 4) {
                    System.out.println("you have selected menu item " + (selectedFood+1) + ", " + menuDisplayDrinkItemList[1] + "\n");
                    break;
                }
                else if (selectedFood == 5) {
                    System.out.println("you have selected menu item " + (selectedFood+1) + ", " + menuDisplayDrinkItemList[2] + "\n");
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
                System.out.println();
                System.out.println("             :::       :::    ::: ::::    :::  ::::::::  :::    :::");
                System.out.println("             :+:       :+:    :+: :+:+:   :+: :+:    :+: :+:    :+:");
                System.out.println("             +:+       +:+    +:+ :+:+:+  +:+ +:+        +:+    +:+");
                System.out.println("             +#+       +#+    +:+ +#+ +:+ +#+ +#+        +#++:++#++");
                System.out.println("             +#+       +#+    +#+ +#+  +#+#+# +#+        +#+    +#+");
                System.out.println("             #+#       #+#    #+# #+#   #+#+# #+#    #+# #+#    #+#");
                System.out.println("             ########## ########  ###    ####  ########  ###    ###");
                System.out.println();
                System.out.println("==================================================================================================");
                //add menu etc
            }
        }

        class DinnerMenu extends Server {
            public static void dinnerMenuList() {
                System.out.println();
                System.out.println("      ::::::::: ::::::::::: ::::    ::: ::::    ::: :::::::::: ::::::::: ");
                System.out.println("      :+:    :+:    :+:     :+:+:   :+: :+:+:   :+: :+:        :+:    :+:");
                System.out.println("      +:+    +:+    +:+     :+:+:+  +:+ :+:+:+  +:+ +:+        +:+    +:+");
                System.out.println("      +#+    +:+    +#+     +#+ +:+ +#+ +#+ +:+ +#+ +#++:++#   +#++:++#: ");
                System.out.println("      +#+    +#+    +#+     +#+  +#+#+# +#+  +#+#+# +#+        +#+    +#+");
                System.out.println("      #+#    #+#    #+#     #+#   #+#+# #+#   #+#+# #+#        #+#    #+#");
                System.out.println("      ######### ########### ###    #### ###    #### ########## ###    ###");
                System.out.println();
                System.out.println("==================================================================================================");
            }
        }





















