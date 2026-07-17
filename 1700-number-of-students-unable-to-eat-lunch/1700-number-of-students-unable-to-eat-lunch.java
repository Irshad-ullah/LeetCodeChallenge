class Solution {
    public boolean allSame(Queue<Integer> q){
        int count = 0;
        int sum= 0;
         for (int x : q) {
        sum += x;
        count++;
        }

        return sum == count || sum == 0;
    }

    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> student = new ArrayDeque<>();
        for (int i:students){
            student.add(i);
        }
        Stack<Integer> sandwich = new Stack<>();
        for(int i = sandwiches.length-1; i>=0; i--){
            sandwich.push(sandwiches[i]);
        }
        while(!student.isEmpty() && !(allSame(student) && student.peek() != sandwich.peek())){
            if (student.peek() == sandwich.peek()){
                student.remove();
                sandwich.pop();
            }else{
                int removed = student.poll();
                student.add(removed);
            }
        }
        return student.size();

    }
}