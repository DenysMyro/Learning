package com.company;

import java.util.*;

public class SpentTime {

    private Map<String, Double> projectToTime;

    public SpentTime() {
        projectToTime = new HashMap<>();
    }

    public void addTime(String project, double time) {
        projectToTime.put(project, getTime(project) + time);
    }

    public List<String> findMissmatchProjects (SpentTime other) {
        List<String> missMatch = new ArrayList<>();
        Set<String> allProjects = new HashSet<>();
                allProjects.addAll(projectToTime.keySet());
        allProjects.addAll(other.projectToTime.keySet());
        for (String project : allProjects) {
            double myTime = getTime(project);
            double otherTime = other.getTime(project);
            if (myTime != otherTime) {
                missMatch.add(project);
            }
        }
        return missMatch;
    }

    public double getTime(String project) {
        if (projectToTime.containsKey(project)) {
            return projectToTime.get(project);
        }
        return 0;
    }
}
