class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> heap=new PriorityQueue<>
        ((a,b)->Integer.compare(b[0],a[0]));

        for(int i=0;i<points.length;i++){
            int side= (points[i][0]*points[i][0]) +(points[i][1]*points[i][1]);
            heap.offer(new int[]{side,points[i][0],points[i][1]});
            System.out.println(side);
            if(i>=k){
                int[] poll=heap.poll();
                System.out.println("poll" +Arrays.toString(poll));
            };

        }
        int[][] ans=new int[heap.size()][2];
        int i=0;
        for(int[] arr :heap){
            ans[i][0]=arr[1];
            ans[i][1]=arr[2];
            i++;
        }
        return ans;

        
    }
}