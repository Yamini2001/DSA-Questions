import java.util.Vector;
class Main{
    public static void addEdge(Vector<Integer> adj[],int u,int v){
        adj[u].addElement(v);
    }
    public static int findSum(vector<Integer> adj[],int V){
        int sum = 0;
        for(int u=0;u<V;u++)
             sum+= adj[u].size();
        return sum;
    }
    public static void main(String[] args){
        int V = 4;
        Vector<Integer> adj[] = new Vector[V];
        for(int i=0;i<adj.length;i++){
            adj[i] = new Vector<>();
        }
        addEdge(adj,0,1);
        addEdge(adj,1,4);
        addEdge(adj,1,6);
        addEdge(adj,1,8);
        System.out.println("Sum of the dependencies: "+findSum(adj,V));

    }

}