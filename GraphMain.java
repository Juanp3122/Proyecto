package Graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class GraphMain {
	public static void main(String[] args) {
		try {

// this is the reading of the txt file
			File file= new File("C:\\Users\\juanp\\git\\DataStructuresTemplates\\src\\Graph\\input2.txt");
			FileReader fr= new FileReader(file);
			BufferedReader br= new BufferedReader(fr);
			Graph twitterGraph= new Graph();
			int cuenta=0;
			String st; 
			while ((st = br.readLine()) != null) {
				cuenta++;
				String[]input= st.split(" ");

				GraphNode userNode= new GraphNode(Integer.parseInt(input[1]));
				KeyNode conectedNode= new KeyNode(Integer.parseInt(input[0]));

				if(!twitterGraph.contains(userNode)) {
					twitterGraph.insert(userNode);
					twitterGraph.conect(userNode, conectedNode);
					

				}
				else {
					twitterGraph.conect(userNode, conectedNode);
				}
				// This method prints out the node with the most conections.
				twitterGraph.mostRt();
                //this method returns the average of conections of the graph.
			     twitterGraph.Average();
			    //this method gives us the frequency table data from each range.
			     twitterGraph.FrequencyTableData();
			    //This method prints out the graph
			     twitterGraph.print();
				
			}



		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
