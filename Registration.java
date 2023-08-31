package com.training.scan;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		String[] usernames = {"Teja","Krishna","Teja"}; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name to register: ");
        String inputName = sc.nextLine();

        boolean isUnique = true;
        for (String username : usernames) {
            if (username.equals(inputName)) {
                isUnique = false;
                break;
            }
        }

        if (isUnique) {
            System.out.println("You are registered.");
        } else {
            System.out.println("Name is not unique.");
        }
		
		
		
		
	}

}
