class Solution {
    public List<String> buildArray(int[] target, int n) {
        int stream = 1;
        int index = 0;
        List<String> operations = new ArrayList<>();
        while(index < target.length){
            operations.add("Push");
            if(stream != target[index]){
                operations.add("Pop");
                index--;
            }
            stream++;
            index++;
        }
        return operations;
        
    }
}