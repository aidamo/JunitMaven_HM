import org.junit.Assert;
import org.junit.Test;

    public class TestExpert {

        static public ExpertCalculator expertCalculator = new ExpertCalculator();

        @Test
        public void expressionTest(){
            Assert.assertNotNull(expertCalculator);
            Integer result = expertCalculator.add((Integer)3);
            Assert.assertEquals((Integer)3,result);
            //  Assert.assertTrue(conditie);
        }

        @Test
        public void callPowExpertCalculator(){
            Integer result = expertCalculator.pow((Integer)2,(Integer)10);
            Assert.assertEquals((Integer)1024,result);
        }


        public ExpertCalculator exp= new ExpertCalculator();
            @Test
            public void expressionPowTestInt(){
                Integer res = exp.pow((Integer)2,(Integer)10);
                Assert.assertEquals((Integer)1024, res);//passed test
            }
            @Test
            public void expressionPowTestDouble(){
                Double res = exp.pow((Double)2.7,(Double)2.0);
                Assert.assertTrue(res == 7.290000000000001);//passed test
            }
            @Test
            public void expressionPowTestLong(){
                long res = exp.pow((long) 147,(long)4);
                Assert.assertEquals((long)466948881, res);//passed test
            }
            @Test
            public void rootTest(){
                float res = exp.root((Integer)169);
                Assert.assertFalse( res == 169);//passed
            }
            @Test
            public void factTest(){
                Integer res = exp.factorial((Integer)5);
                Assert.assertTrue(res == 120);//passed
            }

        }


