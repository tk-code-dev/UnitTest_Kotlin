package ca.tk.unittestdemo

open class Validator {
    open fun isValidNumber(text: String): Boolean {
        return text.matches(Regex("[0-9]+"))
    }

    open fun isValidOperator(text: String): Boolean {
        return text.matches(Regex("""[-+*/]"""))
    }
}