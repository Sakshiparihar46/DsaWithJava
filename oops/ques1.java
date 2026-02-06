class complex{
    int real;
    int img;
    public complex(int r,int i){
          real=r;
          img=i;
    }
    public static complex sum(complex a,complex b){
        return new complex((a.real+b.real),(a.img+b.img));
    }
    public static complex sub(complex a,complex b){
        return new complex((a.real-b.real),(a.img-b.img));
    }
    //(a+ib)(c+id)=ac+adi+bci-bd
    public static complex mul(complex a,complex b){
        return new complex(((a.real*b.real)-(a.img*b.img)),((a.real*b.img)+(a.img*b.real)));
    }
    public void printcomplex(){
        if(real==0 && img!=0){
            System.out.println(img+"i");
        }
        if(img==0 && real!=0){
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+img+"i");
        }
    }
}

public class ques1 {
    public static void main(String[] args) {
        complex a=new complex(4,3);
        complex b=new complex(3,2);
        complex d=complex.mul(a,b);
        d.printcomplex();

    }
    
}
