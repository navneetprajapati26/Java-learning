package oops;

public class Chass {
    public static void main(String[] args) {
        Queen q =new Queen();
        q.moves();
    }
}

interface ChassPlayer {
    void  moves();
}

class  Queen implements ChassPlayer{
   public void  moves(){
       System.out.println("in all direction");
    }
}

class  King implements ChassPlayer{
    public void  moves(){
        System.out.println("Up,down,left,right...one step only");
    }
}

class  Rook implements ChassPlayer{
    public void  moves(){
        System.out.println("Up,dwon,left,right");
    }
}
