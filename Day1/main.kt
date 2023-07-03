fun main() {
    print("Enter a string : ")
    val str = readLine()!!
 
    if (str == str.reversed()) {
        print("$str is palindrome.")
    } else {
        print("$str is not palindrome.")
    }
}