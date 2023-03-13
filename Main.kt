fun main() {
    print("Enter any number:")
    val num = readln().toInt()
    var status = false
    for (i in 2..num / 2) {
        // condition for not a prime number
        if (num % i == 0) {
            status = true
            break
        }
    }
    if (!status)
        println("$num is a prime number.")
    else
        println("$num is not a prime number.")
}