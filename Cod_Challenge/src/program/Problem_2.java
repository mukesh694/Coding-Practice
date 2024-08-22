package program;

public class Problem_2 {

    public static void main (String[] args){
//find the number of even number in a array

        int [] a={2,8,3,7,15,89,90};

        int count=0;
        System.out.println(a.length);

        for(int i=0;i<a.length;i++) {
            if (a[i] % 2 == 0) {
                count++;
            }

        }
        System.out.println(count);

    }
}
