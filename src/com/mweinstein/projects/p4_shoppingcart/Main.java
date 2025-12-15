package com.mweinstein.projects.p4_shoppingcart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cart cart = new Cart();

        User userOne = new User("Max", cart);
        User userTwo = new User("John", cart);

        System.out.println("How many items does Max have in his cart? ");
        int itemsUserOne = scanner.nextInt();

        userOne.cart.itemCount += itemsUserOne;

        System.out.println(userOne.name + " has " +
                userOne.cart.itemCount + " items in cart.");
        System.out.println(userTwo.name + " has " +
                userTwo.cart.itemCount + " items in cart.");
    }

    static class Cart {
        int itemCount;
    }

    static class User {
        String name;
        Cart cart;

        User(String name, Cart cart) {
            this.name = name;
            this.cart = cart;
        }
    }
}