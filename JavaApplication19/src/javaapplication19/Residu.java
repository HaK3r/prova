package calculadoracarles;

public class Residu {
    public int numero1;
    public int numero2;

    public Residu(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
      
    public int Residu() { 
    return numero1%numero2;
    }
}
