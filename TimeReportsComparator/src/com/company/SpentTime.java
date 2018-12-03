package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SpentTime {

    private Map<String, Double> projectToTime;

    public SpentTime() {
        projectToTime = new HashMap<>();
    }

    public void addTime(String project, double time) {
        projectToTime.put(project, getTime(project) + time);

    }

    public Map<String, Double> comapre(SpentTime other) {
        Map<String, Double> missMatch = new HashMap<>();
        Set<String> allProjects = projectToTime.keySet();
        allProjects.addAll(other.projectToTime.keySet());
        for (String project : allProjects) {
            double myTime = getTime(project);
            double otherTime = other.getTime(project);
            if (myTime != otherTime) {
                missMatch.put(project, myTime - otherTime);
            }
        }
        return missMatch;
    }

    private double getTime(String project) {
        if (projectToTime.containsKey(project)) {
            return projectToTime.get(project);
        }
        return 0;
    }
}
