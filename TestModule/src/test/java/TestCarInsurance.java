
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestCarInsurance { //проверка Jenkinsa
    @Test
    public void InsurancePositive () {
        assertEquals(210, CarInsurance.CountInsurance(0.5,0, 25));
        assertEquals(210, CarInsurance.CountInsurance(2,1, 25));
        assertEquals(210, CarInsurance.CountInsurance(35,2, 25));
        assertEquals(210, CarInsurance.CountInsurance(35,1, 75));
        assertEquals(210, CarInsurance.CountInsurance(2,0, 75));
        assertEquals(210, CarInsurance.CountInsurance(35,0, 125));
        assertEquals(210, CarInsurance.CountInsurance(35,0, 350));
        assertEquals(1200, CarInsurance.CountInsurance(0.5,1000, 75));
        assertEquals(1200, CarInsurance.CountInsurance(0.5,2, 350));
        assertEquals(1200, CarInsurance.CountInsurance(0.5,2, 350));
        assertEquals(1050, CarInsurance.CountInsurance(0.5,2, 125));
        assertEquals(1680, CarInsurance.CountInsurance(0.5,1000, 125));
        assertEquals(251, CarInsurance.CountInsurance(2,0, 125));
        assertEquals(1280, CarInsurance.CountInsurance(2,1000, 350));

    }
  }

