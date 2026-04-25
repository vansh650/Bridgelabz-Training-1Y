package Generics;

public class Box2 <A> {
    private A value;

    public A getValue() {
        return value;
    }

    public void setValue(A value) {
        this.value = value;
    }
     public class Box3 <B>{
        private B value;

         public B getValue() {
             return value;
         }

         public void setValue(B value) {
             this.value = value;
         }
     }
}

