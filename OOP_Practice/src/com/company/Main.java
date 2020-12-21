package com.company;

public class Main {

    public static void main(String[] args) {
//	    Car porsche = new Car(2, 4, "Carerra", "v8", "blue");
//	    Car honda = new Car(4, 4, "Civic", "v4", "gray");

//        Account account = new Account("203948", 123.12, "Stephen Rothson", "srothson@gmail.com", "801-287-8747");
//        account.deposit(100);
//        account.withdraw(2);
//        System.out.println(account.getBalance());

//        VIPCustomer person1 = new VIPCustomer();
//        System.out.println(person1.getName());
//
//        VIPCustomer person2 = new VIPCustomer("Bob", 24500.00);
//        System.out.println(person2.getName());
//
//        VIPCustomer person3 = new VIPCustomer("Lance", 10000.22, "lance@email.com");
//        System.out.println(person3.getName());
//
//        Animal animal = new Animal("Animal", 1, 1, 5, 5);
//
//        Dog dog = new Dog("yorkie", 8, 20, 2, 4, 2, 4, 1, 16, "silky");
//        dog.eat();

//        Player player = new Player();
//        player.name = "Ken";
//        player.health = 100;
//        player.weapon = "Axe";
//
//        int damage = 94;
//        player.loseHeatlh(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 44;
//        player.loseHeatlh(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EncapsulatedPlayer player = new EncapsulatedPlayer("Ken", 100, "Axe");
        System.out.println("Initial health is " + player.getHealth());
    }
}
