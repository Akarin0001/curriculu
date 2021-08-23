package check;

import constants.Constants;

public class Check {
	
	//課題【Check.java】にてフィールド変数firstNameとlastNameを宣言し、
			//firstName →　自分の名字　lastName →　自分の名前で初期化しなさい。
			//なお、変数のアクセス修飾子は「private」とする。
	 private static String firstName="吉村";
     private static String lastName="あかり";
     
     private static void printName(String fname,String lname) {
    	 System.out.println("printNameメソッド↠"+fname + lname);
     }
     
	public static void main(String args[]) {
		 
		//課題②
		//【Check.java】にてfirstNameとlastNameを引数で受け取って、
		//連結して表示させるメソッド「printName」を作成しなさい。
		//作成した関数のアクセス修飾子は「private」とする。
		
        Pet ix = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
        RobotPet cx = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
        
        //課題③
        //【Check.java】にてPetクラスとRobotPetクラスをインスタンス化して、下記の完成イメージを出力させなさい。
    
        
	printName(firstName,lastName);
    ix.introduce();
    cx.introduce();
    
		
	}

}
