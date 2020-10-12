package com.pboreg;

public class Main {

    public static void main(String[] args) {
	// void itu artinya hampa

        System.out.println(simpel());
        fungsivoid("apapun");
        selamatPagi("emak");
        selamatPagi("bapak");
    }
    private static void selamatPagi(String nama)
    {
        System.out.println("Selamat pagi " + nama);
    }
    private static void fungsivoid(String input)
    {
        System.out.println(input);
    }

    //fungsi method dengan kembalian sehingga menggunakan return untuk mengembalikan nilainya (10.0f)
    private static float simpel()
    {
        return 10.0f;
    }
}
