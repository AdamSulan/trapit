package controlers;

import javafx.scene.control.Button;
import models.MainModel;
import views.MainPanel;

public class MainController {
    MainPanel mainPanel;
    
    MainModel mainModel;
    public MainController(){
        this.mainPanel=new MainPanel();
        this.mainModel=new MainModel();
        this.handleEvent();
    }
    public MainPanel getMainPanel() {
        return mainPanel;
    }
    public void handleEvent(){
        Button calcButton=this.mainPanel.getButtonPanel().getCalcButton();
        calcButton.setOnAction(e -> {
            double aSide=Double.parseDouble(this.mainPanel.getASidePanel().getValue());
            double CSide=Double.parseDouble(this.mainPanel.getCSidePanel().getValue());
            double height=Double.parseDouble(this.mainPanel.getHeightPanel().getValue());
            double area=this.mainModel.calcArea(aSide, CSide, height);
            mainPanel.getAreaPanel().setValue(String.valueOf(area));
        });
    }
    
}
