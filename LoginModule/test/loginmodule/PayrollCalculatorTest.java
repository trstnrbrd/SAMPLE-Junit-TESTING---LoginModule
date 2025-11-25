package loginmodule;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gutzz23
 */
public class PayrollCalculatorTest {
    
    public class PayrollCalculator {
    private double regularPay, overtimePay;
    
    public double getTotalSalary(double hourlyRate, double hours, double overtime) {
        double netSalary = 0.0;
        regularPay = hours * hourlyRate; //compute regular work pay
        overtimePay = (hourlyRate * 1.5) * overtime; //compute overtime pay
        netSalary = overtimePay + regularPay; ////compute total pay
        return netSalary;
    }
    
    public double getRegularPay(){
        return this.regularPay;
    }
    
    public double getOverTimePay(){
        return this.overtimePay;
    }
}
    
    public PayrollCalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
