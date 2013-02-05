package testCase;
import android.test.AndroidTestCase;

public class StringTest20130204 extends AndroidTestCase 
{
    protected String str1 ;
	protected String str2 ;
	
    static final String LOG_TAG = "StringTest";

    public void setUp() 
    {
        str1 = "android";
        str2 = "Android";
    }

  
    public void testCompareTo() {
    	boolean issuccess;
    	
    	issuccess = str1.compareTo(str2) == 0 ? true :false;
    	assertEquals("testCompareTo  ³ö´íÀ²£¡", "true", issuccess);
    }
    
    public void testCompareToIgnoreCase() { 
    	int issuccess;
    	
    	issuccess = str1.compareToIgnoreCase(str2);
    	assertEquals(2, issuccess);
    }
    
    public void testIndexOf(){
		 String str = "oi";
		 int result = str1.indexOf(str); 
		
		 assertEquals(4, result); 
	 } 
   
    public void testToUpperCase(){ 
		 String result = str1.toUpperCase();
		 assertEquals("ANDROID", result); 
	 } 
    
    public void testEquals(){ 
		 boolean result = str1.equals(str2);
		 assertEquals(true, result); 
	 } 
   
    public void testEndsWith(){ 
    	 boolean result = str1.endsWith("d");
		 assertEquals(true, result); 
	 } 
    
    public void testLength(){ 
    	int lenght = str1.length();
		 assertEquals(7, lenght); 
	 } 
    
    public void testMatches(){ 
		 boolean result = str1.matches("[a-z]");
		 assertEquals(true, result); 
	 } 
    
//    public void testOffsetByCodePoints(){ 
//		 String result = str1.toUpperCase();
//		 assertEquals("ANDROID", result); 
//	 } 
//    public void testReplace(){ 
//		 String result = str1.toUpperCase();
//		 assertEquals("ANDROID", result); 
//	 } 
//    public void testReplaceAll(){ 
//		 String result = str1.toUpperCase();
//		 assertEquals("ANDROID", result); 
//	 } 
//    public void testSplit(){ 
//		 String result = str1.toUpperCase();
//		 assertEquals("ANDROID", result); 
//	 } 
//    public void testStartsWith(){ 
//		 String result = str1.toUpperCase();
//		 assertEquals("ANDROID", result); 
//	 } 
//    public void testSubSequence(){ 
//		 String result = str1.toUpperCase();
//		 assertEquals("ANDROID", result); 
//	 } 
//    public void testSubstring(){ 
//		 String result = str1.toUpperCase();
//		 assertEquals("ANDROID", result); 
//	 } 
//    public void testTrim(){ 
//		 String result = str1.toUpperCase();
//		 assertEquals("ANDROID", result); 
//	 } 
    
}
