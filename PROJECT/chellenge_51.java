

import java.util.Scanner;

class Library {

    //this method use for the that student allowed the books
    public void issuebook(String books[], int b, int number) {

        for (int i = 0; i < b; i++) {
            if (number == i) {
                System.out.println("your issued book is :" + books[i]);
                break;

            }
        }
    }

    //this method use for the showAvalliable books
    public void showAvaliablebooks(int b, String books[], int number) {
        System.out.print("the available books after you issued the book:");
        for (int i = 0; i < b; i++) {
            if (number == i)
                continue;
            System.out.println(books[i]);

        }
    }


    //this method is use for the editthebooks
    public void editbooks(int number, int b, String books[]) {
        Scanner ebooks = new Scanner(System.in);
        System.out.println("enter the book name that you want to add in the list:");
        String editbook = ebooks.nextLine();
        for (int i = 0; i < b; i++) {
            if (number == i) {
                books[i] = editbook;
                System.out.println("the editbook is:" + books[i]);
            }
        }

        System.out.println("after the add the book the book list is:");
        for (int i = 0; i < b; i++) {
            System.out.println(books[i]);
        }
        ebooks.close();
       

    }


    //this mehod is usefor the return the book
    public void returnbooks(int number, int b, String books[]) {
        for (int i = 0; i < b; i++) {
            if (number == i) {
                books[i] = books[i];
                System.out.println("the issuedbook that you return in with in days:" + books[i]);
            }
        }

    }
}

public class chellenge_51 {
    public static void main(String[] args) {
        // you have to implement a libray using JAVA class library
        // Methods:addbook,issuebook,returnBook,showAvaliablebooks
        // Properties:Array to store the Avalible books
        // Array to store the issues books

        //create the library class of the object
        Library choose = new Library();

        Scanner sc = new Scanner(System.in);
        System.out.print("imagine if you have own your library so what you think how much books that you want to store in the library: ");
        int b = sc.nextInt();
        String books[] = new String[b];

        //gets input from  the libraryman
        System.out.println("enter the books name:");
        for (int i = 0; i < books.length; i++) {
            books[i] = sc.nextLine();
        }

        //show the enter the books names
        System.out.print("the avaliable books in the library:");
        for (int i = 0; i < books.length; i++) {
            System.out.printf("%d: %s%n", i + 1, books[i]);
        }

        //input from the student that he is issue the book
        System.out.println("enter the number that you want to issue the book:");
        int number = sc.nextInt();

        //call the isssuebook method 
        choose.issuebook(books, b, number);

        //call the showAvaliablebooks method
        choose.showAvaliablebooks(b, books, number);

        System.out.println("if you want to add the book or not(yes-1/no-0):");
        Scanner choice = new Scanner(System.in);
        int answer = choice.nextInt();
        if (answer == 1) {
            choose.editbooks(number, b, books);
            choice.close();
        } else {
            choose.returnbooks(number, b, books);
        }

        sc.close();

    }

}
