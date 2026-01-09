package POO.Memory.CONSTRUTORESthisENCAPSULAMENTO.POOEX5;

public class Student {
    public String name;
    public double firtstri;
    public double secondtri;
    public double thirdtri;


    public double calcMedia(){
        return firtstri + secondtri + thirdtri;
    }

    public double missingNote(){
        if(calcMedia() < 60.0){
            return 60.0 - calcMedia();
        }else {
            return 0.0;
        }
    }

}

