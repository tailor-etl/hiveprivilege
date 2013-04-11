 import java.util.regex.*; 
 public class MatcherTest{ 
    public static void main(String[] args) 
                         throws Exception { 
    	String sk="500cm*300cm*600cm";
    	System.out.println(sk.indexOf("cm"));
    	Pattern p12 = Pattern.compile("(?<=\\*)([0-9]*)(?=cm\\*)");
    	  Matcher m12 = p12.matcher(sk);
    	  while(m12.find()){
    		  System.out.println(m12.group());
    	  }
    	  
    	Pattern p1 = Pattern.compile("(\\$)|(\\{.+?\\})");
    	Pattern p2 = Pattern.compile("(\\$)|(\\{.+?\\})");
    	  Matcher m1 = p1.matcher("abc$ggg{12dgd3}");
    	  while(m1.find()){
    		  System.out.println(m1.group());
    	  }
    	  System.out.println(m1.replaceAll("qq"));

    	  
    	String s="Kelvin Li and Kelvin Chan are both working in " +
			"Kelvin Chen's $KelvinSoftShop company";
    	System.out.println(s.replace("Kelvin", "kevin"));
    	Pattern pattern = Pattern.compile("\\{vv\\},\\{ss\\}");
    	Matcher matcher = pattern.matcher("{vv},{ss}");
    	System.out.println(matcher.replaceAll("€6.99ggcc"));
    	System.out.println(matcher.replaceAll(Matcher.quoteReplacement("$6.99,gg")));


    	 //System.out.println(s.replace("Kelvin", "Kevin"));
        // 生成 Pattern 对象并且编译一个简单的正则表达式"Kelvin"
        Pattern p = Pattern.compile("Kelvin"); 
        // 用 Pattern 类的 matcher() 方法生成一个 Matcher 对象
        Matcher m = p.matcher("Kelvin Li and Kelvin Chan are both working in " +
			"Kelvin Chen's KelvinSoftShop $company"); 
        StringBuffer sb = new StringBuffer(); 
        int i=0; 
        // 使用 find() 方法查找第一个匹配的对象
        boolean result = m.find(); 
        // 使用循环将句子里所有的 kelvin 找出并替换再将内容加到 sb 里
        while(result) { 
            i++; 
            m.appendReplacement(sb, "Kevin"); 
            System.out.println("第"+i+"次匹配后 sb 的内容是："+sb); 
            // 继续查找下一个匹配对象
            result = m.find(); 
        } 
        // 最后调用 appendTail() 方法将最后一次匹配后的剩余字符串加到 sb 里；
        m.appendTail(sb); 
        System.out.println("调用 m.appendTail(sb) 后 sb 的最终内容是 :"+ 
			sb.toString());
    } 
 }
 

