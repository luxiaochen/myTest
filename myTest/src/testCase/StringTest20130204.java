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
  
    /*�������*/
    public void testCompareTo() {
    	boolean issuccess;
    	
    	issuccess = str1.compareTo(str2) == 0 ? true :false;
    	assertEquals("testCompareTo  ��������", false, issuccess);
    }
    
    /*Ҫ�Ƚϵ��ַ������������ַ�*/
    public void testCompareTo1() {
    	boolean issuccess;
    	String str = "android&";
    	issuccess = str1.compareTo(str) == 0 ? true :false;
    	assertEquals("testCompareTo1  ��������", false, issuccess);
    }
    
    /*�������*/
    public void testCompareToIgnoreCase() { 
    	boolean issuccess;
    	
    	issuccess = str1.compareToIgnoreCase(str2) == 0 ? true :false;
    	assertEquals("testCompareToIgnoreCase  ��������",true, issuccess);
    }
    
    /*Ҫ�Ƚϵ��ַ������������ַ�*/
    public void testCompareToIgnoreCase1() { 
    	boolean issuccess;
    	String str = "android&";
    	
    	issuccess = str1.compareToIgnoreCase(str) == 0 ? true :false;
    	assertEquals("testCompareToIgnoreCase1  ��������",false, issuccess);
    }
    
    /*Ҫ�Ƚϵ��ַ��������ո�*/
    public void testCompareToIgnoreCase2() { 
    	boolean issuccess;
    	String str = "and roid";
    	
    	issuccess = str1.compareToIgnoreCase(str) == 0 ? true :false;
    	assertEquals("testCompareToIgnoreCase2  ��������",true, issuccess);
    }
    
    /*�������*/
    public void testIndexOf(){
		 String str = "oi";
		 int result = str1.indexOf(str); 
		
		 assertEquals("testIndexOf  ��������",4, result); 
	 } 
    
    /*Ŀ���ַ���Ϊ��*/
    public void testIndexOf1(){
		 String str = "";
		 int result = str1.indexOf(str); 
		
		 assertEquals("testIndexOf1  ��������",4, result); 
	 } 
    
    /*�����ַ���������Ŀ���ַ���*/
    public void testIndexOf2(){
		 String str = "m";
		 int result = str1.indexOf(str); 
		
		 assertEquals("testIndexOf2  ��������",4, result); 
	 } 
   
    /*�������*/
    public void testToUpperCase(){ 
		 String result = str1.toUpperCase();
		 assertEquals("testToUpperCase  ��������","ANDROID", result); 
	 } 
    
    /*�ַ��������ո�*/
    public void testToUpperCase1(){ 
    	 String s = "and roid";
		 String result = s.toUpperCase();
		 assertEquals("testToUpperCase1  ��������","AND ROID", result); 
	 } 
    
    /*�������*/
    public void testEquals(){ 
		 boolean result = str1.equals(str2);
		 assertEquals("testEquals  ��������",false, result); 
	 } 
    
    /*�Ƚϵ��ַ������������ַ�*/
    public void testEquals1(){ 
    	 String str = "android*";
		 boolean result = str1.equals(str);
		 assertEquals("testEquals1  ��������",true, result); 
	 } 
   
    /*�������*/
    public void testEndsWith(){ 
    	 boolean result = str1.endsWith("d");
		 assertEquals("testEndsWith  ��������",true, result); 
	 } 
    
    /*�Բ����ڵ��ַ���ͷ*/
    public void testEndsWith1(){ 
   	 	boolean result = str1.endsWith("m");
		assertEquals("testEndsWith1  ��������",false, result); 
	 } 
    
    /*�������*/
    public void testLength(){ 
    	int lenght = str1.length();
		 assertEquals("testLength  ��������",7, lenght); 
	 } 
    
    /*Ŀ���ַ���Ϊ��*/
    public void testLength1(){ 
    	String str = "";
    	int lenght = str.length();
		 assertEquals("testLength1  ��������",0, lenght); 
	 } 
    
    /*Ŀ���ַ���Ϊnull*/
    public void testLength2(){ 
    	String str = null;
    	int lenght = str.length();
		 assertEquals("testLength2  ��������",0, lenght); 
	 } 
    
    /*Ŀ���ַ�����ȫΪ��*/
    public void testLength3(){ 
    	String str = "ab cd ";
    	int lenght = str.length();
		 assertEquals("testLength3  ��������",6, lenght); 
	 } 
    
    /*Ŀ���ַ���ȫΪ��*/
    public void testLength4(){ 
    	String str = "   ";
    	int lenght = str.length();
		 assertEquals("testLength4  ��������",0, lenght); 
	 } 
    
    /*�������*/
    public void testMatches(){ 
		 boolean result = str1.matches("^[a-z]+$");
		 assertEquals("testMatches  ��������",true, result); 
	 } 
    
    /*Ŀ���ַ���������������ʽ*/
    public void testMatches1(){
    	 String str= "sdds2vx5&*";
		 boolean result = str.matches("^[a-z]+$");
		 assertEquals("testMatches1  ��������",false, result); 
	 } 
    
    /*Ŀ���ַ���Ϊnull*/
    public void testMatches2(){ 
    	 String str= null;
		 boolean result = str.matches("^[a-z]+$");
		 assertEquals("testMatches2  ��������",false, result); 
	 } 
    
    /*Ŀ���ַ���ȫΪ��*/
    public void testMatches3(){ 
    	 String str= "   ";
		 boolean result = str.matches("^[a-z]+$");
		 assertEquals("testMatches3  ��������",false, result); 
	 } 
    
    public void testOffsetByCodePoints(){ 
		 int result = str1.offsetByCodePoints(0, 2);
		 assertEquals("testOffsetByCodePoints  ��������",2, result); 
	 }
    
    public void testReplace(){ 
		 String result = str1.replace('o','m');
		 assertEquals("testReplace  ��������","andrmid", result); 
	 } 
    
    public void testReplaceAll(){ 
    	String s = "da1sd2s2a1d3";
		 String result = s.replaceAll("[0-9]","A" );
		 assertEquals("testReplaceAll  ��������","daAsdAsAaAdA", result); 
	 } 
    
    public void testSplit(){ 
		 String[] result = str1.split("d");
		 assertEquals("testSplit  ��������","an", result[0]); 
	 } 
    
    public void testStartsWith(){ 
		 boolean result = str1.startsWith("an");
		 assertEquals("testStartsWith  ��������",true, result); 
	 } 
    
    public void testSubSequence(){ 
		 String result = (String) str1.subSequence(1,3);
		 assertEquals("testSubSequence  ��������","nd", result); 
	 } 
    
    public void testSubstring(){ 
		 String result1 = str1.substring(1);
		 String result2 = str1.substring(0, 2);
		 assertEquals("testSubstring  ��������","ndroid", result1); 
		 assertEquals("testSubstring  ��������","an", result2); 
	 } 
    
    public void testTrim(){ 
		 String s = "da %sdfsd   ";
		 String result = s.trim();
		 assertEquals("testTrim  ��������","da %sdfsd", result); 
	 } 
    
    public void testCharAt(){ 
    	 int index = 2;
		 char result = str1.charAt(index);
		 assertEquals("testCharAt  ��������",'d', result); 
	 } 
    
    public void testConcat(){ 
		 String result = str1.concat(str2);
		 assertEquals("testConcat  ��������","androidAndroid", result); 
	 } 
    
}
