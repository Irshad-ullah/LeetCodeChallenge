class Solution {
public:
    int search(vector<int>& nums, int target) {
        int first = 0;
        int last = size(nums)-1;
        int mid = (first + last )/2;
        while(first < last && nums.at(mid) != target){
            if(target < nums.at(mid)){
                last = mid-1;
            }
            else if(target > nums.at(mid)){
                first = mid + 1;
            }
            mid = (first + last )/2;
        }
        if(nums.at(mid) == target){
            return mid;
        }
        return -1;
    }
};