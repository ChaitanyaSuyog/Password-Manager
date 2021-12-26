package encrypt;

import database.Main;

import java.util.Scanner;

public class Prompt {

    protected static String getWebsite() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Website name(e.g. Ursus): ");
        String url = scan.nextLine();

        String tableName;

        if (url.contains("https://") && url.contains(".")) {
            tableName = url.replace("https://", "").split("\\.")[0];
        }
        else if (url.contains("http://") && url.contains(".")) {
            tableName = url.replace("http://", "").split("\\.")[0];
        }
        else if (url.contains(".")) {
            tableName = url.split("\\.")[0];
        }
        else {
            tableName = url;
        }

        return tableName.substring(0,1).toUpperCase() + tableName.substring(1).toLowerCase();
    }

    protected static String getUsername() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Username: ");
        String username = scan.nextLine();

        return username;
    }

    protected static String getPassword() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Password: ");
        String password = scan.nextLine();

        return password;
    }

    public static void doSomething(String tableName, String username, String password) {
        Main.createTable(tableName);
        Main.insertValues(tableName, username, password);
    }

    public static void main(String[] args) {
        String website = getWebsite();
        String username = getUsername();
        String password = getPassword();
        doSomething(website, username, password);
    }
}
