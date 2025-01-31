package currencyconverter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Hardcoded exchange rates (Base currency: USD)
        Map<String, Double> exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("GBP", 0.75);
        exchangeRates.put("MYR", 4.70);
        exchangeRates.put("JPY", 110.50);

        Scanner input = new Scanner(System.in);
        
        try {
            // User input for source currency
            System.out.print("Enter source currency (USD, EUR, GBP, MYR, JPY): ");
            String sourceCurrency = input.next().toUpperCase();
            
            // Validate source currency
            if (!exchangeRates.containsKey(sourceCurrency)) {
                throw new IllegalArgumentException("Invalid source currency.");
            }
            
            // User input for target currency
            System.out.print("Enter target currency (USD, EUR, GBP, MYR, JPY): ");
            String targetCurrency = input.next().toUpperCase();
            
            // Validate target currency
            if (!exchangeRates.containsKey(targetCurrency)) {
                throw new IllegalArgumentException("Invalid target currency.");
            }
            
            // User input for amount
            System.out.print("Enter amount to convert: ");
            double amount = input.nextDouble();
            
            if (amount < 0) {
                throw new IllegalArgumentException("Amount cannot be negative.");
            }
            
            // Conversion logic
            double usdAmount = amount / exchangeRates.get(sourceCurrency); // Convert to USD
            double convertedAmount = usdAmount * exchangeRates.get(targetCurrency); // Convert to target currency
            
            // Display result
            System.out.printf("%.2f %s = %.2f %s\n", amount, sourceCurrency, convertedAmount, targetCurrency);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close(); // Close scanner resource
        }
    }
}
