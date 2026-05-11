class ArrofObj {
    public static void main(String args[]){
        Students s[] = {
            new Students("Aishuuuu", 101),
            new Students("Misiiiii", 102),
            new Students("Nandhuniii", 103)
        };

        for(Students s1 : s){
            s1.display();
        }
    }
}



class Students {

    String name;
    int roll_no;
    Students(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }
    void display(){
        System.out.println("Name : " + name + "\nRoll No : " + roll_no + "\n");
    }

}


