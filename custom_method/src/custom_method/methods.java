package custom_method;

import java.util.Random;

public class methods {
	boolean generateRandomStringada(int length,String randomvariable) {
        try{
            String chars = "abcdefghijklmnopqrstuvwxyz";
            String temp="";
            Random random = new Random();
            for (int i = 0; i < length; i++) {
                int index = random.nextInt(chars.length());
                temp+=chars.charAt(index);
            }
            //webdriver.storeruntime(randomvariable,temp);   
            return true;
        }
        catch(Exception e){
            return false;
        }
	}

	public static void main(String[] args) {
		methods m = new methods();
		System.out.println(m.generateRandomStringada(5,"a"));
	}

}
