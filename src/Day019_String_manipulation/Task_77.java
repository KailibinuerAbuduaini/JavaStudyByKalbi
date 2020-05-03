package Day019_String_manipulation;

public class Task_77 {

	public static void main(String[] args) {
		/*
		 * Create a emoji program:
          1- Check if emoji has 2 characters. If it is not, print “invalid emoji”
          2-Valid emojis:
          Starting with : = > :) Smile, :( Sad, :/ Upset, :p Playful,Otherwise invalid
          Starting with ; = > ;) Wink, ;0 Surprised, Otherwise invalid
		 */
        String emoji=";)";
        
        if(emoji.length()!=2) {
        	System.out.println("invalid Emoji");
        	return;
        }
        char first=emoji.charAt(0);
        char second=emoji.charAt(1);
        if(first==':') {
        if(second==')')	{
        	System.out.println("smile");
        }else if(second=='(') {
        	System.out.println("sad");
        }else if(second=='/') {
        	System.out.println("upset");
        }else {
        	System.out.println("unknown emoji");
        }
        
        }else if(first==';') {
        	if(second==')') {
        		System.out.println("wink");
        	}else if(second=='0') {
        		System.out.println("suprised");
        	}else {
        		System.out.println("unknown");
        	}
        }
	}

}
