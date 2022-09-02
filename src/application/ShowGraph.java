package application;

import Graph.Graph;
import Graph.Vertex;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public interface ShowGraph {
	
	static void showGraph(AnchorPane root,Graph g)
	{
		for(int i = 0 ; i< g.getListVertex().size();i++)
		{
			Vertex v = g.getListVertex().get(i);
			double guiX = v.getGuiX();
			double guiY = v.getGuiY();
			int id = v.getId();
			String Label=v.getLabel();
			
			root.getChildren().add(addButton(id, guiX, guiY));
			
		}
		
		
	}
	static Button addButton( int i, double x, double y)
	{	
		Button roundButton = new Button(Integer.toString(i));
		roundButton.setLayoutX(x);
		roundButton.setLayoutY(y);
		//((FlowPane) root).setHgap(x);
        //((FlowPane) root).setVgap(y);
		roundButton.setStyle(
	            "-fx-background-radius: 5em; " +
	            "-fx-min-width: 30px; " +
	            "-fx-min-height: 30px; " +
	            "-fx-max-width: 30px; " +
	            "-fx-max-height: 30px;"
	    );
		return roundButton;
	}
}
