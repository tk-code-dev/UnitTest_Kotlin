package ca.tk.unittestdemo

import ca.tk.unittestdemo.model.InputNumbers
import ca.tk.unittestdemo.util.InputChecker
import org.hamcrest.CoreMatchers.`is`
import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class InputCheckerTest {

    lateinit var target: InputChecker

    @Before
    fun setUp() {
        target = InputChecker()
    }

    @After
    fun tearDown() {
    }

    // entered operator is correct
    @Test
    fun checkCanCalc_givenValidValues_returnsTrue() {
        val input = InputNumbers("11", "100", "+")
        val stubValidator = Validator.StubValidator(isNumber = true, isOperator = true)
        assertThat(target.canCalc(input, stubValidator), `is`(true))
    }

    // entered operator is incorrect
    @Test
    fun checkCanCalc_givenInvalidOperator_returnsFalse() {
        val input = InputNumbers("11", "100", "+")
        val stubValidator = Validator.StubValidator(isNumber = true, isOperator = false)
        assertThat(target.canCalc(input, stubValidator), `is`(false))
        assertThat(target.errMsg == "Input these operator +, -, *, /", `is`(true))
    }

    // entered values are incorrect
    @Test
    fun checkCanCalc_givenInvalidNumber_returnsFalse() {
        val input = InputNumbers("11", "100", "+")
        val stubValidator = Validator.StubValidator(isNumber = false, isOperator = true)
        assertThat(target.canCalc(input, stubValidator), `is`(false))
        assertThat(target.errMsg == "Input number", `is`(true))
    }

}