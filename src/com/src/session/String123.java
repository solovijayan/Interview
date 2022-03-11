package com.src.session;

public class String123 {
	public static void main (String args[]){
		String s = "Always-Look-on-the-Bright-Side-of-Life";
		int k = 5;
        String charSet = "abcdefghijklmnopqrstuvwxyz";
        String cipher = charSet.substring(k).concat(charSet.substring(0, k));
        char[] chArray = s.toCharArray();
      /*  for (char ch : chArray.){
            if(Character.isLetter(ch)){
                if(Character.isLowerCase(ch))
                    s = s[i].replace(ch, cipher.charAt(charSet.indexOf(Character.toLowerCase(ch))));
                else {
                s = s.replace(ch, Character.toUpperCase(cipher.charAt(charSet.indexOf(Character.toLowerCase(ch)))));
                
            }
            }
        }*/
        System.out.println(s);
        }
	
}
