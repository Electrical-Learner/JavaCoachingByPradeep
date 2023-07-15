package org.example.oops.exampleinterface;

public abstract class MainBank implements Bank {

    public void mainBankOpening() {
        System.out.println("Congrats Bank Opened At: 9-9-999");
    }

    public void mainBank() {
        System.out.println("Congrats Bank Opened At: 9-9-999");
    }

    public static void main(String[] args) {
        Bank bank = new MainBank() {
            @Override
            public void accountName() {
                System.out.println("AccountName is :" + "ghost");
            }

        };
        bank.accountNumber();
        bank.accountName();


        MainBank mainBank = (MainBank) bank;
        mainBank.accountDate();
        mainBank.mainBankOpening();
        Bank.accountClosingDate();



    }

    @Override
    public void accountNumber() {
        System.out.println("AccountNumber is :" + "00120451");
    }

}


