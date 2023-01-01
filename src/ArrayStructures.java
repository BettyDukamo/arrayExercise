public class ArrayStructures {
    private int[] array = new int[50];
    private int arraySize = 10;

    // generate random array
    public void generateArray(){
        for(int i = 0; i<arraySize; i++){
            array[i]=(int)(Math.random()*10)+10;
        }
    }
    // get a value of an array at the given index
    public int getValueIndex(int index){
        if(index<arraySize) return array[index];
        else return -1;
    }

    // check if the value given is in the array
    public boolean isArrayvalue(int num){
        boolean checker = false;
        for(int i=0; i<arraySize; i++){
            if(array[i] == num) return checker= true;
        }
        return checker;
    }

    // Delete a value located at the index provided
    public void deleteIndex(int index){
        if(index < arraySize){
            for(int i = index; i<arraySize-1; i++){
                array[i] = array[i+1];
            }
            arraySize--;
        }
    }

    public void insertValue(int num){
        if(arraySize<50){
            array[arraySize] = num;
            arraySize++;
        }
    }

    // linear search for a value
    public String linearSearching(int value){
        boolean foundit = false;
        String indexfound = "";
        System.out.print("The value was found at: ");
        for(int i=0; i<arraySize; i++){
            if(array[i]==value){
                foundit = true;
                indexfound += i+" ";
            }
            if(!foundit) {
                indexfound = "None";
            }

        }
        System.out.print(indexfound);
        return indexfound;
    }
    // bubble sort
    public void bubbleSort(){
        for(int i = arraySize-1; i>1; i--){
            for(int j=0; j<i; j++){
                if(array[j] > array[j+1]){
                    swapElements(j, j+1);
                }
            }
        }
    }

    // let's find a value using binary search
    public void binarySearching(int value){
        int lowIndex = 0;
        int highIndex = arraySize -1;

        while(lowIndex <= highIndex){
            int middleIndex = (lowIndex + highIndex)/2;
            if(array[middleIndex] < value) lowIndex = middleIndex +1;
            else if(array[middleIndex] > value) highIndex = middleIndex -1;
            else {
                System.out.println("\n Found match at Index: "+ middleIndex);
                lowIndex = highIndex+1;
            }
        }
    }

    // Selection sorting
    public void selectionSort(){
        for(int x = 0; x<arraySize; x++){
            int minimum = x;
            for(int j=x; j<arraySize; j++){
                if(array[minimum]>array[j]){
                    minimum = j;
                }
            }
            swapElements(x, minimum);
        }
    }

    //Insertion sort
    public void insertionSort(){
        for(int i=0; i<arraySize; i++){
            int j=i;
            int insert = array[i];
            while((j > 0) && (array[j-1]>insert)){
                array[j] = array[j-1];
                j--;
            }
            array[j] = insert;
        }
    }

    // swapping array elements
    public void swapElements(int indexOne, int indexTwo){
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }

    // Print the array in a classy way, well still in the console lol
    public void printArray(){
        for(int j = 0; j<arraySize;j++){
            System.out.println("----------");
            System.out.print(" | " + j + " | ");
            System.out.println(array[j] + " |");
            System.out.println("----------");

        }
    }


}
