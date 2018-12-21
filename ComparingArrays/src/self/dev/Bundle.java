package self.dev;

import java.util.ArrayList;

public class Bundle {
    public boolean CompareArrays(int[] a, int[] b) {
        boolean equals = true;
        BubbleSort(a);
        BubbleSort(b);
        for(int counter = 0; counter < a.length; counter++){
            if(a[counter] * a[counter] != b[counter]){
                equals = false;
                break;
            }
        }
        return equals;
    }

    private void BubbleSort(int[] arr){
        int temp = 0;
        for(int counter_i = 0; counter_i < arr.length; counter_i++ ){
            for(int counter_j = 0; counter_j < arr.length - 1; counter_j++ ){
                if(arr[counter_j] > arr[counter_j + 1]){
                    temp = arr[counter_j];
                    arr[counter_j] = arr[counter_j + 1];
                    arr[counter_j + 1] = temp;
                }
            }
        }
    }

    private void ShowArray(int[] arr){
        for(int counter_i = 0; counter_i < arr.length; counter_i++ ){
            System.out.print(arr[counter_i] + " ");
        }
    }

    public int[] SortOddArray(int[] arr) {
        ArrayList<Integer> temporaryOddArrayList = new ArrayList<>();
        ArrayList<Integer> rememberPosition = new ArrayList<>();
        for(int counter = 0; counter < arr.length; counter++){
            if(arr[counter] % 2 != 0) {
                temporaryOddArrayList.add(arr[counter]);
                rememberPosition.add(counter);
            }
        }
        int[] OddArray = new int[temporaryOddArrayList.size()];
        for(int counter = 0; counter < temporaryOddArrayList.size(); counter++){
            OddArray[counter] = temporaryOddArrayList.get(counter);
        }
        BubbleSort(OddArray);
        for(int counter = 0; counter < rememberPosition.size(); counter++){
            arr[rememberPosition.get(counter)] = OddArray[counter];
        }
        ShowArray(arr);
        return arr;
    }

    public static String whoLikesIt(String... names) {
        //Do your magic here
        String whoLikes = "";
        switch (names.length){
            case 0:
                whoLikes = "no one likes this";
                break;
            case 1:
                whoLikes = names[0] + " likes this";
                break;
            case 2:
                whoLikes = names[0] + " and " + names[1] + " like this";
                break;
            case 3:
                whoLikes = names[0] + ", " + names[1] + " and " + names[2] + " like this";
                break;
            default:
                whoLikes = names[0] + ", " + names[1] + " and " + Integer.toString(names.length - 2) + " others like this";
                break;
        }
        return whoLikes;
    }

    public static int findShort(String str) {
        int ShortestLength = Integer.MAX_VALUE;
        for(String each : str.split(" ")){
            ShortestLength = (each.length() < ShortestLength) ? each.length(): ShortestLength;
        }
        return ShortestLength;
    }

    public int FindMultipliers(int Number) {
        int Summary = 0;
        for(int multiplier = 0; multiplier < Number; multiplier++){
            if(multiplier % 3 == 0 || multiplier % 5 == 0){
                Summary += multiplier;
            }
        }
        return Summary;
    }
}


