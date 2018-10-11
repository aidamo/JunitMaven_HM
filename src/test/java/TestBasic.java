import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



    public class TestBasic {


        static BasicCalculator basicCalculator;

        static public void printMessage(String message) {
            System.out.println(message);
        }

        @BeforeClass
        static public void setUp() {
            basicCalculator = new BasicCalculator();
            printMessage("SetUp");
        }

        @Before
        public void setUpTest() {
            printMessage("BeforeEachTest");
        }
// Add
        @Test
        public void testAddDouble() {
           // BasicCalculator basicCalculator = new BasicCalculator();
            Double result = basicCalculator.add(2.5, 2.5);
            Assert.assertEquals("Message in case of failure", (Double) 5.0, result);

//            Object object = null;
//            Assert.assertNotNull("message-not null", object);
        }

//        @Test
//        public void testAdd2MaxInts() {
//            Integer result = basicCalculator.add(Integer.MAX_VALUE, Integer.MIN_VALUE);
//            Assert.fail();
//        }
//        @Test
//        public void testAddASingleValue() {
//            Integer result = basicCalculator.add();
//            Assert.assertEquals((Integer) 1, result);
//        }

        @Test
        public void testAddInt() {
            Integer result = basicCalculator.add(2, 2);
            Assert.assertEquals("Message in case of failure", (Integer) 4, result);
        }
        @Test
        public void testAddIntFalse() {
            Integer result = basicCalculator.add(2, 2);
            Assert.assertFalse("Message in case of failure", (basicCalculator.add(2, 2) == 5));
        }
        @Test
        public void testAddLongFalse() {
            long result = basicCalculator.add(2576575, 37475);
            Assert.assertFalse("Message in case of failure", (basicCalculator.add(2576575, 37475) == 2665050));
        }
        @Test
        public void testAddLongTrue() {
            long result = basicCalculator.add(2576575, 37475);
            Assert.assertTrue("Message in case of failure", (basicCalculator.add(2576575, 37475) == 2614050));
        }
        @Test
        public void testAddIntTrue () {
            int result = basicCalculator.add(6,3);
            Assert.assertTrue("Message in case of failure", (basicCalculator.add(6,3) == 9));
        }
        @Test
        public void testAddIntNotNull () {
            Assert.assertNotNull("Message is not null", basicCalculator.add(1,2,3));
        }
        @Test
        public void testAddLongEquals() {
            long result = basicCalculator.add(3543647,267748868);
            Assert.assertEquals ((long) 271292515, result);
        }

        @Test
        public void testAddDoubleFalse () {
            double result =basicCalculator.add(5.4, 25.3);
            Assert.assertFalse("Message in case of failure", (basicCalculator.add(5.4,25.3) == 57.2));
        }
        @Test
        public void testAddDoubleTrue () {
            double result =basicCalculator.add(5.4, 25.3);
            Assert.assertFalse("Message in case of failure", (basicCalculator.add(5.4,25.3) == 30.7));
        }
        @Test
        public void testAddDoubleNotNull () {
            //Object object = null;
            Assert.assertNotNull("Message is not null", basicCalculator);
        }
        @Test
        public void testAddDoubleNull () {
            Object object = null;
            Assert.assertNull("Message is null", object);
        }
// Substract

        @Test
        public void testSubstractIntTrue () {
            int result = basicCalculator.add(6,3);
            Assert.assertTrue("Message in case of failure", (basicCalculator.substract(6,3) == 3));
        }
        @Test
        public void testSubstractIntNull () {
            Object object =null;
            Assert.assertNull("Message is null", object);
        }

        @Test
        public void testSubstractLongEquals() {
            long result = basicCalculator.substract(3543647L,267748868L);
            Assert.assertEquals ((long) -264205221L, result);
        }
        @Test
        public void testSubstractDoubleFalse () {
            double result =basicCalculator.substract(5.4, 25.3);
            Assert.assertFalse("Message in case of failure", (basicCalculator.substract(5.4,25.3) == 14));
        }
        @Test
        public void testSubstractDoubleTrue () {
            double result =basicCalculator.substract(5.4, 25.3);
            Assert.assertFalse("Message in case of failure", (basicCalculator.substract(5.4,25.3) == 30.7));
        }
        @Test
        public void testSubstractLongFalse() {
            long result = basicCalculator.substract(2576575L, 37475L);
            Assert.assertFalse("Message in case of failure", (basicCalculator.substract(2576575L, 37475L) == 2614050L));
        }
//Multiply
        @Test
        public void testMultiplyIntTrue () {
            int result =basicCalculator.multiply(4,5);
            Assert.assertTrue("Message in case of failure", (basicCalculator.multiply(4,5) == 20));
        }
        @Test
        public void testMultiplyInt() {
            int result = basicCalculator.multiply(2, 2);
            Assert.assertEquals((int) 4, result);
        }
        @Test
        public void testMultiplyDouble() {
            double result =basicCalculator.multiply(6.1,8.4);
            Assert.assertFalse("Message in case of failure", (basicCalculator.multiply(6.1,8.4) == 7.7));
        }
        @Test
        public void testMultiplyLong () {
            long result = basicCalculator.multiply(39587L,2536L);
            Assert.assertTrue("Message in case of failure",(basicCalculator.multiply(39587L, 2536L)== result));
        }
//Divide
        @Test
        public void testDivideInt () {
            int result =basicCalculator.divide(200, 5);
            Assert.assertTrue("Message in case of failure",(basicCalculator.divide(200,5)== 40));
        }
        @Test
        public void testDivideLong () {
            long result =basicCalculator.divide(4356L,36636L);
            Assert.assertFalse("Message in case of failure",(basicCalculator.divide(4356L, 36636L)== 35647L));
        }
        @Test
        public void testDivideDouble() {
            double result = basicCalculator.divide(4.5,6.6);
            Assert.assertTrue("Message in case of failure", (basicCalculator.divide(4.5,6.6) == result));
        }
        @Test
        public void testDivideDoubleEquals() {
            double result = basicCalculator.divide(8.2, 8.2);
            Assert.assertFalse("Message in case of failure", (basicCalculator.divide (8.1,8.1) == 16));
        }




    }
