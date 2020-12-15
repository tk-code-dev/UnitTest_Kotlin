package ca.tk.unittestdemo.util

import ca.tk.unittestdemo.Validator
import ca.tk.unittestdemo.model.InputNumbers

open class InputChecker {

    var errMsg: String = ""

    open fun canCalc(input: InputNumbers): Boolean {
        val validator = Validator()                     //   <---- It depends on the validator class
        if (!validator.isValidNumber(input.num1)) {
            errMsg = "Input Number"
            return false
        }
        if (!validator.isValidNumber(input.num2)) {
            errMsg = "Input Number"
            return false
        }
        if (!validator.isValidOperator(input.operator)) {
            errMsg = "Input these operator +, -, *, /"
            return false
        }
        if (input.operator == "/" && input.num2 == "0") {
            errMsg = "Not allowed to divide by 0"
            return false
        }
        return true
    }
}
