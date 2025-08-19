package cse;
public class repeated {
    public static void main(String[] args)
    {
    	String Str="maximum";
    	char[] chars=Str.toCharArray();
    	int maxcount=0;
    	char repeated=' ';
    	for(char c:chars)
    	{
    		int count=0;
    		for(char d:chars)
    		{
    		if(c==d)count++;
    	}
    	if(count>maxcount)
    	{
    		maxcount=count;
    		repeated=c;
    	}
    }
    System.out.println("repeated" +repeated+ "("+maxcount+"times");
}
}
