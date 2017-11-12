package com.company;

import java.util.*;

public class Main {

    private static boolean isAvtive = true;

    public static void main(String[] args) {

        while (isAvtive) {
          try {
              showMenu();
          } catch (NumberFormatException e) {
              System.out.println("Wrong input, please type digit");
          }
        }
    }

    static public void showMenu () {
        MountingBiking biking = new MountingBiking(1, "ElCamino", "I like to do MTB", 3);
        VideoGaming gaming = new VideoGaming(7, "Dark Souls","Video games is my passion", 7);
        Hobby hobby1 = new Hobby("hobby1", 5, "I like hobby 1", 5);
        Hobby hobby2 = new Hobby("hobby2", 1, "hobby2 is good", 1);

        List <Hobby> ls = new ArrayList<>();
        ls.add(biking);
        ls.add(gaming);
        ls.add(hobby1);
        ls.add(hobby2);
        Scanner scan = new Scanner(System.in);
        System.out.println("\n"+"Select Operation:");
        System.out.println("1. Tell about hobby");
        System.out.println("2. Exception test");
        System.out.println("3. Sort hobby by title");
        System.out.println("4. Sort hobby by description");
        System.out.println("5. Sort hobby by times per week");
        System.out.println("6. Sort hobby by average hours spent ");
        System.out.println("7. Exit");

        int select = Integer.parseInt(scan.next());

        switch (select) {
            case 1:
                for (Hobby hobby : ls) {
                    hobby.tellAboutHobby();
                }
                break;
            case 2:
                System.out.println("Exception test, Please enter speed for a jump");
                    try {
                        biking.doCrazyJumpOnSpeed(Integer.parseInt(scan.next()));
                    } catch (LowSpeedException e) {
                        System.out.println("exception 1 caught " + "\n" + e.getMessage());
                    } catch (BrokenKneeException e) {
                        System.out.println("exception 2 caught " + "\n" + e.getMessage());
                    } catch (NumberFormatException e) {
                        System.out.println("Wrong input, please type digit");
                    }
                    break;
            case 3:
                System.out.println("Original order"+ls);
                Collections.sort(ls, new HobbyComparatorByTitle());
                System.out.println("Sorted by Title: "+ls);
                break;
            case 4:
                System.out.println("Original order"+ls);
                Collections.sort(ls, new HobbyComparatorByDescription());
                System.out.println("Sorted by Description: "+ls);
                break;
            case 5:
                System.out.println("Original order"+ls);
                Collections.sort(ls, new HobbyComparatorByInt());
                System.out.println("Sorted by times per week: "+ls);
                break;
            case 6:
                System.out.println("Original order"+ls);
                Collections.sort(ls, new HobbyComparatorByFloat());
                System.out.println("Sorted by times per week: "+ls);
            default:
                isAvtive = false;
                break;
        }

    }
}




