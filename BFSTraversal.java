package A1;
import java.io.*;
import java.util.*;
public class BFSTraversal
{
	private int node;
	private LinkedList<Integer> adj[];
	private Queue<Integer> que;
	
	BFSTraversal(int v)
	{
		node=v;
		adj=new LinkedList[node];
		for(int i=0;i<v;i++)
		{
			adj[i]=new LinkedList<>();
		}
		que=new LinkedList<Integer>();
		
	}
	
	void InsertEdge(int v,int w)
	{
		adj[v].add(w);
	}

	void BFS(int n)
	{
		boolean nodes[]=new boolean[node];
		int a=0;
		nodes[n]=true;
		que.add(n);
		while(que.size()!=0)
		{
			n=que.poll();
			System.out.print(n+" ");
			for(int i=0; i<adj[n].size(); i++)
			{
				a=adj[n].get(i);
				if(!nodes[a]) {
					nodes[a]=true;
					que.add(a);
				}
			}
		}
		
	}

	public static void main(String args[])
	{
		BFSTraversal graph =new BFSTraversal(6);
		graph.InsertEdge(0, 0);
		graph.InsertEdge(0, 3);
		graph.InsertEdge(0, 4);
		graph.InsertEdge(4, 5);
		graph.InsertEdge(3, 5);
		graph.InsertEdge(1, 2);
		graph.InsertEdge(1, 0);
		graph.InsertEdge(2, 1);
		graph.InsertEdge(4, 1);
		graph.InsertEdge(3, 1);
		graph.InsertEdge(5, 4);
		graph.InsertEdge(5, 3);
		System.out.println("BFS Traversal:");
		graph.BFS(0);
		
		
	}
}