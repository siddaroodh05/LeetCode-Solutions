class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        List<List<Integer>> grph=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        path.add(0);
        dfs(grph,path, graph,0);
        return grph;
    }

    void dfs(List<List<Integer>> grph,List<Integer> path,int[][] graph,int node){

        if(node==graph.length-1){
            grph.add(new ArrayList<>(path));
            return;
        }

        for(int i=0;i<graph[node].length;i++){
            path.add(graph[node][i]);
            dfs(grph,path,graph,graph[node][i]);
            path.remove(path.size()-1);
        }


    }
}