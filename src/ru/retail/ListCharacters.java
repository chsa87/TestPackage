package ru.retail;

public class ListCharacters {
    public static void main(String[] args) {

        for(char с = 0; с < 128; с++){
            if(Character.isLowerCase(с)) // char
                System.out.println("3Ha4eHHe: " + (int)с + " символ: " + с);
        }

    }


}
