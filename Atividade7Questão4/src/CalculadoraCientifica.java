
public class CalculadoraCientifica {
    public float expo(int base, int expoente){
        base = (int) Math.pow(base, expoente);
        return base;
    }
    public float seno(float angulo) {
        angulo = (float) Math.sin(angulo);
        return angulo;
    }
    public float cosseno(float angulo){
    angulo = (float) Math.cos(angulo);
    return angulo;
    }    
}
