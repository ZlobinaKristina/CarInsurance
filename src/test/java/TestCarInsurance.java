import org.junit.jupiter.api.*;

public class TestCarInsurance {
    @Test
    public void InsurancePositive () {
        Assertions.assertEquals(210, CarInsurance.CountInsurance(0.5,0, 25));
        Assertions.assertEquals(210, CarInsurance.CountInsurance(2,1, 25));
        Assertions.assertEquals(210, CarInsurance.CountInsurance(35,2, 25));
        Assertions.assertEquals(210, CarInsurance.CountInsurance(35,1, 75));
        Assertions.assertEquals(210, CarInsurance.CountInsurance(2,0, 75));
        Assertions.assertEquals(210, CarInsurance.CountInsurance(35,0, 125));
        Assertions.assertEquals(210, CarInsurance.CountInsurance(35,0, 350));
        Assertions.assertEquals(1200, CarInsurance.CountInsurance(0.5,1000, 75));
        Assertions.assertEquals(1200, CarInsurance.CountInsurance(0.5,2, 350));
        Assertions.assertEquals(1200, CarInsurance.CountInsurance(0.5,2, 350));
        Assertions.assertEquals(1050, CarInsurance.CountInsurance(0.5,2, 125));
        Assertions.assertEquals(1680, CarInsurance.CountInsurance(0.5,1000, 125));
        Assertions.assertEquals(251, CarInsurance.CountInsurance(2,0, 125));
        Assertions.assertEquals(1280, CarInsurance.CountInsurance(2,1000, 350));

    }
  }

