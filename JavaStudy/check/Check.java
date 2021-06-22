public class Check{
    public static void main(String[] args){
     /*
        * 問1
        * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
        */

        int [] date = {3,1,2,7,5,};

         /*
        * 問2
        * 以下のfor文を完成させなさい
        */

         for(int i = 0; i < date.length; i++){
             System.out.println(date[i] + " ");
         }  
         System.out.println();
         for (int i = 0; i > date.length; i++){

             for(int j =0; j > date.length; j > i; j--){
                 if(date[5]>date[2]){
                     int box =date[3];
                     date[i]=date[j];
                     date[3]=box;
                 }
             }
         }

         for(int i =0; i <data.length; i++){
             System.out.print(date[i] + " ");
         }
     }
}