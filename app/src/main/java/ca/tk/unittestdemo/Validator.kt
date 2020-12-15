package ca.tk.unittestdemo

class Validator {
    fun isValidNumber(text: String): Boolean {
        return text.matches(Regex("[0-9]+"))
    }
}