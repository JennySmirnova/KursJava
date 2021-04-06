import org.junit.Assert;
import org.junit.Test;
import Task5_7.Calculator

import java.lang.reflect.Array;
public class CalculatorTest {
    @Test
    public void calcMultNegativeNumber () {
        Calculator calc = new Calculator();
        Assert.assertEquals("При умножении отрицательных чисел получаем положительное",1.21,calc.Multiplication(-1.1,-1.1),1.0E-4);
    }
    @Test
    public void calcMultNegativeNumberToPositive () {
        Calculator calc = new Calculator();
        Assert.assertEquals("При умножении отрицательного числа на положительное получаем отрицательное",-1.21,calc.Multiplication(-1.1,1.1),1.0E-4);
    }
    @Test
    public void calcMultPositiveNumber () {
        Calculator calc = new Calculator();
        Assert.assertEquals("При умножении положительных чисел получаем положительное",1.21,calc.Multiplication(1.1,1.1),1.0E-4);
    }
    @Test
    public void calcMultNumberByZero () {
        Calculator calc = new Calculator();
        Assert.assertEquals("При умножении на 0 получаем 0",0,calc.Multiplication(0,1.1),1.0E-4);
    }
    @Test
    public void calcAddNumberByZero () {
        Calculator calc = new Calculator();
        Assert.assertEquals("При сложении числа с 0 получаем то же число",1.1,calc.Addition(0,1.1),1.0E-4);
    }
    @Test
    public void calcSubZeroFromNumber () {
        Calculator calc = new Calculator();
        Assert.assertEquals("При вычитании нуля из числа получаем то же число",1.1,calc.Subtraction(1.1,0),1.0E-4);
    }
    @Test
    public void calcSubNumberFromZero () {
        Calculator calc = new Calculator();
        Assert.assertEquals("При вычитании числа из нуля получаем то же число с минусом",-1.1,calc.Subtraction(0,1.1),1.0E-4);
    }
    @Test
    public void calcDivZeroByNumber () {
        Calculator calc = new Calculator();
        Assert.assertEquals("При делении числа 0 на другое число получаем 0",0,calc.Division(0,1.1),1.0E-4);
    }
    @Test
    public void calcDivNegativeNumber () {
        Calculator calc = new Calculator();
        Assert.assertEquals("При делении отрицательных чисел получаем положительное",1,calc.Division(-1.1,-1.1),1.0E-4);
    }
    @Test
    public void calcDivNegativeNumberToPositive () {
        Calculator calc = new Calculator();
        Assert.assertEquals("При делении отрицательного числа на положительное получаем отрицательное",-1,calc.Division(-1.1,1.1),1.0E-4);
    }
    @Test
    public void calcDivPositiveNumber () {
        Calculator calc = new Calculator();
        Assert.assertEquals("При делении положительных чисел получаем положительное",1,calc.Division(1.1,1.1),1.0E-4);
    }
    @Test
    public void calcDivPositiveNumberByZero() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.Division(1.1, 0), Double.POSITIVE_INFINITY , 1.0E-4);
    }
    @Test
    public void calcNegativePositiveNumberByZero() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.Division(-1.1, 0), Double.NEGATIVE_INFINITY , 1.0E-4);
    }

}
