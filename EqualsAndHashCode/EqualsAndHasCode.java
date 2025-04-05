package EqualsAndHashCode;

public class EqualsAndHasCode {
    private String name;

    private int num;

    public EqualsAndHasCode(String name, int num){
        this.name= name;
        this.num = num;
    }


    public String getName(){
        return this.name;
    }
    public int getNum(){
        return this.num;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        EqualsAndHasCode eq = (EqualsAndHasCode) obj;
        return  eq.getName() == this.name && eq.getNum() == this.num ? true : false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void equalsAndHashCodeTest(){
        EqualsAndHasCode eqI = new EqualsAndHasCode("GPT", 33);
        EqualsAndHasCode eqII = new EqualsAndHasCode("GPT", 33);

        /** 오버라이딩을 하지않은 경우에는 false가 뜨는데
             유추 하건데, eqI은 {Equals@622}이고 eqII는 {Equals@623}이라서 다르게 나오나? */
        System.out.println("=======TEST Equals=========");
        System.out.println("단순비교 " + (eqI == eqII));
        System.out.println("오버라이딩 비교 "+ eqII.equals(eqI));

        int hashOne = eqI.hashCode();
        int hashTwo = eqII.hashCode();

        System.out.println("=======TEST Equals=========");
        System.out.println("hashCode One " +hashOne);
        System.out.println("hashCode Two " + hashTwo);

    }

}

