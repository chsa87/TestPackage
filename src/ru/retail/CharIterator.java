package ru.retail;

public class CharIterator {

    public static void main(String[] args) {

        char[] charArray = "Х.M.A.B".toCharArray();

        for (char selectChar : charArray) {

            int i =0;

            switch (selectChar) {
                case 'Х' :
                    System.out.println("Хлебный отдел");  i=3; break;
                case 'M' :
                    System.out.println("Молочный отдел"); break;
                case 'A' :
                    System.out.println("Тут вино"); break;
                case 'B' :
                    System.out.println("Тут техника"); break;
                default: System.out.println("-"); break;
            }
        }

    }

}


