fun main() {
    print("Enter your name: ")
    val name = readLine()

    if (name != null) {
        println("Hello, $name!")
    } else {
        println("Error reading input.")
    }

    print("Enter your age: ")
    val ageString = readLine()
    val age = ageString?.toIntOrNull()

    if (age != null) {
        println("You are $age years old.")
    } else {
        println("Invalid age entered.")
    }
}
