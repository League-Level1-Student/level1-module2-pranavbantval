 import static org.junit.Assert.assertEquals;
     import org.junit.Test;
 class TeaParty {
	 public String welcome(String name, boolean isWoman, boolean isKnighted)
     {
		
		 String a="";
		 if(isWoman==true) {
			 if(isKnighted==true) {
				 a="Lady ";
			 }
			 else {
				 a="Ms. ";
			 }
			 
		 }
		 else if(isWoman == false) {
			 if(isKnighted==true) {
				 a="Sir ";
			 }
			 else {
				a="Mr. "; 
			 }
		 }
		 String s = "Hello " + a+ name;
		 System.out.println(s);
		return s;

     }
}

     public class TeaPartyTest {
            /**
             * Jane Austen is a woman, so say “Hello Ms. Austen”. 
             * George Orwell is a man, so say “Hello Mr. Orwell”. 
             * Isaac Newton was knighted, so say "Hello Sir Isaac Newton".
             **/

            @Test
            public void test() {
                    TeaParty teaParty = new TeaParty();
                  //  String greeting = teaParty.welcome(null, false, false);
                    assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
                    assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
                    assertEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
                    assertEquals("Hello Lady Joan Arc", teaParty.welcome("Joan Arc", true, true));
            }
     }


