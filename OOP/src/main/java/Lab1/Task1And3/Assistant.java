package Lab1.Task1And3;

import java.util.ArrayList;
import java.util.List;

public class Assistant {
    private String assistantName;
    private List<Display> assignedDisplays;

    public Assistant(String assistantName, List<Display> assignedDisplays) {
        this.assistantName = assistantName;
        this.assignedDisplays = assignedDisplays;
    }

    public void addDisplay(Display display) {
        assignedDisplays.add(display);
    }

    public void assist(){
        Display bestDisplay = assignedDisplays.get(0);
        for (int i = 1; i < assignedDisplays.size(); i++){
            bestDisplay.compareWithMonitor(assignedDisplays.get(i));
            bestDisplay = bestDisplay.betterDisplay(assignedDisplays.get(i));
        }
        System.out.println("--------------------------------");
        System.out.println("The best display is: " + bestDisplay.toString());
    }

    public void buyDisplay(Display display){
        if (assignedDisplays.contains(display)){
            System.out.println("You have bought display: " + display.toString());
            assignedDisplays.remove(display);
        } else {
            System.out.println("This display is not included in our stock!!!");
        }
    }

    public void printDisplay(){
        System.out.println();
        System.out.println("The available displays are: ");
        for (Display display : assignedDisplays){
            System.out.println(display.toString());
            System.out.println("--------------------------------");
        }
    }

    public void getRecommandation(Display display){
        double lowestscore = display.recommendation(assignedDisplays.get(0));
        Display bestRecommendation = assignedDisplays.get(0);
        for (int i = 1; i < assignedDisplays.size(); i++){
            double score = display.recommendation(assignedDisplays.get(i));
            if (score < lowestscore){
                lowestscore = score;
                bestRecommendation = assignedDisplays.get(i);
            }
        }
        System.out.println("The best recommendetion is: " + bestRecommendation.toString());
    }

    public Display findDisplayByName(String name) {
        for (Display display : assignedDisplays) {
            if (display.getModel().equalsIgnoreCase(name)) {
                return display; // Return the display if the name matches
            }
        }
        return null; // Return null if no matching display is found
    }
}
