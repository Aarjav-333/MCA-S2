class ExceptionTest{
    public static void main(String args []){
        int age = 14;
        try {
            if (age < 18){
                throw new KriException("Not Eligible to vote");
            } else {
                System.out.println("Eligible to vote");
            }
        }catch(KriException e){
            System.out.println("KriException :" + e.getMessage());
        }
    }
}
class KriException extends Exception {
    public KriException(String s){
        super(s);
    }
}

