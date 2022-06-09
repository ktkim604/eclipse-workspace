package ╠Х╠теб_2018112447;

public class Goods {
	private int weight;
    Goods(){

    }
    void set_weight(int weight){
        this.weight = weight;
    }
    int get_weight(){
        return weight;
    }
    

    void rand_weight(){
        int n = (int)(Math.random()*10 + 1);
        weight = n;
    }
}
