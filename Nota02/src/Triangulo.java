public class Triangulo {
    int l1, l2, l3;

    public void setL1(int l1){
        this.l1 = l1;
    }
    public void setL2(int l2){
        this.l2 = l2;
    }
    public void setL3(int l3){
        this.l3 = l3;
    }

    public int getL1(){
        return l1;
    }
    public int getL2(){
        return l2;
    }
    public int getL3(){
        return l3;
    }

    public void lados(){
        if (l1 == l2 && l1 == l3){
            System.out.println("É um triangulo Equilátero");
        } else if (l1 == l2 || l1 == l3){
            System.out.println("É um triangulo Isósceles");
        } else {
            System.out.println("É um triangulo Escaleno");
        }
    }

}
