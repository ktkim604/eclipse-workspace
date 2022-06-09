package 기말01_2_정답;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Example{
    void del_num(String str){

        str = str.replace("0","");
        str = str.replace("1","");
        str = str.replace("2","");
        str = str.replace("3","");
        str = str.replace("4","");
        str = str.replace("5","");
        str = str.replace("6","");
        str = str.replace("7","");
        str = str.replace("8","");
        str = str.replace("9","");

        System.out.println(str);
    }


    String lower(char c){
        String s = Character.toString(c);
//        return (char)(c+'a'-'A');
        return s.toLowerCase();
    }
}


public class Main {
    public static void main(String[] args) {

        Example ex = new Example();


        ex.del_num("abcd1234eFGU897v");
        int index = 0;
        int cnt = 0;
        int[] array = new int[10];

        while (cnt<10){
            boolean flag = true;
            int n = (int) (Math.random() * 90 + 10 ); //중복없는 난수 생성
            for(int j = 0 ; j<array.length;j++){
                if(array[j]==n){
                    flag = false;
                }
            }
            if(flag){
                array[index++] = n;
                cnt+=1;
            }

        }

        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<10;i++){
            a.add(array[i]);
        }
        for(int i = 0;i<10;i++){
            System.out.print(a.get(i)+" ");
        }

        Collections.sort(a);

        System.out.println();
        for(int i = 0;i<10;i++){
            System.out.print(a.get(i)+" ");
        }
        Signal st30 = new Signal();
        st30.set_signal('r');
        System.out.println();
        System.out.println("현재 신호등은 "+st30.get_signal());

        Car sm5 = new Car();
        sm5.monitor();
        sm5.see_signal(st30);
        sm5.monitor();
        st30.set_signal('b');
        sm5.see_signal(st30);
        sm5.monitor();


    }

}

class Signal{
    private char color;
    Signal(){
    }
    void set_signal(char c){
        color = c;
    }
    char get_signal(){
        return color;
    }
}

class Car{
    private String message;
    Car(){
        message = "자동차 시동";
    }

    void monitor(){
        System.out.println(message);
    }

    void see_signal(Signal s){
        if(s.get_signal()=='r'){
            message = "자동차 운행중";
        }else{
            message = "멈추세요";
        }
    }
}
