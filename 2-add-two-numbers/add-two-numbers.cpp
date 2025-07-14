/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode *root = new ListNode();
        ListNode *last = root;
        int remainder = 0;
        
        while (l1 != nullptr || l2 != nullptr || remainder != 0){
            
            int val1 = l1 != nullptr ? l1->val : 0;
            int val2 = l2 != nullptr ? l2->val : 0;
            int sum = val1 + val2 + remainder;

            if(sum >=  10){
                remainder = 1;
            }else {
                remainder = 0;
            }
            last->val = sum % 10;

             if(l1 != nullptr){
                l1 = l1->next;
            }
            if(l2 != nullptr){
                l2 = l2->next;
                
            }
            if(l1 != nullptr || l2 != nullptr || remainder != 0 ){
                
                last->next = new ListNode();
                last = last->next;   
            }
           
        }

        return root;
    }
};