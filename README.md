# Java Currency Converter

A simple Java-based currency converter that uses hardcoded exchange rates to convert between USD, EUR, GBP, MYR, and JPY. Includes error handling for invalid inputs and negative amounts. Ideal for beginners learning Java.

## Features
- Convert between USD, EUR, GBP, MYR, and JPY using fixed exchange rates.
- Handles invalid inputs and negative values gracefully.
- Console-based interface with a simple user prompt.

## Installation & Usage

1. Clone the repository:
   ```sh
   git clone https://github.com/nurulashraf/java-currency-converter.git
   ```
2. Navigate to the project folder:
   ```sh
   cd java-currency-converter
   ```
3. Compile the Java program:
   ```sh
   javac src/CurrencyConverter.java
   ```
4. Run the program:
   ```sh
   java -cp src CurrencyConverter
   ```

## Example Usage
```
Enter source currency (USD, EUR, GBP, MYR, JPY): USD
Enter target currency (USD, EUR, GBP, MYR, JPY): MYR
Enter amount to convert: 10
10.00 USD = 47.00 MYR
```

## Repository Structure
```
java-currency-converter/
│── src/
│   ├── CurrencyConverter.java  # Main Java program
│── README.md                    # Project documentation
│── LICENSE                      # MIT License file
```

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
