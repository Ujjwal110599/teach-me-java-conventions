package powerpackage;


import org.junit.Test;

public class powertest {
    @Test
    public void oneRaisedToOneIsOne() {

        assert powerFinder.OF(1,1) == 1;

    }

    @Test
    public void twoRaisedToOneIsTwo() {

        assert powerFinder.OF(2,1) == 2;

    }

    @Test
    public void twoRaisedToPowerTwoIsFour() {

        assert powerFinder.OF(2, 2) == 4;

    }

    @Test
    public void twoRaisedToPowerThreeIsEight() {

        assert powerFinder.OF(2, 3) == 8;

    }
}
