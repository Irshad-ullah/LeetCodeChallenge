class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int index = 0;
        int time = 0;
        int n = tickets.length;
        while(tickets[k] > 0){
            if(tickets[index%n] != 0){
                time++;
                tickets[index%n]--;
            }
            index++;
        }
        return time;
        
    }
}