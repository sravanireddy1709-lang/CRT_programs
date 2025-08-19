package cse;
 class replace {
  public static void main(String[] args)
  {
	  String para=" it is programming language";
	  String place=para.replace(" ","-");
	  System.out.println(place);
	  String splitname="mahendra reddy";
	  String[] parts=splitname.split(" ");
	  String first=parts[0];
	  String last=parts[1];
      System.out.println(first);
      System.out.println(last);
      String  text="programming language";
      String trimmed=text.trim();
      System.out.println("before: [" + text + "]");
      System.out.println("after:[" + trimmed + "]");
      String word="programming";
      String convert=word.toUpperCase();
      System.out.println(convert);
      String original = "reverse a string";
      String reverse =" ";

      for (int i = original.length() - 1; i >= 0; i--) 
      {
          reverse+= original.charAt(i);
      }

      System.out.println(reverse);
  }
}
