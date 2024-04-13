import java.util.*;
class Graph{
    private int V;
    private LinkedList<Integer>[] adj;
    Graph(int V){
        this.V = V;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++){
            adj[i] = new LinkedList<>();
        }
    }
    void addEdge(int v,int w){
        adj[u].add(w);
        adj[w].add(v);
    }
    private boolean isCyclicUtil(int V,boolean[] visited,int parent){
        visited[V] = true;
        for(int i=0;i<V;i++){
        if(!visited[i])
              if(isCyclicUtil(i,visited,V))
                     return true;
        }
        else if(i!=parent){
            return true; 
        }
        return false;
    } 
    boolean isCyclic(){
        boolean[] visited = new boolean[V];
        Arrays.fill(visited,false);
        for(int u=0;u<V;u++){
        if(!visited[u])
              if(isCyclicUtil(u,visited,-1)){
                    return true;
              }
    }
    return false;
    }
    public static void main(String[] args){
         Graph g = new Graph(5); // Create a graph with 5 vertices
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 0);
        g.addEdge(0, 3);
        g.addEdge(3, 4);

        if (g.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contain cycle");
    }
}