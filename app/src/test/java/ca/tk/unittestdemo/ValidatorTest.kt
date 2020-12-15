package ca.tk.unittestdemo

import junit.framework.TestCase
import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ValidatorTest : TestCase() {

    public override fun setUp() {
        super.setUp()
    }

    public override fun tearDown() {}

    @Test
    fun isValidNum_givenChar_returnsFalse() {
        val target = Validator()
        val actual = target.isValidNumber("A")
        assertThat(actual, `is`(false))
    }

    @Test
    fun isValidNum_givenNum_returnsTrue() {
        val target = Validator()
        val actual = target.isValidNumber("7")
        assertThat(actual, `is`(true))
    }
}