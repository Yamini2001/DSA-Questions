/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        // empty node
        if (node == null)
            return null;

        // make adj
        Map<Node, Set<Node>> adj = new HashMap();
        Set<Node> vis = new HashSet();

        dfs(node, adj, vis);

        /*        
        use this approach for printing, bcz Nodes doesnt have 
        toString()
        for (Node p : adj.keySet()) {
            System.out.print(p.val + ": ");
        
            for (Node q : adj.get(p))
                System.out.print(q.val + " ");
        
            System.out.println();
        }
        */

        // make array of nodes
        int n = adj.size();
        Node[] nodes = new Node[n + 1]; //1-indexed

        // add the node to respective index
        for (Node nd : adj.keySet()) {
            nodes[nd.val] = new Node(nd.val);
        }

        // through the indices, add the neighbors
        for (Node nd : adj.keySet()) {
            for (Node nei : adj.get(nd)) {
                nodes[nd.val].neighbors.add(nodes[nei.val]);
            }
        }

        // return nodes[1] bcz 1-indexed
        return nodes[1];
    }

    void dfs(Node node, Map<Node, Set<Node>> adj, Set<Node> vis) {
        vis.add(node);
        if (adj.get(node) == null)
            adj.put(node, new HashSet());

        for (Node nei : node.neighbors) {
            adj.get(node).add(nei);
            if (!vis.contains(nei)) {
                dfs(nei, adj, vis);
            }
        }
    }
}