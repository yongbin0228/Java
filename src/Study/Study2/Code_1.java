package Study.Study2;

public class Code_1 {
    public static void main(String[] args) {
        int[] test = {5,1,4,3,2};

        for(int i=0; i<test.length-1; i++){
            for(int j=i+1; j<test.length; j++){
                if(test[j] > test[i]){
                    int tmp = test[j];
                    test[j] = test[i];
                    test[i] = tmp;
                }
            }
        }
        for(int i=0; i<test.length; i++){
            System.out.print(test[i]+", ");
        }
    }
}
