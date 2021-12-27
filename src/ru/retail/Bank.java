package ru.retail;

import ru.retail.kassa.MoneyKassa;


public class Bank {

        private MoneyKassa kassa;

        private String name;

        private int korSchet;

    public Bank(String name) {
        kassa = new MoneyKassa();
        this.name = name;
        korSchet = 145;
    }

    public int getKorSchet() {
        return korSchet;
    }

    public void setKorSchet(int korSchet) {
        this.korSchet = korSchet;
    }

    public MoneyKassa getKassa() {

        return kassa;
    }

    public void setKassa(MoneyKassa kassa) {
        this.kassa = kassa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}







