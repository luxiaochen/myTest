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
  
    /*正常情况*/
    public void testCompareTo() {
    	boolean issuccess;
    	
    	issuccess = str1.compareTo(str2) == 0 ? true :false;
    	assertEquals("testCompareTo  出错啦！", false, issuccess);
    }
    
    /*要比较的字符串包含特殊字符*/
    public void testCompareTo1() {
    	boolean issuccess;
    	String str = "android&";
    	issuccess = str1.compareTo(str) == 0 ? true :false;
    	assertEquals("testCompareTo1  出错啦！", false, issuccess);
    }
    
    /*正常情况*/
    public void testCompareToIgnoreCase() { 
    	boolean issuccess;
    	
    	issuccess = str1.compareToIgnoreCase(str2) == 0 ? true :false;
    	assertEquals("testCompareToIgnoreCase  出错啦！",true, issuccess);
    }
    
    /*要比较的字符串包含特殊字符*/
    public void testCompareToIgnoreCase1() { 
    	boolean issuccess;
    	String str = "android&";
    	
    	issuccess = str1.compareToIgnoreCase(str) == 0 ? true :false;
    	assertEquals("testCompareToIgnoreCase1  出错啦！",false, issuccess);
    }
    
    /*要比较的字符串包含空格*/
    public void testCompareToIgnoreCase2() { 
    	boolean issuccess;
    	String str = "and roid";
    	
    	issuccess = str1.compareToIgnoreCase(str) == 0 ? true :false;
    	assertEquals("testCompareToIgnoreCase2  出错啦！",true, issuccess);
    }
    
    /*正常情况*/
    public void testIndexOf(){
		 String str = "oi";
		 int result = str1.indexOf(str); 
		
		 assertEquals("testIndexOf  出错啦！",4, result); 
	 } 
    
    /*目标字符串为空*/
    public void testIndexOf1(){
		 String str = "";
		 int result = str1.indexOf(str); 
		
		 assertEquals("testIndexOf1  出错啦！",4, result); 
	 } 
    
    /*测试字符串不包含目标字符串*/
    public void testIndexOf2(){
		 String str = "m";
		 int result = str1.indexOf(str); 
		
		 assertEquals("testIndexOf2  出错啦！",4, result); 
	 } 
   
    /*正常情况*/
    public void testToUpperCase(){ 
		 String result = str1.toUpperCase();
		 assertEquals("testToUpperCase  出错啦！","ANDROID", result); 
	 } 
    
    /*字符串包含空格*/
    public void testToUpperCase1(){ 
    	 String s = "and roid";
		 String result = s.toUpperCase();
		 assertEquals("testToUpperCase1  出错啦！","AND ROID", result); 
	 } 
    
    /*正常情况*/
    public void testEquals(){ 
		 boolean result = str1.equals(str2);
		 assertEquals("testEquals  出错啦！",false, result); 
	 } 
    
    /*比较的字符串包含特殊字符*/
    public void testEquals1(){ 
    	 String str = "android*";
		 boolean result = str1.equals(str);
		 assertEquals("testEquals1  出错啦！",true, result); 
	 } 
   
    /*正常情况*/
    public void testEndsWith(){ 
    	 boolean result = str1.endsWith("d");
		 assertEquals("testEndsWith  出错啦！",true, result); 
	 } 
    
    /*以不存在的字符开头*/
    public void testEndsWith1(){ 
   	 	boolean result = str1.endsWith("m");
		assertEquals("testEndsWith1  出错啦！",false, result); 
	 } 
    
    /*正常情况*/
    public void testLength(){ 
    	int lenght = str1.length();
		 assertEquals("testLength  出错啦！",7, lenght); 
	 } 
    
    /*目标字符串为空*/
    public void testLength1(){ 
    	String str = "";
    	int lenght = str.length();
		 assertEquals("testLength1  出错啦！",0, lenght); 
	 } 
    
    /*目标字符串为null*/
    public void testLength2(){ 
    	String str = null;
    	int lenght = str.length();
		 assertEquals("testLength2  出错啦！",0, lenght); 
	 } 
    
    /*目标字符串不全为空*/
    public void testLength3(){ 
    	String str = "ab cd ";
    	int lenght = str.length();
		 assertEquals("testLength3  出错啦！",6, lenght); 
	 } 
    
    /*目标字符串全为空*/
    public void testLength4(){ 
    	String str = "   ";
    	int lenght = str.length();
		 assertEquals("testLength4  出错啦！",0, lenght); 
	 } 
    
    /*正常情况*/
    public void testMatches(){ 
		 boolean result = str1.matches("^[a-z]+$");
		 assertEquals("testMatches  出错啦！",true, result); 
	 } 
    
    /*目标字符串不符合正则表达式*/
    public void testMatches1(){
    	 String str= "sdds2vx5&*";
		 boolean result = str.matches("^[a-z]+$");
		 assertEquals("testMatches1  出错啦！",false, result); 
	 } 
    
    /*目标字符串为null*/
    public void testMatches2(){ 
    	 String str= null;
		 boolean result = str.matches("^[a-z]+$");
		 assertEquals("testMatches2  出错啦！",false, result); 
	 } 
    
    /*目标字符串全为空*/
    public void testMatches3(){ 
    	 String str= "   ";
		 boolean result = str.matches("^[a-z]+$");
		 assertEquals("testMatches3  出错啦！",false, result); 
	 } 
    
    public void testOffsetByCodePoints(){ 
		 int result = str1.offsetByCodePoints(0, 2);
		 assertEquals("testOffsetByCodePoints  出错啦！",2, result); 
	 }
    
    public void testReplace(){ 
		 String result = str1.replace('o','m');
		 assertEquals("testReplace  出错啦！","andrmid", result); 
	 } 
    
    public void testReplaceAll(){ 
    	String s = "da1sd2s2a1d3";
		 String result = s.replaceAll("[0-9]","A" );
		 assertEquals("testReplaceAll  出错啦！","daAsdAsAaAdA", result); 
	 } 
    
    public void testSplit(){ 
		 String[] result = str1.split("d");
		 assertEquals("testSplit  出错啦！","an", result[0]); 
	 } 
    
    public void testStartsWith(){ 
		 boolean result = str1.startsWith("an");
		 assertEquals("testStartsWith  出错啦！",true, result); 
	 } 
    
    public void testSubSequence(){ 
		 String result = (String) str1.subSequence(1,3);
		 assertEquals("testSubSequence  出错啦！","nd", result); 
	 } 
    
    public void testSubstring(){ 
		 String result1 = str1.substring(1);
		 String result2 = str1.substring(0, 2);
		 assertEquals("testSubstring  出错啦！","ndroid", result1); 
		 assertEquals("testSubstring  出错啦！","an", result2); 
	 } 
    
    public void testTrim(){ 
		 String s = "da %sdfsd   ";
		 String result = s.trim();
		 assertEquals("testTrim  出错啦！","da %sdfsd", result); 
	 } 
    
    public void testCharAt(){ 
    	 int index = 2;
		 char result = str1.charAt(index);
		 assertEquals("testCharAt  出错啦！",'d', result); 
	 } 
    
    public void testConcat(){ 
		 String result = str1.concat(str2);
		 assertEquals("testConcat  出错啦！","androidAndroid", result); 
	 } 
    
}
