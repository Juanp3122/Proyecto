package Graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import LinearDataStructures.List;

public class Graph {
	public List GraphNodes;


	public Graph() {
		List GraphNodes= new List();
		this.GraphNodes=GraphNodes;

	}
	public void insert(GraphNode node) {
		//		if(this.GraphNodes.linealSearch(node)==null) {
		this.GraphNodes.insertAtEnd(node);
		//		}
	}
	public void conect(GraphNode node,KeyNode key) {

		GraphNode temp=(GraphNode)this.GraphNodes.linealSearch(node);

		temp.ConectedNodes.insertAtEnd(key);

	}
	public boolean contains(GraphNode toSearch) {
		return (this.GraphNodes.linealSearch(toSearch)!=null);
	}

	public void mostRt() {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter( System.out ));
		GraphNode temp=(GraphNode)this.GraphNodes.head;
		GraphNode Max=(GraphNode)this.GraphNodes.head;

		try {

			while(temp!=null)
			{
				if(temp.ConectedNodes.length()>Max.ConectedNodes.length())
				{
					Max=temp;
				}
				temp=(GraphNode)temp.getNext();
			}
			bw.write("Nodo con más conexiones:"+"\n");
			bw.write(Max.toString());
			bw.flush();

			bw.write("\n");
bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	public void FrequencyTableData() {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter( System.out ));
		int res=0,res2=0,res3=0,res4=0,res5=0,res6=0,res7=0,res8=0,res9=0,res10=0;
		GraphNode temp=(GraphNode)this.GraphNodes.head;
		while(temp!=null)
		{
			if(temp.ConectedNodes.length()>=1&&temp.ConectedNodes.length()<=2)
				res++;
			
			if(temp.ConectedNodes.length()>=3&&temp.ConectedNodes.length()<=1408)
				res2++;
			
			if(temp.ConectedNodes.length()>=1409&&temp.ConectedNodes.length()<=2814)
				res3++;
			
			if(temp.ConectedNodes.length()>=2815&&temp.ConectedNodes.length()<=4220)
				res4++;
			
			if(temp.ConectedNodes.length()>=4221&&temp.ConectedNodes.length()<=5626)
				res5++;
			
			if(temp.ConectedNodes.length()>=5627&&temp.ConectedNodes.length()<=7032)
				res6++;
			
			if(temp.ConectedNodes.length()>=7033&&temp.ConectedNodes.length()<=8438)
				res7++;
			
			if(temp.ConectedNodes.length()>=8439&&temp.ConectedNodes.length()<=9844)
				res8++;
			
			if(temp.ConectedNodes.length()>=9845&&temp.ConectedNodes.length()<=11250)
				res9++;
			
			if(temp.ConectedNodes.length()>=11251)
				res10++;
			temp=(GraphNode)temp.getNext();
		}
		try {
			bw.write(res+""+"\n");
			bw.write(res2+""+"\n");
			bw.write(res3+""+"\n");
			bw.write(res4+""+"\n");
			bw.write(res5+""+"\n");
			bw.write(res6+""+"\n");
			bw.write(res7+""+"\n");
			bw.write(res8+""+"\n");
			bw.write(res9+""+"\n");
			bw.write(res10+""+"\n");
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void Average() {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter( System.out ));
		GraphNode temp=(GraphNode)this.GraphNodes.head;
		try {
			int suma=0;
			while(temp!=null)
			{
				suma =suma+temp.ConectedNodes.length();
				temp=(GraphNode)temp.getNext();
			}
            bw.write("Promedio de conexiones:"+"\n");
            bw.write(Math.ceil(suma/this.GraphNodes.length())+"");
            bw.flush();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void print() {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter( System.out ));
		GraphNode temp1=(GraphNode) this.GraphNodes.head;
		try {
			while(temp1!=null) {

				bw.write(temp1.toString()+" ");
				bw.flush();

				temp1.ConectedNodes.printList();
				bw.write("\n");
				temp1 = (GraphNode)temp1.getNext();
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
