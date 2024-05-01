/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
        bool detected = false;
        if(head != nullptr){
            ListNode* slow = head;
            ListNode* fast = head->next;
            while(fast != nullptr && fast->next != nullptr && fast != slow ){
                slow = slow->next;
                fast = fast->next->next;
            }

        if(fast == slow){
            detected = true;
        }
        }
        return detected;
    }
};