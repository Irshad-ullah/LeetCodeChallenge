class Solution {
    public int sumExcept(int[] arr, int exception){
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            if(i != exception){
            sum += arr[i];

            }
        }
        return sum;
    }
    public boolean isPossible(int[] target) {
        if(target.length == 1){
            return target[0] == 1;
        }
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b)->Integer.compare(b[0],a[0]));
            for(int i = 0; i < target.length; i++ ){
                maxHeap.offer(new int[]{target[i], i});
            }
                int[] tamp = maxHeap.poll();
                int sum = sumExcept(target,tamp[1]);
                int dif = (tamp[0] % sum) + sum ;
                target[tamp[1]] = dif;
                maxHeap.offer(new int[]{dif, tamp[1]});

            while(sumExcept(target, target.length) != target.length){
                int[] temp = maxHeap.poll();
                int diff = temp[0] - sumExcept(target,temp[1]);
                if(diff < 1){
                    return false;
                }
                target[temp[1]] = diff;
                maxHeap.offer(new int[]{diff, temp[1]});
            }
        return true;
    }
}