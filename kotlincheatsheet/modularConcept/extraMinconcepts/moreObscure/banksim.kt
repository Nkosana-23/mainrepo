// Define a class representing a bank account
class BankAccount(val owner: String, private var balance: Double) {

    // Method to deposit money into the account
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited $$amount to $owner's account.")
        } else {
            println("Deposit amount must be positive.")
        }
    }

    // Method to withdraw money from the account
    fun withdraw(amount: Double) {
        if (amount > balance) {
            println("Insufficient funds for $owner.")
        } else if (amount <= 0) {
            println("Withdrawal amount must be positive.")
        } else {
            balance -= amount
            println("Withdrew $$amount from $owner's account.")
        }
    }

    // Method to check the current balance
    fun checkBalance() {
        println("$owner's current balance: $$balance")
    }
}

// Main function to demonstrate usage
fun main() {
    val account = BankAccount("Alice", 100.0)  // Create a new account with initial balance
    account.checkBalance()                     // Check balance
    account.deposit(50.0)                      // Deposit money
    account.withdraw(30.0)                     // Withdraw money
    account.withdraw(150.0)                    // Attempt to overdraw
    account.checkBalance()                     // Final balance check
}
