class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[numCourses];

        // 1. Build adjacency list
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] pre : prerequisites) {
            int course = pre[0], prereq = pre[1];
            adj.get(prereq).add(course); // edge: prereq -> course
            indegree[course]++;
        }

        // 2. Add all courses with indegree 0 to queue
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) q.offer(i);
        }

        // 3. BFS (Kahn's Algorithm)
        int taken = 0;
        while (!q.isEmpty()) {
            int course = q.poll();
            taken++;

            for (int next : adj.get(course)) {
                indegree[next]--;
                if (indegree[next] == 0) q.offer(next);
            }
        }

        return taken == numCourses;
    }
}
