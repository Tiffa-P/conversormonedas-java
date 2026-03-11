package com.converter;

import com.converter.model.Currency;
import com.converter.service.ConverterService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConverterService service = new ConverterService();

        System.out.println("--- Conversor de Monedas ---");
        try {
            System.out.print("Monto: ");
            double amount = Double.parseDouble(scanner.nextLine());
            System.out.print("Desde (USD, KRW, COP, JPY, MXN, GBP): ");
            Currency from = Currency.valueOf(scanner.nextLine().toUpperCase());
            System.out.print("Hacia: ");
            Currency to = Currency.valueOf(scanner.nextLine().toUpperCase());

            System.out.println(service.convert(from, to, amount));
        } catch (Exception e) {
            System.out.println("Error en los datos ingresados.");
        } finally {
            scanner.close();
        }
    }
}
