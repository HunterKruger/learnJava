package String;

public class Exercise {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//去除字符串首尾空格，然后计算字母，数字，空格，和其他字符数量
        String str=" sdijvs dj2462 vsk &*7 asb23cuz sdvv ";
        String str1=str.trim();//去除字符串首尾空格
        System.out.println(str);
        System.out.println(str1);
        int eng=0;
        int num=0;
        int blank=0;
        int others=0;
        for(int i=0;i<str1.length();i++){
        	char c=str1.charAt(i);
        	if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
        		eng++;
        	}
        	else if(c>='0'&&c<='9'){
        		num++;
        	}
        	else if(c==' '){
        		blank++;
        	}
        	else{
        		others++;
        	}
        	
        }
        System.out.println("These are "+eng+" letters.");
        System.out.println("There are "+num+" numbers.");
        System.out.println("There are "+blank+" blanks.");
        System.out.println("There are "+others+" other chars.");
        
          		
	}

}
