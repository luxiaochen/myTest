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
    
    /*正常情况*/
    public void testOffsetByCodePoints(){ 
		 int result = str1.offsetByCodePoints(0, 2);
		 assertEquals("testOffsetByCodePoints  出错啦！",2, result); 
	 }
    
    /*偏移量大于字符串长度或者超出字符串下标范围*/
    public void testOffsetByCodePoints1(){ 
		 assertEquals("testOffsetByCodePoints1  出错啦！",9, str1.offsetByCodePoints(0, 9)); 
	 }
    
    /*偏移量大于字符串长度或者超出字符串下标范围*/
    public void testOffsetByCodePoints2(){ 
		 assertEquals("testOffsetByCodePoints2  出错啦！",-1, str1.offsetByCodePoints(0,-2)); 
	 }
    
    /*正常情况*/
    public void testReplace(){ 
		 String result = str1.replace('o','m');
		 assertEquals("testReplace  出错啦！","andrmid", result); 
	 } 
    
    /*该字符串不包含目标字符串*/
    public void testReplace1(){
		 assertEquals("testReplace1  出错啦！","android", str1.replace('k','m')); 
	 } 
    
    /*正常情况*/
    public void testReplaceFirst(){ 
    	 String str = "da1sd2s2a1d3";
		 String result = str.replaceFirst("[0-9]","m");
		 assertEquals("testReplaceFirst  出错啦！","damsd2s2a1d3", result); 
	 }
    
    /*给定的正则表达式匹配不到字符串*/
    public void testReplaceFirst1(){ 
    	 String str = "sdasd";
		 assertEquals("testReplaceFirst  出错啦！","sdasd", str.replaceFirst("[0-9]","m")); 
	 }
    
    /*正常情况*/
    public void testReplaceAll(){ 
    	 String s = "da1sd2s2a1d3";
		 String result = s.replaceAll("[0-9]","A" );
		 assertEquals("testReplaceAll  出错啦！","daAsdAsAaAdA", result); 
	 } 
    
    /*替换空格*/
    public void testReplaceAll1(){ 
    	 String s = "da1s d2s2a1d3";
		 String result = s.replaceAll("^[/s]+$","A" );
		 assertEquals("testReplaceAll1  出错啦！","da1sAd2s2a1d3", result); 
	 } 
    
    /*正常情况*/
    public void testSplit(){ 
		 String[] result = str1.split("d");
		 assertEquals("testSplit  出错啦！","an", result[0]); 
	 } 
    
    /*该字符串不存在目标字符*/
    public void testSplit1(){ 
		 assertEquals("testSplit1  出错啦！","an", str1.split("k")[0]); 
	 } 
    
    /*目标字符串为null*/
    public void testSplit2(){ 
		 assertEquals("testSplit2  出错啦！","android", str1.split(null)[0]); 
	 } 
    
    /*目标字符串为""*/
    public void testSplit3(){ 
		 assertEquals("testSplit3  出错啦！","android", str1.split("")[0]); 
	 } 
    
    /*正常情况*/
    public void testStartsWith(){ 
		 boolean result = str1.startsWith("an");
		 assertEquals("testStartsWith  出错啦！",true, result); 
	 } 
    
    /*目标字符串为""*/
    public void testStartsWith1(){ 
		 boolean result = str1.startsWith("");
		 assertEquals("testStartsWith1  出错啦！",true, result); 
	 } 
    
    /*正常情况*/
    public void testSubSequence(){ 
		 String result = (String) str1.subSequence(1,3);
		 assertEquals("testSubSequence  出错啦！","nd", result); 
	 } 
    
    /*下标越界*/
    public void testSubSequence1(){
		 assertEquals("testSubSequence1  出错啦！","android", str1.subSequence(1,9)); 
	 } 
    
    /*正常情况*/
    public void testSubstring(){
		 String result = str1.substring(0, 2);
		 assertEquals("testSubstring  出错啦！","and", result); 
	 } 
    
    /*结束下表越界*/
    public void testSubstring1(){
		 assertEquals("testSubstring1   出错啦！","android", str1.substring(0, 9)); 
	 } 
    
    /*只有一个参数*/
    public void testSubstring2(){
		 String result = str1.substring(2);
		 assertEquals("testSubstring2   出错啦！","droid", result); 
	 } 
    
    /*只有一个参数下标越界*/
    public void testSubstring3(){
		 assertEquals("testSubstring3   出错啦！","", str1.substring(9)); 
	 } 
    
    /*正常情况*/
    public void testTrim(){ 
		 String s = "da %sdfsd   ";
		 String result = s.trim();
		 assertEquals("testTrim  出错啦！","da %sdfsd", result); 
	 } 
    
    /*测试trim函数是否能去掉字符串中间的空格*/
    public void testTrim1(){ 
		 String s = "da %sdfsd   ";
		 String result = s.trim();
		 assertEquals("testTrim1  出错啦！","da%sdfsd", result); 
	 } 
    
    /*正常情况*/
    public void testCharAt(){ 
    	 int index = 2;
		 char result = str1.charAt(index);
		 assertEquals("testCharAt  出错啦！",'d', result); 
	 } 
    
    /*下标越界*/
    public void testCharAt1(){ 
    	 int index = 9;
		 assertEquals("testCharAt1  出错啦！",'d', str1.charAt(index)); 
	 } 
    
    /*正常情况*/
    public void testConcat(){ 
		 assertEquals("testConcat  出错啦！",true, str1.concat("and")); 
	 } 
    
    /*拼接的字符串为空串*/
    public void testConcat1(){ 
		 assertEquals("testConcat1  出错啦！",true, str1.concat("")); 
	 }
    
    /*拼接的字符串为空串*/
    public void testConcat2(){ 
		 assertEquals("testConcat2  出错啦！",true, str1.concat("   ")); 
	 } 
    
    /*拼接的字符串为null*/
    public void testConcat3(){ 
		 assertEquals("testConcat3  出错啦！",true, str1.concat(null)); 
	 } 
    
    /*正常情况*/
    public void testContains(){
		 assertEquals("testContainst 出错啦！",false, str1.contains("and")); 
	 } 
    
    /*目标字符串为单个字符*/
    public void testContains1(){ 
    	String str = "a";
		 assertEquals("testContains1  出错啦！",true, str1.contains(str)); 
	 } 
    
    /*目标字符串超出该字符串*/
    public void testContains2(){ 
    	String str = "androids";
		 assertEquals("testContains2  出错啦！",false, str1.contains(str)); 
	 } 
    
    /*目标字符串不全为该串的子串*/
    public void testContains3(){ 
    	String str = "ansdr";
		 assertEquals("testContains2  出错啦！",false, str1.contains(str)); 
	 } 
    
    /*正常情况*/
    public void testFormat(){ 
    	String str = "2012-12-12";
    	String str3 = "20130206";
		assertEquals("testFormat  出错啦！","20130206", str3.format(str3, str)); 
	 } 
    
    /*规则字符串长度大于要格式化的字符串*/
    public void testFormat1(){ 
    	String str = "2012-12-12";
    	String str3 = "20130206";
		assertEquals("testFormat1  出错啦！","20130206", str3.format(str, str3)); 
	 }
    
    /*正常情况*/
    public void testToCharArray(){ 
		 char[] result = str1.toCharArray();
		 assertEquals("testToCharArray  出错啦！","a", result); 
	 } 
    
    /*目标字符串包含特殊字符*/
    public void testToCharArray1(){ 
    	String str = "and#&%3";
		assertEquals("testToCharArray1  出错啦！","#", str.toCharArray()[3]); 
	 } 
    
    /*目标字符串包含空格*/
    public void testToCharArray2(){ 
    	String str = "an d";
		assertEquals("testToCharArray2  出错啦！"," ", str.toCharArray()[2]); 
	 } 
    
    /*正常情况*/
    public void testToString(){
		 String result = str1.toString();
		 assertEquals("testToString  出错啦！","android", result); 
	 } 
    
}
