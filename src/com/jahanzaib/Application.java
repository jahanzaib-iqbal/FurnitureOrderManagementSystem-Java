package com.jahanzaib;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        Customer customer = new Customer();
        
        
        System.out.println("Entre your name : ");
        customer.name = sc.nextLine();
        System.out.println("Which order do you want to place");
        System.out.println("Press 1_Furniture\t2_Notebook ");
        int firstChoice = sc.nextInt();

        if(firstChoice==1){
            System.out.println("Do you want to buy chair or desk");
            System.out.println("Press 1_chair\t2_desk");
            int cahirOrDesk = sc.nextInt();


            if(cahirOrDesk ==1){
                System.out.println("Enter the category");
                System.out.println("1_wood\t2_Iron");
                int chiarChoice = sc.nextInt();

                if(chiarChoice == 1){
                    System.out.println("Enter number of wood chairs ");
                    double woodChairs= sc.nextDouble();
                    ChairCategory chairCategory = new ChairCategory(woodChairs);
                    chairCategory.wood();

                   
                    chairCategory.printDetails();
                }
                if(chiarChoice == 2){
                    System.out.println("Enter number of iron chairs ");
                    double ironChairs= sc.nextDouble();
                    ChairCategory chairCategory = new ChairCategory(ironChairs);
                    chairCategory.iron();

                    System.out.println("\n------------------ Bill Details------------------\n ");
                    System.out.println("Customer name  "+ customer.name);
                    System.out.println("Company name  "+ Customer.COMPANY);
                    chairCategory.printDetails();
                }


            }
            else if(cahirOrDesk ==2){
                System.out.println("Enter the category");
                System.out.println("1_wood\t2_Iron\t3_plastic");
                int deskChoice = sc.nextInt();

                if(deskChoice == 1){
                    System.out.println("Enter number of wood Desks ");
                    double woodDesk= sc.nextDouble();
                    DeskCategory deskCategory = new DeskCategory(woodDesk);
                    deskCategory.wood();

                    customer.customerDetails();
                    deskCategory.printDetails();
                }
                if(deskChoice == 2){
                    System.out.println("Enter number of Iron Desks ");
                    double ironDesk= sc.nextDouble();
                    DeskCategory deskCategory = new DeskCategory(ironDesk);
                    deskCategory.iron();
                    
                    customer.customerDetails();
                    deskCategory.printDetails();
                }

                if(deskChoice == 3){
                    System.out.println("Enter number of Plastic Desks ");
                    double plasticDesk= sc.nextDouble();
                    DeskCategory deskCategory = new DeskCategory(plasticDesk);
                    deskCategory.plastic();

                    customer.customerDetails();
                    deskCategory.printDetails();
                }


            }

        }
        else if(firstChoice==2){
            System.out.println("which Notebook you want to buy?");
            System.out.println("Press 1_Lab Notebook\t2_Spiral Notebook");
            int notebookChoice = sc.nextInt();

            if(notebookChoice==1){
                System.out.println("Enter the number of lab notebooks you want to buy");
                double labNotebooks = sc.nextDouble();
                LabNotebook labNotebook =new LabNotebook(labNotebooks);
                labNotebook.setLabprice();

                customer.customerDetails();
                labNotebook.printDetails();
            }
            if(notebookChoice==2){
                System.out.println("Enter the number of Spiral notebooks you want to buy");
                double spiarlNotebooks = sc.nextDouble();
                Spiral spiral =new Spiral(spiarlNotebooks);
                spiral.setSpiralprice();

                customer.customerDetails();
                spiral.printDetails();
            }

        }

    }
}
