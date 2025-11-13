import java.util.ArrayList;

public class monotonic{
    public static void main(String[]args){


    ArrayList<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(2);
    list.add(2);
    list.add(3);

    int asc = 1;

    if(list.get(0)>list.get(1)){
        asc=0;//decreasing order
    }else{
        asc=1;// increasing order
    }



    for(int i =0 ; i<list.size();i++){

        if(asc ==1 && list.get(i)<list.get(i+1)){
asc=1;
    }else if(=0 && list.get(i)>list.get(i+1)){
        asc = 0;asc =
    }





    }

    }
}