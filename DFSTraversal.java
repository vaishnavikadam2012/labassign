package A1;
import java.io.*;
import java.util.*;

public class DFSTraversal 
{
	private LinkedList<Integer> adj[];
	private boolean visited[];
	DFSTraversal(int v)
	{
		adj=new LinkedList[v];
		visited= new boolean[v];
		for(int i=0; i<v; i++)
		{
			adj[i]=new LinkedList<>();
		}
		
	}
	void InsertEdges(int src, int dest)
	{
		adj[src].add(dest);
	}
	
	void DFS(int vertex)
	{
		visited[vertex]=true;
		System.out.print(vertex + " ");  
		Iterator<Integer> it=adj[vertex].listIterator();
		while(it.hasNext())
		{
			int n = it.next();
			if(!visited[n])
			{
				DFS(n);
			}
		}
	}
	public static void main(String[] args) 
	{
		DFSTraversal graph=new DFSTraversal(8);
		graph.InsertEdges(0,1);
		graph.InsertEdges(0,2);
		graph.InsertEdges(0,3);
		graph.InsertEdges(1,3);
		graph.InsertEdges(2,4);
		graph.InsertEdges(3,5);
		graph.InsertEdges(3,6);
		graph.InsertEdges(4,7);
		graph.InsertEdges(4,5);
		graph.InsertEdges(5,2);
		System.out.println("DFS:");
		graph.DFS(0);
	}

}
