package POO.Memory.CONSTRUTORESthisENCAPSULAMENTO.POOEX1;

public class Triangle { //Classe Triângulo
    public double a; // atributos
    public double b;
    public double c;

    public double area(){ // métodos da classe triângulo
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}


