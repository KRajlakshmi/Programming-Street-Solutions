import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle{
    public static void main(String[] args) {
        int numsRow =7;
        List<List<Integer>> Pascaltriangle = generatePascalsTriangle(numsRow);
        for(List<Integer> row: Pascaltriangle){
            System.out.println(row);
        }
        

    }
        public static List<List<Integer>> generatePascalsTriangle(int numsRow){
            List<List<Integer>> triangle = new ArrayList<>();
            //Base Case
            if(numsRow == 0) return triangle;
            //First Row
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            triangle.add(firstRow);

            //Fill  middle values
            for(int i = 1; i < numsRow; i++){
                List<Integer> prevRow = triangle.get(i-1);
                List<Integer> currRow = new ArrayList<>();
                //First element of each row is always 1
                currRow.add(1);
                
                for(int j=1; j<i; j++){
                    currRow.add(prevRow.get(j-1)+prevRow.get(j));

                }
                //Last element of each row is always 1
                currRow.add(1);
                triangle.add(currRow);
        }
        return triangle;
    }


}