package views;

import com.github.suli2022.inputlib.ButtonPanel;
import com.github.suli2022.inputlib.InputPanel;
import com.github.suli2022.inputlib.TitlePanel;

import javafx.scene.layout.VBox;

public class MainPanel extends VBox {
    TitlePanel titlePanel;
    InputPanel aSidePanel;
    InputPanel cSidePanel;
    InputPanel heightPanel;
    ButtonPanel buttonPanel;
    InputPanel areaPanel;

    public MainPanel(){
        this.titlePanel=new TitlePanel();
        this.aSidePanel=new InputPanel();
        this.cSidePanel=new InputPanel();
        this.heightPanel=new InputPanel();
        this.buttonPanel=new ButtonPanel();
        this.areaPanel=new InputPanel();

        this.titlePanel.setText("Trapéz területe");
        this.aSidePanel.setText("A oldal");
        this.cSidePanel.setText("B oldal");
        this.heightPanel.setText("Magasság");
        this.buttonPanel.setCalcButtonText("Számít");
        this.areaPanel.setText("Terület");

        this.getChildren().add(this.titlePanel);
        this.getChildren().add(this.aSidePanel);
        this.getChildren().add(this.cSidePanel);
        this.getChildren().add(this.heightPanel);
        this.getChildren().add(this.buttonPanel);
        this.getChildren().add(this.areaPanel);
    }
    
    public InputPanel getASidePanel() {
        return aSidePanel;
    }
    public InputPanel getCSidePanel() {
        return cSidePanel;
    }
    public InputPanel getHeightPanel() {
        return heightPanel;
    }
    public ButtonPanel getButtonPanel() {
        return buttonPanel;
    }
    public InputPanel getAreaPanel() {
        return areaPanel;
    }
}
