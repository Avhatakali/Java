package Assignment.learnProgramming;

import java.util.Scanner;

public class EatCupcake {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println("You Dropped Food on the Floor\n Do You Eat It ?");

        System.out.println("Did anyone see you?");
        String response = input.next();
        String yes = "yes";
        String no = "no";
//YES
        if (response.equalsIgnoreCase(yes)) {
            System.out.println("Was it boss/lover/parent?");
            String resp = input.next();

            if (resp.equalsIgnoreCase(yes)) {
                System.out.println("Was it expensive?");
                String response1 = input.next();

                if (response1.equalsIgnoreCase(yes)) {
                    System.out.println("Can you cut off the part that touched the floor?");
                    String respon = input.next();

                    if (respon.equalsIgnoreCase(yes)) {
                        System.out.println("EAT IT");
                    } else {
                        System.out.println("YOUR CALL");
                    }
                } else {
                    System.out.println("Is it chocolate?");
                    String response2 = input.next();

                    if (response2.equalsIgnoreCase(yes)) {
                        System.out.println("EAT IT");
                    } else {
                        System.out.println("DON'T EAT IT");
                    }
                }
//NO
            } else if (resp.equalsIgnoreCase(no)) {
                System.out.println("EAT IT");
            }
        } else if (response.equalsIgnoreCase(no)) {
            System.out.println("Was it sticky ?");
            String response3 = input.next();

            if (response3.equalsIgnoreCase(yes)) {
                System.out.println("Is it a raw steak ?");
                String response4 = input.next();

                if (response4.equalsIgnoreCase(yes)) {
                    System.out.println("Are you a puma ?");
                    String response5 = input.next();

                    if (response5.equalsIgnoreCase(yes)) {
                        System.out.println("EAT IT");
                    } else if (response5.equalsIgnoreCase(no)) {
                        System.out.println("DON'T EAT IT");
                    }

                } else if (response4.equalsIgnoreCase(no)) {
                    System.out.println("Did your cat lick it ?");
                    String repond = input.next();

                    if (repond.equalsIgnoreCase(yes)) {
                        System.out.println("Is your cat healthy ?");
                        String respon = input.next();
                        if (respon.equalsIgnoreCase(yes)) {
                            System.out.println("EAT IT");
                        } else if (respon.equalsIgnoreCase(no)) {
                            System.out.println("YOUR CALL");
                        }

                    } else if (repond.equalsIgnoreCase(no)) {
                        System.out.println("EAT IT");
                    }
                }

            } else if (response3.equalsIgnoreCase(no)) {
                System.out.println("Is is an Emausaurus ?");
                String rep = input.next();

                if (rep.equalsIgnoreCase(yes)) {
                    System.out.println("Are you a Megalosaurus ?");
                    String re = input.next();

                    if (re.equalsIgnoreCase(yes)) {
                        System.out.println("EAT IT");
                    } else if (re.equalsIgnoreCase(no)) {
                        System.out.println("DON'T EAT IT");
                    }

                } else if (rep.equalsIgnoreCase(no)) {
                    System.out.println("Did your cat lick it ?");
                    String repo = input.next();

                    if (repo.equalsIgnoreCase(yes)) {
                        System.out.println("Is your cat healthy ?");
                        String repo1 = input.next();

                        if (repo1.equalsIgnoreCase(yes)) {
                            System.out.println("EAT IT");
                        } else if (repo1.equals(no)) {
                            System.out.println("YOUR CALL");
                        }

                    } else if (repo.equalsIgnoreCase(no)) {
                        System.out.println("EAT IT");
                    }
                }
            }
        }
    }
}