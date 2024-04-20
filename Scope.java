class Scope{

    public static void main(String args[]){
        int x=1;
        if(x==1){

            int y=69;  //this is declared for this block only
            System.out.println("y is ="+ y);

        }
        y=12;  //this will show an error
    }
}