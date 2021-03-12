
package ejercicio4;


public class PairOfDice implements Dice{
    private Integer dice1;
    private Integer dice2;
    
    
    //CONSTRUCTOR
    public PairOfDice(Integer dice1, Integer dice2) {
        this.dice1 = dice1;
        this.dice2 = dice2;
    }
    //CONSTRUCTOR
    public PairOfDice() {
       
    }
    
    

    public int valorDice1() {
        double x;
        x=Math.random()*6+1;   
        Integer a = (int)Math.floor(x);
        dice1=a;
        return dice1;
        //return dice1;
    }

    public int valorDice2() {
        double y;
        //double z;
        y=Math.random()*6+1;   
        Integer z=(int)Math.floor(y);
        //Math.floor(y);
        //dice2=y;
        dice2=z;
        return dice2;
        //int dice2 = (int) (Math.random()*6+1);
        //return dice2;
    }


    
    
    //IMPLEMENTACION 
    @Override
    public void roll() {
        System.out.println("Los numero son: "+valorDice1()+" "+valorDice2());
        
    }
    
    
    
    
    

       
    
}
