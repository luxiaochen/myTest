package testCase;
import junit.framework.TestCase;

public class StringTest20130204 extends TestCase 
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
    
    /*�������*/
    public void testOffsetByCodePoints(){ 
		 int result = str1.offsetByCodePoints(0, 2);
		 assertEquals("testOffsetByCodePoints  ��������",2, result); 
	 }
    
    /*ƫ���������ַ������Ȼ��߳����ַ����±귶Χ*/
    public void testOffsetByCodePoints1(){ 
		 assertEquals("testOffsetByCodePoints1  ��������",9, str1.offsetByCodePoints(0, 9)); 
	 }
    
    /*ƫ���������ַ������Ȼ��߳����ַ����±귶Χ*/
    public void testOffsetByCodePoints2(){ 
		 assertEquals("testOffsetByCodePoints2  ��������",-1, str1.offsetByCodePoints(0,-2)); 
	 }
    
    /*�������*/
    public void testReplace(){ 
		 String result = str1.replace('o','m');
		 assertEquals("testReplace  ��������","andrmid", result); 
	 } 
    
    /*���ַ���������Ŀ���ַ���*/
    public void testReplace1(){
		 assertEquals("testReplace1  ��������","android", str1.replace('k','m')); 
	 } 
    
    /*�������*/
    public void testReplaceFirst(){ 
    	 String str = "da1sd2s2a1d3";
		 String result = str.replaceFirst("[0-9]","m");
		 assertEquals("testReplaceFirst  ��������","damsd2s2a1d3", result); 
	 }
    
    /*������������ʽƥ�䲻���ַ���*/
    public void testReplaceFirst1(){ 
    	 String str = "sdasd";
		 assertEquals("testReplaceFirst  ��������","sdasd", str.replaceFirst("[0-9]","m")); 
	 }
    
    /*�������*/
    public void testReplaceAll(){ 
    	 String s = "da1sd2s2a1d3";
		 String result = s.replaceAll("[0-9]","A" );
		 assertEquals("testReplaceAll  ��������","daAsdAsAaAdA", result); 
	 } 
    
    /*�滻�ո�*/
    public void testReplaceAll1(){ 
    	 String s = "da1s d2s2a1d3";
		 String result = s.replaceAll("^[/s]+$","A" );
		 assertEquals("testReplaceAll1  ��������","da1sAd2s2a1d3", result); 
	 } 
    
    /*�������*/
    public void testSplit(){ 
		 String[] result = str1.split("d");
		 assertEquals("testSplit  ��������","an", result[0]); 
	 } 
    
    /*���ַ���������Ŀ���ַ�*/
    public void testSplit1(){ 
		 assertEquals("testSplit1  ��������","an", str1.split("k")[0]); 
	 } 
    
    /*Ŀ���ַ���Ϊnull*/
    public void testSplit2(){ 
		 assertEquals("testSplit2  ��������","android", str1.split(null)[0]); 
	 } 
    
    /*Ŀ���ַ���Ϊ""*/
    public void testSplit3(){ 
		 assertEquals("testSplit3  ��������","android", str1.split("")[0]); 
	 } 
    
    /*�������*/
    public void testStartsWith(){ 
		 boolean result = str1.startsWith("an");
		 assertEquals("testStartsWith  ��������",true, result); 
	 } 
    
    /*Ŀ���ַ���Ϊ""*/
    public void testStartsWith1(){ 
		 boolean result = str1.startsWith("");
		 assertEquals("testStartsWith1  ��������",true, result); 
	 } 
    
    /*�������*/
    public void testSubSequence(){ 
		 String result = (String) str1.subSequence(1,3);
		 assertEquals("testSubSequence  ��������","nd", result); 
	 } 
    
    /*�±�Խ��*/
    public void testSubSequence1(){
		 assertEquals("testSubSequence1  ��������","android", str1.subSequence(1,9)); 
	 } 
    
    /*�������*/
    public void testSubstring(){
		 String result = str1.substring(0, 2);
		 assertEquals("testSubstring  ��������","and", result); 
	 } 
    
    /*�����±�Խ��*/
    public void testSubstring1(){
		 assertEquals("testSubstring1   ��������","android", str1.substring(0, 9)); 
	 } 
    
    /*ֻ��һ������*/
    public void testSubstring2(){
		 String result = str1.substring(2);
		 assertEquals("testSubstring2   ��������","droid", result); 
	 } 
    
    /*ֻ��һ�������±�Խ��*/
    public void testSubstring3(){
		 assertEquals("testSubstring3   ��������","", str1.substring(9)); 
	 } 
    
    /*�������*/
    public void testTrim(){ 
		 String s = "da %sdfsd   ";
		 String result = s.trim();
		 assertEquals("testTrim  ��������","da %sdfsd", result); 
	 } 
    
    /*����trim�����Ƿ���ȥ���ַ����м�Ŀո�*/
    public void testTrim1(){ 
		 String s = "da %sdfsd   ";
		 String result = s.trim();
		 assertEquals("testTrim1  ��������","da%sdfsd", result); 
	 } 
    
    /*�������*/
    public void testCharAt(){ 
    	 int index = 2;
		 char result = str1.charAt(index);
		 assertEquals("testCharAt  ��������",'d', result); 
	 } 
    
    /*�±�Խ��*/
    public void testCharAt1(){ 
    	 int index = 9;
		 assertEquals("testCharAt1  ��������",'d', str1.charAt(index)); 
	 } 
    
    /*�������*/
    public void testConcat(){ 
		 assertEquals("testConcat  ��������",true, str1.concat("and")); 
	 } 
    
    /*ƴ�ӵ��ַ���Ϊ�մ�*/
    public void testConcat1(){ 
		 assertEquals("testConcat1  ��������",true, str1.concat("")); 
	 }
    
    /*ƴ�ӵ��ַ���Ϊ�մ�*/
    public void testConcat2(){ 
		 assertEquals("testConcat2  ��������",true, str1.concat("   ")); 
	 } 
    
    /*ƴ�ӵ��ַ���Ϊnull*/
    public void testConcat3(){ 
		 assertEquals("testConcat3  ��������",true, str1.concat(null)); 
	 } 
    
    /*�������*/
    public void testContains(){
		 assertEquals("testContainst ��������",false, str1.contains("and")); 
	 } 
    
    /*Ŀ���ַ���Ϊ�����ַ�*/
    public void testContains1(){ 
    	String str = "a";
		 assertEquals("testContains1  ��������",true, str1.contains(str)); 
	 } 
    
    /*Ŀ���ַ����������ַ���*/
    public void testContains2(){ 
    	String str = "androids";
		 assertEquals("testContains2  ��������",false, str1.contains(str)); 
	 } 
    
    /*Ŀ���ַ�����ȫΪ�ô����Ӵ�*/
    public void testContains3(){ 
    	String str = "ansdr";
		 assertEquals("testContains2  ��������",false, str1.contains(str)); 
	 } 
    
    /*�������*/
    public void testFormat(){ 
    	String str = "2012-12-12";
    	String str3 = "20130206";
		assertEquals("testFormat  ��������","20130206", str3.format(str3, str)); 
	 } 
    
    /*�����ַ������ȴ���Ҫ��ʽ�����ַ���*/
    public void testFormat1(){ 
    	String str = "2012-12-12";
    	String str3 = "20130206";
		assertEquals("testFormat1  ��������","20130206", str3.format(str, str3)); 
	 }
    
    /*�������*/
    public void testToCharArray(){ 
		 char[] result = str1.toCharArray();
		 assertEquals("testToCharArray  ��������","a", result); 
	 } 
    
    /*Ŀ���ַ������������ַ�*/
    public void testToCharArray1(){ 
    	String str = "and#&%3";
		assertEquals("testToCharArray1  ��������","#", str.toCharArray()[3]); 
	 } 
    
    /*Ŀ���ַ��������ո�*/
    public void testToCharArray2(){ 
    	String str = "an d";
		assertEquals("testToCharArray2  ��������"," ", str.toCharArray()[2]); 
	 } 
    
    /*�������*/
    public void testToString(){
		 String result = str1.toString();
		 assertEquals("testToString  ��������","android", result); 
	 } 
    
}
