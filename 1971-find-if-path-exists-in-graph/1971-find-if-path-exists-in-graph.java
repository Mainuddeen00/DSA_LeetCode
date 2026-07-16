class Solution {

    private int[] parent;
    private int [] rank;
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        parent = new int[n];
        rank = new int[n];

        for(int i = 0; i<n; i++)
            parent[i] = i;

            for(int[] edge : edges){

                union(edge[0],edge[1]);
            }

            return find(source)== find(destination);
        

        
    }

    private int find(int x){

        if(parent[x] != x){

            parent[x]  = find(parent[x]);
        }

        return parent[x];
    }


    private void union(int x,int y){
            
            int rootX = find(x);
            int rootY = find(y);

            if(rootX == rootY)
            return;

             if(rank[rootX] < rank[rootY]){
            parent[rootX] = rootY;

        }else if(rank[rootX] > rank[rootY]){
            parent[rootY] = rootX;
        }else {
            parent[rootY] = rootX;
            rank[rootX]++;
        }
    }

    
}